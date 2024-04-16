package selface;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Demo3 d=new Demo3();
		int res=d.palidrome(num);
		if(num==res) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}

class Demo3{
	int palidrome(int num) {
		int rev=0;
		int digit=0;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
}