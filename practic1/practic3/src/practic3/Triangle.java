package practic3;

public class Triangle implements shape{
	private double side; 
	
	//コンストラクタ
	public Triangle(double side) {
		this.side=side;
	}
	
	//shapeから継承したareaメソッドとperimeterメソッドを作成する
	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}	
	@Override
	public double perimeter() {
		return side*3;
	}	
}

