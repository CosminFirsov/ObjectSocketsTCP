/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ud3_e7_ObjetosSockets;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.*;
import java.net.*;

/**
 *
 * @author DAM203
 */
public class E7_ServidorObjetoTCP {
    public static void main(String[] args) throws SocketException, IOException, ClassNotFoundException {
        int numeroPuerto = 6000;
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("Esperando al cliente....");
        Socket cliente = servidor.accept();
        
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
        
        E7_Persona persona = new E7_Persona("Juan", 20);
        outObjeto.writeObject(persona);
        System.out.println("Envio: " + persona.getNombre() + "*" + persona.getEdad());
        
        ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
        
        E7_Persona dato = (E7_Persona) inObjeto.readObject();
        System.out.println("Recibido: " + dato.getNombre() + "*" + dato.getEdad());
        
        outObjeto.close();
        inObjeto.close();
        cliente.close();
        servidor.close();
        
    }
}
