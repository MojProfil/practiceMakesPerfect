package com.danielgluhak;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at x: " + x + " , at y: " + y + " in color " + color);
    }
    public void drawLogo() {
        drawPixel(1220, 50, "blue");
    }
    private void pressTurnOnButton() {
        System.out.println("Button on is pressed.");
    }
    public void turnOnMonitor() {
        pressTurnOnButton();
        System.out.println("Monitor turned on.");
    }
    public void windowsBoot() {
        System.out.println("Welcome to Windows 10!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
