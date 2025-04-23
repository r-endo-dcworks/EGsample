package practic2;

/*main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作
成してください。関数は動的メソッドとして作成してください。
また、関数は引数を持たず、クラスのインスタンス変数を使用し計算を行ってください。
main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の動的メソッドを使用し、計算を行って
ください。*/

public class Pra4 {
	public static void main(String[] args) {
		
				
		//Addクラスのインスタンス作成
		Addition addition = new Addition(10, 5);
		Subtract subtract = new Subtract(15,5);
		Multiply multiply = new Multiply(4,5);
		Divide divide = new Divide(8,4);
		
		
		//addメソッドの呼び出し、結果の出力
        System.out.println("Addition: " + addition.a + " + " + addition.b + " = " + addition.add());
        System.out.println("Subtract: " + subtract.a + " - " + subtract.b + " = " + subtract.sub());
        System.out.println("Multiply: " + multiply.a + " * " + multiply.b + " = " + multiply.mul());
        System.out.println("Divide: " + divide.a + " / " + divide.b + " = " + divide.div());
		
	}
}

//足し算クラス
class Addition{
	int a;
	int b;
	
	//コンストラクタ：初期化
	public Addition(int a,int b) {
		this.a = a;
		this.b = b;
	}
	//addメソッド
	public int add() {
		return a + b;
	}
}


//引き算クラス
class Subtract{
	int a;
	int b;
	
	public Subtract(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sub() {
		return a - b;
	}
}


//掛け算クラス
class Multiply{
	int a;
	int b;
	
	public Multiply(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int mul() {
		return a * b;
	}
}

//割り算クラス
class Divide{
	int a;
	int b;
	
	public Divide(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int div() {
		return a / b;
	}
}



