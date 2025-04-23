package practic2;

/*main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラ
スをそれぞれ作成してください。関数は静的メソッドとして作成してください。
main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の静的メソッドを使用し、
計算を行ってください。*/


public class Pra3 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

   
		Pra3_1.add(num1, num2); 
		Pra3_2.subtract(num1, num2);
		Pra3_3.multiply(num1,num2);
		Pra3_4.divide(num1, num2);
	}
}

class Pra3_1{
	public static void add(int a, int b) {
    System.out.println("足し算の結果: " + (a + b));
	}
}

class Pra3_2{
	public static void subtract(int a, int b) {
     System.out.println("引き算の結果: " + (a - b));
	}
}
 
class Pra3_3{
	public static void multiply(int a, int b) {
     System.out.println("掛け算の結果: " + (a * b));
	}
}

class Pra3_4{
	public static void divide(int a, int b) {
		if (b != 0) {
         System.out.println("割り算の結果: " + (a / b));
		} else {
         System.out.println("割り算は0ではできません。");
		}
	}
}


