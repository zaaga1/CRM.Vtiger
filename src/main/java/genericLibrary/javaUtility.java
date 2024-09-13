package genericLibrary;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {

	
		public String handlingCalendar(String CustomizedFormat)
		{
			Calendar cal = Calendar.getInstance();
			 Date d = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat(CustomizedFormat);
			String currentDate = sdf.format(d);
			return currentDate;
			
		}
		public long generateRandomNumber(long range){
			Random r = new Random();
			long num = r.nextLong();
			return num;
			
		}

	}


