package main.java.Tries;

public class Trie {

    Node root;

    Trie() {
        root = new Node("");
    }

    public void insert(String key) {
        Node tempNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);

            int asciiIndex = c - 'a';

            if (tempNode.getChild(asciiIndex) == null) {
                Node node = new Node(String.valueOf(c));
                tempNode.setChild(asciiIndex, node);
                tempNode = node;
            } else {

                tempNode = tempNode.getChild(asciiIndex);
            }
        }

        tempNode.setLeaf(true);
    }


    public boolean search(String key) {
        Node tempNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);

            int asciiIndex = c - 'a';

            if (tempNode.getChild(asciiIndex) == null) {
                return false;
            } else {

                tempNode = tempNode.getChild(asciiIndex);
            }
        }

        if (!tempNode.isLeaf()) return false;
        return true;
    }
}
