package selface;
import java.util.*;
public class AmicableNumbersFriendlyFairNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum1=Amicable.amicable(num1);
		int sum2=Amicable.amicable(num2);
		int res1=sum1/num1;
		int res2=sum2/num2;
		if(res1==res2) {
			System.out.println("Friendly Pairs");
		}
		else {
			System.out.println("Not Friendly Pairs");
		}
	}
}

class Amicable{
	static int amicable(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
