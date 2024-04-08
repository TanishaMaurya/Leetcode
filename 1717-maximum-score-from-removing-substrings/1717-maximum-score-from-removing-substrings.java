class Solution {
    public int maximumGain(String s, int x, int y) {
         Character firstChar = 'a', secondChar = 'b'; 
        int firstWeight = x, secondWeight = y;
        if (y > x) {
            firstChar = 'b';
            secondChar = 'a';
            firstWeight = y;
            secondWeight = x;
        }

        int score = 0;

        //first remove higher weight string
        var sb = new StringBuilder();
        for(Character currChar : s.toCharArray()) { 
            if(!sb.isEmpty() && sb.charAt(sb.length() - 1) == firstChar && currChar == secondChar) {
                sb.setLength(sb.length() - 1);
                score += firstWeight;
            } else {
                sb.append(currChar);
            }
        }

        s = sb.toString();
        sb = new StringBuilder();
        //second remove lower wight string
        for(Character currChar : s.toCharArray()) { 
            if(!sb.isEmpty() && sb.charAt(sb.length() - 1) == secondChar && currChar == firstChar) {
                sb.setLength(sb.length() - 1);
                score += secondWeight;
            } else {
                sb.append(currChar);
            }
        }

        return score;
    }
}