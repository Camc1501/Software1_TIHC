

/**
 * FaultDBService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.fault_dataservice;

    /*
     *  FaultDBService java interface
     */

    public interface FaultDBService {
          

        /**
          * Auto generated method signature
          * 
                    * @param basic_merge_op8
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Customer[] basic_merge_op(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param basic_merge_op8
            
          */
        public void startbasic_merge_op(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param basic_array_type_op11
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Customer[] basic_array_type_op(

                        java.lang.String country12,java.lang.String[] state13,int creditLimit14,java.lang.String[] city15,java.lang.String contactFirstName16)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param basic_array_type_op11
            
          */
        public void startbasic_array_type_op(

            java.lang.String country12,java.lang.String[] state13,int creditLimit14,java.lang.String[] city15,java.lang.String contactFirstName16,

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param _postcustomers219
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Customer[] _postcustomers2(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _postcustomers219
            
          */
        public void start_postcustomers2(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param _getcustomers122
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Customer[] _getcustomers1(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getcustomers122
            
          */
        public void start_getcustomers1(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param select_op_given_fields25
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Customer[] select_op_given_fields(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param select_op_given_fields25
            
          */
        public void startselect_op_given_fields(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param select_op_count28
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.OrderDetails[] select_op_count(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param select_op_count28
            
          */
        public void startselect_op_count(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param select_attributes_op31
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Payment[] select_attributes_op(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param select_attributes_op31
            
          */
        public void startselect_attributes_op(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param select_op_all_fields34
                
             * @throws org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Product[] select_op_all_fields(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.fault_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param select_op_all_fields34
            
          */
        public void startselect_op_all_fields(

            

            final org.wso2.carbon.dataservices.samples.fault_dataservice.FaultDBServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    