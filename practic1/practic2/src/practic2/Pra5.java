package practic2;

//X軸（int） 、Y軸（int）の座標を保持するPointクラスを作成してください。
//2点の座標の距離を求める関数を作成し、main関数を持つクラスで計算結果を表示してください。
//2点の座標を計算する計算式： Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

public class Pra5 {
	public static void main(String[] args) {

		Point point = new Point(3,7,4,1);
        System.out.println("座標の距離: " + point.poi());
		
	}
}
//pointクラス

class Point{
	int x1;
	int x2;
	int y1;
	int y2;
	
	public Point(int x1,int x2,int y1,int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	//2点の座標を計算する計算式
	public double poi() {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
