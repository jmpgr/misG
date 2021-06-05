package comun;

import java.time.LocalDate;
import java.util.List;

public class MovimientoImpl implements Movimiento {
	
	
	private Long idMovimiento;
	private Usuario uauario;
	private LocalDate fecha;
	private String concepto;
	private double importe;
	private List<Categoria> categorias;
	
	
	
	public MovimientoImpl() {
		super();
	}
	public Long getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public Usuario getUauario() {
		return uauario;
	}
	public void setUauario(Usuario uauario) {
		this.uauario = uauario;
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
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

}
