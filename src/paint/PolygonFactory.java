/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author alextec
 */
public class PolygonFactory extends AbstractShapeFactory {
    @Override
    public Polygons getPolygon(String polygonType){
   
      if(polygonType.equalsIgnoreCase("LINE")){
         return new Line();
         
      }else if(polygonType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(polygonType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      else if(polygonType.equalsIgnoreCase("TRIANGLE")){
         return new Triangle();
      }
        else if(polygonType.equalsIgnoreCase("RIGHTTRIANGLE")){
         return new RightTriangle();
      }
      return null;
   }
   
    @Override
    public  EllipticalShape getEllipticalShape(String shape) {
       return null;
    }

  
   
}
