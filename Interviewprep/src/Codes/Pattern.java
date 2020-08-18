package Codes;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");  //if we take i same number pattern(Bottom part) and j for incremental pattenr(TOP part)
            }
             
            System.out.println();
        }
        
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--) //j = row for 3rd pattern
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
        for (int i = rows; i >= 1; i--)  //to start from now of row,ulta pattern 4th
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        //Close the resources
         
        sc.close();
    }
}
