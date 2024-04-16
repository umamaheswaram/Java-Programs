package selface;
import java.util.*;
public class FactorsofNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		fact.factors(num);
	}
}


class fact{
	static void factors(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}