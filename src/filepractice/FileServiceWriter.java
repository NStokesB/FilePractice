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
public class FileServiceWriter {
    private TextFileWriter writer;

    public FileServiceWriter() {
        
    }

  
    
    List writeData(String filePath)throws FileNotFoundException, IOException{
        return writer.writeData(filePath);
    }

    public TextFileWriter getWriter() {
        return writer;
    }

    public void setWriter(TextFileWriter writer) {
        this.writer = writer;
    }
    
    
}
