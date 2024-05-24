class Solution {
    int maxScore = Integer.MIN_VALUE;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int [] letterFreq = new int[26];

        for (char c : letters) {
            letterFreq[c - 'a']++;
        }

        int [] wordScores = new int[words.length];

        for (int i=0; i<words.length; i++) {
            int wordScore = 0;
            for (char c : words[i].toCharArray()) {
                wordScore += score[c - 'a'];
            }
            wordScores[i] = wordScore;
        }

        helper(words, letterFreq, wordScores, 0, 0);

        return maxScore;
    }

    private void helper(String [] words, int [] letterFreq, int [] wordScores, int idx, int score) {
        if (idx >= words.length) {
            maxScore = Math.max(maxScore, score);
            return;
        }

        // Pick
        int [] tempLetterFreq = letterFreq.clone();
        if (canIPick(words[idx], tempLetterFreq)) {
            helper(words, tempLetterFreq, wordScores, idx + 1, score + wordScores[idx]);
        }

        // Not Pick
        helper(words, letterFreq, wordScores, idx + 1, score);
    }

    private boolean canIPick(String word, int [] letterFreq) {
        for (char c : word.toCharArray()) {
            if (letterFreq[c - 'a'] == 0) {
                return false;
            }
            letterFreq[c - 'a']--;
        }

        return true;
    }
}