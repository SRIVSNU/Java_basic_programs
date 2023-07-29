
public class FindNum {
boolean armStrong(int n) {
	int org=n;
	int count=0;
	int arm=0;
	
	public int cal(int n,int count) {
		FindNum.armStrong(count);
		while(n!=0) {
			n=n/10;
			count++;
		}
	
	}
	while(n!=0) {
		
		int rem=n%10;
		arm=(int) (arm+(Math.pow(rem,count)));
		n=n/10;
		
		}
		
	
	
	System.out.println("result of the given number "+org+" is "+arm);
	if(org==arm) {
		return true;
	}
	else {
		return false;
	}
	
	
}
}
