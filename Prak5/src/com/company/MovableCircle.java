package com.company;

public class MovableCircle extends Circle implements Movable{

    public MovableCircle(int coordinateCenterX, int coordinateCenterY) {
        super(coordinateCenterX, coordinateCenterY);
    }

    @Override
    public void move(int x, int y) {
        setCoordinateCenterX(getCoordinateCenterX()+x);
        setCoordinateCenterY(getCoordinateCenterY()+y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "coordinateCenterX=" + coordinateCenterX +
                ", coordinateCenterY=" + coordinateCenterY +
                '}';
    }
}
