package selface;

import java.util.*;
public class GreatestofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("Number1 is Greater "+num1);
		}
		else {
			System.out.println("Number2 is Grater "+num2);
		}
		sc.close();
	}
}
