

/**
 * NestedQuerySample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.nested_query_sample;

    /*
     *  NestedQuerySample java interface
     */

    public interface NestedQuerySample {
          

        /**
          * Auto generated method signature
          * 
                    * @param customerOrders0
                
             * @throws org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.nested_query_sample.Order[] customerOrders(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param customerOrders0
            
          */
        public void startcustomerOrders(

            

            final org.wso2.carbon.dataservices.samples.nested_query_sample.NestedQuerySampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param customerName3
                
             * @throws org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault : 
         */

         
                     public java.lang.String customerName(

                        int customerNumber4)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param customerName3
            
          */
        public void startcustomerName(

            int customerNumber4,

            final org.wso2.carbon.dataservices.samples.nested_query_sample.NestedQuerySampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param listOffices7
                
             * @throws org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.nested_query_sample.Office[] listOffices(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param listOffices7
            
          */
        public void startlistOffices(

            

            final org.wso2.carbon.dataservices.samples.nested_query_sample.NestedQuerySampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param employeesInOffice10
                
             * @throws org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.nested_query_sample.Employee[] employeesInOffice(

                        java.lang.String officeCode11)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.nested_query_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param employeesInOffice10
            
          */
        public void startemployeesInOffice(

            java.lang.String officeCode11,

            final org.wso2.carbon.dataservices.samples.nested_query_sample.NestedQuerySampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    