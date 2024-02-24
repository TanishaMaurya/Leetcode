class Solution {
    public String largestNumber(int[] nums) {
       String[] s=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=nums[i]+"";
        }
   Arrays.sort(s, (a, b) -> ( a+b).compareTo(b+a));
        StringBuilder sb=new StringBuilder("");
        for(int i=s.length-1;i>=0;i--){
            sb.append(s[i]);
        }
    
        if(sb.charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}