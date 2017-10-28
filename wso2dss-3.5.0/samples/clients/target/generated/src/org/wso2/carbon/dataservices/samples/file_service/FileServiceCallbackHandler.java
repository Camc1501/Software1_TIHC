
/**
 * FileServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.file_service;

    /**
     *  FileServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FileServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FileServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FileServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for _getcheckfileexists method
            * override this method for handling normal response from _getcheckfileexists operation
            */
           public void receiveResult_getcheckfileexists(
                    org.wso2.ws.dataservice.samples.file_service.file_exists.File9[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getcheckfileexists operation
           */
            public void receiveError_getcheckfileexists(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for _getgetfilerecords method
            * override this method for handling normal response from _getgetfilerecords operation
            */
           public void receiveResult_getgetfilerecords(
                    org.wso2.ws.dataservice.samples.file_service.file_records.File3[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getgetfilerecords operation
           */
            public void receiveError_getgetfilerecords(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for _getgetfiletype method
            * override this method for handling normal response from _getgetfiletype operation
            */
           public void receiveResult_getgetfiletype(
                    org.wso2.ws.dataservice.samples.file_service.file_type.FileE[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getgetfiletype operation
           */
            public void receiveError_getgetfiletype(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for _getgetfilenames method
            * override this method for handling normal response from _getgetfilenames operation
            */
           public void receiveResult_getgetfilenames(
                    org.wso2.ws.dataservice.samples.file_service.file_names.File6[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getgetfilenames operation
           */
            public void receiveError_getgetfilenames(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for _getgetfilesize method
            * override this method for handling normal response from _getgetfilesize operation
            */
           public void receiveResult_getgetfilesize(
                    org.wso2.ws.dataservice.samples.file_service.file_size.File[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getgetfilesize operation
           */
            public void receiveError_getgetfilesize(java.lang.Exception e) {
            }
                


    }
    