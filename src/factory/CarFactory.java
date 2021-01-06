package factory;

import makeOfCars.BMW;
import makeOfCars.Mercedes;

public class CarFactory {
    public Car create(Cars car) {
        if(car == Cars.BMW){
            return new BMW();
        }
        else{
            if(car == Cars.MERCEDES) {
                return new Mercedes();
            }
            else{
                return null;
            }
        }
    }
}
