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
 * @author alextec
 */
public class HistoryList implements HistoryListInterface {
    private List<String> HistoryList;
 
    public HistoryList() {
        HistoryList = new ArrayList<>();
    }
 
    @Override
    public void addAction(String action) {
        this.HistoryList.add(action);
    }
 
    @Override
    public void removeAction(String action) {
        this.HistoryList.remove(action);
    }

   @Override
   public Iterator getIterator() {
      return new IteratorImpl(this.HistoryList);
   }
 
 
   private class IteratorImpl implements Iterator {
       
       private List<String> actions;
       private int index;
       public IteratorImpl( List<String> actionsList) {
           
            this.actions = actionsList;
        }
 
      @Override
      public boolean hasNext() {
      
         if(index < actions.size()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return actions.get(index++);
            
         }
         return null;
      }		
   }
    
}
