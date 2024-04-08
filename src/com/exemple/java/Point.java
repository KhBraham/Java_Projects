package com.exemple.java;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point other){
        double deltaX = other.getX() - this.x;
        double deltaY = other.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public static void main(String[] args){
        Point pt1 = new Point(1, 2);
        Point pt2 = new Point(4, 6);
        double distance = pt1.distance(pt2);
        System.out.println("Distance entre les points : " + distance);
    }
}
