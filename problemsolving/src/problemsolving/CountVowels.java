package problemsolving;

import java.util.HashSet;

public class CountVowels {
	
	private static HashSet<Character> vowelSet = new HashSet<Character>();
	
	public static void main(String[] args) {
		
		//Milestone 1: Understand the problem clearly.
			// - Ask questions & clarify the problem statement clearly.
			// - Take an example or two to confirm your understanding of the input/output & extend it to testcases.
		
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		
		System.out.println(countVowels("testcases"));
		System.out.println(countVowels("teStCases"));
		System.out.println(countVowels("aeiou"));
		System.out.println(countVowels("tryst"));
		System.out.println(countVowels("test cases"));
		System.out.println(countVowels(""));
		System.out.println(isVowel('A'));
/* Vowels ->  a ,e ,i, o, u
 * Eg:#1  testcases
 * o/p -> 3
 * Eg: #2 teStCases
 * o/p -> 3
 * Eg: #3 aeiou 
 * o/p -> 5
 * Eg: #4 tryst
 * o/p -> 0
 * Eg: #5 test cases
 * o/p -> 3
 * Eg: #6 ""
 * o/p -> 0
 */
		// Milestone 2: Finalize approach and execution plan
			// - Understand what type of problem you're solving.
		/*
		 * simple logic problem
		 */
			// - Brainstorm multiple ways to solve he problem and pick one.
		/*
		 * 1. Recursion
		 * 2. loop and counter
		 * 		- Go though the word character by character if the letter is vowel add one to the counter. 
		 */
			// - Get to the point where you can explain your approach to a 10 year old.
			// - Take a stab at the high level logic & write it down.
		/*
		 *  vowelCounter = 0
		 *  loop though string given 
		 *  	- if(isVowel(character)==true)
		 *  	- vowelCounter+1
		 *  return vowelCounter
		 */
			// - Try to offload processing to function & keep your main code small.
		
		// Milestone 3: Code by expanding your pseudocode.
			// Make sure you name the variables, functions clearly.
			// Avoid constants in your code unless necessary; go for generic functions.
				// you can use examples to thinking through.
			//Use libraries as much as possible.
		
		// Milestone 4: Prove to the interviewer that your code works with unit tests
			// Make sure you check boundary conditions.
		
		// Time and Storage Complexity
		// Suggest optimizations. -> in this program we introduced vowelSet to avoid if ( a e i o u ) check which makes code much cleaner.
		
		
	}	
		
		public static int countVowels(String str) {
			
			int vowelCounter=0;
			for(char c: str.toCharArray()) {
				if(isVowel(c))
					vowelCounter++;
			}
			return vowelCounter;
		}

		private static boolean isVowel(char character) {
			character=Character.toLowerCase(character);
			if(vowelSet.contains(character))
//			if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
				return true;
			return false;
		}
		
		
	}


