
package paint;

import java.awt.Color;

public interface EllipticalShape extends Cloneable{ 
    public void ellipticalShape2D(float xstart, float xend, float ystart, float yend);
    void drawEllipticalShape();
    boolean ifSelectedEllipticalShape(float x, float y );
    
    public Color getColor();
    public void setColor(Color color);
    
    public float getXstart();
    public void setXstart(float xstart);
    
    public float getXend();
    public void setXend(float xend);
    
    public float getYstart();
    public void setYstart(float ystart);
    
    public float getYend();
    public void setYend(float yend);
    
      public float getAngle();
     public void setAngle(float angle);
     
       public Color getFillColor();
     public void setFillColor(Color fillColor);
       
     public boolean isSelected();
    public void setSelected(boolean selected);
    
    public EllipticalShape getClone();
}
