
package paint;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;


public interface Polygons extends Cloneable {
    
    void drawPolygon();
    void polygon2D(float xstart, float xend, float ystart, float yend);
    boolean ifSelectedPolygon(float x, float y );
    
    public float getXstart();
    public void setXstart(float xstart);
    public float getXend();
    public void setXend(float xend);
    public float getYstart();
    public void setYstart(float ystart);
    public float getYend();
    public void setYend(float yend);
    public Color getColor();
    public void setColor(Color color);
    public float getAngle();
    public void setAngle(float angle);
    public Color getFillColor();
     public void setFillColor(Color fillColor);
     public boolean isSelected();
     public void setSelected(boolean selected);
     public Polygons getClone();
}
