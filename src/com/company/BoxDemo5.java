package com.company;

class Box5 {
    double width;
    double height;
    double depth;
// рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}

class BoxDemo5 {
    public static void main(String args[]) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //* присвоить другие значение переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипида
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипида
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
