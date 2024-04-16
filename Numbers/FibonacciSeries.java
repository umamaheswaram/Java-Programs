package selface;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	}
}

class Fib{
	void fib(int num) {
		int num1=0;
		int num2=1;
		if(num==1) {
			System.out.println(num1);
		}
		else if(num==2) {
			System.out.println(num2);
		}
		else {
			System.out.println(num1+" ,"+num2);
		}
		for(int i=3;i<=num;i++) {
			int fib=num1+num2;
			System.out.println(fib+" ");
			num1=num2;
			num2=fib;
		}
		
	}
}
