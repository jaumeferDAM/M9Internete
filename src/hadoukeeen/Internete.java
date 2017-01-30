/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadoukeeen;

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
        System.out.println("Imprimiendo info sobre las redes actuales : \n");
        for (int i = 0; i < interfaces.size(); i++) {
            System.out.println(interfaces.get(i));
        }
        System.out.println("End");

        for (Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();++
                
        for (InterfaceAddress ia : f.getInterfaceAddresses()) {
            int network_prefix_len = ia.getNetworkPrefixLength();
            InetAddress address = ia.getAddress();
            InetAddress broadcast = ia.getBroadcast();
        }
        for (int i = 0; i < lista1.size(); i++) {
            lista2 = (ArrayList) lista1.get(i);
//            lista2 = Collections.list(InetAddress.I());
        }
    }
}
