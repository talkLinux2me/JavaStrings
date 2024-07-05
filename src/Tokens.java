import java.io.*;
import java.util.*;
public class Tokens {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
            scan.close();
            String[] array = s.split("[ !,?._'@]+");

            int counts = 0;

            for (String count : array) {
                if (!count.isEmpty()) {
                    counts++;
                }
            }
            System.out.println(counts);
            for (String string : array) {
                if (!string.isEmpty()) {
                    System.out.println(string);
                }
            }
        }


}