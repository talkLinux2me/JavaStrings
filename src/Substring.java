
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String partOfString = S.substring(start,end);
        System.out.println(partOfString);
    }
}


