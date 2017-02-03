/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M9UF3A1Sub2;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 * @author ALUMNEDAM
 */
public class Mainsub2 {

    /**
     * @param args the command line arguments 1.En primer lloc per obtenir una
     * referència a la interfície de xarxa connectada al host donat el nom de la
     * interfície. Fem ús de la classe NetworkInterface i la funció getByName().
     * 2.Una vegada obtinguda la interfície de xarxa, feu ús del mètode
     * getHardwareAddress() per obtenir la direcció MAC associada a la
     * interfície. Aquesta funció retorna byte[]
     */
    public static void main(String[] args) throws SocketException {
        ArrayList interficies = new ArrayList();
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

        while (interfaces.hasMoreElements()) {
            NetworkInterface NI = interfaces.nextElement();
            byte[] adreca = NI.getHardwareAddress();

            if (adreca != null) {
                //Inicialitzem un StringBuilder per despres imprimir la MAC en forma de String
                StringBuilder sb = new StringBuilder();
                //Fem un bucle for de la llargada de la direccio MAC
                for (int i = 0; i < adreca.length; i++) {
                    //Anem afegint al string cada parell de numeros seguit d'un gui. En cas de ser l'utlim parell no posem guio.
                    sb.append(String.format("%02X%s", adreca[i], (i < adreca.length - 1) ? "-" : ""));
                }
                //Imprimim la interficie amb la MAC
                System.out.println("Interficie: " + NI.getName() + "amb MAC: " + sb.toString());
                System.out.println("--- ---     ---     ---     ---");
            }

        }

    }
}
