package edu.ccat.contract;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class BoxIcon implements Icon {

  private final int iconWidth = 50;
  private final int iconHeight = 50;

  @Override
  public void paintIcon(Component component, Graphics pincel,
      int positionX, int positionY) {
    pincel.setColor(Color.BLUE);
    pincel.fillRect(0, 0, this.iconWidth, this.iconHeight);
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
