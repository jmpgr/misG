package comun;



public interface Gasto {
	
	
	default boolean isAutorizado() {
			if (getUsuarioAutorizado() != null);
			return true;
		}
	
	Usuario  getUsuarioAutorizado();

	

}
