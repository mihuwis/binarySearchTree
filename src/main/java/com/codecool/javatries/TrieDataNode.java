package com.codecool.javatries;

import java.util.HashMap;
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
        mapOfChilds = new HashMap<>();
    }

    public char getData() {
        return data;
    }

    public Map<Character, TrieDataNode> getMapOfChilds() {
        return mapOfChilds;
    }

    public void setData(char data) {
        this.data = data;
    }

    public void setMapOfChilds(Character letter, TrieDataNode child ) {
        this.mapOfChilds.put(letter, child);
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }

}
