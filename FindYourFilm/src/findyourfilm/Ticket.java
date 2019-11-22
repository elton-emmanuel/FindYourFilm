/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourfilm;

/**
 *
 * @author User
 */

public class Ticket {

    public String date;
    public String movieName;
    public String theater;
    public String time;
    public String movieType;
    public String age;
    public String rating;
    
    public Ticket(String d,String mn,String th,String t,String mt,String a, String r)
    
    {
       date =d;
       movieName = mn;
       theater = th;
       time = t;
       movieType = mt;
       age = a;
       rating = r;
       
        
    }
    
}
