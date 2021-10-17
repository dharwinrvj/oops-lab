public class venuebook {
    public static void main(String[] args) {
        semhallbook b = new semhallbook();
        cse obj1 = new cse(b);
        ece obj2 = new ece(b);
        eee obj3 = new eee(b);
        civil obj4 = new civil(b);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
    }
}

class semhallbook {
    boolean hall[] = { true, true, true };

    synchronized void book(String s1, int no) {
        if (hall[no - 1] == true) {
            System.out.println(s1 + " is allocated for hall-" + no);
            hall[no - 1] = false;
        } else
            System.out.println("hall-" + no + " is not available for " + s1);
    }

}

class cse extends Thread {
    semhallbook b1;

    cse(semhallbook b1) {
        this.b1 = b1;
    }

    public void run() {
        b1.book("cse", 1);
    }

}

class ece extends Thread {
    semhallbook b1;

    ece(semhallbook b1) {
        this.b1 = b1;
    }

    public void run() {
        b1.book("ece", 3);
    }

}

class eee extends Thread {
    semhallbook b1;

    eee(semhallbook b1) {
        this.b1 = b1;
    }

    public void run() {
        b1.book("eee", 2);
    }

}

class civil extends Thread {
    semhallbook b1;

    civil(semhallbook b1) {
        this.b1 = b1;
    }

    public void run() {
        b1.book("civil", 2);
    }

}