package comun;

public class IngresoImpl extends MovimientoImpl implements Ingreso {
private boolean compartido;

@Override
public boolean getCompartido() {
	return compartido;
}

public void setCompartido(boolean compartido) {
	this.compartido = compartido;
}
}
