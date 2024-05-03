class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        int v1=version1.length(),v2=version2.length();
        int n1,n2;
        while(i<v1 || j<v2){
            n1=0;
            n2=0;
            while(i<v1 && version1.charAt(i)!='.'){
                n1=n1*10 +(version1.charAt(i)-'0');
                i++;
            }
            while(j<v2 && version2.charAt(j)!='.'){
                n2=n2*10 +(version2.charAt(j)-'0');
                j++;
            }
            if(n1>n2) return 1;
            else if(n2>n1) return -1;
            i++;
            j++;
            
        }
        return 0;
    }
}
