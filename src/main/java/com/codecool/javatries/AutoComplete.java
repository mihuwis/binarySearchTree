package com.codecool.javatries;

import java.util.ArrayList;
import java.util.List;

public class AutoComplete {

    private TrieDataNode root;

    /**
     * Starts a new Trie with dummy root data "-"
     */
    public AutoComplete() {
        root = new TrieDataNode('-');
    }

    /**
     * Adds a word to the Trie.
     */
    public void addWord(String wordToAdd) {
        TrieDataNode current = root;
        for (int i = 0; i < wordToAdd.length() ; i++) {
            Character letter = wordToAdd.charAt(i);

            TrieDataNode child = new TrieDataNode(letter);
            current.setMapOfChilds(wordToAdd.charAt(i), child);
            current = child;

        }
        endWord(current);

    }

    private void endWord(TrieDataNode current) {
        TrieDataNode endOfWord = new TrieDataNode('.');
        current.setMapOfChilds('.', endOfWord);
    }

    /**
     * Returns the possible completions of baseChars String from the Trie.
     * @param baseChars The String to autocomplete.
     * @return possible completions. An empty list if there are none.
     */
    public List<String> autoComplete(String baseChars) {
        List<String> words = new ArrayList<>();
        String word = "";
        words.add(baseChars);
        // TODO
        return words;
    }

    /**
     * Removes a word from the Trie
     * @return true if the removal was successful
     */
    public boolean removeWord(String wordToRemove) {
        // TODO -- Optional homework
        return false;
    }

}
