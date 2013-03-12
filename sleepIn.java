import java.util.*;
public class sleepIn{

public boolean sleepIn_Hurray( int daycode) {

public enum week{
	Mon("Monday"), 
	Tue("Tuesday"),
	Wed("Wednesday"), 
	Thur("Thursday"), 
	Fri("Friday"), 
	Sat("Saturday"), 
	Sun("Sunday"),
	Vac("Vacation"),
}

private String sel_day;

public void setday(){

     System.out.println("Enter 1 for Monday");
     System.out.println("Enter 2 for Tuesday");
     System.out.println("Enter 3 for Wednesday");
     System.out.println("Enter 4 for Thursday");
     System.out.println("Enter 5 for Friday");
     System.out.println("Enter 6 for Saturday");
     System.out.println("Enter 7 for Sunday");
	 System.out.println("Enter 0 for vacation");
	 
	 switch(daycode){
	 case 0:
	       sel_day = week.Vac;
	       System.out.println("today is " + sel_day);
		   break;
	 case 1:
	       sel_day = week.Mon;
	       System.out.println("today is " + sel_day);
		   break;
     case 2:
	       sel_day = week.Tue;
	       System.out.println("today is " + sel_day);
		   break;
	 case 3:
	       sel_day = week.Wed;
	       System.out.println("today is " + sel_day);
		   break;
     case 4:
	       sel_day = week.Thur; 
	       System.out.println("today is " + sel_day);
		   break;
     case 5:
	       sel_day = week.Fri; 
	       System.out.println("today is " + sel_day);
		   break;
	 case 6:
	       sel_day = week.Sat;
	       System.out.println("today is " + sel_day);
		   break;
     case 7:
	       sel_day = week.Sun;
           System.out.println("today is " + sel_day);
		   break;	 
	 default: 	       
	       System.out.println("Wrong number!");
		   }
   }

public String getday(){
       return sel_day;
      }
	  
public boolean weekdayOrNot(sel_day){
	if (sel_day  = "Monday"||"Tuesday"||"Wednesday"||"Thursday"||"Friday"){
    return true;
    }
	else{
	return false;
	}
}

public boolean vacationOrNot(sel_day){
	if (sel_day  = "vacation"){
    return true;
    }
	else{
	return false;
	}
}	   

	
    if (!weekday || vacation)
	{
	System.out.println(":)");
	   return true;
	}
     else{
	 System.out.println(":(");	 
	   return false;
   }
  }
}

public static void main(string[] args){
   boolean sleepIn_Hurray(int daycode)
   }
}