package week3;
 
import java.util.Arrays;


public class Week03ArraysAndMethodsLab {
	
	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
				int[] numbers = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
				System.out.println("The first element in the array: " + numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
				System.out.println("The last element in the array: " + numbers[numbers.length - 1]);

				System.out.println();
		// 4. Print out the element in the array at position 6, what happens?
				//System.out.println(numbers[6]);
				//It throws an exception, it goes over the array length which is 5
		
		// 5. Print out the element in the array at position -1, what happens?
				//System.out.println(numbers[-1]);
				/*Throws an exception, an array's position always starts at 0 and goes up from there but 
				 this number is less than zero so position -1 doesn't exist in the array*/
			
		// 6. Write a traditional for loop that prints out each element in the array
				System.out.println("Traditional For Loop");
				
				for (int i = 0; i < 6; i++) {
					System.out.print(numbers[i] + " ");
				}
			
		// 7. Write an enhanced for loop that prints out each element in the array
				System.out.println();
				System.out.println("Enhanced For Loop");
				
				for (int number : numbers) {
					System.out.print(number + " ");
				}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
				System.out.println();
				System.out.println();
				
				int sum = 0;
				
				for (int number : numbers) {
					sum += number;
				}
				
				System.out.println("The sum of the array elements is: " + sum);

		// 9. Create a new variable called average and assign the average value of the array to it
				double average = 0;
				
				average = sum / numbers.length; 
				System.out.println("The average value of the array is: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
				System.out.print("The numbers in the array that are odd: ");
				for (int number : numbers) {
					if (number % 2 != 0 ) {
						System.out.print(number + " ");
					}
				}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
				System.out.println();
				String[] names = {"Sam", "Sally", "Thomas", "Robert"}; 
				
				System.out.println();
				
		// 12. Calculate the sum of all the letters in the new array
				int sumString = 0;
				
				for (String name : names) {
					sumString += name.length();
				}
				
				System.out.println("The sum of all the letters in the string array: " + sumString);
				System.out.println();

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
				System.out.println("Printing out a greeting inside a new method");
				String name = "Stella";
				stringName(name);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
				String nameReturn = "Britney";
				String returnGreeting = stringNameWithReturn(nameReturn);
				
				System.out.println("Printing out a greeting that is returned to the main method");
				System.out.println(returnGreeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
				
				/*They both take in String arguments from main but method 13 prints out the greeting in the method because its void, doesn't return to main method.
				 * Method 14 returns the greeting to the main method and prints it there because it has a return data type of String.
				*/
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
				System.out.println();
				 
				String color = "purple";
				int num = 3;
				
				System.out.println("True or False, are the letters in the string greater than the integer provided: " + random(color, num));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
				System.out.println();
				
				String[] weekend = {"Saturday", "Sunday"};
				String day = "Monday";
				
				boolean result = weekendStringComparison(weekend, day);
				System.out.println("True or False, is the string provided inside the array of strings: " + result); 
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
				int[] numbersInArray = {27, 7, 22, 9, 33, 4, 10, 46};
			
				int smallestNumber = smallestNumberInArray(numbersInArray);
				
				System.out.println();
				System.out.println("The smallest number in the array: " + smallestNumber);
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
				double[] averageArray = {2, 7, 5, 4};
				
				double ave = averageOfArray(averageArray);
				System.out.println("The average of the elements in the array of double: " + ave);
				
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
				String[] seasons = {"winter", "spring", "summer", "fall"};
				int[] lengthOfSeasons = seasonsStringLength(seasons);
				
				System.out.println();
				System.out.println("Elements of a new int array that has each element value equal to the length of each element in a string array at the same position:");
				for (int season : lengthOfSeasons) {
					System.out.print(season + " ");
				}
				
				System.out.println();
				

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
				System.out.println();
				String[] groceries = {"Apples", "Pears", "Cheese", "Milk", "Bread", "Candy", "Oil"};
				
				System.out.println("True or False, is the sum all of the strings in the array of strings that have an even amount of letters greater than the sum of those with odd letters:");
				System.out.println(sumOfGroceries(groceries));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
				System.out.println();
				
				String radar = "madam";
				
				System.out.println("True or False, is the string provided a palindrome:");
				System.out.println(palindromeCheck(radar));

		
		
	}
	

	
	// Method 13:
		
	
		public static void stringName(String name) {
			
			System.out.println("Hello " + name);
		}

	// Method 14:
		
		public static String stringNameWithReturn(String name) {
			
			return "Hello " + name;
		}
	
	// Method 15:
		public static boolean random(String c, int y) {
			if (c.length() > y) {
				return true;
			} else {
				return false;
			}
		}
	
	// Method 16:
		
		 public static boolean weekendStringComparison(String[] weekendDays, String dayOfWeek) {
			 boolean equality = true;
			 
			 for (int counter = 0; counter < weekendDays.length; counter++) {
				if (weekendDays[counter].equals(dayOfWeek)) {
					equality = true;
				} else {
					equality = false;
				}
			 }
			  return equality;
		 
			

		} 
	
	// Method 17:
			public static int smallestNumberInArray(int[] array) {
				int smallestNum;
				
				Arrays.sort(array);
				smallestNum = array[0];
				
				return smallestNum;
				
								
			}
	
	// Method 18:
			
		public static double averageOfArray(double[] average) {
			double sum = 0;
			double equation;
			
			for (double numbers : average) {
				sum += numbers;
			}
			
			equation = sum / average.length; 
			return equation;
		}
	
	// Method 19:
		
		public static int[] seasonsStringLength(String[] seasons) {
			int[] lengthSeasons = new int[seasons.length]; 
			
			for (int i = 0; i < seasons.length; i++) {
				lengthSeasons[i] = seasons[i].length();
			}
			
			return lengthSeasons;
		}
	
	// Method 20:
		public static boolean sumOfGroceries(String[] groceries) {
			int sumEven = 0;
			int sumOdd = 0;
			
			for (int i = 0; i < groceries.length; i++) {
				if (groceries[i].length() % 2 == 0) {
					sumEven += groceries[i].length();
				} else {
					sumOdd += groceries[i].length();
				}
			}
			
			
			if (sumEven > sumOdd) {
				return true;
			} else {
				return false;
			}
		}
	
	// Method 21:
	
		public static boolean palindromeCheck(String palindrome) {
			char[] charBackwards = new char[palindrome.length()];
			int reverseIndex = palindrome.length();
			String stringBackwards = "";
			
			for (int i = 0; i < palindrome.length(); i++) {
				charBackwards[reverseIndex - 1] = palindrome.charAt(i);
				reverseIndex--;
			}
			
			
			for (char character : charBackwards) {
				stringBackwards += character;
			}
			
			
			if (stringBackwards.equals(palindrome)) {
				return true;
			} else {
				return false;
			}
		
			
			
			
			
		}
}

