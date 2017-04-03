package InterFace;

interface MyIF {
    // Это объявление обычного метода в интерфейсе.
    // он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию
    default String getString(){
        return "Объект типа String по умолчанию";
    }
}

// Реализовать интерфейс MyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе MyIF.
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}
