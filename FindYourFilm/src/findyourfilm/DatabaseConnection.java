/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourfilm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author danri
 */
public class DatabaseConnection {
    public static void main(String[] args){
        String file = "TermProject_Movie_Database.csv";
        //File f = new File("TermProject_Movie_Database.csv");
        //System.out.print(f.getAbsolutePath());
        BufferedReader br = null;
        String line = "";
        String splitOn = ",";
        String[][] movieDB = new String[661][7];
        int rowCount =0;
        int count =0;

        try{
            br = new BufferedReader(new FileReader(file));
            //System.out.println("FOUND IT");
            while ((line = br.readLine()) != null){
                System.out.println(count);
                String[] splitLine = line.split(splitOn);
                movieDB[rowCount] = splitLine;
                rowCount++;
                count++;
                

            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(movieDB[0][2]);
    }
}
