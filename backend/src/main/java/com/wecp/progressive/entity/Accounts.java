package com.wecp.progressive.entity;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
 
@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer account_id;
    private  Integer customer_id;
    private Double balance;
 
    @ManyToOne
    private Customers customers;
 
    public Accounts()
    {
 
    }
 
    public Integer getAccount_id() {
        return account_id;
    }
 
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }
 
    public Integer getCustomer_id() {
        return customer_id;
    }
 
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
 
    public Double getBalance() {
        return balance;
    }
 
    public void setBalance(Double balance) {
        this.balance = balance;
    }
 
    public Customers getCustomers() {
        return customers;
    }
 
    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
 
}