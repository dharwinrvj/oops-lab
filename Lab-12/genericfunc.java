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

    generic(T[] val) {
        this.val = val;
    }

    void oddCount() {
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            if ((val[i].doubleValue() % 2.0) == 1.0)
                count++;

        }
        System.out.println("No. of Odd integers: " + count);
    }

    void exchangePosition() {
        T temp;
        System.out.print("Before exchanging elements: ");
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
        System.out.print("After exchanging elements at the position 2 and 5: ");
        temp = val[1];
        val[1] = val[4];
        val[4] = temp;
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
    }

    public void maxInRange() {
        System.out.print("Find maximum element in the range(2,6): ");
        T temp;
        for (int i = 1; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {

                if (val[i].doubleValue() > val[j].doubleValue()) {
                    temp = val[i];
                    val[i] = val[j];
                    val[j] = temp;
                }
            }
        }
        System.out.println(val[4]);

    }
}