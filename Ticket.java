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
import java.io.Serializable;

public class Ticket implements Serializable{

    public String date;
    public String movieName;
    public String theater;
    public String time;
    public String movieType;
    public String rating;
    private static final long serialVersionUID = 1L;
    
    public Ticket(String d,String mn,String th,String t,String mt, String r)
    
    {
       date =d;
       movieName = mn;
       theater = th;
       time = t;
       movieType = mt;
       rating = r;
       
        
    }
    
}
