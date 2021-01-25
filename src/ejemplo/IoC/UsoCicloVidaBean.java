/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ups_c
 */
public class UsoCicloVidaBean {
    
    public static void main(String[] args){
    //Cargar xml de configuracion
     ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
    //Obtener el bean
     Empleados juan = contexto.getBean("miEmpleado", Empleados.class); 
     System.out.println(juan.getInforme());
    //Cerrar el contexto
     contexto.close();
     
    }
}
