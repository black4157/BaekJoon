import java.util.*;

public class prob14681{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        
        if(a > 0 && b > 0) System.out.println("1");
        else if(a < 0 && b > 0) System.out.println("2");
        else if(a < 0 && b < 0) System.out.println("3");
        else System.out.println("4");
    }
}