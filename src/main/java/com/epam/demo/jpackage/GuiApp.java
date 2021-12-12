package com.epam.demo.jpackage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GuiApp {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My awesome GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    JLabel label = new JLabel("Hello World");
    label.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(label);
    frame.setVisible(true);
  }
}
