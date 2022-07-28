package main.java.Tries;

import java.util.LinkedList;
import java.util.List;

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

    public void insert(String key, int value) {
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
        tempNode.setValue(value);

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

    public Integer searchAssociative(String key) {
        Node tempNode = root;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);

            int asciiIndex = c - 'a';

            if (tempNode.getChild(asciiIndex) == null) {
                return null;
            } else {

                tempNode = tempNode.getChild(asciiIndex);
            }
        }

        if (!tempNode.isLeaf()) return null;
        return tempNode.getValue();
    }


    public List<String> autocomplete(String prefix) {
        Node tempNode = root;
        List<String> wordList = new LinkedList<>();
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int asciiIndex = c - 'a';

            if (tempNode.getChild(asciiIndex) == null) {
                return wordList;
            } else {
                tempNode = tempNode.getChild(asciiIndex);
            }
        }

        collate(tempNode, prefix, wordList);

        return wordList;
    }

    private void collate(Node tempNode, String prefix, List<String> wordList) {

        if (tempNode == null) return;

        if (tempNode.isLeaf()) {
            wordList.add(prefix);
        }

        for (Node temp : tempNode.getChildren()) {
            if (temp == null) continue;
            String character = temp.getCharacter();
            collate(tempNode, prefix + character, wordList);
        }
    }
}
