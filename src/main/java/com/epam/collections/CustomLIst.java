package com.epam.collections;
import java.util.ArrayList;

	 
	  
	class CustomLIst 
	{ 
	    
	    int n=4; 
	  
	   
	    class Data 
	    { 
	        int roll; 
	        String name; 
	        int marks; 
	        long phone; 
	  
	        Data(int roll, String name, int marks, long phone) 
	        { 
	            this.roll = roll; 
	            this.name = name; 
	            this.marks = marks; 
	            this.phone = phone; 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        
	        int roll[] = {1, 2, 3, 4}; 
	        String name[] = {"name1", "name2", "name3", "name4"}; 
	        int marks[] = {100, 99, 93, 94}; 
	        long phone[] = {999999999L, 8888888888L, 7777777777L, 
	                        8762357384L 
	                       }; 
	  
	     
	        CustomLIst custom = new CustomLIst(); 
	  
	        custom.addValues(roll, name, marks, phone); 
	    } 
	  
	    public void addValues(int roll[], String name[], int marks[], 
	                          long phone[]) 
	    { 
	        ArrayList<Data> list=new ArrayList<Data>(); 
	  
	        for (int i = 0; i < n; i++) 
	        { 
	            list.add(new Data(roll[i], name[i], marks[i], 
	                                              phone[i])); 
	        } 
	         
	        printValues(list); 
	    } 
	  
	    public void printValues(ArrayList<Data> list) 
	    { 
	     
	  
	        for (int i = 0; i < n; i++) 
	        { 
	             
	            Data data = list.get(i);            
	            System.out.println(data.roll+" "+data.name+" "
	                               +data.marks+" "+data.phone); 
	        } 
	    } 
	} 



