import java.util.*;

public class telephone {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float amt = 0, s = 0;
        ArrayList<Float> bill = new ArrayList<>();
        System.out.println("Enter telephone bill amount for 12 months");
        for (int i = 1; i <= 12; i++) {
            amt = obj.nextInt();
            bill.add(amt);
        }
        for (float j : bill) {
            s = s + j;
        }
        Collections.sort(bill);
        System.out.println("Average: " + (s / 12));
        System.out.println("Max amount: " + bill.get(0));
        Collections.sort(bill, Collections.reverseOrder());
        System.out.println("Min amount: " + bill.get(0));
    }
}