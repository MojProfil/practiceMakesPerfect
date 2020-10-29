package com.danielgluhak;

public class Kitchen {

    private Fridge fridge;
    private Microwave microwave;
    private Owen owen;

    public Kitchen(Fridge fridge, Microwave microwave, Owen owen) {
        this.fridge = fridge;
        this.microwave = microwave;
        this.owen = owen;
    }

    public void allDevices() {
        owen.turnOnDevice();
        microwave.turnOnDevice();
        fridge.turnOnDevice();

    }

    public Fridge getFridge() {
        return fridge;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public Owen getOwen() {
        return owen;
    }
}
