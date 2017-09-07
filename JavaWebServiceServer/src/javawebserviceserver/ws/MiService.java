/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceserver.ws;

import javawebserviceserver.exception.MiServiceException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService(serviceName="MiService")
public class MiService {
    
    @WebMethod
    public String saludo(@WebParam(name="nombre") String nombre) throws MiServiceException {
        if("fault".equalsIgnoreCase(nombre)) {
            MiServiceFault fault = new MiServiceFault();
            fault.setFaultCode("1234");
            fault.setFaultString("My Service Error");
            throw new MiServiceException(fault);
        } 
        return "Hola " + nombre;
    }
}
