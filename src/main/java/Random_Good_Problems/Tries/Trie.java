package main.java.Random_Good_Problems.Tries;

public class Trie {

    TrieNode root;

    Trie() {
        root = new TrieNode();
    }


    private class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        TrieNode() {
            this.children = new TrieNode[26];
            this.isEndOfWord = false;
        }
    }


    public void insert(String str) {
        TrieNode current = root;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            } else {
                current = current.children[index];
            }
        }

        current.isEndOfWord = true;

    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
    }
}
