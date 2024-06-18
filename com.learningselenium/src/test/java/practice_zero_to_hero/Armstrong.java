package practice_zero_to_hero;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp = n;
		int count = 0;
		int digit = 0;
		int sum=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		System.out.println(count);
		temp=n;
		while(temp!=0) {
			 digit = temp%10;
			 sum+=(int)Math.pow(digit, count);
			 temp/=10;
			 digit=0;
		}
		if(sum==n) {
			System.out.println("given no. is armstrong:"+n);
		}
		else {
			System.out.println("Given no. is not Armstrong:"+n);
		}
	}

}
