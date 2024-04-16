package selface;
import java.util.*;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean res=Harsh.harsh(num);
		if(res==true) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
	}
}


class Harsh{
	static boolean harsh(int num) {
		int original=num;
		int sum=0;
		int digit=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(original%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
}