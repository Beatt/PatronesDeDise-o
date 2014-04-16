package pdd.bridge.sys;

import pdd.bridge.bridge.IBridge;
import pdd.bridge.portal.Portal;
import pdd.proxy2.entity.ICommunication;
import pdd.proxy2.entity.SpaceBook;

/**
 * Objetivo: implementa la interface de IBridge y 
 * 	define su implementación concreta.
 * @author beat
 *
 */
public class MyOpenBook implements IBridge {
	
	private ICommunication myOpenBook;
	private String name;
	private static int users;
	
	public MyOpenBook(String n) {
		
		name = n;
		users++;
		myOpenBook = new SpaceBook(name + "-" + users);
		
	}
	
	@Override
	public void add(String message) {
		myOpenBook.add(message);
	}

	@Override
	public void add(String friend, String message) {
		myOpenBook.add(friend, name + " : " + message);
	}

	@Override
	public void poke(String who) {
		myOpenBook.poke(who, name);
	}
	
}//Fin class MyOpenBook
