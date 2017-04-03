package com.company;

// определить внутренний класс в цикле for
public class Outer1 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner1 {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner1 inner1 = new Inner1();
            inner1.display();
        }
    }
}
class InnerClassDemo1 {
    public static void main(String args[]) {
        Outer1 outer1 = new Outer1();
        outer1.test();
    }
}