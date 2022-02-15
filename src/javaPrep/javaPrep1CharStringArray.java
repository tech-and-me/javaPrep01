package javaPrep;

import java. util. Arrays;

public class javaPrep1CharStringArray {

	public static void main(String[] args) {
		//convert char to integer
		char c='1';
		int a = Character.getNumericValue(c);
		int b = Integer.parseInt(String.valueOf(c));
		
		//convert integer to char
		int number = 2;
		char numberToChar = (char)(number + '0');
		
		// find character of a string at a specific index
		String str1 = "ABCdefg";
		char firstChar = str1.charAt(0);
		
		//Check if a character is letter
		char gender = '1';
		if (Character.isLetter(gender)) {
			System.out.println("Character is letter");
		}else {
			System.out.println("Character is not a letter");
		}
		
		//convert string to character array
		String myStr = "Hello World";
		char chArray[] = myStr.toCharArray();
		
		//convert String to integer
		String numStr = "123";
		int numInt = Integer.parseInt(numStr);
		int numInt2 = Integer.valueOf(numInt);
		
		//Split String
		String strng = "geeksss you me";
		String arrStrng[] = strng.split(" ");
		for (String ar:arrStrng) {
			System.out.println(ar);
		}
		// remove all white space from a String
		String noWhiteSpace = "I Have no white space   ..";
		String newNoWhiteSpace = noWhiteSpace.replaceAll(" ","");
		System.out.println(newNoWhiteSpace);
		
		
		// convert integer to String
		int numInt3 = 123;
		String a1 = Integer.toString(numInt3);
		
		// convert double to String
		double numDouble=123.0;
		String a2 = Double.toString(numDouble);
		
		//convert long to String
		long numLong= 123L;
		
		String a3 = Long.toString(numLong);
		float numFloat= 123.0f;
		
		//Compare String
		if (a3.equalsIgnoreCase(strng)) {
			System.out.println("true");
		}
		
		if(a3.equals("hello")) {
			System.out.println("true");
		}
		
		//convert string to upperCase
		String upperMyStr = myStr.toUpperCase();
		
		//convert string to lowerCase
		String lowerMyStr = myStr.toLowerCase();
		
		//Create an array
		int array[] = new int[5]; // create an array with 4 int element.
		
		//add element to array 
		array[0] = 10;
		
		// using for loop to add all i value to array.
		for (int i = 0; i<5; i++) {
			array[i] = i;
		}
		
		//Sort array
		//import java.util. Arrays;
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		Arrays.sort(arr);
		
		// Sort sub array from index 1 to 4, i.e.,
		Arrays.sort(arr, 1, 5);
	
		
		
		//  Arithmetic Operation
		int x = 3;
		double s = Math.pow(x, 2);
		
		double r = Math.sqrt(s);
		
		
		
		// Bonus
		Integer n = 10;
		System.out.println("Check if number is of type integer : " + (n instanceof Integer));
		
		
		//displaying result of above codes	
		System.out.println(numberToChar);
		System.out.println(a1);
		System.out.println(numDouble);
		System.out.println(numLong);
		System.out.println(numFloat);
		System.out.println(upperMyStr);
		System.out.println(lowerMyStr);
		
		for(char element:chArray) {
			System.out.println(element);
			
			}
		
		}
		
	}

	