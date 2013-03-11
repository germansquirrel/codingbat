public class sleepIn{

public enum week{Mon("Monday"), Tue("Tuesday"),Wed("Wednesday"), Thur("Thursday"), Fri("Friday"), Sat("Saturday"), Sun("Sunday")}
week sel_day;
private int daycode;
public void setday(){
     System.out.print("Enter 1 for Monday");
     System.out.print("Enter 2 for Tuesday");
     System.out.print("Enter 3 for Wesnesday");
     System.out.print("Enter 4 for Thursday");
     System.out.print("Enter 5 for Friday");
     System.out.print("Enter 6 for Saturday");
     System.out.print("Enter 7 for Sunday");
	 daycode = input.nextInt();
	 switch(daycode)
	 case 1:
	       sel_day =Monday
	 }
if sel_day == 

public boolean sleepIn_Hurray(boolean weekday, boolean vacation) {
    
	
    if (!weekday || vacation)
	{
	   return true;
	}
     else
	   return false;
   }

public static void main(string[] args){
    sleepIn day = new sleepIn();
	System.out.printIn("today is" + day);
	if (!sleepIn_Hurray())
	 {
	  System.out.printIn(":(");
	 }
     else
	 System.out.printIn(":)");
   }
}