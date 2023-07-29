import java.util.Scanner;

public class MainApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	Main m=new Main();
	int res=m.reverse(scan.nextInt());
	System.out.println(res);
	scan.close();
}
}
