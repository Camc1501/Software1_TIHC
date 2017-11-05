

/**
 * DTPSampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.dtp_sample;

    /*
     *  DTPSampleService java interface
     */

    public interface DTPSampleService {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addToAccountBalanceInBank2(
         int accountId12,double value13

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAccountBalanceFromBank114
                
             * @throws org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault : 
         */

         
                     public double getAccountBalanceFromBank1(

                        int accountId15)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAccountBalanceFromBank114
            
          */
        public void startgetAccountBalanceFromBank1(

            int accountId15,

            final org.wso2.carbon.dataservices.samples.dtp_sample.DTPSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Control operation for aborting a boxcarring session
         */
        public void  abort_boxcar(
         

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getAccountBalanceFromBank219
                
             * @throws org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault : 
         */

         
                     public double getAccountBalanceFromBank2(

                        int accountId20)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAccountBalanceFromBank219
            
          */
        public void startgetAccountBalanceFromBank2(

            int accountId20,

            final org.wso2.carbon.dataservices.samples.dtp_sample.DTPSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addAccountToBank123
                
             * @throws org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.dtp_sample.Entry[] addAccountToBank1(

                        double balance24)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addAccountToBank123
            
          */
        public void startaddAccountToBank1(

            double balance24,

            final org.wso2.carbon.dataservices.samples.dtp_sample.DTPSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addToAccountBalanceInBank1(
         int accountId28,double value29

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * Control operation for ending a boxcarring session
                    * @param end_boxcar30
                
             * @throws org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault : 
         */

         
                     public org.apache.axiom.om.OMElement end_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for ending a boxcarring session
                * @param end_boxcar30
            
          */
        public void startend_boxcar(

            

            final org.wso2.carbon.dataservices.samples.dtp_sample.DTPSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
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
                    * @param addAccountToBank234
                
             * @throws org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.dtp_sample.Entry[] addAccountToBank2(

                        double balance35)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.dtp_sample.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addAccountToBank234
            
          */
        public void startaddAccountToBank2(

            double balance35,

            final org.wso2.carbon.dataservices.samples.dtp_sample.DTPSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    