package com.company;

/* В данном примере конструкторы определяются в классе Box для
инициализации размеров параллелепипеда тремя разными способами
 */
class BoxConstruct {
    double width;
    double height;
    double depth;

    // конструктор, используемый при указании всех размеров
    BoxConstruct(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //конструктор, используемый, когда ни один из размеров не указан
    BoxConstruct() {
        width = -1; // использовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемый при создании куба
    BoxConstruct(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return  width * height * depth;
    }
}

class BoxConstruct1 {
    public static void main(String args[]) {
        // создать параллелепипеда, используя разные
        // конструкторы
        BoxConstruct mybox1 = new BoxConstruct(10, 20,15);
        BoxConstruct mybox2 = new BoxConstruct();
        BoxConstruct mycube = new BoxConstruct(7);

    double vol;

    // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем втрого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);


    }
}
