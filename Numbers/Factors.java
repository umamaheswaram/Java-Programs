package selface;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean res=Factor.factor(num);
		if(res==true) {
			System.out.println("Factor");
		}
		else {
			System.out.println("Not factor");
		}
	}
}

class Factor{
	static boolean factor(int num) {
		if(10%num==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
