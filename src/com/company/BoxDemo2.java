package com.company;

// В этой программе объявляются два объекта класса Box

class Box1 {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String args[]) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //* присвоить другие значение переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелепипида
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // рассчитать объем второго параллелепипида
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}