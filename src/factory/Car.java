package factory;
public abstract class Car {
    public static void printMakeOfCar() {
        for (Cars car : Cars.values()) {
            System.out.println(car);
        }
    }
    public static void printMakeOfCar(int n) {
        for (Cars car : Cars.values()) {
            System.out.println(car + " " + n);
        }
    }

    public abstract void print();
}

