public class Driver {
    private String name;
    private Car rentedCar;

    public Driver(String name) {
        this.name = name;
        this.rentedCar = null; // Изначально у водителя нет арендованного автомобиля
    }

    public void rentCar(Car car) {
        this.rentedCar = car;
        car.rent();
    }

    public void returnCar() {
        if (rentedCar != null) {
            rentedCar.returnCar();
            rentedCar = null;
        } else {
            System.out.println("У водителя нет арендованного автомобиля.");
        }
    }

    public void displayInfo() {
        System.out.println("Водитель: " + name);
        if (rentedCar != null) {
            System.out.println("Арендованный автомобиль:");
            rentedCar.displayInfo();
        } else {
            System.out.println("У водителя нет арендованного автомобиля.");
        }
    }
}