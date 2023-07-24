package com.endava.ticketmanagersystem.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;
    @Column(name="CustomerName")
    private String CustomerName;
    @Column(name="Email", unique = true)
    private String Email;


    //Constructors
    public Customer(){}

    public Customer(int customerID, String customerName, String email) {
        CustomerID=customerID;
        CustomerName=customerName;
        Email=email;
    }


//getteri+setteri

    public int getCustomerID(){
        return CustomerID;
    }

    public void setCustomerID(int customerId){
        this.CustomerID=customerId;
    }
   public String getCustomerName(String CustomerName){
       return CustomerName;
   }

   public void setCustomerName(String CustomerName){
       this.CustomerName=CustomerName;
   }

   public String getEmail() {
    return Email;
    }
    public void setEmail(String Email){
       this.Email = Email;
   }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + CustomerID +
                ", email='" + Email + '\'' +
                ", name='" + CustomerName + '\'' +
                '}';
    }

}
