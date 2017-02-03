/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M9UF3A1sub1;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author Jaume
 */
public class Internete extends Object {

    ArrayList interfaces;
    ArrayList lista1 = new ArrayList<>();
    ArrayList lista2 = new ArrayList<>();

    public Internete() throws SocketException {
        this.interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
        this.lista1 = Collections.list(NetworkInterface.getNetworkInterfaces());
        redecitas();
    }

    public void redecitas() throws SocketException {
        try {
            System.out.println("Mostrando interficies");
            //Declarem una llista enumeration per guardar les interficies, i recorre totes aquestes..
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                //Guardamos y mostramos la interfaz.
                NetworkInterface interfaz = interfaces.nextElement();
                System.out.println(interfaz.getDisplayName());
                
                //Declarem un atribut per a guardar les adreçes , i recorre totes aquestes.
                Enumeration<InetAddress> address = interfaz.getInetAddresses();
                while (address.hasMoreElements()) {
                    //Guardamos y mostramos la adreca.
                    InetAddress ip = address.nextElement();
                    System.out.println(ip.getHostAddress());
                }
                System.out.println("\n");
                        }
        } catch (SocketException e) {
            System.out.println(e);
        }
    }
}


