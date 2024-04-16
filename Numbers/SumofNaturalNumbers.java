package selface;
import java.util.*;
public class SumofNaturalNumbers {
	public static void main(String[] args) {
		Demo d=new Demo();
		int res=d.sum();
		System.out.println(res);
	}
}

class Demo{
	public int sum() {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
