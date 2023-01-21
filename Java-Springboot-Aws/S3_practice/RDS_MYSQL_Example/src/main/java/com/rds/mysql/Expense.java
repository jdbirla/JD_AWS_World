package com.rds.mysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private float amount;
     
    public Expense() {
    }
 
    
    
 
    // getters and setters are hidden for brevity
 
    public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getItem() {
		return item;
	}




	public void setItem(String item) {
		this.item = item;
	}




	public float getAmount() {
		return amount;
	}




	public void setAmount(float amount) {
		this.amount = amount;
	}




	@Override
    public String toString() {
        return id + ". " + item + " - " + amount + " USD";     
    }  
}