package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	
    	String[] stringArray = new String[5];
    	stringArray[0] = "Pizza";
    	stringArray[1] = "Chicken Nugget";
    	stringArray[2] = "5 Gum: Stimulate Your Senses";
    	stringArray[3] = "Squegee";
    	stringArray[4] = "Joel Biben and Ronald Rump";
    	
        // 2. print the third element in the array
    	
    	System.out.println(stringArray[3]);

        // 3. set the third element to a different value
    	
    	stringArray[3] = "Macaroni Pancakes";

        // 4. print the third element again
    	
    	System.out.println(stringArray[3]);

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	
    	for (int i = 0; i < stringArray.length; i++) {
    		stringArray[i] = "Marshmellow";
    	}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	

    	for (int i = 0; i < stringArray.length; i++) {
    		System.out.println(stringArray[i]);
    	}

        // 7. make an array of 50 integers
    	
    	int[] intArray = new int[50];

        // 8. use a for loop to make every value of the integer array a random
        //    number
    	
    	Random r = new Random();
    	
    	for (int i = 0; i < intArray.length; i++) {
    		intArray[i] = r.nextInt(1000);
    	}

        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	
    	int smallestNum = intArray[0];
    	
    	for (int i = 1; i < intArray.length; i++) {
    		if (intArray[i] < smallestNum) {
    			smallestNum = intArray[i];
    		}
    	}
    	
    	System.out.println(smallestNum);
    	
        // 10 print the entire array to see if step 8 was correct
    	
    	for (int i = 0; i < intArray.length; i++) {
    		System.out.println(intArray[i]);
    	}

        // 11. print the largest number in the array.
    	
    	int biggestNum = intArray[0];
    	
    	for (int i = 1; i < intArray.length; i++) {
    		if (intArray[i] > biggestNum) {
    			biggestNum = intArray[i];
    		}
    	}
    	
    	System.out.println(biggestNum);
    	
        // 12. print only the last element in the array
    	
    	System.out.println(intArray[intArray.length - 1]);

    }
}
