package project1;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        TestPrime s1 = new TestPrime();
        Scanner sc = new Scanner(System.in);
    s1.init();
    s1.display();
        System.out.println(s1.array[0][2]);
    s1.getPrimeTotalNumber();
    s1.getPrimeAndPosition();
    s1.setNumber(11);
    s1.test1();
    }
}