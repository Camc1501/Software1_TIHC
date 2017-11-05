

/**
 * BatchRequestSample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.batch_request_sample;

    /*
     *  BatchRequestSample java interface
     */

    public interface BatchRequestSample {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  deleteEmployee(
         org.wso2.ws.dataservice.samples.batch_request_sample.DeleteEmployee deleteEmployee1

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * batch operation for 'deleteEmployee'
         */
        public void  deleteEmployee_batch_req(
         org.wso2.ws.dataservice.samples.batch_request_sample.DeleteEmployee_batch_req deleteEmployee_batch_req2

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * batch operation for 'addEmployee'
                    * @param addEmployee_batch_req3
                
             * @throws org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.REQUEST_STATUS addEmployee_batch_req(

                        org.wso2.ws.dataservice.samples.batch_request_sample.AddEmployee_batch_req addEmployee_batch_req3)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * batch operation for 'addEmployee'
                * @param addEmployee_batch_req3
            
          */
        public void startaddEmployee_batch_req(

            org.wso2.ws.dataservice.samples.batch_request_sample.AddEmployee_batch_req addEmployee_batch_req3,

            final org.wso2.carbon.dataservices.samples.batch_request_sample.BatchRequestSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addEmployee5
                
             * @throws org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.REQUEST_STATUS addEmployee(

                        org.wso2.ws.dataservice.samples.batch_request_sample.AddEmployee addEmployee5)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addEmployee5
            
          */
        public void startaddEmployee(

            org.wso2.ws.dataservice.samples.batch_request_sample.AddEmployee addEmployee5,

            final org.wso2.carbon.dataservices.samples.batch_request_sample.BatchRequestSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param employeeExists7
                
             * @throws org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.batch_request_sample.EmployeesE employeeExists(

                        org.wso2.ws.dataservice.samples.batch_request_sample.EmployeeExists employeeExists7)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.batch_request_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param employeeExists7
            
          */
        public void startemployeeExists(

            org.wso2.ws.dataservice.samples.batch_request_sample.EmployeeExists employeeExists7,

            final org.wso2.carbon.dataservices.samples.batch_request_sample.BatchRequestSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    