package selface;
import java.util.*;
public class SumofnNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo1 d=new Demo1();
		int num=sc.nextInt();
		int res=d.sum(num);
		System.out.println(res);
	}
}

class Demo1{
	public int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
