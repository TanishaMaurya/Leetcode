import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
     BigInteger a1 = new BigInteger(a, 2); // Convert Binary to BigInteger
        BigInteger b1 = new BigInteger(b, 2); // Convert Binary to BigInteger
        BigInteger sum = a1.add(b1); // Add both numbers
        return sum.toString(2); 
    }
}