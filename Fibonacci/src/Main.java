import java.util.Scanner;

public class Main {
public static void fibonacci() {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int fib1=0;
	int fib2=1;
	if(n==1) {
		System.out.println(fib1);
	}
	else if(n==2) {
		System.out.println(fib1+" "+fib2);
	}
	else
		for(int i=3;i<=n;i++) {
			int nextNo=fib1+fib2;
			fib1=fib2;
			fib2=nextNo;
		System.out.print(nextNo+" ");
		}
	scan.close();
}
}
