import java.util.*;
public class AreAnagram{
public static boolean areanagrams(String a, String b){
if(a.length()!=b.length()){return false;}


char[] S1=a.toCharArray();
char[] S2=b.toCharArray();
Arrays.sort(S1);
Arrays.sort(S2);
    
    return Arrays.equals(S1,S2);
}
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        
        if(areanagrams(a,b)==true){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}


