import java.util.Scanner;

class usernameValidator{

    public static final String regularExpression="^[A-Za-z][A-Za-z0-9_]{7,29}$";
}

public class ValidUsername {

private static final Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        
        int n=Integer.parseInt(scan.nextLine());
        while(n--!=0){
            String username=scan.nextLine();
            if(username.matches(usernameValidator.regularExpression)){
                System.out.println("Valid");
            }
            else {
                System.out.println("InValid");
            }
        }
    }

}
