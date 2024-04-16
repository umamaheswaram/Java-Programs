package selface;
import java.util.*;
public class PrimeNumberBetween {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo4 d=new Demo4();
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			boolean res=d.prime(i);
			if(res==true) {
				System.out.println(i);
			}
		}
	}
}

class Demo4{
	boolean prime(int n) {
		if(n==0||n==1) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
