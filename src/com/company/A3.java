package com.company;

// Продемонстрировать порядок вызова конструктора

// создать суперкласс

public class A3 {
    A3() {
        System.out.println("В конструкторе А3.");
    }
}

// создать подкласс путем расширения класса А3
class B3 extends A3 {
    B3() {
        System.out.println("В конструкторе В3.");
    }
}

// создать еще один подкласс путем расширения класса В3.
class C3 extends B3 {
    C3() {
        System.out.println("В конструкторе С3.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C3 c3 = new C3();
    }
}