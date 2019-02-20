package com.codecool.javatries;

import java.util.List;
import java.util.Map;

public class TrieDataNode {

    private char data;
    private Map<Character, TrieDataNode> mapOfChilds;

    /**
     * Initializes a TrieDataNode with its data
     * @param data The data in this node
     */
    public TrieDataNode(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public Map<Character, TrieDataNode> getMapOfChilds() {
        return mapOfChilds;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }

}
