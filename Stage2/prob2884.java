import java.util.*;

public class prob2884{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        
        if(minute >= 45) {
        	minute -= 45;
        	System.out.println(hour + " " + minute);
        }
        else if(hour == 0 && minute < 45) {
        	hour = 23;
        	minute = minute + 60 - 45;
        	System.out.println(hour + " " + minute);
        }
        else {
        	hour -= 1;
        	minute = minute + 60 - 45;
        	System.out.println(hour + " " + minute);
        }
    }
}