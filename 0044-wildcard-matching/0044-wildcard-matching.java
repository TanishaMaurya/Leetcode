class Solution {
    
     public boolean isMatch(String s, String p) {
        char[] s1 = s.toCharArray();
        char[] s2 = p.toCharArray();

        if (s1.length == 0 && s2.length == 0) return true;
        if (s1.length == 0) return checkEmptyString(s2);
        if (s2.length == 0) return checkEmptyString(s1);
        
        Boolean[][] dp = new Boolean[s1.length + 1][s2.length + 1]; 
        return dfs(s1, s2, 0, 0, dp);
    }

    private boolean checkEmptyString(char[] s1) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != '*') return false;
        }

        return true;
    }

    private boolean dfs(char[] s1, char[] s2, int i, int j, Boolean[][] dp) {
        if (dp[i][j] != null) return dp[i][j];

        if (s1.length <= i && s2.length <= j) return true;
        if (i >= s1.length) {
            return dp[i][j] = s2[j] == '*'
                    ? dfs(s1, s2, i, j + 1, dp)
                    : false;
        } else if (j >= s2.length) {
            return dp[i][j] = s1[i] == '*'
                    ? dfs(s1, s2, i + 1, j, dp)
                    : false;
        }

        char c1 = s1[i];
        char c2 = s2[j];

        if (c1 == '*' || c2 == '*') {
            return dp[i][j] = dfs(s1, s2, i + 1, j + 1, dp) 
                || dfs(s1, s2, i + 1, j, dp) 
                || dfs(s1, s2, i, j + 1, dp); 
        }

        if (c1 == '?' || c2 == '?') {
            return dp[i][j] = dfs(s1, s2, ++i, ++j, dp);
        }

        if (c1 == c2) {
            return dp[i][j] = dfs(s1, s2, ++i, ++j, dp);
        }

        return false;
    }
}