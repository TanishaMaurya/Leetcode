class Solution {
    public int passThePillow(int n, int time) {
        
 int cycleLength = 2 * (n - 1);
        int timeInCycle = time % cycleLength;

        if (timeInCycle < n) {
            return 1 + timeInCycle;
        } else {
            return n - (timeInCycle - n + 1);
        }
    }
}