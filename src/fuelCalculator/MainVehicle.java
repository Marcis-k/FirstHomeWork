package fuelCalculator;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(70.0f, 7.0f, 0);
        Vehicle vehicle1 = new Vehicle(55.5f, 5.5f, 5);

        System.out.println(vehicle.maxDistance());
        System.out.println(vehicle1.maxDistance());
    }
}
