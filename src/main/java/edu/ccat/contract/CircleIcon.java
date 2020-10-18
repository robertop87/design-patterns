package edu.ccat.contract;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class CircleIcon implements Icon {

  private final int iconRadius = 30;

  @Override
  public void paintIcon(Component component, Graphics pincel,
      int positionX, int positionY) {
    pincel.setColor(Color.RED);
    pincel.fillOval(15, 15, this.getIconWidth(), this.getIconHeight());
  }

  @Override
  public int getIconWidth() {
    return this.iconRadius*2;
  }

  @Override
  public int getIconHeight() {
    return this.iconRadius*2;
  }
}
