
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Line implements Polygons {
    
private float xstart,xend,ystart,yend,angle=0;
Line2D line;
private Color color;
 AffineTransform at;
 boolean selected;
 private static final int HIT_BOX_SIZE = 2;
   public Line(){
       
   }
  
@Override
    public void  polygon2D(float xstart, float xend, float ystart, float yend) {
        this.xstart = xstart;
        this.xend = xend;
        this.ystart = ystart;
        this.yend = yend;
         line =new Line2D.Float((float)xstart, (float)ystart, (float)xend,(float) yend);
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
    
    if(xstart<=xend&&ystart<=yend)
    at =AffineTransform.getRotateInstance(Math.toRadians(angle),xstart+(Math.abs(line.getX1()-line.getX2())/2),ystart+(Math.abs(line.getY1()-line.getY2())/2));
   else if(xstart>=xend&&ystart<=yend)
    at =AffineTransform.getRotateInstance(Math.toRadians(angle),xstart-(Math.abs(line.getX1()-line.getX2())/2),ystart+(Math.abs(line.getY1()-line.getY2())/2));
   else if(xstart<=xend&&ystart>=yend)
    at =AffineTransform.getRotateInstance(Math.toRadians(angle),xstart+(Math.abs(line.getX1()-line.getX2())/2),ystart-(Math.abs(line.getY1()-line.getY2())/2));
   else if(xstart>=xend&&ystart>=yend)
    at =AffineTransform.getRotateInstance(Math.toRadians(angle),xstart-(Math.abs(line.getX1()-line.getX2())/2),ystart-(Math.abs(line.getY1()-line.getY2())/2));
    paintJFrame.g2.setTransform(at);
     
    paintJFrame.g2.draw(line);
    if(selected==true){
    Stroke dotted = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {1,2}, 0);
            Rectangle2D selection=new Rectangle2D.Float((float)line.getBounds2D().getMinX()-20, (float)line.getBounds2D().getMinY()-20,(float)line.getBounds2D().getWidth()+40 ,(float)line.getBounds2D().getHeight()+40);
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
       int boxX = (int) (x - HIT_BOX_SIZE / 2);
       int boxY = (int) (y - HIT_BOX_SIZE / 2);

      int width = HIT_BOX_SIZE;
      int height = HIT_BOX_SIZE;

      
	if (line.intersects(boxX, boxY, width, height)) {
		return true;
	}
        return false;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFillColor(Color fillColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


@Override
    public boolean isSelected() {
        return selected;
    }

@Override
    public void setSelected(boolean selected) {
        this.selected = selected;
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

   

  
    

   
        
  
                
          
                
                
               
    }
    

