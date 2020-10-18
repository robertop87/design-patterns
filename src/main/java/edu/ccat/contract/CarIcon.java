package edu.ccat.contract;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class CarIcon implements Icon {

  private final int iconWidth = 100;
  private final int iconHeight = 50;

  @Override
  public void paintIcon(Component component, Graphics pincel,
      int positionX, int positionY) {
    int unitWidth = iconWidth/6;
    int unitHeight = iconHeight/3;

    // first wheel
    pincel.setColor(Color.BLACK);
    pincel.fillOval(1*(unitWidth), 2*unitHeight, unitWidth, unitHeight);

    // second wheel
    pincel.setColor(Color.BLACK);
    pincel.fillOval(4*(unitWidth), 2*unitHeight, unitWidth, unitHeight);

    // body
    pincel.setColor(Color.RED);
    pincel.fillRect(0, 1*unitHeight, this.iconWidth, unitHeight);

    // cover
    pincel.setColor(Color.BLUE);
    int[] xPoints = {1*unitWidth,2*unitWidth,4*unitWidth,5*unitWidth};
    int[] yPoints = {1*unitHeight,0,0,1*unitHeight};
    pincel.drawPolygon(xPoints,yPoints,4);
  }

  @Override
  public int getIconWidth() {
    return this.iconWidth;
  }

  @Override
  public int getIconHeight() {
    return this.iconHeight;
  }
}
