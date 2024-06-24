class Solution {
   public int minKBitFlips(int[] A, int K) {
    int n = A.length;      // Length of the input array
    int flipped = 0;       // Keeps track of the current flip state
    int flipCount = 0;     // Number of flips performed
    int[] flipMarker = new int[n];  // Marks where flips occur

    for (int i = 0; i < n; ++i) {
        // Update flipped state by checking if a flip that affects the current position has ended
        if (i >= K) {
            flipped ^= flipMarker[i - K];
        }

        // Check if the current bit is in its original state (needs flipping)
        if (flipped == A[i]) {
            // If there aren't enough bits left to flip, return -1
            if (i + K > n) {
                return -1;
            }

            // Mark the current position as the start of a flip
            flipMarker[i] = 1;

            // Flip the state
            flipped ^= 1;

            // Increment the flip count
            flipCount++;
        }
    }

    return flipCount;
}

}