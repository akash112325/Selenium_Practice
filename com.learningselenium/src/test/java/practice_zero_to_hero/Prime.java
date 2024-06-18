package practice_zero_to_hero;

import java.util.*;

public class Prime {
	   	    static boolean isprime(int n) {
	   	    	if (n <= 1)
	            return false;
	 
	            for (int i = 2; i <n; i++) {
	                if (n % i == 0) {
	                    return false;
	                }
	            } return true;
	   	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. to check prime");
		int n = sc.nextInt();
		if(isprime(n)==false) {
			System.out.println("not prime");		}
		else{
			System.out.println("No is prime");
		}
		}
}

