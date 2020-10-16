public class genericsort {
    public static void main(String[] args) {
        Integer a[] = { 22, 33, 44, 55, 98, 23, 786, 104 };
        Float b[] = { 3f, 89.9f, 778.87f, 34.898f, 11.431f };
        Double c[] = { 233.9766, 677.985, 9076.456, 8888.99975, 1010101.887655, 277637.65442, 66.787556 };
        sort<Integer> obj1 = new sort<>(a);
        sort<Float> obj2 = new sort<>(b);
        sort<Double> obj3 = new sort<>(c);
        obj1.descending();
        obj2.descending();
        obj3.descending();
    }
}

class sort<T extends Number> {
    T[] val;

    sort(T[] val) {
        this.val = val;
    }

    void descending() {
        T temp;
        for (int i = 0; i < val.length; i++) {
            for (int j = i + 1; j < val.length; j++) {

                if (val[i].doubleValue() < val[j].doubleValue()) {
                    temp = val[i];
                    val[i] = val[j];
                    val[j] = temp;
                }
            }
        }
        System.out.print("Sorted values: ");
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
    }
}