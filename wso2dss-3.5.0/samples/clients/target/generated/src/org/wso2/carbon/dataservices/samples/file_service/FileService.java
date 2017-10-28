

/**
 * FileService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.file_service;

    /*
     *  FileService java interface
     */

    public interface FileService {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  _getcreatenewfile(
         java.lang.String fileName15,java.lang.String fileType16

        ) throws java.rmi.RemoteException
        
        ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  _postappenddatatofile(
         java.lang.String fileName18,javax.activation.DataHandler data19

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param _getcheckfileexists20
                
             * @throws org.wso2.carbon.dataservices.samples.file_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.file_service.file_exists.File9[] _getcheckfileexists(

                        java.lang.String fileName21)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.file_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getcheckfileexists20
            
          */
        public void start_getcheckfileexists(

            java.lang.String fileName21,

            final org.wso2.carbon.dataservices.samples.file_service.FileServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param _getgetfilerecords24
                
             * @throws org.wso2.carbon.dataservices.samples.file_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.file_service.file_records.File3[] _getgetfilerecords(

                        java.lang.String fileName25)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.file_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getgetfilerecords24
            
          */
        public void start_getgetfilerecords(

            java.lang.String fileName25,

            final org.wso2.carbon.dataservices.samples.file_service.FileServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  _getdeletefile(
         java.lang.String fileName29

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param _getgetfiletype30
                
             * @throws org.wso2.carbon.dataservices.samples.file_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.file_service.file_type.FileE[] _getgetfiletype(

                        java.lang.String fileName31)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.file_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getgetfiletype30
            
          */
        public void start_getgetfiletype(

            java.lang.String fileName31,

            final org.wso2.carbon.dataservices.samples.file_service.FileServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param _getgetfilenames34
                
             * @throws org.wso2.carbon.dataservices.samples.file_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.file_service.file_names.File6[] _getgetfilenames(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.file_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getgetfilenames34
            
          */
        public void start_getgetfilenames(

            

            final org.wso2.carbon.dataservices.samples.file_service.FileServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param _getgetfilesize37
                
             * @throws org.wso2.carbon.dataservices.samples.file_service.DataServiceFault : 
         */

         
                     public org.wso2.ws.dataservice.samples.file_service.file_size.File[] _getgetfilesize(

                        java.lang.String fileName38)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.file_service.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getgetfilesize37
            
          */
        public void start_getgetfilesize(

            java.lang.String fileName38,

            final org.wso2.carbon.dataservices.samples.file_service.FileServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    