package pdd.proxy2.entity;

import java.util.HashMap;
import java.util.Map;

public class SpaceBook {
	
	private static Map<String, SpaceBook>  community
		= new HashMap<String, SpaceBook>();
	
	private String pages;
	private String name;
	private String gap = "\n\t\t\t\t";
	
	public static boolean IsUnique(String name) {		
		return community.containsKey(name);
	}//Fin IsUnique
	
	public SpaceBook(String n) {
		
		name = n; // Nombre de dueño de la página.
		community.put(n, this);
		
	}//Fin SpaceBook
	
	public void add(String s) {
		
		pages += gap+s;
		System.out.println(gap+"=====================" + name + "'s SpaceBook ==========");
		System.out.println(pages);
		System.out.println(gap+"=================================");
		
	}//Fin add
	
	public void add(String friend, String message) {
		
		community.put(friend, this).add(message);
		
	}
	
	public void poke(String who, String friend) {
		
		community.get(who).pages += gap + friend + " poked you";
		
	}
	
}//Fin class SpaceBook
