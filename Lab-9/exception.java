public class exception {
    public static void main(String[] args) {
        int a = 4, b = 0;
        int arr[] = new int[4];
        String str[] = new String[2];
        arith(a, b);
        arrayexcep(arr);
        numformat(a);
        stringexcep(str);
    }

    static void arith(int a, int b) {
        try {
            a = a / b;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    static void arrayexcep(int arr[]) {
        try {
            arr[4] = 50;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    static void numformat(int a) {
        try {
            a = Integer.parseInt(" 1 ");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    static void stringexcep(String str[]) {
        try {
            str[4] = "It is a string";
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
