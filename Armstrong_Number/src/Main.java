import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to find armstrong ");
	FindNum fn=new FindNum();
	boolean res=fn.armStrong(scan.nextInt());
	System.out.println(res);
	scan.close();
}
}
