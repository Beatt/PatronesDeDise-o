package pdd.proxy2.test;

import pdd.proxy2.proxy.MySpaceBook;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySpaceBook me = new MySpaceBook();
		me.add("Hello World");
		me.add("Today I worked 18 hours");
		
		MySpaceBook tom = new MySpaceBook();
		tom.poke("Judith");
		tom.add("Judith", "Poor you");
		tom.add("Off to see the Lion King tonight");
	}

}
