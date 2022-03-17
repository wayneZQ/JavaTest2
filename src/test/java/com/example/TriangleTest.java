package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }
    @Test
    public void testNegativeLength(){
        Triangle t1 = new Triangle(-1,2,3);
        assertEquals("Error: The length should be positive",t1.getTriangleType());
        Triangle t2 = new Triangle(1,-2,3);
        assertEquals("Error: The length should be positive",t2.getTriangleType());
        Triangle t3 = new Triangle(1,2,-3);
        assertEquals("Error: The length should be positive",t3.getTriangleType());
    }
    @Test
    public void testNotTriangle(){
        Triangle t1 = new Triangle(6,2,3);
        assertEquals("Error: Not a triangle",t1.getTriangleType());
        Triangle t2 = new Triangle(2,6,3);
        assertEquals("Error: Not a triangle",t2.getTriangleType());
        Triangle t3 = new Triangle(2,3,6);
        assertEquals("Error: Not a triangle",t3.getTriangleType());
    }
    @Test
    public void testIsosceles(){
        Triangle t1 = new Triangle(3,3,4);
        assertEquals("Isosceles", t1.getTriangleType());
        Triangle t2 = new Triangle(3,4,3);
        assertEquals("Isosceles", t2.getTriangleType());
        Triangle t3 = new Triangle(4,3,3);
        assertEquals("Isosceles", t3.getTriangleType());
    }

}