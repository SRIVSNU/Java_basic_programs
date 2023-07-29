import java.util.*;
public class Main {
	
	public static void categorizeAge(int age)
	{ 
	if (age>=0 && age<=12) {
		System.out.println("child");
	}
	else if(age>=13 && age<=19) {
		System.out.println("teen");
	}
	else if (age>=20 && age<=59) {
		System.out.println("adult");
	}
	else {
		System.out.println("senior");
	}
	}
	public static void main(String[] args)
	{ 
		Scanner sc= new Scanner(System.in);
		categorizeAge(sc.nextInt());
	} 
}

