package selface;
import java.util.*;
public class PowerofNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int exp=sc.nextInt();
		/*int res=(int)Math.pow(base,exp);
		System.out.println(res);*/
		Demo7 d=new Demo7();
		int res=d.power(base, exp);
		System.out.println(res);
	}
}

class Demo7{
	int power(int base, int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
}