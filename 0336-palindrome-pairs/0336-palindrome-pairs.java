class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<List<Integer>> l=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            hm.put(words[i],i);
        }
        for(int i=0;i<n;i++){
            if(words[i].equals("")){
                for(int j=0;j<n;j++){
                    String w=words[j];
                    if(isPal(w,0,w.length()-1) && j!=i){
                        l.add(List.of(i,j));
                        l.add(List.of(j,i));
                    }
                }
                continue;
            }
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            String bw=sb.toString();
            if(hm.containsKey(bw)){
                int res=hm.get(bw);
                if(res != i){
                    l.add(List.of(i,res));
                }
            }

            for(int j=1;j<bw.length();j++){
                if(isPal(bw,0,j-1)){
                    String s=bw.substring(j);
                    if(hm.containsKey(s)){
                        l.add(List.of(i,hm.get(s)));
                    }
                }
                if(isPal(bw,j,bw.length()-1)){
                    String s=bw.substring(0,j);
                    if(hm.containsKey(s)){
                        l.add(List.of(hm.get(s),i));
                    }
                }

            }

        }
        return l;
    }
    private boolean isPal(String bw,int l,int r){
        while(l<r){
            if(bw.charAt(l++) != bw.charAt(r--)) return false;
        }
        return true;
    }
}