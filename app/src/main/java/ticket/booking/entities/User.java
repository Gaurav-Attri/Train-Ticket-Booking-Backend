package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public User() {}

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public String getHashedPassword(){
        return this.hashedPassword;
    }

    public List<Ticket> getTicketsBooked(){
        return this.ticketsBooked;
    }

    public String getUserId(){
        return this.userId;
    }

    public void printTickets(){
        for(Ticket ticket : ticketsBooked){
            System.out.println(ticket.getTicketInfo());
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
}
