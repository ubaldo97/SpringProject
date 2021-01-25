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
public class UsoDemoSingletonPrototype {
    
    public static void main(String[] args){
    
        //Carga de xml de configuracion 
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
        
        //Peticion de beans al contenedor Spring
        
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Jose = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Ivan = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        
        System.out.println(Maria);
        System.out.println(Pedro);
        System.out.println(Juan);
        System.out.println(Jose);
        System.out.println(Ivan);
    }
}
