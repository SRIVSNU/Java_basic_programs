import java.util.Scanner;

public class PrintFacator {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter N");
	int n = scan.nextInt();
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			System.out.println("the factors of "+n+" is " + i);
		}
	}
}
}
