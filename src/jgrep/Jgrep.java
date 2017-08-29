/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrep;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ciaran
 */
public class Jgrep {

    // jgrep path glob pattern
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String path = args[0];
        final String glob = args[1];
        final String pattern = args[2];
        
        
//        Search search = new Search("C:\\Temp", "**/*.c", ".*");
        Search search = new Search(path, glob, pattern);
        try {
            search.run();
        } catch (IOException ex) {
            Logger.getLogger(Jgrep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
