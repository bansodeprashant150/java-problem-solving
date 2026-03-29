import java.util.*;
public class Lexicographyproblem1{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(s1.length()+s2.length());
    if(s1.compareTo(s2) > 0)
    {
    System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }

    String s1_cap = s1.substring(0,1).toUpperCase()+s1.substring(1);
    String s2_cap = s2.substring(0,1).toUpperCase()+s2.substring(1);
    System.out.println(s1_cap+" "+s2_cap);

}    
}
