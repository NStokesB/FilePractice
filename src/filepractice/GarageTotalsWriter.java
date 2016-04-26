/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NStokesBeamon
 */
public class GarageTotalsWriter implements TextFileWriter{

    @Override
    public List writeData(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        PrintWriter pw = null;
        
        List lines = new ArrayList();
        
        pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        
         pw.println("34.25");
         pw.println("100.75");
         pw.close();
         
         return lines; 
    }
    
    
}
