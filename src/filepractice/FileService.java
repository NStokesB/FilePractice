/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author NStokesBeamon
 */
public class FileService {
    private TextFileReader reader;
    
    public FileService(){
       
    }
            
            
     public List getData (String filePath) throws FileNotFoundException, IOException{
         return reader.getData(filePath);
     }  

    public TextFileReader getReader() {
        return reader;
    }

    public void setReader(TextFileReader reader) {
        this.reader = reader;
    }
     
     
}
