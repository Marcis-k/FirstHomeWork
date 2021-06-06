package fuelCalculator;

import java.text.DecimalFormat;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;


    Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public String maxDistance() {

        float maxDistance;

        if (Vehicle.this.passengers == 0) {
            maxDistance = Vehicle.this.fuel / Vehicle.this.fuelUsage * 100;
        } else {
            maxDistance = (float) (Vehicle.this.fuel / (Vehicle.this.fuelUsage + (Vehicle.this.fuelUsage * (Vehicle.this.passengers * 0.05))) * 100);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(maxDistance);
    }
}
