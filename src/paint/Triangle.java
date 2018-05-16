
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangle implements Polygons {
    
private float xstart,xend,ystart,yend,xlast,ylast,angle=0;
Polygon triangle;
private Color color,fillColor;
int[] xs;
int[] ys;
 AffineTransform at;
 boolean selected;
public Triangle(){
    
}
 @Override
    public Polygons getClone() {
    try {
        return (Polygons)this.clone();
    } catch (CloneNotSupportedException ex) {
        Logger.getLogger(Line.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
@Override
    public void polygon2D(float xstart, float xend, float ystart, float yend) {
    this.xstart = xstart;
    this.xend = xend;
        this.ystart = ystart;
        this.yend = yend;
        this.ylast=yend;
         if (xstart > xend)
         this.xlast=xend+2*(xstart-xend);
       
     else 
      this.xlast=xend-2*(xend-xstart);
      int[] xs = {(int) xstart, (int)xend, (int)xlast };
      int[] ys = {(int) ystart, (int)yend, (int)ylast };  
      triangle = new Polygon(xs, ys, 3); 
      
    }


    @Override
    public float getXend() {
        return xend;
    }

@Override
    public void setXend(float xend) {
        this.xend = xend;
    }

@Override
    public float getYstart() {
        return ystart;
    }

@Override
    public void setYstart(float ystart) {
        this.ystart = ystart;
    }

@Override
    public float getYend() {
        return yend;
    }

@Override
    public void setYend(float yend) {
        this.yend = yend;
    }
    

   

@Override
    public Color getColor() {
        return color;
    }

@Override
    public void setColor(Color color) {
        this.color = color;
    }
   
    @Override
    public void drawPolygon() {
        paintJFrame.g2.setColor(color);
          paintJFrame.g2.setStroke(new BasicStroke(3));
    at =AffineTransform.getRotateInstance(Math.toRadians(angle),triangle.getBounds2D().getCenterX(),triangle.getBounds2D().getCenterY());
    paintJFrame.g2.setTransform(at);
     if(fillColor!=null){
        paintJFrame.g2.setPaint(fillColor);
        paintJFrame.g2.fill(triangle);
    }
          paintJFrame.g2.drawPolygon(triangle);
          if(selected==true){
    Stroke dotted = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {1,2}, 0);
            Rectangle2D selection=new Rectangle2D.Float((float)triangle.getBounds2D().getMinX()-20, (float)triangle.getBounds2D().getMinY()-20,(float)triangle.getBounds2D().getWidth()+50 ,(float)triangle.getBounds2D().getHeight()+50);
              paintJFrame.g2.setStroke(dotted);
               paintJFrame.g2.setColor(Color.BLACK);
              paintJFrame.g2.draw(selection);
    }
          }

    @Override
    public float getXstart() {
       return xstart;
    }

    @Override
    public void setXstart(float xstart) {
       this.xstart=xstart;
    }

    @Override
    public boolean ifSelectedPolygon(float x, float y) {
        return triangle.contains(x, y);
    }

@Override
    public float getAngle() {
        return angle;
    }

@Override
    public void setAngle(float angle) {
        this.angle = angle;
    }

@Override
    public Color getFillColor() {
        return fillColor;
    }

@Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

@Override
    public boolean isSelected() {
        return selected;
    }

@Override
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

 
    
}
