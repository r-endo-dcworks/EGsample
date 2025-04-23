package practic2;

//上記で作成したクラスに、足し算の関数と同様2つの引数を受け取り、
//引き算、掛け算、割り算を行う関数を作成してください。
//作成した関数をmain関数で使用し、結果を標準出力で表示してください。


import java.util.Scanner;

public class Pra2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//一つ目の数字の入力
		System.out.print("一つ目の数字を入力してください > ");
		int number1 = scanner.nextInt();
		
		//二つ目の数字の入力
		System.out.print("二つ目の数字を入力してください > ");
		int number2 = scanner.nextInt();
		
		//計算結果の出力
		System.out.println(number1+ "+" +number2 +"=" + (number1 + number2));
		System.out.println(number1+ "-" +number2 +"=" + (number1 - number2));
		System.out.println(number1+ "*" +number2 +"=" + (number1 * number2));
		System.out.println(number1+ "/" +number2 +"=" + (number1 / number2));
		scanner.close();
			
	}
}
