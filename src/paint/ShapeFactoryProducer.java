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
public class ShapeFactoryProducer {  
    //create an object of SingleObject
   private static ShapeFactoryProducer instance = new ShapeFactoryProducer();

   //make the constructor private so that this class cannot be
   //instantiated
   private ShapeFactoryProducer(){}

   //Get the only object available
   public static ShapeFactoryProducer getInstance(){
      return instance;
   }

      public  AbstractShapeFactory getShapeFactory(String choice){
   
      if(choice.equalsIgnoreCase("POLYGON")){
         return new PolygonFactory();
         
      }else if(choice.equalsIgnoreCase("ELLIPTICAL SHAPE")){
         return new EllipticalShapeFactory();
      }
      
      return null;
   }
}
