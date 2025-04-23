package practic1;




public class Pra2_2 {
	public static void main(String[] args) {
	
		System.out.print("arr1: ");
		
		
		int[] arr1 = new int[10];
		for(int i=0; i<10; i++) {
			arr1[i]= i;
			System.out.print(arr1[i]);
		}
		
		
		System.out.println();
		System.out.print("arr2: ");
		
		 int[] arr2 = new int[10]; 
	     for (int i = 0; i < arr1.length; i++) {
	    	 arr2[i] = arr1[arr1.length - 1 - i]; 
	    	 System.out.print(arr2[i]);
	     }
	
	}
}