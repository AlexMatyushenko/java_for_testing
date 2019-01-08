package ru.training.java;

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(12, -7);
        Point p2 = new Point(-6, 4);
        double dist = calculationDistance(p1, p2);
        System.out.println("Расстояние между двумя точками = " + dist);
    }


    public static double calculationDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
