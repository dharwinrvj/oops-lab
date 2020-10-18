import java.util.*;

public class genericfunc {
    public static void main(String[] args) {
        Integer a[] = { 2, 4, 5, 68, 3, 9, 564, 81, 9, 276 };
        Double b[] = { 2.4, 89.767, 9.243, 9.635, 77.3, 9.002, 34.7896, 11.343 };
        Float c[] = { 3f, 89.9f, 778.87f, 34.898f, 11.431f };
        generic<Integer> obj1 = new generic<>(a);
        generic<Double> obj2 = new generic<>(b);
        generic<Float> obj3 = new generic<>(c);
        obj1.oddCount();
        obj1.exchangePosition();
        obj1.maxInRange();
        obj2.oddCount();
        obj2.exchangePosition();
        obj2.maxInRange();
        obj3.oddCount();
        obj3.exchangePosition();
        obj3.maxInRange();
    }
}

class generic<T extends Number> {
    T[] val;
    Scanner obj = new Scanner(System.in);

    generic(T[] val) {
        this.val = val;
    }

    void oddCount() {
        int count = 0, flag = 0;
        for (int i = 0; i < val.length; i++) {
            if ((val[i].intValue() % 2) == 1 && val[i] instanceof Integer)
                count++;
            if (val[i] instanceof Integer)
                flag = 1;
            else {
                flag = -1;
                break;
            }

        }
        System.out.println("No. of Odd integers: " + count);
        if (flag == -1)
            System.out.println("It is Only available for Integers");
    }

    void exchangePosition() {
        T temp;
        System.out.print("Before exchanging elements: ");
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
        System.out.println("Enter 2 position to exchange values: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        if (a > 0 && a <= val.length) {
            System.out.print("After exchanging elements at the position " + a + " and " + b + ": ");
            temp = val[a - 1];
            val[a - 1] = val[b - 1];
            val[b - 1] = temp;
            for (int i = 0; i < val.length; i++) {
                System.out.print(val[i] + " ");
            }
            System.out.println();
        } else
            System.out.println("Enter correct positions");
    }

    public void maxInRange() {
        System.out.println("Enter a lower and upper range: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        if (a > 0 && b <= val.length) {
            System.out.print("Finding maximum element in the range(" + a + "," + b + "): ");
            T temp;
            for (int i = a - 1; i < b - 1; i++) {
                for (int j = i + 1; j < b - 1; j++) {

                    if (val[i].doubleValue() > val[j].doubleValue()) {
                        temp = val[i];
                        val[i] = val[j];
                        val[j] = temp;
                    }
                }
            }
            System.out.println(val[b - 2]);
        } else
            System.out.println("Enter a correct range");

    }
}