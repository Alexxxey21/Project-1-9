package p2;


class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("конструктор из другого пакета");

        // доступно только для данного класса или пакета
        // System.out.println("n_pri= " + n_pri);

        // доступно только для данного класса
        // System.out.println("n_pri = " + p.n_pri);

        // доступно только для данного класса, подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
