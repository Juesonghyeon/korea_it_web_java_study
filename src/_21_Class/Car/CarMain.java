package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car("아반떼");

        Car car3 = new Car("람보그기니",2025,"white");

        car3.starCar();
        car3.FrontOf();
    }
}
