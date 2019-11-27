/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourfilm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;


/**
 *
 * @author User
 */
public class Customer implements Serializable {
    
    public  String name;
    public  String type;
    public  ArrayList<Ticket> ticketList = new ArrayList<>();
    private static final long serialVersionUID = 1L;
    
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
    
    public void saveState(Customer customer) {
        
        try {
            FileOutputStream f = new FileOutputStream(new File("savedusers.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(customer);
            
            o.close();
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadTickets() throws FileNotFoundException, IOException, ClassNotFoundException {
         try {
            FileInputStream fin = new FileInputStream(new File("savedusers.txt"));
            ObjectInputStream oin = new ObjectInputStream(fin);
            
            Customer user = (Customer) oin.readObject();
            
            oin.close();
            fin.close();
         } catch (Exception e) {
             System.out.println(e);
         }
    }
    
}
