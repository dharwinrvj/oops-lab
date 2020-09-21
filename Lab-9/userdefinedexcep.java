public class userdefinedexcep {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        PrimeNumber obj1 = new PrimeNumber(a, b);
        try {
            obj1.check();
            obj1.primenumbers();
        } catch (PrimeNumberException e) {
            System.out.println(e);
        }
    }
}

class PrimeNumber {
    int a, b;

    PrimeNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void check() throws PrimeNumberException {
        if (a <= 0 && b <= 0)
            throw new PrimeNumberException("Enter positive integer");
        if (b < a)
            throw new PrimeNumberException("Enter Begining number which is lesser than Ending number");
    }

    void primenumbers() {
        int flag = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = -1;
                    break;
                } else
                    flag = 1;
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}

class PrimeNumberException extends Exception {
    PrimeNumberException(String s) {
        super(s);
    }
}