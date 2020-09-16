import java.util.*;

public class strtoint {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter numeric String: ");
        String s1 = obj.next();
        int parse = 0, s = 0;
        for (int i = 0; i < s1.length(); i++) {
            parse = Integer.parseInt(s1.substring(i, i + 1));
            System.out.println(parse);
            s = s + parse;
        }
        System.out.print("Sum: ");
        System.out.println(s);
    }
}