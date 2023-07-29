import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
	switch(productCode) {
	case "P02":
		System.out.println("paper boat");
		break;
	case "P03":
		System.out.println("thumbs up");
		break;
	case "P04":
		System.out.println("sprite");
		break;
	default :
		System.out.println("Coco Cola");
		
	}
	} 
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter code");
		getProduct(sc.next());
	sc.close();
}
}

