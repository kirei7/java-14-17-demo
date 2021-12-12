package com.epam.demo.area;

import static com.epam.demo.area.Models.*;
import static java.lang.Math.*;

public class AreaCalculator {

  public double calculateArea(Shape shape) {
    double result = 0;

    if (shape instanceof Circle) {
      var circle = (Circle) shape;
      result = PI * pow(circle.getRadius(), 2);
    }
    else if (shape instanceof Rectangle) {
      var rectangle = (Rectangle) shape;
      result = rectangle.getLength() * rectangle.getWidth();
    }
    else if (shape instanceof Triangle) {
      var triangle = (Triangle) shape;
      var s = (triangle.getA() + triangle.getB() + triangle.getC()) / 2.0;
      result = sqrt(s * (s - triangle.getA()) * (s - triangle.getB()) * (s - triangle.getC()));
    }

    return result;
  }
}
