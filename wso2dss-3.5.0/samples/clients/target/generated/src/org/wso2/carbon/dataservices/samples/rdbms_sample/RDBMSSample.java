

/**
 * RDBMSSample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.rdbms_sample;

    /*
     *  RDBMSSample java interface
     */

    public interface RDBMSSample {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  setEmployeeSalary(
         double salary11,int employeeNumber12

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  incrementEmployeeSalary(
         double increment14,int employeeNumber15

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param employeesByNumber16
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.rdbms_sample.Employee[] employeesByNumber(

                        int employeeNumber17)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param employeesByNumber16
            
          */
        public void startemployeesByNumber(

            int employeeNumber17,

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param thousandFive20
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.rdbms_sample.Number[] thousandFive(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param thousandFive20
            
          */
        public void startthousandFive(

            

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Control operation for ending a boxcarring session
                    * @param end_boxcar23
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.apache.axiom.om.OMElement end_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for ending a boxcarring session
                * @param end_boxcar23
            
          */
        public void startend_boxcar(

            

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  setSalaryForEmployees(
         double salary27,int[] employeeNumbers28

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  incrementEmployeeSalaryEx(
         int employeeNumber30

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param customerAddress31
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.rdbms_sample.CustomerAddress[] customerAddress(

                        java.lang.String lastName32,java.lang.String firstName33)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param customerAddress31
            
          */
        public void startcustomerAddress(

            java.lang.String lastName32,java.lang.String firstName33,

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addEmployee36
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public java.lang.String addEmployee(

                        int employeeNumber37,java.lang.String lastName38,java.lang.String firstName39,java.lang.String email40,double salary41)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addEmployee36
            
          */
        public void startaddEmployee(

            int employeeNumber37,java.lang.String lastName38,java.lang.String firstName39,java.lang.String email40,double salary41,

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param productsInfo44
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.rdbms_sample.Product[] productsInfo(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param productsInfo44
            
          */
        public void startproductsInfo(

            

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Control operation for aborting a boxcarring session
         */
        public void  abort_boxcar(
         

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Control operation for beginning a boxcarring session
         */
        public void  begin_boxcar(
         

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param customersInBoston49
                
             * @throws org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.rdbms_sample.Customer[] customersInBoston(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdbms_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param customersInBoston49
            
          */
        public void startcustomersInBoston(

            

            final org.wso2.carbon.dataservices.samples.rdbms_sample.RDBMSSampleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    