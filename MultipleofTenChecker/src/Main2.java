import java.util.Scanner;

public class Main2 {
	public static void checkMultipleOfTen(int n,int d) 
	{ 
	if(n%d==0) {
		System.out.println("the number "+n+" is multiple of "+d);
	}
	else {
		System.out.println("number "+n+ " is not multiple of "+d);
	}
	} 
	
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two number to find a number is multiple of b number");
		checkMultipleOfTen(sc.nextInt(),sc.nextInt());
		sc.close();
	} 
}
