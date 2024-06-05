class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        int[] commonchar=new int[26];
        int[] currentChar=new int[26];
        List<String> result=new ArrayList<>();
        for(char ch:words[0].toCharArray()){
            commonchar[ch-'a']++;
        }
        for(int i=1;i<n;i++){
            Arrays.fill(currentChar,0);
            for(char ch:words[i].toCharArray()){
                currentChar[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                commonchar[j]=Math.min(commonchar[j],currentChar[j]);
            }
        }
        for(int j=0;j<26;j++){
            for(int commonCount=0;commonCount<commonchar[j];commonCount++){
                result.add(String.valueOf((char)(j+'a')));
            }
        }
        return result;
    }
}