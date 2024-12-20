import java.util.Scanner;

public class square implements shapes {
	int side;
	double area1;
	@Override
	public void calculate() {
		area1=side*side;
	}
	@Override
	public void display() {
		System.out.println("area of square"+area1);
    }
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side");
		side=sc.nextInt();
	}
}
