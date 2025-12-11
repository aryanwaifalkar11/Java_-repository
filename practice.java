import java.util.Scanner;

public class practice {
	public static int add(int a,int b) {
		int sum;
		sum=a+b;
		System.out.println("Sum="+ sum);
		return sum;
	}
	public static int sub(int a,int b) {
		int sub;
		sub=a-b;
		System.out.println("Sub="+ sub);
		
		return sub;
	}
 
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("hello world!");
		System.out.println("enter string");
		String x= sc.nextLine();
		System.out.println(x);
		System.out.println("Enter a");
		int a= sc.nextInt();
		System.out.println("Enter b");
		int b= sc.nextInt();
		add(a,b);
		sub(a,b);
		
		sc.close();
	}
}
