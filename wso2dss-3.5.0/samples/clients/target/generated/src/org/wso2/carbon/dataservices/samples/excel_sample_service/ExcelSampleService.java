

/**
 * ExcelSampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.excel_sample_service;

    /*
     *  ExcelSampleService java interface
     */

    public interface ExcelSampleService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getProductClassifications2
                
             * @throws org.wso2.carbon.dataservices.samples.excel_sample_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.excel_sample_service.ProductE[] getProductClassifications(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.excel_sample_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getProductClassifications2
            
          */
        public void startgetProductClassifications(

            

            final org.wso2.carbon.dataservices.samples.excel_sample_service.ExcelSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getProducts5
                
             * @throws org.wso2.carbon.dataservices.samples.excel_sample_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.excel_sample_service.getproducts.Product[] getProducts(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.excel_sample_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getProducts5
            
          */
        public void startgetProducts(

            

            final org.wso2.carbon.dataservices.samples.excel_sample_service.ExcelSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    