import java.io.*;
import java.util.*;

public class Token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        System.out.println(s);
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String word : tokens) {
            System.out.println(word);
        }
    }
}
