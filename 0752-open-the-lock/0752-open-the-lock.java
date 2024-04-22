class Solution {
    public int openLock(String[] deadends, String target) {

        //if target is 0000 return
        if (target.equals("0000")) {
            return 0;
        }

        Set<String> deadSet = new HashSet(Arrays.asList(deadends));

        //if dead end is 0000 return
        if (deadSet.contains("0000")) {
            return -1;
        }

        //queue and visited set from source
        Queue<String> qSource = new LinkedList();
        Set<String> visitedSource = new HashSet();
        qSource.add("0000");
        visitedSource.add("0000");
        int levelSource = 0;

        //queue and visited set from end
        Queue<String> qEnd = new LinkedList();
        Set<String> visitedEnd = new HashSet();
        qEnd.add(target);
        visitedEnd.add(target);
        int levelEnd = 0;


        while (!qSource.isEmpty() && !qEnd.isEmpty()) {

            //check from source
            if (find(deadSet, visitedSource, visitedEnd, qSource)) {

                return levelSource + levelEnd + 1;
            }

            levelSource++;

            //check from end
            if (find(deadSet, visitedEnd, visitedSource, qEnd)) {

                return levelSource + levelEnd + 1;
            }

            levelEnd++;

        }

        return -1;

    }

    //primary visited set is set for current queue, secondary is for other queue
    private boolean find(Set<String> deadSet, Set<String> visitedPrimary, Set<String> visitedSecondary, Queue<String> queue) {

        int size = queue.size();

        for (int idx = 0; idx < size; idx++) {

            String s = queue.poll();

            for (int i = 0; i < 4; i++) {

                char[] charArr = s.toCharArray();
                char c = charArr[i];

                charArr[i] = (char) ((c - '0' + 1) % 10 + '0');
                String next = new String(charArr);

                charArr[i] = (char) ((c - '0' + 9) % 10 + '0');
                String prev = new String(charArr);

                if (!visitedPrimary.contains(next) && !deadSet.contains(next)) {

                    if (visitedSecondary.contains(next)) {
                        return true; // found target
                    }

                    visitedPrimary.add(next);
                    queue.add(next);

                }

                if (!visitedPrimary.contains(prev) && !deadSet.contains(prev)) {

                    if (visitedSecondary.contains(prev)) {
                        return true; // found target
                    }

                    visitedPrimary.add(prev);
                    queue.add(prev);

                }

            }

        }

        return false;
    }
}