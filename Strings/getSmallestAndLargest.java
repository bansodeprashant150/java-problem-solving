import java.util.Scanner;

public class getSmallestAndLargest{
    

   public static String getSmallestAndLargeststr(String s, int k){

        String smallest="";
        String largest="";

        for(int i=0; i<=s.length()-k;i++){
            String sub=s.substring(i, i+k);
            if(i==0){
                smallest=sub;
                largest=sub;
            }

            if(sub.compareTo(smallest)<0){
                smallest=sub;
            }

            if(sub.compareTo(largest)>0){
                largest=sub;
            }
        }

   return smallest+"\n"+largest;

}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int k=sc.nextInt();
    System.out.println(getSmallestAndLargeststr(s, k));
}
}
