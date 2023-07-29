
public class Main {
int reverse(int n) {
	int rev=0;
	while(n!=0) {
		int rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
		
		
	}
	
if(rev==n) {
	System.out.println("pallindrom");
	
}
else {
System.out.println("not pallindrom");
	
}return rev;
}
}
 