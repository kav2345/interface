import java.util.Scanner;

public class rectangle implements shapes{
	double breadth;
	double length;
	double area2;
	@Override
	public void calculate() {
		area2=breadth*length;
	}
	@Override
	public void display() {
		System.out.println("area of rectangle"+area2);
    }
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		length=sc.nextDouble();
		System.out.println("enter the breadth");
		breadth=sc.nextDouble();
	}
}

