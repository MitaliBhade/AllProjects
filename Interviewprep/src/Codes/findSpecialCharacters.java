package Codes;

public class findSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "MitaliBhade!";
		char[] list = myString.toCharArray();
		System.out.println(list);
		for(int i = 0 ; i < list.length ; i ++)
		{
			
			if( list[i] == '!' ) {
				
				System.out.println("Unique charater" + list[i]); 
			}
		}
	}

}
