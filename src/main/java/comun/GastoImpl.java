package comun;

public class GastoImpl extends MovimientoImpl implements Gasto{
private boolean autorizado;

public void setAutorizado(boolean autorizado) {
	this.autorizado = autorizado;
}

@Override
public boolean getAutorizado() {
	return autorizado;
}

}
