public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();
        Car car1 = new Car("747ABC", "Toyota Camry");
        Car car2 = new Car("668AID", "Honda Accord");
        carPark.addCar(car1);
        carPark.addCar(car2);
        Driver driver = new Driver("Махмет");
        carPark.displayAvailableCars();
        driver.rentCar(car1);
        driver.displayInfo();
        carPark.displayAvailableCars();
    }
}