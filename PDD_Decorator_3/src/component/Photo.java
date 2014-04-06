package component;

import java.awt.Graphics;
import java.awt.event.PaintEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Photo extends JPanel {
	
	BufferedImage image;
	
	public Photo() {
		
		try {	
			image = ImageIO.read(new File("waa.png"));
		} catch (IOException e) {
			System.out.println("Error al cargar la imagen");
			e.printStackTrace();
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, null);
	}
	
}//Fin class Photo
