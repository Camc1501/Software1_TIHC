

/**
 * SamplesRDFSampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.rdf_dataservice;

    /*
     *  SamplesRDFSampleService java interface
     */

    public interface SamplesRDFSampleService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getMoviesByGenre2
                
             * @throws org.wso2.carbon.dataservices.samples.rdf_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Movie[] getMoviesByGenre(

                        java.lang.String genre3)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdf_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMoviesByGenre2
            
          */
        public void startgetMoviesByGenre(

            java.lang.String genre3,

            final org.wso2.carbon.dataservices.samples.rdf_dataservice.SamplesRDFSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAllMovieData6
                
             * @throws org.wso2.carbon.dataservices.samples.rdf_dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Movie[] getAllMovieData(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.dataservices.samples.rdf_dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAllMovieData6
            
          */
        public void startgetAllMovieData(

            

            final org.wso2.carbon.dataservices.samples.rdf_dataservice.SamplesRDFSampleServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    