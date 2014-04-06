import java.awt.Color;

import component.Aplication;
import component.Photo;
import decorator.BorderedPhoto;
import decorator.TaggedPhoto;


public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String...args) {
		
		//new Aplication().run(new TaggedPhoto(new BorderedPhoto(new Photo(), Color.red), "Decorator"));
		new Aplication().run(new TaggedPhoto(new Photo(), "Decorator"));

	}

}//Fin class Cliente
