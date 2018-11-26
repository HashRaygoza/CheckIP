/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hash.checkip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class CheckIP {
    static private final Logger LOGGER = Logger.getLogger("mx.com.hash.checkip.CheckIP");

    String obtenerIP() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostAddress();
    }
    
    static public void main(String[] args) {
        try {
            CheckIP checkIP = new CheckIP();
            System.out.println("La IP de su compuradora es " + checkIP.obtenerIP());
        } catch (UnknownHostException ex) {
            LOGGER.log(Level.SEVERE, "Error al consultar el Host");
            LOGGER.log(Level.SEVERE, null, ex);
        }        
    }    
}

