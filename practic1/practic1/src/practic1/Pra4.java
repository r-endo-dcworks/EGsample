package practic1;

public class Pra4 {
	public static void main(String[] args) {
		
	//1から100までの要素を持つ配列を作成し偶数だけ表示してください	
	int[] numbers = new int[100];
	
	for(int i=0; i<100; i++) {
		numbers[i]= i+1;
	}
	
	for(int i=0; i<numbers.length;i++) {
		if(numbers[i] % 2==0) {
			System.out.println(numbers[i]);
		}
	}
	
	
	
	}
}
