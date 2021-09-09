package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

//String: If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.
//
//<HashMap> keys: characters, values: the character count (# of times it appears)
//
//Step 1: turn string inputValue into array of characters
//Step 2: use a for-style loop to iterate over each char
//    a) conditional to check if .containsKey()
//        i) if doesn't already exist, use .put() method to add char as a key with the value of 1
//        ii) if already encountered character, add 1 to the count
//Step 3: use a for each loop to print out each entry in the hashmap

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInQuote = quote.toCharArray();

        HashMap <Character, Integer> charactersAndCounts = new HashMap<>();

        for (Character character : charactersInQuote) {
            if (!charactersAndCounts.containsKey(character)) {
                charactersAndCounts.put(character, 1);
            } else if (charactersAndCounts.containsKey(character)) {
                Integer value = charactersAndCounts.get(character);
                charactersAndCounts.put(character, value + 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charactersAndCounts.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
