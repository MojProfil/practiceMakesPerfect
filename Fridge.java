package com.danielgluhak;

public class Fridge extends KitchenDevices {

    private Dimension fridgeDimensions;
    private String manufacturer;
    private String numberOfDoors;
    private String color;
    private int productionYear;

    public Fridge(Dimension fridgeDimensions, String manufacturer, String numberOfDoors, String color, int productionYear) {
        this.fridgeDimensions = fridgeDimensions;
        this.manufacturer = manufacturer;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.productionYear = productionYear;
    }

    public void adjustTemperature(int temp) {
        System.out.println("Temperature set to " + temp + "° Celsius.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

}
