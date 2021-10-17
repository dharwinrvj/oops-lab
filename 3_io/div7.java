public class div7 {
    public static void main(String args[]) {
        System.out.println("Numbers divisible by 7 between 100 and 200:");
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0)
                System.out.println(i);
        }
    }
}