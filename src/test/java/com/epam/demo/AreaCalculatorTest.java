package com.epam.demo;


import com.epam.demo.area.AreaCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.epam.demo.area.Models.*;
import static java.lang.Math.abs;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.fail;

class AreaCalculatorTest {

  private static final double THRESHOLD_MULTIPLIER = 0.000_001;
  private final AreaCalculator calculator = new AreaCalculator();

  @Test
  public void shouldCalculateCircle() {
    testCase(new Circle(5), 78.53982);
  }
  @Test
  public void shouldCalculateRectangle() {
    testCase(new Rectangle(5, 10), 50);
  }
  @Test
  public void shouldCalculateEllipse() {
    testCase(new Ellipse(5, 10), 157.07963);
  }
  @Test
  public void shouldCalculateTriangle() {
    testCase(new Triangle(5, 7, 9), 17.41228);
  }

  private void testCase(Shape shape, double expected) {
    var calculated = calculator.calculateArea(shape);
    var delta = abs(expected - calculated);
    var threshold = expected * THRESHOLD_MULTIPLIER;
    if (delta > threshold) {
      fail(format(
              "delta is larger than threshold\nD:%s\nT:%s",
              BigDecimal.valueOf(delta),
              BigDecimal.valueOf(threshold)
      ));
    }
  }
}