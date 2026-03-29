import java.util.*;

public class Palindrome_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.next();
        int left=0;
        int right=s.length()-1;

        boolean ispalindrome=true;


        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
            {
                ispalindrome=false;
            }

            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
