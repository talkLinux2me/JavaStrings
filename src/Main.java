import java.util.*;

public class Main {
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();

    System.out.println(A.length() + B.length());

    if (A.compareTo(B) < B.compareTo(A)) {
        System.out.println("No");
    }
    else {
        System.out.println("Yes");;
    }

    System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1)) + " " + B.substring(0,1).toUpperCase().concat(B.substring(1)));

    //System.out.println((A.replace('h','H').concat(" " ).concat(B.replace('j', 'J'))));  for a specific circumstance
}
}