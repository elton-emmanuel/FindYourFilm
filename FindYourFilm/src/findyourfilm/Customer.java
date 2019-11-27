/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourfilm;
import java.util.*;


/**
 *
 * @author User
 */
public class Customer {
    
    public  String name;
    public  String type;
    public  ArrayList<Ticket> ticketList = new ArrayList<>();
    
    public Customer(String n,String t, ArrayList<Ticket> list)
    {
        name = n;
        type = t;
        ticketList = list;
    }
    public void AddTicket(Ticket ticket)
    {
        if(ticketList== null)
            ticketList = new ArrayList<>();
                    
        ticketList.add(ticket);
      
        
    }
    
    
}
