package com.threenary.code;


/**
 * <b>Given</b> two non empty Strings, A and B, consisting of N and M letters respectively
 * <b>Returns</b> the minimum number of letters to add to the words specified in A and B to make them anagrams
 */
public class CodilityOne {
    final int ALPHABET_SIZE = 26;

    public int solution(String firstWord, String secondWord) {
        int[] charsCountInFirstWord = countCharsInWord(firstWord);
        int[] charsCountInSecondWord = countCharsInWord(secondWord);

        int result = 0;
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            result += Math.abs(charsCountInFirstWord[i] - charsCountInSecondWord[i]);
        }

        return result;
    }

    private int[] countCharsInWord(String secondWord) {
        int[] charsCountInSecondWord = new int[ALPHABET_SIZE];
        for (int i = 0; i < secondWord.length(); i++)
            charsCountInSecondWord[secondWord.charAt(i) - 'a']++;
        return charsCountInSecondWord;
    }
}
