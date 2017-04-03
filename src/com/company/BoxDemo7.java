package com.company;

/* В данном примере программы для инициализации размеров
параллелепипеда в классе Box рименяется параметризированный
конструктор
 */
class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
        Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


public class BoxDemo7 {
    public static void main(String args[]) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // получить объем первого параллелепипида
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипида
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

}
}
