

/**
 * EventingSample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.eventing_sample;

    /*
     *  EventingSample java interface
     */

    public interface EventingSample {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  updateProductQuantity(
         java.lang.String productCode4,double quantityInStock5

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getProductByCode6
                
             * @throws org.wso2.carbon.dataservices.samples.eventing_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.eventing_sample.Product[] getProductByCode(

                        java.lang.String productCode7)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.eventing_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getProductByCode6
            
          */
        public void startgetProductByCode(

            java.lang.String productCode7,

            final org.wso2.carbon.dataservices.samples.eventing_sample.EventingSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addProduct(
         java.lang.String productCode11,java.lang.String productLine12,java.lang.String productName13,int quantityInStock14,double buyPrice15

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    