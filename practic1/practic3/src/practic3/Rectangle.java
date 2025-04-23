package practic3;

public class Rectangle implements shape{
	//長さと幅それぞれの変数を設置する
	private double length; //長さ
	private double width; //幅
	
	//コンストラクタ
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	//shapeから継承したareaメソッドとperimeterメソッドを作成する
	@Override
	public double area() {
		return length*width/2;
	}
	
	@Override
	public double perimeter() {
		return length*2+width*2;
	}	
}
