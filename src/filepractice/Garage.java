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
public class Garage {
    private String name;
    private double totalHours;
    private double totalFees;
    private FileService fileService;
    private FileServiceWriter fileServiceWriter;

    public Garage(String name) {
        this.name = name;
        fileService = new FileService();
        fileServiceWriter = new FileServiceWriter();
    }
    public List getData(String filePath) throws IOException{
       return fileService.getData(filePath);
    }
    
    List writeData(String filePath)throws FileNotFoundException, IOException{
        return fileServiceWriter.writeData(filePath);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }

    public FileServiceWriter getFileServiceWriter() {
        return fileServiceWriter;
    }

    public void setFileServiceWriter(FileServiceWriter fileServiceWriter) {
        this.fileServiceWriter = fileServiceWriter;
    }
    
    
    
}
