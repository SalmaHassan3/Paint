/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nnnnnnnnnr
 */
public class State {
    private List<Polygons> polygonsState=new ArrayList<>();
    private List<EllipticalShape> ellipticalShapesState=new ArrayList<>();
     public State(List<Polygons> polygonsState, List<EllipticalShape> ellipticalShapesState ){
             this.polygonsState=polygonsState;
             this.ellipticalShapesState=ellipticalShapesState;
        
     }

    public List<Polygons> getPolygonsState() {
        return polygonsState;
    }

    public List<EllipticalShape> getEllipticalShapesState() {
        return ellipticalShapesState;
    }
     
}
