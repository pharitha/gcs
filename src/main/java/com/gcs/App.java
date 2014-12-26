package com.gcs;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{
 
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("My Unique ID is this one1 : " + obj.generateUniqueKey());
        // comments added here
    }
 
    public String generateUniqueKey(){
 
    	String id = UUID.randomUUID().toString();
    	return id;
 
    }
}
