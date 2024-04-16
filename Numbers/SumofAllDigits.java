package selface;
import java.util.*;
public class SumofAllDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo5 d=new Demo5();
		int num=sc.nextInt();
		int res=d.sum(num);
		System.out.println(res);
	}
}

class Demo5{
	int sum(int num) {
		int digit=0;
		int sum=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
}
