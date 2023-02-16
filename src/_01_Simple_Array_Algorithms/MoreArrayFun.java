package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] stringArr = new String[5];
		stringArr[0] = "CODING THE JAVA INTEGER";
		stringArr[1] = "Penny the turkey";
		stringArr[2] = "I want money";
		stringArr[3] = "There are lizards on Uranus";
		stringArr[4] = "Goatie the sheep and Sheepy the goat.";
		
		printStringArray(stringArr);
		System.out.println(" ");
		printStringArrReverse(stringArr);
		System.out.println(" ");
		printStringArrEveryOther(stringArr);
		System.out.println(" ");
		printStringArrRandom(stringArr);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

	static void printStringArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

	static void printStringArrReverse(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

    //4. Write a method that takes an array of Strings and prints every other String in the array.

	static void printStringArrEveryOther(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
	
    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	
	static void printStringArrRandom(String[] array) {
		ArrayList<String> str = new ArrayList<String>();
		for (String s: array) {
			str.add(s);
		}
		Collections.shuffle(str);
		for (String s: str) {
			System.out.println(s);
		}
	}
	
	public static boolean containsIntValue(int[] array, int value) {
    	boolean hasNumber = false;
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] == value) {
    			hasNumber = true;
    			break;
    		}
    	}
    	
        return hasNumber;
    }


}
