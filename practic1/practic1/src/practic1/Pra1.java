package practic1;

public class Pra1 {
	public static void main(String[] args) {
		
	//文字列型の変数を2つ（変数名：str1, str2）用意してください。それぞれの変数に「aaa」「bbb」を代入してください。
	//代入した値を入れ替えてください。	
		String str1 = "aaa";
        String str2 = "bbb";
        
        System.out.println("str1 = "+str1); 
        System.out.println("str2 = "+str2); 
        
        String str3 = str1;
        str1=str2;
        str2=str3;
        
        System.out.println("str1 = "+str1); 
        System.out.println("str2 = "+str2); 
	}

}
