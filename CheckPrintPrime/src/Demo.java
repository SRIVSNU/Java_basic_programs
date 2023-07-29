import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number to check prime numbers in a  range ");
	int n=sc.nextInt();
	int count =0;
	for(int i=3;i<=n;i++) {
		int  res=checkPrime(i);
		if(res!=0) {
			System.out.println(res);
			count ++;
		}
	}System.out.println(count);
}
public static int checkPrime(int n) {
	for(int i=0;i<=n;i++) {
		if(n%i==0) {
			return 0;
		}
		
	}return n;
	
}

}
