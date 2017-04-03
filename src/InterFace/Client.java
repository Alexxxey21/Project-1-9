package InterFace;



class Client implements Callback{
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, ревлизующих интерыейсы," +
        "могут определяться и другие члены.");
    }
}
