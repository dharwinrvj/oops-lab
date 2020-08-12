public class counter {
    public static void main(String[] args) {
        counte.count();
        counte.count();
        counte.count();
        counte.count();
        counte.count();
    }
}

class counte {
    static int j = 1, c = 1;
    static void count() {
        int i = 1;
        System.out.println("Counter - " + (c++));
        System.out.println("value of Normal variable: " + (i++));
        System.out.println("value of Static variable: " + (j++));
    }
}