import java.util.Scanner;

public class circle implements shapes{
	static double pi=3.14;
	int r;
	double area;
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextInt();
	}
	@Override
	public void calculate() {
		area=pi*r*r;
	}
	@Override
	public void display() {
		System.out.println("area of circle"+area);
    }
	
}
