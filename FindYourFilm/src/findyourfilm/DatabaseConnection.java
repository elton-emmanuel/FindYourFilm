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
    
    public static String[][] movieDB = new String[661][6];
    public static void main(String[] args){
        String file = "TermProject_Movie_Database.csv";
        
        BufferedReader br = null;
        String line = "";
        String splitOn = ",";
        int rowCount =0;
        int count =0;

        //read file into movieDB array
        try{
            br = new BufferedReader(new FileReader(file));
            //System.out.println("FOUND IT");
            while ((line = br.readLine()) != null){
                //System.out.println(count);
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
        
        //METHOD TESTING:
        searchDate("18-Nov-19", movieDB);
        searchRating("R", movieDB);
        searchType("IMAX", movieDB);
    }
    
    public static String[][] searchDate(String date, String[][] movies)
    {
        int arrayLength = 0;
        
        //determine result array length
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][0].equals(date))
            {
                arrayLength++;
            }
        }
        //initialize result array and counter
        String[][] searchedByDate = new String[arrayLength][6];
        int counter = 0;
        
        //fill result array with entries that match date passed as parameter
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][0].equals(date))
            {
                searchedByDate[counter][0] = movies[i][0];
                searchedByDate[counter][1] = movies[i][1];
                searchedByDate[counter][2] = movies[i][2];
                searchedByDate[counter][3] = movies[i][3];
                searchedByDate[counter][4] = movies[i][4];
                searchedByDate[counter][5] = movies[i][5];
                counter++;
            }
        }
        
        //System.out.println(searchedByDate[0][5]);
        
        //for (int x = 0; x < searchedByDate.length; x++)
        //{
        //    System.out.println(searchedByDate[x][0] + searchedByDate[x][1]);
        //}
        
        return searchedByDate;
    }
    
    public static String[][] searchRating(String rating, String[][] movies)
    {
        int resultLength = 0;
        
        //determine length of result array
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][5].equals(rating))
            {
                resultLength++;
            }
        }
        
        //initialize result array and counter
        String[][] searchByRating = new String[resultLength][6];
        int counter = 0;
        
        //fill result array with applicable entries
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][5].equals(rating))
            {
                searchByRating[counter][0] = movies[i][0];
                searchByRating[counter][1] = movies[i][1];
                searchByRating[counter][2] = movies[i][2];
                searchByRating[counter][3] = movies[i][3];
                searchByRating[counter][4] = movies[i][4];
                searchByRating[counter][5] = movies[i][5];
                counter++;
            }
        }
        
        //RESULT TESTING:
        //for (int i = 0; i < searchByRating.length; i++)
        //{
        //    System.out.println(searchByRating[i][0] + searchByRating[i][1] + searchByRating[i][5]);
        //}
        
        return searchByRating;
    }

    public static String[][] searchType(String type, String[][] movies)
    {
        int resultLength = 0;
        
        //determine length of result array
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][4].equals(type))
            {
                resultLength++;
            }
        }
        
         //initialize result array and counter
        String[][] searchByType = new String[resultLength][6];
        int counter = 0;
        
        //fill result array with applicable entries
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][4].equals(type))
            {
                searchByType[counter][0] = movies[i][0];
                searchByType[counter][1] = movies[i][1];
                searchByType[counter][2] = movies[i][2];
                searchByType[counter][3] = movies[i][3];
                searchByType[counter][4] = movies[i][4];
                searchByType[counter][5] = movies[i][5];
                counter++;
            }
        }
        
        //TESTING OUTPUT
        //for (int i = 0; i < searchByType.length; i++)
        //{
        //    System.out.println(searchByType[i][0] + searchByType[i][1] + searchByType[i][4]);
        //}
        
        return searchByType;
    }
}
