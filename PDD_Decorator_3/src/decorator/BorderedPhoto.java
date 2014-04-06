package decorator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import component.Photo;

@SuppressWarnings("serial")
public class BorderedPhoto extends Photo {
	
	Photo photo;
	Color color;
	
	public BorderedPhoto(Photo photo, Color color) {
		this.photo = photo;
		this.color = color;
	}

	@Override
	public void paint(Graphics g) {
		photo.paint(g);
		g.setColor(color);
		g.drawRect(0, 0, 460, 460);
	}

}//Fin class BorderedPhoto
