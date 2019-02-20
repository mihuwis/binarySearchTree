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
//TODO
//            Character uperLetter = Character.toUpperCase(letter);
//            Character lowerLetter = Character.toLowerCase(letter);
//            current.setMapOfChilds(uperLetter, child);
//            current.setMapOfChilds(lowerLetter, child);
//            current = child;

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
        TrieDataNode current = root;
        String word = "";
        boolean endOfWordReached = false;

        for (int i = 0; i < baseChars.length(); i++){
            Character baseChar = baseChars.charAt(i);
//            String upperBaseChar = Character.toString(baseChars.charAt(i)).toUpperCase();
//            String lowerBaseChar = Character.toString(baseChars.charAt(i)).toLowerCase();
//
            if(current.getMapOfChilds().containsKey(baseChar)){
                TrieDataNode child = current.getMapOfChilds().get(baseChar);
                word += child.getData();
                current = child;
            } else {
                return words;
            }
        }

        while (!endOfWordReached){
            for(Character letter : current.getMapOfChilds().keySet()) {
                // here will be if statement. but in test there is only one key
                TrieDataNode child = current.getMapOfChilds().get(letter);
                if (child.getData() == '.'){
                    words.add(word);
                    endOfWordReached = true;

                } else {
                    word += child.getData();
                }
                current = child;

            }
        }


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
