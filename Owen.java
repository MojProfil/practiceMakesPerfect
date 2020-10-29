package com.danielgluhak;

public class Owen extends KitchenDevices{

    private Dimension owenDimensions;
    private String manufacturer;
    private String interfaceType;
    private String color;
    private int productionYear;

    public Owen(Dimension owenDimensions, String manufacturer, String interfaceType, String color, int productionYear) {
        this.owenDimensions = owenDimensions;
        this.manufacturer = manufacturer;
        this.interfaceType = interfaceType;
        this.color = color;
        this.productionYear = productionYear;
    }

    public Dimension getOwenDimensions() {
        return owenDimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
