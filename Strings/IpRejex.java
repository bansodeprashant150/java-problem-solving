import java.util.Scanner;

public class IpRejex {

    public static boolean isValidIp(String ip){
        String[] parts=ip.split("\\.");

        if(parts.length!=4) return false;

        for(String part: parts){
            if(part.length()==0|| part.length()>3) return false;

            int num= Integer.parseInt(part);

            if (num<0||num>255) return false;

            if(part.length()>1 && part.charAt(0)=='0')return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.next();
       
        if(isValidIp(ip)==true){
            System.out.println("Valid");
        }
        else{System.out.println("Invalid");}
    }
}
