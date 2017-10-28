

/**
 * GSpreadSample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.gspread_sample_service;

    /*
     *  GSpreadSample java interface
     */

    public interface GSpreadSample {
          

        /**
          * Auto generated method signature
          * 
                    * @param _getcustomers2
                
             * @throws org.wso2.carbon.dataservices.samples.gspread_sample_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.gspread_sample_service.Customer[] _getcustomers(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.gspread_sample_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getcustomers2
            
          */
        public void start_getcustomers(

            

            final org.wso2.carbon.dataservices.samples.gspread_sample_service.GSpreadSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getCustomers5
                
             * @throws org.wso2.carbon.dataservices.samples.gspread_sample_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.gspread_sample_service.Customer[] getCustomers(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.gspread_sample_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getCustomers5
            
          */
        public void startgetCustomers(

            

            final org.wso2.carbon.dataservices.samples.gspread_sample_service.GSpreadSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    