public class Servicio{
    private Trabajador empleado;
    private Vehiculo vehiculo;
    private String desc;
    
    
    /**
	 * @param empleado
	 * @param vehiculo
	 */
	public Servicio(Trabajador empleado, Vehiculo vehiculo) {
		this.empleado = empleado;
		this.vehiculo = vehiculo;
		this.desc = "";
	}

	public Servicio() {
    	this.empleado = new Trabajador();
    	this.vehiculo = new Vehiculo();
    	this.desc = "";
    }

	/**
	 * @return the empleado
	 */
	public Trabajador getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Trabajador empleado) {
		this.empleado = empleado;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Servicio [empleado=" + empleado + ", vehiculo=" + vehiculo + "]";
	}
	
	
}