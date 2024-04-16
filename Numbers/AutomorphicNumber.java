package selface;
import java.util.*;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean res=Auto.auto(num);
		if(res==true) {
			System.out.println("Auto Morphic");
		}
		else {
			System.out.println("Not Auto Morphic");
		}
	}
}

class Auto{
	static boolean auto(int num) {
		int square=num*num;
		while(num!=0) {
			if(num%10!=square%10) {
				return false;
			}
			num=num/10;
			square=square/10;
		}
		return true;
	}
}