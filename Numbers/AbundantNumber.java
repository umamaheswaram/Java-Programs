package selface;
import java.util.*;
public class AbundantNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean res=Abunt.abunt(num);
		if(res==true) {
			System.out.println("Abundant Number");
		}
		else {
			System.out.println("Not Abundant Number");
		}
	}
}

class Abunt{
	static boolean abunt(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum>num) {
			return true;
		}
		else {
			return false;
		}
	}
}