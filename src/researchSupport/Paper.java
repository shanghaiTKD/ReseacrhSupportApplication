/*
 * Paper.java
 *
 * Created on 09 March 2010, 21:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
// Testing Git push 2
package researchSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains details of an individual Paper.
 * YOU NEED TO COMPLETE THIS CLASS
 */
public class Paper {
    private static int nextIdNum=0;
    private String title ;
    private String[] authors = new String[6] ;
    private List<String> referencedPapers = new ArrayList<String>() ;
    
   
 /** Creates a new instance of Paper */
    public Paper()
    {
        
    }


    /**
     * Provided in case you want to use a Paper id. 
     * 
     * @return the next available id number
     */
    public static int getNextIdNum() {
        nextIdNum++;
        return nextIdNum;
    }
    
}
