package com.company;

public class MovablePoint extends Point implements Movable{

    public MovablePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        setX(getX()+x);
        setY(getY()+y);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
