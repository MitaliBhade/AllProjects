package Codes;

public class intersetionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1 ,2 ,3 ,4,5};
		int array1[] = { 4, 6,5,7 ,1};
		boolean flag = false;
		
		for( int i = 0 ; i < array.length ; i ++) {
			
			for( int j = 0 ; j < array1.length ; j ++)
			{
				
				if(array[i] == array1[j]) {
				
				System.out.println("Repeated chars of array are " + array1[j]);
				
			
			}
		}
	}

}
}
