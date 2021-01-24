package ejemplo.IoC;

public class SecretarioEmpleado implements Empleados {

	//Creacion de campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	
		
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: "+informeNuevo.getInforme();
	}

}
