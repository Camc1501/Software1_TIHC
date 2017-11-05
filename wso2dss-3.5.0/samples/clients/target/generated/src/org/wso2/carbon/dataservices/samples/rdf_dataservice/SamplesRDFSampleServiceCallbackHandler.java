
/**
 * SamplesRDFSampleServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.rdf_dataservice;

    /**
     *  SamplesRDFSampleServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SamplesRDFSampleServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SamplesRDFSampleServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SamplesRDFSampleServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMoviesByGenre method
            * override this method for handling normal response from getMoviesByGenre operation
            */
           public void receiveResultgetMoviesByGenre(
                    org.wso2.ws.dataservice.Movie[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMoviesByGenre operation
           */
            public void receiveErrorgetMoviesByGenre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllMovieData method
            * override this method for handling normal response from getAllMovieData operation
            */
           public void receiveResultgetAllMovieData(
                    org.wso2.ws.dataservice.Movie[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllMovieData operation
           */
            public void receiveErrorgetAllMovieData(java.lang.Exception e) {
            }
                


    }
    