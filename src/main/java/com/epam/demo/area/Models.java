package com.epam.demo.area;

public class Models {
  public interface Shape {}

  /**
   * Added 01.01.2021 by Jose
   */
  public static class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
      this.radius = radius;
    }

    public int getRadius() {
      return radius;
    }
  }

  /**
   * Added 01.01.2021 by Jose
   */
  public static class Rectangle implements Shape  {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
    }
    public int getWidth() {
      return width;
    }
    public int getLength() {
      return length;
    }
  }

  /**
   * Added 07.01.2021 by Jose
   */
  public static class Ellipse implements Shape  {
    private final int a;
    private final int b;

    public Ellipse(int a, int b) {
      this.a = a;
      this.b = b;
    }
    public int getA() {
      return a;
    }
    public int getB() {
      return b;
    }
  }

  /**
   * Added 09.12.2021 by Dutch
   */
  public static class Triangle implements Shape  {
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
    public int getA() {
      return a;
    }
    public int getB() {
      return b;
    }
    public int getC() {
      return c;
    }
  }
}
