class Solution {
    public int numRescueBoats(int[] people, int limit) {
     int n=people.length;
        Arrays.sort(people);
    int l=0,r=n-1;
        int b=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }
            r--;
            b++;
        }
        return b;
    }
}