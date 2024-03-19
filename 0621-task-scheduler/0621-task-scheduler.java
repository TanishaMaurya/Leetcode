class Solution {
    public int leastInterval(char[] tasks, int n) {
    int freq[] = new int[26];
        for(char c : tasks){
            freq[c - 'A']++;
        }
        Arrays.sort(freq);
        int maxFrequency = freq[25];
        int id = (maxFrequency-1) * n;
        for(int i = 24 ; i>= 0 ; i--){
            id -= Math.min(maxFrequency-1 ,freq[i]);
        }
        if(id < 0) id = Math.max(0 , id);
        return tasks.length + id;
    }
}