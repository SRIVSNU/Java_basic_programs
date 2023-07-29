import java.util.Scanner;

public class Main {

	public static void checkGrade(int grade){
		if(grade>50) {
			System.out.println("pass");
		}
		else {
			System.out.println("try again");
		}
		
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks scored");
		checkGrade(sc.nextInt());
		sc.close();
	}
	}

