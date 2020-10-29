package com.danielgluhak;

public class Microwave extends KitchenDevices {

    private Dimension microwaveDimensions;
    private String interfaceType;
    private String color;
    private int productionYear;
    private int watts;

    public void adjustIntensity(int intensityInWatts) {
        if(intensityInWatts < watts && intensityInWatts > 100)
            System.out.println("Intensity set to " + intensityInWatts + " watts.");
        else {
            System.out.println(intensityInWatts + " not available above " + watts);
        }
    }

    public Microwave(Dimension microwaveDimensions, String interfaceType, String color, int productionYear, int watts) {
        this.microwaveDimensions = microwaveDimensions;
        this.interfaceType = interfaceType;
        this.color = color;
        this.productionYear = productionYear;
        this.watts = watts;
    }
}
