/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alextec
 */
public class Square implements Polygons{

private float xstart,xend,ystart,yend,angle=0;
Rectangle2D square;
private Color color,fillColor;
 AffineTransform at;
 boolean selected;
 public Square(){
     
 }
@Override
    public void  polygon2D(float xstart, float xend, float ystart, float yend) {
        this.xstart = xstart;
        this.xend = xend;
        this.ystart = ystart;
        this.yend = yend;
         square =new Rectangle2D.Float((float)xstart, (float)ystart, (float)xend-(float)xstart, (float)xend-(float)xstart);
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
at =AffineTransform.getRotateInstance(Math.toRadians(angle) ,xstart+square.getWidth()/2,ystart+ square.getHeight()/2);
    paintJFrame.g2.setTransform(at);
     if(fillColor!=null){
        paintJFrame.g2.setPaint(fillColor);
        paintJFrame.g2.fill(square);
    }
          paintJFrame.g2.draw(square);
          if(selected==true){
    Stroke dotted = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {1,2}, 0);
            Rectangle2D selection=new Rectangle2D.Float((float)square.getBounds2D().getMinX()-20, (float)square.getBounds2D().getMinY()-20,(float)square.getBounds2D().getWidth()+40 ,(float)square.getBounds2D().getHeight()+40);
              paintJFrame.g2.setStroke(dotted);
               paintJFrame.g2.setColor(Color.BLACK);
              paintJFrame.g2.draw(selection);
    }
          
          }
   
  

   

    @Override
    public boolean ifSelectedPolygon(float x, float y) {
       return square.contains(x,y);
    }

@Override
    public float getXstart() {
        return xstart;
    }

@Override
    public void setXstart(float xstart) {
        this.xstart = xstart;
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
