import factory.Car;
import factory.CarFactory;
import factory.Cars;
public class Runner {
    public static void main(String[] args) {
        CarFactory creater = new CarFactory();
        Car bmw1 = creater.create(Cars.BMW);
        Car mercedes1 = creater.create(Cars.MERCEDES);
        bmw1.print();
        mercedes1.print();
        Car.printMakeOfCar();
        Car.printMakeOfCar(10);
    }
}
