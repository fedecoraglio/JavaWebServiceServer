/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceserver;

import javawebserviceserver.ws.SimpleService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Federico Coraglio
 */
public class JavaWebServiceServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando el servicio llamado simple service...");
        Endpoint.publish("http://localhost:8001/ws/simpleService", new SimpleService());
        System.out.println("El servicio quedo iniciado correctamente");
    }
    
}
