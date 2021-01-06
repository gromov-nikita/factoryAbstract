package makeOfCars;
import factory.Car;
public class BMW extends Car {
    @Override
    public void print() {
        System.out.println("BMW: \"hello\"");
    }
}