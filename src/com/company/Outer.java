package com.company;

// Продемонстрировать приминение внутреннего класса
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутренний класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}