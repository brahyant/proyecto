/**
 * 
 */
package Modelo;

/**
 * @author 1
 *
 */
public class Natural extends Cliente {
	private String natPatrimonio;

	/**
	 * Constructor Vacio
	 */
	public Natural() {
		super();
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param nacionalidad
	 * @param perFecNacimiento
	 * @param cliCategoria
	 * @param natPatrimonio
	 */
	public Natural(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String nacionalidad,
			String perFecNacimiento, String cliCategoria, String natPatrimonio) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, nacionalidad, perFecNacimiento, cliCategoria);
		this.natPatrimonio = natPatrimonio;
	}

	public String getNatPatrimonio() {
		return natPatrimonio;
	}

	public void setNatPatrimonio(String natPatrimonio) {
		this.natPatrimonio = natPatrimonio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Natural [natPatrimonio=" + natPatrimonio + ", cliCategoria=" + cliCategoria + ", perRut=" + perRut
				+ ", perNombre=" + perNombre + ", perApePaterno=" + perApePaterno + ", perApeMaterno=" + perApeMaterno
				+ ", Nacionalidad=" + Nacionalidad + ", perFecNacimiento=" + perFecNacimiento + "]";
	}
	

}
