package com.Json_Parser;

import java.io.File;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Parser {
	
	public static void main(String[] args)throws Throwable {
		
		File f = new File("src\\test\\java\\com\\json\\Json_Payload.json");
		
		FileReader fis = new FileReader(f);
		
		JSONParser json = new JSONParser();
		
		Object parse = json.parse(fis);
		
		JSONObject json_Obj = (JSONObject) parse;  // narrow type casting 
		
		Object object = json_Obj.get("Team");  // key ---> value 
		
		String value = object.toString();
		
		System.out.println("Team : " + value);
		
	}
	
}
