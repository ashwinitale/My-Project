package steps;

import java.util.ArrayList;
import java.util.HashMap;


public class ListOfMapOfString {

	public static void main(String[] args) {
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("India", "New Delhi");
		Capital.put("South Africa", "Cape Town");
		Capital.put("France", "Paris");
		
		HashMap<String, String> Currency=new HashMap<String, String>();
		Currency.put("India", "Rupee");
		Currency.put("South Africa", "Rands");
		Currency.put("France", "Euro");
		
		ArrayList<HashMap<String, String>> al= new ArrayList<HashMap<String, String>>();
		al.add(Capital);
		al.add(Currency);
		
		
	
	}

}
