package practic1;

import java.util.HashMap;
import java.util.Map;

public class Pra5 {
	public static void main(String[] args) {
		
	//	キーに「1から5」、値に「りんご、いちご、みかん、バナナ、メロン」を順にセットした
	//HashMapを作成し、キーと値を一つずつ表示してください
	
	Map<Integer,String> map = new HashMap<>();
	map.put(1, "りんご");
	map.put(2, "いちご");
	map.put(3, "みかん");
	map.put(4, "バナナ");
	map.put(5, "メロン");
	
	map.forEach((key,value) -> {
		System.out.println(key + ":" + value);
	});
		
	}

}
