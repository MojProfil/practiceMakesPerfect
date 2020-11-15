package com.danielgluhak;

public class Keyboard {

    private String input;

    public Keyboard(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void escapeButton() {
        System.out.println("Escape key pressed.");
    }

}
