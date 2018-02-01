package tcc.entra21.SeamSmart;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//@SpringBootApplication
public class SeamSmartApplication {

	public static void main(String[] args){
		
		DateFormat df = DateFormat.getDateInstance();
		Date data = new Date();
		
		df.format(data);
		try {
			data = df.parse("12/12/1212");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(data);
		
		//SpringApplication.run(SeamSmartApplication.class, args);
	}
}
