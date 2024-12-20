import java.util.Scanner;

public class tcf {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator");
			int num=sc.nextInt();
			System.out.println("enter the denominator");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
			}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("inside finally block");
		}

	}

}
