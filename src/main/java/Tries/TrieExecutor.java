package main.java.Tries;

public class TrieExecutor {


    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("apple");
        trie.insert("apply");
        trie.insert("bat");


        System.out.println("search in trie returned : " + trie.search("ba"));
    }
}
