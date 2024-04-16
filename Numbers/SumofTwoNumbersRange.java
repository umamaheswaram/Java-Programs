package selface;
import java.util.*;
public class SumofTwoNumbersRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Demo2 d=new Demo2();
		int res=d.sum(a, b);
		System.out.println(res);
	}
}

class Demo2{
	public int sum(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
