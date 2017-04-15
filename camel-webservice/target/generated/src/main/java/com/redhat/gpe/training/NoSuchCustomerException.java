
package com.redhat.gpe.training;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-04-15T21:33:40.298+05:30
 * Generated source version: 3.1.9
 */

@WebFault(name = "NoSuchCustomer", targetNamespace = "http://training.gpe.redhat.com/")
public class NoSuchCustomerException extends Exception {
    
    private com.redhat.gpe.training.NoSuchCustomer noSuchCustomer;

    public NoSuchCustomerException() {
        super();
    }
    
    public NoSuchCustomerException(String message) {
        super(message);
    }
    
    public NoSuchCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCustomerException(String message, com.redhat.gpe.training.NoSuchCustomer noSuchCustomer) {
        super(message);
        this.noSuchCustomer = noSuchCustomer;
    }

    public NoSuchCustomerException(String message, com.redhat.gpe.training.NoSuchCustomer noSuchCustomer, Throwable cause) {
        super(message, cause);
        this.noSuchCustomer = noSuchCustomer;
    }

    public com.redhat.gpe.training.NoSuchCustomer getFaultInfo() {
        return this.noSuchCustomer;
    }
}
