package com.danielgluhak;

import java.security.Key;

public class PC {
    private Casing theCasing;
    private Motherboard theMotherboard;
    private Monitor theMonitor;
    private Keyboard theKeyboard;

    public PC(Casing theCasing, Motherboard theMotherboard, Monitor theMonitor, Keyboard theKeyboard) {
        this.theCasing = theCasing;
        this.theMotherboard = theMotherboard;
        this.theMonitor = theMonitor;
        this.theKeyboard = theKeyboard;
    }
    public void powerUp() {
        theCasing.pressPowerButtin();
        theMonitor.drawLogo();
        theMonitor.windowsBoot();
    }
}

