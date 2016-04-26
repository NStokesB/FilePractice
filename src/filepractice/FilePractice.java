/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author NStokesBeamon
 */
public class FilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // TODO code application logic here
        String path = "src" + File.separatorChar + "bofa.txt";
        
        File file= new File(path);
        
        
        
//        PrintWriter out = new PrintWriter(new BufferedWriter(
//                            new FileWriter(file, false)));
//        
//        out.println("66.25");
//        out.println("105.75");
//        out.close();

        
       Garage garage = new Garage("Niesha's Garage");
       garage.getFileService().setReader(new GarageTotalsReader());
       garage.getFileServiceWriter().writeData(path);
       List data = garage.getData(path);
       double totalHours = Double.parseDouble(data.get(0).toString());
       double totalFees = Double.parseDouble(data.get(1).toString());
       
       garage.setTotalHours(totalHours);
       garage.setTotalFees(totalFees);
        
        System.out.println("Garage Totals: Total Hours = " + garage.getTotalHours() );
        System.out.println("Total Fees = " + garage.getTotalFees());

    }
    
}
