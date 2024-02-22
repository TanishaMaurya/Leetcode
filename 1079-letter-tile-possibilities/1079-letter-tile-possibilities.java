class Solution {
 int count=0;
 public void traverse(char a[],boolean used[]){
     count++;
     for(int i=0;i<a.length;i++){
         if(used[i] || (i>0 && a[i]==a[i-1]) && !used[i-1])

           continue;

          used[i]=true;
          traverse(a,used);
          used[i]=false; 
     }
 }

    public int numTilePossibilities(String tiles) {
        char a[]=tiles.toCharArray();
        Arrays.sort(a);
        traverse(a,new boolean[a.length]);
        return count-1;
    }
}