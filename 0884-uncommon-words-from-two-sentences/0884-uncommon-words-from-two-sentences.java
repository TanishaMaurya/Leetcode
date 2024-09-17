class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
       
        for(String p:s1.split(" ")){
            hm.put(p,hm.getOrDefault(p,0)+1);
        }
        for(String pp:s2.split(" ")){
            hm.put(pp,hm.getOrDefault(pp,0)+1);
        }
        List<String> ans=new LinkedList();
        for(String word:hm.keySet()){
            if(hm.get(word)==1)
                ans.add(word);
        }
     return ans.toArray(new String[ans.size()]);
    }
}