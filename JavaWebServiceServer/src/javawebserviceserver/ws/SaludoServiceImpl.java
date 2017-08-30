/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceserver.ws;

import javax.jws.WebService;


/**
 *
 * @author Federico Coraglio
 */
@WebService(endpointInterface = "javawebserviceserver.ws.SaludoService", serviceName = "SaludoServiceImpl")
public class SaludoServiceImpl implements SaludoService {

    @Override
    public void mostrarSaludo() {
        System.out.println("mostrar el saludo!");
    }
    
}
