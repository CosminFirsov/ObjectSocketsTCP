/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ud3_e7_ObjetosSockets;

import java.io.Serializable;

/**
 *
 * @author DAM203
 */
public class E7_Persona implements Serializable{
    String nombre;
    int edad;

    
    public E7_Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public E7_Persona() {
        super();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
