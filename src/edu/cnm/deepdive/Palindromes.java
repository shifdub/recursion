package edu.cnm.deepdive;

public class Palindromes {

  public static boolean testRecursive(String phrase) {
    return phrase.length() <= 1
  ||(
        phrase.charAt(0) == phrase.charAt(phrase.length() - 1)
            && testRecursive(phrase.substring(1, phrase.length() - 1))
    );
  }
}