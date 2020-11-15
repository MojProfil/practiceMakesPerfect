package com.danielgluhak;

import java.security.Key;

public class Main {

    public static void main(String[] args) {

    Casing casing = new Casing("DB22", "Dell", "220", new Dimension(250,80,45));
    Motherboard motherboard = new Motherboard("XFX 323", "XFX", 8, 4, "v292.3");
    Monitor monitor = new Monitor("HP", "HO", 24, new Resolution(1920,1080));
    Keyboard keyboard = new Keyboard("qwertz");

    PC pc = new PC(casing, motherboard, monitor, keyboard);

    keyboard.escapeButton();
    }
}
