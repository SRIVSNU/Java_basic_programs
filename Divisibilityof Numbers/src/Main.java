
public class Main {
	
public void divTwo(int n) {
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			System.out.println("the numbers divisible by 2 up to "+n+" are "+i);
		}
	}
}

public void divThree(int n) {
	for(int i=0;i<=n;i++) {
			if(i%3==0) {
			System.out.println("the numbers divisible by 3 up to "+n+" are "+i);
		}
		}
}

public void divFive(int n) {
	for (int i=0;i<=n;i++) {
		if(i%5==0) {
			System.out.println("the numbers divisible by 5 up to "+n+" are "+i);
		}
		}
}
		
public void divTwoFive(int n) {
	for(int i=0;i<=n;i++) {
	if(i%5==0 && i%2==0) {
			System.out.println("the numbers divisible by 5 and 2 up to "+n+" are "+i);
		}
	}
}

public void divThreeFive(int n) {
	for(int i=0;i<=n;i++) {
		if(i%3==0 && i%5==0 ) {
			System.out.println("the number divisible by 3 and comes in table 5 are "+i);
		}
}
}
}
