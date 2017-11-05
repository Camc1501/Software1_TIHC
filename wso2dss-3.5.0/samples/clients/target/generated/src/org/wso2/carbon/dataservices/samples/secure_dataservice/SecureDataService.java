

/**
 * SecureDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.secure_dataservice;

    /*
     *  SecureDataService java interface
     */

    public interface SecureDataService {
          

        /**
          * Auto generated method signature
          * 
                    * @param showAllOffices0
                
             * @throws org.wso2.carbon.dataservices.samples.secure_dataservice.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.secure_dataservice.Office[] showAllOffices(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.secure_dataservice.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param showAllOffices0
            
          */
        public void startshowAllOffices(

            

            final org.wso2.carbon.dataservices.samples.secure_dataservice.SecureDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    