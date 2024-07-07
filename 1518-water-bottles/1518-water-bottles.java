class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
     int consumebottle=0;   
        while(numBottles>=numExchange){
            consumebottle +=numExchange;
            numBottles -=numExchange;
            numBottles++;
        }
    return consumebottle + numBottles;
    }
}