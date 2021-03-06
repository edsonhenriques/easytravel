
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-18T18:30:51.445+01:00
 * Generated source version: 2.7.3
 */

@WebFault(name = "APIException", targetNamespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/")
public class APIException_Exception extends Exception {
    
    private com.conducivetech.cache.flighthistory.api_internal.v2.APIException apiException;

    public APIException_Exception() {
        super();
    }
    
    public APIException_Exception(String message) {
        super(message);
    }
    
    public APIException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public APIException_Exception(String message, com.conducivetech.cache.flighthistory.api_internal.v2.APIException apiException) {
        super(message);
        this.apiException = apiException;
    }

    public APIException_Exception(String message, com.conducivetech.cache.flighthistory.api_internal.v2.APIException apiException, Throwable cause) {
        super(message, cause);
        this.apiException = apiException;
    }

    public com.conducivetech.cache.flighthistory.api_internal.v2.APIException getFaultInfo() {
        return this.apiException;
    }
}
