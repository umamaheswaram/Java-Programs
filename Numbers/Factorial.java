package selface;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		factal.fact(num);
	}
}

class factal{
	static void fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
	}
}