package first;

public class SumofOddNumbers {

	public static void main(String[] args) {
		int sumofOdds= 0; // iterate through numbers from 7 to 21
		for ( int num = 7 ; num <= 21; num++) { // using for loop
			if (num % 2 != 0) { // To check if the number is Odd.
				
				
			System.out.println(num); // print the odd number
			sumofOdds += num; // Adding the odd number to the sum
		}
		
	}

		System.out.println("The sum of odd numbers between 7 to 21 is: " + sumofOdds);
}
}