package MyPack;

public class Balance1 {
    String name;
    double bal;

    public Balance1(String n, double b) {
        name = n;
        bal = b;
    }

    public void  show() {
        if (bal<0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String args[]) {
        MyPack.Balance1 current[] = new MyPack.Balance1[3];

        current[0] = new MyPack.Balance1("K.J. Fielding", 123.23);
        current[1] = new MyPack.Balance1("Will Tell", 157.02);
        current[2] = new MyPack.Balance1("Tom Jackson", -12.33);

        for (int i = 0; i < 3; i++) current[i].show();
    }
}