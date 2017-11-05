
/**
 * DataServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

package org.wso2.carbon.dataservices.samples.eventing_sample;

public class DataServiceFault extends java.lang.Exception{

    private static final long serialVersionUID = 1445621610739L;
    
    private org.wso2.ws.dataservice.DataServiceFault faultMessage;

    
        public DataServiceFault() {
            super("DataServiceFault");
        }

        public DataServiceFault(java.lang.String s) {
           super(s);
        }

        public DataServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DataServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.ws.dataservice.DataServiceFault msg){
       faultMessage = msg;
    }
    
    public org.wso2.ws.dataservice.DataServiceFault getFaultMessage(){
       return faultMessage;
    }
}
    