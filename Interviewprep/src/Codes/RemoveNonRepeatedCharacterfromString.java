package Codes;

public class RemoveNonRepeatedCharacterfromString {
//remove unique characters
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mitali";
		
		//char[] charlist = name.toCharArray();
		boolean unique = true;
		//System.out.println(charlist);
		int i ,j ;
		for( i = 0 ; i <= name.length() ; i ++) 
		{
			for( j = i +1 ; j < name.length() ; j ++)
			{
				
				if (/*i != j && */name.charAt(i) == name.charAt(j)) {
				     unique = false;
				     break;
				    }
				
				
			}	
			 if (unique) {
				    System.out.println("The first non repeated character in String is: " + name.charAt(i));
				    break;
				   }
			
		}
		
		
	}

}
