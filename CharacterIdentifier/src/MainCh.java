import java.nio.charset.CharacterCodingException;
import java.util.Scanner;

public class MainCh {
public static void identifyCharecter(char ch) {
	if (Character.isDigit(ch)) {
		System.out.println("Entered charecter "+ch+" is Digit");
	}
	else if(!Character.isLetter(ch)) {
		System.out.println("Entered charecter "+ch+" is special charecter");
	}
	else {
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		if(Character.isLowerCase(ch)) {
			System.out.println("Entered character "+ch+" is lower casse vowel");
		}
		else{
			System.out.println("Entered chareecter "+ch+" is upper case vowel");
		}
		break;
		default:
			if(Character.isLowerCase(ch)){
				System.out.println("Entered character "+ch+ "is consonent of lowercase");
			}
			else{
				System.out.println("Entered chareacter "+ch+ " is consonent of uppercase");
			}
		}
	}
}


public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a charecter");
	identifyCharecter(sc.next().charAt(0));
}
}