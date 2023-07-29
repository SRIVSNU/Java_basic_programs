import java.util.Scanner;

public class GCDApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers");
	int m=scan.nextInt();
	int n=scan.nextInt();
	//GCD gcd=new GCD();
	System.out.println("GCD of "+m+" and "+n+" is "+GCD.findGCD( m, n));
	scan.close();
	
}

}
