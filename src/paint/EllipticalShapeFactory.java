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
public class EllipticalShapeFactory extends AbstractShapeFactory {

    @Override
    public EllipticalShape getEllipticalShape(String EllipticalShapeType) {
        if(EllipticalShapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(EllipticalShapeType.equalsIgnoreCase("ELLIPSE")){
         return new Ellipse();
      }      
      return null;
    }
    
     @Override
    public Polygons getPolygon(String PolygonType) {
       return null;
    }

}
