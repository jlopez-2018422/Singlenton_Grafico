/*
    Paso 1: Crear el constructor de la clase (public) private.
    Paso 2: Declarar una variable privada y estática del formulario 
            que se requiere utilizar (JFrame)
    Paso 3: Agregar la librería 
    Paso 4: Crearemos un método para la instancia del Objeto 
    Paso 5: Agregar el paquete del Login 
*/
package org.jefreylopez.clases;

import javax.swing.JFrame;
import org.jefreylopez.system.Login;

public class LoginSingleton {
    
    private static JFrame log;
    
    // Contructor de la clase (private)
    private LoginSingleton() {
    }
    
    public static JFrame getInstance(){
        if(log == null)
            log = new Login();
            return log;
    }
    
}
