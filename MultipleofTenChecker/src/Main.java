import java.util.Scanner;

public class Main {

	public static void checkMultipleOfTen(int n) 
	{ 
	if(n%10==0) {
		System.out.println("it is multiple of 10");
	}
	else {
		System.out.println("number "+n+ " is not multiple of 10");
	}
	} 
	
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		checkMultipleOfTen(sc.nextInt());
		sc.close();
	} 
	
}

