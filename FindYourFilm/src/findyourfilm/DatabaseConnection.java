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
//import java.io.File;
/**
 *
 * @author danri
 */
public class DatabaseConnection {
    
    public String[][] movieDB = new String[661][6];
    public String[][] bioDB = new String[42][2];
    public DatabaseConnection(){
        initializeDB();
        initializeMB();
        System.out.println(findBio("Charlie's Angels"));
    }
     public void main(String[] args)
     {
         initializeDB();
         initializeMB();
         //METHOD TESTING:
        searchDate("18-Nov-19", movieDB);
        searchRating("R", movieDB);
        searchType("IMAX", movieDB);
        childMode(movieDB);
        
     }
        
    
    public String[][] searchDate(String date, String[][] movies)
    {
        
        String[][] searchedByDate = search(date, 0, movies);
        
        //System.out.println(searchedByDate[0][5]);
        
        //TESTING OUTPUT:
//        for (int x = 0; x < searchedByDate.length; x++)
//        {
//            System.out.println(searchedByDate[x][0] + searchedByDate[x][1]);
//        }
        
        return searchedByDate;
    }
    
    public String[][] searchRating(String rating, String[][] movies)
    {
              
        //initialize result array
        String[][] searchByRating = search(rating, 5, movies);

        //RESULT TESTING:
        //for (int i = 0; i < searchByRating.length; i++)
        //{
        //    System.out.println(searchByRating[i][0] + searchByRating[i][1] + searchByRating[i][5]);
        //}
        
        return searchByRating;
    }

    public String[][] searchType(String type, String[][] movies)
    {
        
         //initialize result array
        String[][] searchByType = search(type, 4, movies);

        
        //TESTING OUTPUT
        //for (int i = 0; i < searchByType.length; i++)
        //{
        //    System.out.println(searchByType[i][0] + searchByType[i][1] + searchByType[i][4]);
        //}
        
        return searchByType;
    }
    
    public String[][] childMode(String[][] movies)
    {
        int resultLength = 0;
        
        //determine length of result array
        for (int i = 0; i < movies.length; i++)
        {
            if (!movies[i][4].equals("R"))
            {
                resultLength++;
            }
        }
        
         //initialize result array and counter
        String[][] searchChildMode = new String[resultLength][6];
        int counter = 0;
        
        //fill result array with applicable entries
        for (int i = 0; i < movies.length; i++)
        {
            if (!movies[i][5].equals("R"))
            {
                searchChildMode[counter][0] = movies[i][0];
                searchChildMode[counter][1] = movies[i][1];
                searchChildMode[counter][2] = movies[i][2];
                searchChildMode[counter][3] = movies[i][3];
                searchChildMode[counter][4] = movies[i][4];
                searchChildMode[counter][5] = movies[i][5];
                counter++;
            }
        }
        
        //TESTING OUTPUT:
//        for (int i = 0; i < movies.length; i++)
//        {
//            System.out.println(searchChildMode[i][0]+searchChildMode[i][1]+searchChildMode[i][5]);
//        }
        return searchChildMode;
    } 
    
    public String[][] search(String query, int index, String[][] movies)
    {
        int arrayLength = 0;
        
        //determine result array length
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][index].equals(query))
            {
                arrayLength++;
            }
        }
        //initialize result array and counter
        String[][] output = new String[arrayLength][6];
        int counter = 0;
        
        //fill result array with entries that match date passed as parameter
        for (int i = 0; i < movies.length; i++)
        {
            if (movies[i][index].equals(query))
            {
                output[counter][0] = movies[i][0];
                output[counter][1] = movies[i][1];
                output[counter][2] = movies[i][2];
                output[counter][3] = movies[i][3];
                output[counter][4] = movies[i][4];
                output[counter][5] = movies[i][5];
                counter++;
            }
        }
        
        return output;
    }
    
    public String findBio(String movieName)
    {
        for (int i = 0; i < bioDB.length; i++)
        {
            if (bioDB[i][0].equals(movieName))
            {
                return bioDB[i][1];
            }
        }
        return "No Bio Available";
    }
    
    
    public void initializeDB()
    {
        String file = "TermProject_Movie_Database.csv";
        
        BufferedReader br = null;
        String line = "";
        String splitOn = ",";
        int rowCount =0;
        int count = 0;

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
    }
    
    public void initializeMB()
    {
        String file = "Movie_Bio.txt";
        
        BufferedReader br = null;
        String line = "";
        String splitOn = "	";
        int rowCount =0;
        int count = 0;

        //read file into movieDB array
        try{
            br = new BufferedReader(new FileReader(file));
            //System.out.println("FOUND IT");
            while ((line = br.readLine()) != null){
                //System.out.println(count);
                String[] splitLine = line.split(splitOn);
                bioDB[rowCount] = splitLine;
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
    }
}
