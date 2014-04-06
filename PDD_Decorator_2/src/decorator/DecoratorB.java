package decorator;

import component.IComponent;

public class DecoratorB implements IComponent {

	IComponent component;
	public String addedState = "past the Coffee Shop ";

	public DecoratorB(IComponent component) {
		this.component = component;
	}

	public String addedBehavior() {
		return "and I bought a cappuccino ";
	}

	@Override
	public String operation() {		 		
		return component.operation() + "to school ";
	}

}// Fin DecoratorB
