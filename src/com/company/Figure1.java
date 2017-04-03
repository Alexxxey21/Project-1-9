package com.company;

// Применение абстрактных методов и классов
abstract class Figure1 {
double dim1;
double dim2;
Figure1(double a, double b) {
    dim1 = a;
    dim2 = b;
}

// теперь метод area() объявляется абстрактным
    abstract double area();
}

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для прямоугольного треуголника
    double area() {
        System.out.println("В области тругольника.");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas1 {
    public static void main(String args[]) {
        // Figure1 f = new Figure(10, 10); // теперь недопустимо
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1 (10, 8 );
        Figure1 figref; // верно, но объект не создается

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
