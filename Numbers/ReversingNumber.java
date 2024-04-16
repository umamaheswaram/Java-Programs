package selface;
import java.util.*;
public class ReversingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Demo6 d=new Demo6();
		int num=sc.nextInt();
		int res=d.reverse(num);
		System.out.println(res);
	}
}

class Demo6{
	int reverse(int num) {
		int temp=0;
		int rev = 0;
		while(num!=0) {
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		return rev;
	}
}
