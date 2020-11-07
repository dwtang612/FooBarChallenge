//Braille Translation
//===================
//
//Because Commander Lambda is an equal-opportunity despot, she has several visually-impaired minions. But she never bothered to follow intergalactic standards for workplace accommodations, 
//so those minions have a hard time navigating her space station. You figure printing out Braille signs will help them, and - since you'll be promoting efficiency at the same time - increase your chances of a promotion. 
//
//Braille is a writing system used to read by touch instead of by sight. Each character is composed of 6 dots in a 2x3 grid, where each dot can either be a bump or be flat (no bump). 
//You plan to translate the signs around the space station to Braille so that the minions under Commander Lambda's command can feel the bumps on the signs and ""read"" the s with their touch. 
//The special printer which can print the bumps onto the signs expects the dots in the following order:
//1 4
//2 5
//3 6
//
//So given the plain s word ""code"", you get the Braille dots:
//
//11 10 11 10
//00 01 01 01
//00 10 00 00
//
//where 1 represents a bump and 0 represents no bump.  Put together, ""code"" becomes the output string ""100100101010100110100010"".
//
//Write a function solution(plains) that takes a string parameter and returns a string of 1's and 0's representing the bumps and absence of bumps in the input string. Your function should be able to encode 
//the 26 lowercase letters, handle capital letters by adding a Braille capitalization mark before that character, and use a blank character (000000) for spaces. All signs on the space station are less than fifty 
//characters long and use only letters and spaces.
//
//Languages
//=========
//
//To provide a Python solution, edit solution.py
//To provide a Java solution, edit Solution.java
//
//Test cases
//==========
//Your code should pass the following test cases.
//Note that it may also be run against hidden test cases not shown here.
//
//-- Java cases -- 
//Input:
//Solution.solution("code")
//Output:
//    100100101010100110100010
//    
//Input:
//Solution.solution("Braille")
//Output:
//    000001110000111010100000010100111000111000100010
//    000001110000111010100000010100111000111000100010
//Input:
//Solution.solution("The quick brown fox jumps over the lazy dog")
//Output:
//    000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110
//    000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110

public class level1 {
	
	public String brailleTrans(String s) {
		int index;
		//Braille Alphabet
		String[] brailleAlpha= {
				"100000", //a
				"110000", //b
				"100100", //c
				"100110", //d
				"100010", //e
				"110100", //f
				"110110", //g
				"110010", //h
				"010100", //i
				"010110", //j
				"101000", //k
				"111000", //l
				"101100", //m
				"101110", //n
				"101010", //o
				"111100", //p
				"111110", //q
				"111010", //r
				"011100", //s
				"011110", //t
				"101001", //u
				"111001", //v
				"010111", //w
				"101101", //x
				"101111", //y
				"101011"  //z
		};
		
		String solution = "";
		
		for (int i = 0; i < s.length(); i++) {

			if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) {
				index = ((int)s.charAt(i)-65);
				solution = solution + "000001" + brailleAlpha[index];
			}
			else if ((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) {
				index = ((int)s.charAt(i)-97);
				solution = solution + brailleAlpha[index];
			}
			else {
				solution = solution + "000000";
			}
		}
		return solution;
	}
	
	public static void main(String[] args) {
		level1 program = new level1();
		String input = "The quick brown fox jumps over the lazy dog";

		System.out.println(program.brailleTrans(input));
	}
}
