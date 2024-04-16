package selface;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int power=Demo8.count(num);
		int res=Demo8.sum(num, power);
		if(num==res) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}

class Demo8{
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
