package selface;
import java.util.*;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Strong st=new Strong();
		boolean res=st.detect(num);
		if(res==true) {
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}

class Strong{
	int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	boolean detect(int num) {
		int temp=num;
		int sum=0;
		int digit=0;
		while(temp!=0) {
			digit=temp%10;
			sum=sum+fact(digit);
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
}