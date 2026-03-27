import java.util.*;

public class findday {
    
    public static String FindDay(int month, int day, int year){
        Calendar cal=Calendar.getInstance();
        cal.set(year, month-1,day);
        int DayOfWeek=cal.get(Calendar.DAY_OF_WEEK);

        String[] days={
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" , "FRIDAY", "SATURDAY"
        };
        return days[DayOfWeek-1];
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The month");
        int month=sc.nextInt();
        System.out.println("Enter The day");
        int day=sc.nextInt();
        System.out.println("Enter The year");
        int year=sc.nextInt();

        String result=FindDay(month,day,year);
        System.out.println("Day is : "+ result);
        sc.close();
    }
}
