/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M9UF3A1Sub3;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author ALUMNEDAM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress DireccionLocal = InetAddress.getLocalHost();
        InetAddress ferreria = InetAddress.getByName("www.inslaferreria.com");
        System.out.println("Información del host local");
        System.out.println(DireccionLocal);
        System.out.println("Dirección IP " + " : " + DireccionLocal.getHostAddress());
        System.out.println("Nombre del host " + " : " + DireccionLocal.getHostName() + "\n");

        System.out.println("Direccion ip de www.inslaferreria.com");
        System.out.println(ferreria + "\n");
        System.out.println("Direcciones ip de www.google.com");
       for (InetAddress inetAddress : InetAddress.getAllByName("www.google.com")) {
System.out.println(inetAddress);
          
    }
        
    }
    
}
