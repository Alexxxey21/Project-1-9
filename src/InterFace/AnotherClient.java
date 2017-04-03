package InterFace;

// Еще одна реализация интерфейса Callback

class AnotherClient implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p){

        System.out.println("Еще один вариант метода callback()");

        System.out.println("р в квдрате равно " + (p*p));
    }
}

