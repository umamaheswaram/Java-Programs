package selface;
import java.util.*;
public class ArmstrongNumbersRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++) {
			int power=Demo9.count(i);
			int res=Demo9.sum(i, power);
			if(i==res) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count = "+count);
	}
}


class Demo9{
	static int count(int num) {
		int count=0;
		while(num!=0) {
			int digit=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	
	static int sum(int num,int power) {
		int sum=0;
		if(num==0) {
			return 0;
		}
		while(num!=0) {
			int digit=num%10;
			int value=(int)Math.pow(digit, power);
			sum=sum+value;
			num=num/10;
		}
		return sum;
	}
}