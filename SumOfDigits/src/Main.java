import java.util.*;
public class Main {
	public static void calculateSumOfDigits(int n) 
	{ 
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	} 

	
	public static void main(String[] args)
	{
		System.out.println("enter the number to find sum of digits in it");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateSumOfDigits(n);
	scan.close();
	}

}
