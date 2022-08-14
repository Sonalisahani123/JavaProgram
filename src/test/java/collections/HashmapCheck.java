package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashmapCheck {
	
	
	@Test
	public void hashmaptest()
	{
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		  hm.put("sonali",1);
		  hm.put("sonu", 2);
		  hm.put("runu", 3);
		  System.out.println(hm);
		  System.out.println(hm.get("sonu"));
		  Set<String> ks = hm.keySet();
		  for(String s:ks)
		  {
			 System.out.println(s);
		  }
	
	}
	
	@Test
	public void mapIterator_iterartor()
	{
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		  hm.put("sonali",1);
		  hm.put("sonu", 2);
		  hm.put("runu", 3);
		Iterator<Map.Entry<String,Integer>> itr =  hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry =itr.next();
			System.out.println(entry.getKey() + "|" +entry.getValue());
		}
		  
	}
	
	@Test
	public void mapIterator_forEach()
	{
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		  hm.put("sonali",1);
		  hm.put("sonu", 2);
		  hm.put("runu", 3);
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	
	@Test
	public void mapIterator_keys_values()
	{
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		  hm.put("sonali",1);
		  hm.put("sonu", 2);
		  hm.put("runu", 3);
		for(String key:hm.keySet())
		{
			System.out.println(key);
		}
		for(Integer value:hm.values())
		{
			System.out.println(value);
		}
	}
	
	@Test
	public void mapIterator_keys_values1()
	{
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		  hm.put("sonali",1);
		  hm.put("sonu", 2);
		  hm.put("runu", 3);
		for(String key:hm.keySet())
		{
			System.out.println(key + hm.get(key));
		}
		
	}

}
