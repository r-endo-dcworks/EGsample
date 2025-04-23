package practic3;

import java.util.Scanner;

//インターフェース
interface shape {
	double area();
	double perimeter();	
}


//以下メインメソッド
public class Pra1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("円の半径を入力してください > ");
	    double radius = scanner.nextDouble();
	
		Rectangle rectangle = new Rectangle(5,7);
		Circle circle = new Circle(radius);
		Triangle triangle = new Triangle(3);
		
		
		
		System.out.println("Rectangle Area: " + rectangle.area());
		System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
		System.out.println();
		
		System.out.println("Circle Area: " + circle.area());
		System.out.println("Circle Perimeter: " + circle.perimeter());
		System.out.println();
		
		System.out.println("Triangle Area: " + triangle.area());
		System.out.println("Triangle Perimeter: " + triangle.perimeter());
		scanner.close();
	 
	}
}
