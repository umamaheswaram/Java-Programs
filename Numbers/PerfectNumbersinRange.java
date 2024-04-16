package selface;
import java.util.*;
public class PerfectNumbersinRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(int i=num1;i<num2;i++) {
			if(Range.perfect(i)) {
			System.out.println(i);
			}
		}
	}
}


class Range{
	static boolean perfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum==num;
	}
}