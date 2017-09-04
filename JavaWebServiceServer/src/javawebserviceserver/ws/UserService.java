/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceserver.ws;

import javawebserviceserver.model.User;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Federico Coraglio
 */
@WebService()
public class UserService {
    
    @WebMethod()
    public User createUser(final String firstName, final String lastName, 
                           final String username) {
        
        return new User(firstName, lastName, username);
        
    }
    
}
