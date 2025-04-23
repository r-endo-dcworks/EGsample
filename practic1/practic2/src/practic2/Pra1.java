package practic2;

import java.util.Scanner;

public class Pra1 {
	public static void main(String[] args) {	
	
	//数値（int）の引数を2つ受け取り、足し算を行う関数を作成してください。
	//作成した関数をmain関数で使用し、結果を標準出力で表示してください。
	//※足し算の関数に渡す引数の値は、数値（int）であれば何でも良い
	
		//Scannerクラスのインスタンス化
		Scanner scanner = new Scanner(System.in);
		
		//一つ目の数字の入力
		System.out.print("一つ目の数字を入力してください > ");
		int number1 = scanner.nextInt();
		
		//二つ目の数字の入力
		System.out.print("二つ目の数字を入力してください > ");
		int number2 = scanner.nextInt();
		
		//計算結果の出力
		System.out.println(number1+ "+" +number2 +"=" + (number1 + number2));
		
		scanner.close();
	
		
	}
}
