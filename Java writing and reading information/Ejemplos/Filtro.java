/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplos;

import java.io.File;
import java.io.FilenameFilter;


public class Filtro implements FilenameFilter{
     private String [] extension;

    public Filtro(String [] ext) {
        this.extension = ext;
    }
     
     
    @Override
    public boolean accept(File dir, String name) {
        for(String s:extension){
        if(name.endsWith(s))return true;
        
        }
        return false;//else
            
        
    }
    
}
