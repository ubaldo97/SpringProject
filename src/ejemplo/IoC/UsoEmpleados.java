package ejemplo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Creacion de objetos de tipo empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos
		System.out.println(Empleado1.getTareas()); */
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
		
		/*
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println(Maria.getEmail());
		
		System.out.println(Maria.getNombreEmpresa());*/
		
		contexto.close();
	}

}
