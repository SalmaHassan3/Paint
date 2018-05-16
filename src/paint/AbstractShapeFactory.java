
package paint;

public abstract class AbstractShapeFactory {
     abstract Polygons getPolygon(String polygon);
     abstract EllipticalShape  getEllipticalShape(String ellipticalShape) ;
    
}
