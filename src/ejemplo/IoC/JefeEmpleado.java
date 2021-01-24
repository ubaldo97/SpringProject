package ejemplo.IoC;

public class JefeEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "retorno cuestiones relativas a empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Presentando informe por parte del jefe:" + informeNuevo.getInforme();
	}
}
