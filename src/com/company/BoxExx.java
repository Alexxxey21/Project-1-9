package com.company;

// Полная реализация BoxWeight2

class BoxExx {
    private double width;
    private double height;
    private double depth;


        // сконструировать клон объекта
        BoxExx(BoxExx ob) { // передать объект конструктору
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }

        // конструктор, применяемый при указании всех размеров
        BoxExx (double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }

        // конструктор, применяемый в отсутствие размеров
        BoxExx() {
            width = -1; // значение -1 служит для обозначения
            height = -1; // неинициализированного
            depth = -1; // параллелепипида
        }

        // конструктор, применяемый при создании куба
        BoxExx(double len) {
            width = height = depth = len;
        }

        // рассчитать и возвратить объем
        double volume() {
            return width * height * depth;
        }
    }


    // Теперь в классе BoxWeight2 полностью реализованы все конструкторы
    class BoxWeight2 extends BoxExx {
        double weight; // вес параллелепипида

        // сконструировать клон объекта
        BoxWeight2(BoxWeight2 ob) {// передать объект конструктору
            super(ob);
            weight = ob.weight;
        }

        // Конструтор применяемый при указании всех параметров
        BoxWeight2(double w, double h, double d, double m) {
            super(w, h, d); // вызвать конструктор из суперкласса
            weight = m;
        }

        // конструктор применяемый по умолчанию
        BoxWeight2() {
            super();
            weight = -1;
        }

        // конструктор применяемый при создании куба
        BoxWeight2(double len, double m) {
            super(len);
            weight = m;
        }
    }
    class DemoSuper {
        public static void main(String args[]) {
            BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
            BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
            BoxWeight2 mybox3 = new BoxWeight2(); // по умолчанию
            BoxWeight2 mycube = new BoxWeight2(3, 2);
            BoxWeight2 myclone = new BoxWeight2(mybox1);
            double vol;

            vol = mybox1.volume();
            System.out.println("Объем mybox1 равен " + vol);
            System.out.println("Вес mybox1 равен " + mybox1.weight);
            System.out.println();

            vol = mybox2.volume();
            System.out.println("Объем mybox2 равен " + vol);
            System.out.println("Вес mybox2 равен " + mybox2.weight);
            System.out.println();

            vol = mybox3.volume();
            System.out.println("Объем mybox3 равен " + vol);
            System.out.println("Вес mybox3 равен " + mybox3.weight);
            System.out.println();

            vol = myclone.volume();
            System.out.println("Объем myclone равен " + vol);
            System.out.println("Вес myclone равен " + myclone.weight);
            System.out.println();

            vol = mycube.volume();
            System.out.println("Объем mycube равен " + vol);
            System.out.println("Вес mycube равен " + mycube.weight);
            System.out.println();

        }
    }











