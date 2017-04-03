package com.company;

// Возврат объекта
public class Vozvrat {
    int a;

    Vozvrat(int i) {
        a = i;
    }
    Vozvrat incrByTen() {
        Vozvrat temp = new Vozvrat(a+10);
        return temp;
    }
}

class RetOb {
    public static void main(String args[]) {
        Vozvrat ob1 = new Vozvrat(2);
        Vozvrat ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения знпчения: " + ob2.a);
    }
}
