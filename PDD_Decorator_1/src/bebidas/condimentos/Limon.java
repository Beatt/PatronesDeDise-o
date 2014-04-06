package bebidas.condimentos;

import bebidas.Bebida;

public class Limon extends CondimentoAbstracto {
	
	public Limon(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return bebida.getPrecio() + 50.5f;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + " limon";
	}

}
