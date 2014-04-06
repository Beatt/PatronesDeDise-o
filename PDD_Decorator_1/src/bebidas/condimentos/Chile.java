package bebidas.condimentos;

import bebidas.Bebida;

public class Chile extends CondimentoAbstracto {
	
	public Chile(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return bebida.getPrecio() + 10.5f;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + " chile";
	}

}//Fin class Chile
