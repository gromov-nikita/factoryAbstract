package makeOfCars;
import factory.Car;
public class Mercedes extends Car {
    @Override
    public void print() {
        System.out.println("Mercedes: \"hello\"");
    }
}