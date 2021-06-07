package comun;

public class GastoImpl extends MovimientoImpl implements Gasto{
private boolean autorizado;


public GastoImpl() {
	super();
}

public void setAutorizado(boolean autorizado) {
	this.autorizado = autorizado;
}


public boolean isAutorizado() {
	return autorizado;
}

@Override
public Usuario getUsuarioAutorizado() {
	return getUsuarioAutorizado();
}

}
