package String_Programs;

import java.util.*;

public class Vowel_Consonents {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        String vowels = "";
        String consonants = "";
        
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {         //if character belongs to "aeiou" add to vowels string
                    vowels += c;
                } else {
                    consonants += c;
                }
            }
        }
        
        String reversedVowels = new StringBuilder(vowels).reverse().toString();
        
        System.out.println("Extracted Vowels (reversed): " + reversedVowels);
        System.out.println("Extracted Consonants (same order): " + consonants);
        
        if (isPalindrome(reversedVowels)) {
            System.out.println("The vowel string \""+ reversedVowels + "\" is a palindrome.");
        } else {
            System.out.println("The vowel string \""+ reversedVowels + "\" is not a palindrome.");
        }
        
        if (isPalindrome(consonants)) {
        	System.out.println("The vowel string \""+ consonants + "\" is a palindrome.");
        } else {
            System.out.println("The vowel string \""+ consonants + "\" is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
    	
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }       
}   

