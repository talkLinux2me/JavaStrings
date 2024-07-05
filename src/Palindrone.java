import java.io.*;
import java.util.*;
public class Palindrone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuffer convertAToStringBuffer = new StringBuffer(A);

        String reverseAndPutBackToString = convertAToStringBuffer.reverse().toString();

        if (A.equals(reverseAndPutBackToString)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    }
