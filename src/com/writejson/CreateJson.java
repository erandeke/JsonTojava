/**
 * 
 */
package com.writejson;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Kedar Erande
 *
 * date:28/07/2018
 */
public class CreateJson {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * @param creation of json object that stores the data in the form of map
		 */
		
		JSONObject obj=new JSONObject();
		//Map for creating the json object
		
		obj.put("Database 1","Fi.trades");
		obj.put("Database 2","Fi.trades.hist");
		obj.put("BatchSize ",2);
		obj.put("Iterations","1");
			
		
		/**
		 * @param args Creating the json array for excluding the list of datasets
		 */
		
		JSONArray ja = new JSONArray();
		 ja.add("_id");
		 ja.add("eventId");
		 ja.add("srcMsg");
		 
		 obj.put("Exclude-Data", ja);
		  
		
		 /**
			 * @param args Creating the json array for source system the list of datasets
			 */
		 	 
		 //Source System
		 JSONArray list = new JSONArray();
	        list.add("GC");
	        list.add("BIG-TOMS");
	        list.add("HEN");
		 obj.put("Source-System", list);
		 
		 
		 
		 /**
			 * @param args Printing the datasets
			 */
		 
		  PrintWriter pw=null;
		try {
			pw = new PrintWriter("E:\\Spring Boot Apps\\Java-Mongo Db\\ParseJson\\src\\DemoJson.json");
		    pw.write(obj.toString());
	         
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    finally
	    {
	    	  pw.flush();
		        pw.close();
			 
	    }
		  
		
		
		
		
		
	}

}
