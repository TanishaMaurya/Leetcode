class Solution {
    private class Trie {
        public Trie[] table;
        public boolean isWord = false;
        public Trie() {
            table = new Trie[26];
        }
    }

    private void insert(Trie trie, String word) {
        for (char c : word.toCharArray()) {
            if (trie.table[c - 'a'] == null) {
                trie.table[c - 'a'] = new Trie();
            }
            trie = trie.table[c - 'a'];
        }
        trie.isWord = true;
    }

    private String search(Trie trie, String word) {
        int idx = 0;
        for (char c : word.toCharArray()) {
            if (trie.isWord) {
                return word.substring(0, idx);
            }
            if (trie.table[c - 'a'] == null) {
                break;
            }
            trie = trie.table[c - 'a'];
            idx++;
        }
        return word;
    } 

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String root : dictionary) {
            insert(trie, root);
        }
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String root = search(trie, word);
            sb.append(root).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}