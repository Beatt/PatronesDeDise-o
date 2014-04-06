package decorator;

import java.awt.Color;
import java.awt.Graphics;

import component.Photo;

@SuppressWarnings("serial")
public class TaggedPhoto extends Photo {

	private Photo photo;
	private String tag;
	
	public TaggedPhoto(Photo photo, String tag) {
		this.photo = photo;
		this.tag = tag;
	}

	@Override
	public void paint(Graphics g) {
		photo.paint(g);
		g.setColor(Color.GREEN);
		g.drawString(tag, 250, 250);
	}
	
}//Fin class TaggedPhoto
