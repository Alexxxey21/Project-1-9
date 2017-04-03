package com.company;

class Box3 {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипида
    void volume() {
        System.out.print("бъем равен ");
        System.out.println(width * height * depth);
    }

}
public class BoxDemo3 {
    public static void main(String args[]) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //* присвоить другие значение переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объем первого параллелепипида
        mybox1.volume();

        // вывести объем второго параллелепипида
        mybox2.volume();


    }
}

