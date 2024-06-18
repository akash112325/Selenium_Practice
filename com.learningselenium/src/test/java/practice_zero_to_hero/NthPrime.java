package practice_zero_to_hero;

import java.util.Scanner;

public class NthPrime {
	public static boolean prime(int n) {

		for(int i=2;i<=n/2;i++) {
			if(n<2 || n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth prime no. ");
		int nth  = sc.nextInt();
		int count = 0;
		for (int j = 3 ; j<=50;j++) {
			if(prime(j)==true) {
				count= count+1;
			}
			else if (count == nth) {
				System.out.println("nth prime no. from 1 to 50 is "+j);
				break;
			}
		}
	}

}
