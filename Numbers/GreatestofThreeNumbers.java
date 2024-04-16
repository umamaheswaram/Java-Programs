package selface;

import java.util.*;
public class GreatestofThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3) {
			System.out.println(num1+" Number1 is greater");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println(num2+" Number2 is greater");
		}
		else {
			System.out.println(num3+" Number3 is greater");
		}
	}
}
