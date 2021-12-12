package com.epam.demo.npe;

import java.util.List;

public class HelpfulNPE {

  public static void main(String[] args) {
    var xs = collectXCoordinates(List.of(
            new Circle(new Point(null, 12), 12),
            new Circle(new Point(12, null), 12)
    ));
  }

  private static List<String> collectXCoordinates(List<Circle> circles) {
    return circles.stream()
            .map(c -> c.center.x.toString())
            .toList();
  }
  private record Circle(Point center, Integer radius) {}
  private record Point(Integer x, Integer y) {}
}
