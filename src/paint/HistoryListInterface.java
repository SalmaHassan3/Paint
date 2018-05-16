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
public interface HistoryListInterface {
   public void addAction(String action);    
    public void removeAction(String action);
    public Iterator getIterator();  
}
