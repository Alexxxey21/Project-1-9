package InterFace;

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main(String args[]){

        MyIFImp obj = new MyIFImp();

        // Метод getNumber() можно взвать, т.к. он явно реализован
        // в классе MyIFIm:
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т. к. в интерфейсе
        // имеется его реализвция по умолчанию:
        System.out.println(obj.getString());
    }
}
