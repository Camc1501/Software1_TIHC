

/**
 * CSVSampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.csv_sample_service;

    /*
     *  CSVSampleService java interface
     */

    public interface CSVSampleService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getProducts0
                
             * @throws org.wso2.carbon.dataservices.samples.csv_sample_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.csv_sample_service.Product[] getProducts(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.csv_sample_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getProducts0
            
          */
        public void startgetProducts(

            

            final org.wso2.carbon.dataservices.samples.csv_sample_service.CSVSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    