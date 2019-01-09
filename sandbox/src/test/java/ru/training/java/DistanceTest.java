package ru.training.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {

    @Test
    public void testDistance(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,2);
        Assert.assertEquals(Distance.calculationDistance(p1, p2) , 2);
    }

    @Test
    public void testDistance2(){
        Point p1 = new Point(3,0);
        Point p2 = new Point(0,4);
        Assert.assertEquals(Distance.calculationDistance(p1, p2) , 5);
    }
}
