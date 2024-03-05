import java.util.*;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeCal {
    public static void main(String[] args) {
        
        while(true){
      
      
      java.util.Date date= new Date();
      Calendar cal = Calendar.getInstance();
      cal.setTime(date);
            
      //all start date variables
      long startDateYear = 0;
      long startDateMonth = 0;
      long startDateDay = 0;
      long startDateHour = 0;
      long startDateMinute = 0;
      long startDateSecond = 0;
      
      long totalStartSeconds = 0;
      
      //all end date variables
      long endDateYear = 0;
      long endDateMonth = 0;
      long endDateDay = 0;
      long endDateHour = 0;
      long endDateMinute = 0;
      long endDateSecond = 0;
      
      long totalEndSeconds = 0;
      
      //all manual current date variables
      
        long currDateYear = 0;
        long currDateMonth = 0;
        long currDateDay = 0;
        long currDateHour = 0;
        long currDateMinute = 0;
        long currDateSecond = 0;
        
        
      if(true){
        currDateYear = cal.get(Calendar.YEAR);
        currDateMonth = (cal.get(Calendar.MONTH) + 1);
        currDateDay = cal.get(Calendar.DATE);
        currDateHour = (cal.get(Calendar.HOUR) + 8);
        currDateMinute = cal.get(Calendar.MINUTE);
        currDateSecond = cal.get(Calendar.SECOND);
      }
      long totalCurrSeconds = 0;
      
      
      //leap year calculator
      if(startDateYear%4==0 && endDateMonth < 2){
        totalStartSeconds = totalStartSeconds - 86400;
      }
      totalStartSeconds = totalStartSeconds + (startDateYear/4)*86400;
      
      //year seconds
      totalStartSeconds = totalStartSeconds + (startDateYear*31536000);
      
      //january seconds
      if(startDateMonth >= 1){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //february seconds
      if(startDateMonth >= 2){
        totalStartSeconds = totalStartSeconds + 2419200;
      }
      //march seconds
      if(startDateMonth >= 3){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //april seconds
      if(startDateMonth >= 4){
        totalStartSeconds = totalStartSeconds + 2592000;
      }
      //may seconds
      if(startDateMonth >= 5){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //june seconds
      if(startDateMonth >= 6){
        totalStartSeconds = totalStartSeconds + 2592000;
      }
      //july seconds
      if(startDateMonth >= 7){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //august seconds
      if(startDateMonth >= 8){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //september seconds
      if(startDateMonth >= 9){
        totalStartSeconds = totalStartSeconds + 2592000;
      }
      //october seconds
      if(startDateMonth >= 10){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      //november seconds
      if(startDateMonth >= 11){
        totalStartSeconds = totalStartSeconds + 2592000;
      }
      //december seconds
      if(startDateMonth >= 12){
        totalStartSeconds = totalStartSeconds + 2678400;
      }
      
      //day seconds
      totalStartSeconds = totalStartSeconds + (startDateDay*86400);
      
      //hour seconds
      totalStartSeconds = totalStartSeconds + (startDateHour*3600);
      
      //minute seconds
      totalStartSeconds = totalStartSeconds + (startDateMinute*60);
      
      //seconds
      totalStartSeconds = totalStartSeconds + startDateSecond;
      
      
            //leap year calculator
      if(endDateYear%4==0 && endDateMonth < 2){
        totalEndSeconds = totalEndSeconds - 86400;
      }
      totalEndSeconds = totalEndSeconds + (endDateYear/4)*86400;
      
      //year seconds
      totalEndSeconds = totalEndSeconds + (endDateYear*31536000);
      
      //january seconds
      if(endDateMonth >= 1){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //february seconds
      if(endDateMonth >= 2){
        totalEndSeconds = totalEndSeconds + 2419200;
      }
      //march seconds
      if(endDateMonth >= 3){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //april seconds
      if(endDateMonth >= 4){
        totalEndSeconds = totalEndSeconds + 2592000;
      }
      //may seconds
      if(endDateMonth >= 5){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //june seconds
      if(endDateMonth >= 6){
        totalEndSeconds = totalEndSeconds + 2592000;
      }
      //july seconds
      if(endDateMonth >= 7){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //august seconds
      if(endDateMonth >= 8){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //september seconds
      if(endDateMonth >= 9){
        totalEndSeconds = totalEndSeconds + 2592000;
      }
      //october seconds
      if(endDateMonth >= 10){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      //november seconds
      if(endDateMonth >= 11){
        totalEndSeconds = totalEndSeconds + 2592000;
      }
      //december seconds
      if(endDateMonth >= 12){
        totalEndSeconds = totalEndSeconds + 2678400;
      }
      
      //day seconds
      totalEndSeconds = totalEndSeconds + (endDateDay*86400);
      
      //hour seconds
      totalEndSeconds = totalEndSeconds + (endDateHour*3600);
      
      //minute seconds
      totalEndSeconds = totalEndSeconds + (endDateMinute*60);
      
      //seconds
      totalEndSeconds = totalEndSeconds + endDateSecond;
      
      
      //seconds between
      long secondsBetween = (totalEndSeconds - totalStartSeconds);
      
      //days between
      long daysBetween = (secondsBetween / 86400);
      
      //years between
      long yearsBetween = (daysBetween - (totalEndSeconds - totalStartSeconds) / 126144000) / 365;
      
      
      //day remainder
      long dayRemainder = daysBetween % 365;
      
      
      
      //leap year calculator
      if(currDateYear%4==0 && endDateMonth < 2){
        totalCurrSeconds = totalCurrSeconds - 86400;
      }
      totalCurrSeconds = totalCurrSeconds + (currDateYear/4)*86400;
      
      //year seconds
      totalCurrSeconds = totalCurrSeconds + (currDateYear*31536000);
      
      //january seconds
      if(currDateMonth >= 1){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //february seconds
      if(currDateMonth >= 2){
        totalCurrSeconds = totalCurrSeconds + 2419200;
      }
      //march seconds
      if(currDateMonth >= 3){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //april seconds
      if(currDateMonth >= 4){
        totalCurrSeconds = totalCurrSeconds + 2592000;
      }
      //may seconds
      if(currDateMonth >= 5){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //june seconds
      if(currDateMonth >= 6){
        totalCurrSeconds = totalCurrSeconds + 2592000;
      }
      //july seconds
      if(currDateMonth >= 7){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //august seconds
      if(currDateMonth >= 8){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //september seconds
      if(currDateMonth >= 9){
        totalCurrSeconds = totalCurrSeconds + 2592000;
      }
      //october seconds
      if(currDateMonth >= 10){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      //november seconds
      if(currDateMonth >= 11){
        totalCurrSeconds = totalCurrSeconds + 2592000;
      }
      //december seconds
      if(currDateMonth >= 12){
        totalCurrSeconds = totalCurrSeconds + 2678400;
      }
      
      //day seconds
      totalCurrSeconds = totalCurrSeconds + (currDateDay*86400);
      
      //hour seconds
      totalCurrSeconds = totalCurrSeconds + (currDateHour*3600);
      
      //minute seconds
      totalCurrSeconds = totalCurrSeconds + (currDateMinute*60);
      
      //seconds
      totalCurrSeconds = totalCurrSeconds + currDateSecond;
      
      
      long secondsBetweenCurr = totalCurrSeconds - totalStartSeconds;
      
      //days between
      long daysBetweenCurr = ((totalCurrSeconds - totalStartSeconds) / 86400);
      
      //years between
      long yearsBetweenCurr = (daysBetweenCurr - (totalCurrSeconds - totalStartSeconds) / 126144000) / 365;
      
      
      //day remainder
      long dayRemainderCurr = daysBetweenCurr % 365;
      
      double percent = ((secondsBetweenCurr)* 1000000000 / secondsBetween);
      double percentDoub = percent / 10000000;
      
      
      System.out.println("%" + percentDoub);
      
      try {
    Thread.sleep(1000); // delay for 1 second
} catch (InterruptedException e) {
    e.printStackTrace();
}

      
        }
  }
}
