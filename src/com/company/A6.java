package com.company;

// Динамическая диспетчеризация методов
public class A6 {
    void callme() {
        System.out.println("В методе callme() из класса А6");
    }
}
class B6 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme()  из класса В6");
    }
}
class C6 extends A6 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса С6");
    }
}
class Dispatch {
    public static void main(String args[]) {
        A6 a = new A6(); // Объект класса А6
        B6 b = new B6(); // Объект класса В6
        C6 c = new C6(); // Объект класса С6

        A6 r; // получить ссылку на объект типа А6

        r = a; // переменная r ссылается на объект типа А6
        r.callme(); // вызвать вариант метода callme()
                // определенный в классе А6
        r = b; // переменная r ссылается на объект типа B6
        r.callme(); // вызвать вариант метода callme()
        // определенный в классе B6
        r = c; // переменная r ссылается на объект типа C6
        r.callme(); // вызвать вариант метода callme()
        // определенный в классе C6


    }
}
