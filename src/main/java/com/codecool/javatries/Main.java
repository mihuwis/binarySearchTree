package com.codecool.javatries;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        Path worldListPath = new File("assets/wordlist.txt").toPath();
        List<String> wordList = Files.readAllLines(worldListPath);

        AutoComplete ac = new AutoComplete();
        for (String word : wordList) {
            ac.addWord(word);
        }

        // Try to write tests to verify your code!
        System.out.println(ac.autoComplete("spectro"));
        System.out.println("done");

        //---------------------------------------------------------------------

//        Map <Character, Integer> myMap = new HashMap<>();
//
//        myMap.put('a', 10);
//        myMap.put('.', 12);
//        myMap.put('c', 13);
//        myMap.put('d', 14);
//
//        if (myMap.keySet().contains('.')){
//            System.out.println(myMap.get('.'));
//        }

    }
}