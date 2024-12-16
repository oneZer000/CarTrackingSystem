public class Car {
    private String licensePlate;
    private String model;
    public boolean isRented;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isRented = false;
    }

    public void rent() {
        isRented = true;
        System.out.println("Автомобиль " + licensePlate + " сдан в аренду.");
    }

    public void returnCar() {
        isRented = false;
        System.out.println("Автомобиль " + licensePlate + " возвращен.");
    }

    public void displayInfo() {
        System.out.printf("Номерной знак: %s%nМодель: %s%nСтатус аренды: %s%n", licensePlate, model, isRented ? "Сдан в аренду" : "Свободен");
    }
}