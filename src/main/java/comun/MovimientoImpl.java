package comun;

import java.time.LocalDate;
import java.util.List;

public class MovimientoImpl implements Movimiento {
	
	
	private Long idMovimiento;
	private Cuenta cuenta;
	private LocalDate fecha;
	private String concepto;
	private double importe;
	private List<CategoriaImpl> categorias;
	
	
	
	public MovimientoImpl() {
		super();
	}
	public Long getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}


	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public List<CategoriaImpl> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<CategoriaImpl> categorias) {
		this.categorias = categorias;
	}

}
