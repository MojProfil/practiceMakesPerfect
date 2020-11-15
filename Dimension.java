package com.danielgluhak;

public class Dimension {

    private int height;
    private int width;
    private int depth;

    public Dimension(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        System.out.println("Height: " + this.height);
        return height;
    }

    public int getWidth() {
        System.out.println("Width: " + this.width);
        return width;
    }

    public int getDepth() {
        System.out.println("Depth: " + this.depth);
        return depth;
    }
}
