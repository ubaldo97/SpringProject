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
        
        //Metodo init para ejecutar tareas antes de que el bean este disponible
        public void metodoInicial(){
            System.out.println("Dentro del metodo init. Aqui irian todas las "
                    + "tareas antes del que bean este disponible");
        }
        
        //Metodo destroy para ejecutar tareas despues de que el bean haya sido usado
        public void metodoFinal(){
            System.out.println("Dentro del metodo destroy. Aqui irian todas las "
                    + "tareas despues de que bean haya sido utilizado");
        }
}
