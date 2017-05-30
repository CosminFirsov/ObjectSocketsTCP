/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ud3_e7_ObjetosSockets;

import java.io.*;
import java.net.*;

/**
 *
 * @author DAM203
 */
public class E7_ClienteObjetoTCP {
    public static void main(String[] args) throws SocketException, IOException, ClassNotFoundException {
        String host ="localhost";
        int puerto = 6000;
        System.out.println("programa cliente iniciando....");
        
        System.out.println("Esperando al cliente....");
        Socket cliente = new Socket(host,puerto);
        
        ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
        E7_Persona dato = (E7_Persona) perEnt.readObject();
        System.out.println("Recibido: " + dato.getNombre() + "*" + dato.getEdad());
        
        dato.setNombre("Juan Ramos");
        dato.setEdad(22);
        
        ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
        
        perSal.writeObject(dato);
        System.out.println("Envio: " + dato.getNombre() + "*" + dato.getEdad());


        
        
        perEnt.close();
        perSal.close();
        cliente.close();

    }
}
