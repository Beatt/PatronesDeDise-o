import component.Component1;
import component.IComponent;
import decorator.DecoratorA;
import decorator.DecoratorB;

public class Cliente {
	
	static void display(String msj, IComponent c) {
		System.out.println(msj + c.operation());
	}
	
	public static void main(String...args) {
		
		IComponent component = new Component1();
		display("1. Basic component: ", component);		
		display("2. A-decorated ", new DecoratorA(component));
		display("3. B-decorated " , new DecoratorB(component));
		display("4. A+B-decorated ", new DecoratorB(new DecoratorA(component)));
		DecoratorB b = new DecoratorB(new Component1());
		display("5. A+B-decorated: " , new DecoratorA(b));		
		System.out.println("\t\t" + b.addedState + b.addedBehavior());
	}
	
}//Fin class Cliente
