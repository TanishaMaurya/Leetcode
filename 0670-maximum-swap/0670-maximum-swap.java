class Solution {
    public int maximumSwap(int num) {
       
       String s=Integer.toString(num);
        int n=s.length();
        int maxi=num;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char[] arr=s.toCharArray();
                
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                int tempnum=Integer.parseInt(new String(arr));
                
                maxi=Math.max(maxi,tempnum);
            }
        }
        return maxi;
    }
}