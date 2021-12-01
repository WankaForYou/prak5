package com.company;

public class Circle {
    protected int coordinateCenterX;
    protected int coordinateCenterY;

    public Circle(int coordinateCenterX, int coordinateCenterY) {
        this.coordinateCenterX = coordinateCenterX;
        this.coordinateCenterY = coordinateCenterY;
    }

    public int getCoordinateCenterX() {
        return coordinateCenterX;
    }

    public void setCoordinateCenterX(int coordinateCenterX) {
        this.coordinateCenterX = coordinateCenterX;
    }

    public int getCoordinateCenterY() {
        return coordinateCenterY;
    }

    public void setCoordinateCenterY(int coordinateCenterY) {
        this.coordinateCenterY = coordinateCenterY;
    }



}
