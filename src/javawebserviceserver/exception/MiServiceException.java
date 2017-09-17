/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebserviceserver.exception;

import javawebserviceserver.ws.MiServiceFault;
import javax.xml.ws.WebFault;

   
@WebFault(name="MiServiceFault")
public class MiServiceException extends Exception {
 
    /**
     * 
     */
    private static final long serialVersionUID = -6647544772732631047L;
    private MiServiceFault fault;
    /**
     * 
     */
    public MiServiceException() {
            // TODO Auto-generated constructor stub
    }
    /**
     * 
     * @param fault
     */
    public MiServiceException(MiServiceFault fault) {
        super(fault.getFaultString()); 
        this.fault = fault;
    }
    /**
     * 
     * @param message
     * @param faultInfo
     */
    public MiServiceException(String message, MiServiceFault faultInfo){
            super(message);
    this.fault = faultInfo;
    }
    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public MiServiceException(String message, MiServiceFault faultInfo, Throwable cause){
            super(message,cause);
    this.fault = faultInfo;
    }
    /**
     * 
     * @return
     */
    public MiServiceFault getFaultInfo(){
            return fault;
    }

    /**
     * @param message
     */
    public MiServiceException(String message) {
            super(message);
            // TODO Auto-generated constructor stub
    }
    /**
     * @param message
     */
    public MiServiceException(String code, String message) {
        super(message);
        this.fault = new MiServiceFault();
        this.fault.setFaultString(message);
        this.fault.setFaultCode(code);
    }

    /**
     * @param cause
     */
    public MiServiceException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public MiServiceException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }
}
