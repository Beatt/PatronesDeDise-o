package decorator;

import component.IComponent;

public class DecoratorA implements IComponent {
	
	IComponent component;
	
	public DecoratorA(IComponent component) {
		this.component = component;
	}
	
	@Override
	public String operation() {
		return component.operation() + "and listenig to Classic FM ";
	}

}//Fin class DecoratorA
