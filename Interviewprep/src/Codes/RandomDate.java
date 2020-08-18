package Codes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class RandomDate {
	
	public static void main(String[] args) {
		 
		 
        for (int i = 0; i < 3; i++) {
            LocalDate randomDate = createRandomDate(2000, 2020);
       System.out.println(randomDate);
       String formattedDate = randomDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yy"));
       System.out.println(formattedDate);
           
        }
    }
	
	public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
	  public static LocalDate createRandomDate(int startYear, int endYear) {
	        int day = createRandomIntBetween(1, 30);
	        int month = createRandomIntBetween(1, 12);
	        int year = createRandomIntBetween(startYear, endYear);
	        return LocalDate.of(year, month, day) ;
	    }

}
