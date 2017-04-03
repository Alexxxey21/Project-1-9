package com.company;

// В этой версии класса Boxx один объект допускаутся
// инициализирровать другим объектом
public class Boxx {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конмструктор.
    // В качестве параметра в нем используется объект типа Boxx
    Boxx(Boxx ob) {// передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех размеров
    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор используемый, если ни один из размеров не указан
    Boxx(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
class OverloadCons2 {
    public static void main(String args[]) {
        // создать параллелепипеды, используя
        // разные конструкторы
        Boxx mybox1 = new Boxx(10, 20,15);
        Boxx mybox2 = new Boxx(1);
        Boxx mycube = new Boxx(7);

        Boxx myclone = new Boxx(mybox1);

        // создать копию объекта mybox1
        double vol;

        // получить объем первого параллелепипида
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем втрого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);

        // получить объем втрого параллелепипеда
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);


    }
}

