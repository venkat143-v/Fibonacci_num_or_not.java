import java.util.*;
public class Fibonacci_num_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt(); // 5		
		int t1 = 0,t2 =1, sum =0;	
		while(sum < n) // 5 < 5
		{
			sum = t1+t2; // sum =2+3 = 5
			t1 = t2; // t1 = 3
			t2 = sum;// t2 = 5
		}
		if (sum == n)
			System.out.print("Fibonacci Number");
		else
			System.out.print("Not Fibonacci Number");
	} }