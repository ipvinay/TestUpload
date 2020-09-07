package card;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;

import com.authentic.authorisation.CurrencyManager;
import com.authentic.batch.xml.Field;

public class TestDecimalTruncate {

	public static void main(String[] args) {
		
		

     
 	String customDate = "20200725";
 	 SimpleDateFormat formatter1=new SimpleDateFormat("ddMMyy");  
    
 	if(customDate != null)
 	{
//customDate = new SimpleDateFormat("ddMMyy").format(customDate);
// 		Date date = (Date) new SimpleDateFormat("ddMMyy").parse(customDate);
 	   try {
		Date date1=(Date) formatter1.parse(customDate);
		System.out.println("custom date   " + date1);	

 	   } catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
 	}

 	
		double d = 1234.32;
       System.out.println("		Math.floor(123.23); === " + 		Math.floor(123.23));
       
       System.out.println(String.valueOf((int)d));
	}

}
