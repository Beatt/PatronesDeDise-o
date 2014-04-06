import bebidas.Bebida;
import bebidas.Cerveza;
import bebidas.Vino;
import bebidas.condimentos.Chile;
import bebidas.condimentos.Limon;

/**
 * Objetivo: Conocer la funcionalidad del patrón de diseño
 * 	decorador(Decorator).
 * 
 * @author beat
 *
 */
public class Aplicacion {
	
	public static void main(String...args) {
		
		Bebida cerveza = new Cerveza();
		
		// Agregan condimentos
		cerveza = new Limon(cerveza);
		cerveza = new Chile(cerveza);
		//Chile c = (Chile) bebida;		
		System.out.println(cerveza.getDescripcion() + " precio: " + cerveza.getPrecio());

		
		Bebida vino = new Vino();
	
		// Agregan condimentos
		vino = new Limon(vino);
		System.out.println(vino.getDescripcion() + " precio: " + vino.getPrecio());
	}
	
}//Fin class Aplicacion
