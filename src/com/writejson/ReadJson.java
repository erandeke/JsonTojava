/**
 * 
 */
package com.writejson;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Kedar Erande
 *
 * date:28/07/2018
 */
public class ReadJson {

	/**
	 * Read Json Driver
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> excludes=new HashSet<String>();
		Set<String> sourceSystem=new HashSet<String>();
		   try {
			Object obj = new JSONParser().parse(new FileReader("E:\\Spring Boot Apps\\Java-Mongo Db\\ParseJson\\src\\DemoJson.json"));
			
			JSONObject job=(JSONObject)obj;
			
			String Db1=job.get("Database 1").toString();
			String Db2=job.get("Database 2").toString();
			/*Integer batchSize2Retrieve=(Integer) job.get("BatchSize");
			Integer Iterations=(Integer)job.get("Iterations");*/
			
		
			System.out.println(Db1);
			System.out.println(Db2);
		/*	System.out.println(batchSize2Retrieve);
			System.out.println(Iterations);*/
			
			JSONArray ja=(JSONArray) job.get("Exclude-Data");
			Iterator<String> itr=ja.iterator();
			while(itr.hasNext())
			{
				String excludelist=(String)itr.next();
				excludes.add(excludelist);
				
			}
			System.out.println(excludes);
			ja=(JSONArray)job.get("Source-System");
			
			 while(itr.hasNext())
			 {
				 String sourceSystems=(String)itr.next();
				 sourceSystem.add(sourceSystems);
				 System.out.println(sourceSystem);
				 
			 }
			
			
			
			
			
			
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	         
	}

}
