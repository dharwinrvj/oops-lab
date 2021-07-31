/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

/**
 *
 * @author dharwin
 */
class Student {
    String name;
    String rollno;

    Student(String n, String r) {
        name = n;
        rollno = r;
    }
}

class Sports extends Student {
    int sport;

    Sports(String n, String r, int sport) {
        super(n, r);
        this.sport = sport;
    }

    void printsport() {
        System.out.println("sports point : " + sport);
    }
}

class Result extends Sports {
    int sum;
    int maths;
    int english;
    int science;

    Result(String n, String r, int sport, int m, int eng, int sc) {
        super(n, r, sport);
        maths = m;
        english = eng;
        science = sc;
    }

    void printresult() {
        System.out.println("your total mark is : " + (maths + english + science));
        if (maths >= 35 && english >= 35 && science >= 35) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
        this.printsport();
    }
}

public class SportsStudent {
    public static void main(String srgs[]) {
        Result one = new Result("Dharwin", "19CSE101", 98, 100, 99, 9);
        Result three = new Result("Vasanth", "19CSE128", 78, 56, 10, 2);
        Result two = new Result("Pandi", "19CSE78", 89, 98, 23, 10);
        one.printresult();
        two.printresult();
        three.printresult();
    }
}
