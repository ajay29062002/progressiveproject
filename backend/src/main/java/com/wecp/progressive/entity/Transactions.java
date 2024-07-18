package com.wecp.progressive.entity;
import java.sql.Timestamp;
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaction_id;
    private Integer account_id;
    private Double amount;
    private Date transaction_date;
    private String transaction_type;
 
   
   public Transactions()
   {
 
   }
 
public Integer getTransaction_id() {
    return transaction_id;
}
 
public void setTransaction_id(Integer transaction_id) {
    this.transaction_id = transaction_id;
}
 
public Integer getAccount_id() {
    return account_id;
}
 
public void setAccount_id(Integer account_id) {
    this.account_id = account_id;
}
 
public Double getAmount() {
    return amount;
}
 
public void setAmount(Double amount) {
    this.amount = amount;
}
 
public Date getTransaction_date() {
    return transaction_date;
}
 
public void setTransaction_date(Date transaction_date) {
    this.transaction_date = transaction_date;
}
 
public String getTransaction_type() {
    return transaction_type;
}
 
public void setTransaction_type(String transaction_type) {
    this.transaction_type = transaction_type;
}
 
 
}