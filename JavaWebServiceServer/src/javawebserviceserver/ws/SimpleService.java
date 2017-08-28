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
@WebService
public class SimpleService {
    
    public String getGreetings(final String name) {
        return "Bienvenido a mi servicio " + name;
    }
}
