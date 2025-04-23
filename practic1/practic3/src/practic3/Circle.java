package practic3;

public class Circle implements shape{
	private double radius; 
	
	//コンストラクタ
	public Circle(double radius) {
		this.radius=radius;
	}
	
	//shapeから継承したareaメソッドとperimeterメソッドを作成する
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}	
	@Override
	public double perimeter() {
		return Math.PI * radius * 2;
	}
}
