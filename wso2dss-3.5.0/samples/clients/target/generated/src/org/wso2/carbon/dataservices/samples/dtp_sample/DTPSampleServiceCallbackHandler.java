
/**
 * DTPSampleServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.dtp_sample;

    /**
     *  DTPSampleServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DTPSampleServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DTPSampleServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DTPSampleServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAccountBalanceFromBank1 method
            * override this method for handling normal response from getAccountBalanceFromBank1 operation
            */
           public void receiveResultgetAccountBalanceFromBank1(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAccountBalanceFromBank1 operation
           */
            public void receiveErrorgetAccountBalanceFromBank1(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getAccountBalanceFromBank2 method
            * override this method for handling normal response from getAccountBalanceFromBank2 operation
            */
           public void receiveResultgetAccountBalanceFromBank2(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAccountBalanceFromBank2 operation
           */
            public void receiveErrorgetAccountBalanceFromBank2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addAccountToBank1 method
            * override this method for handling normal response from addAccountToBank1 operation
            */
           public void receiveResultaddAccountToBank1(
                    org.wso2.ws.dataservice.samples.dtp_sample.Entry[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addAccountToBank1 operation
           */
            public void receiveErroraddAccountToBank1(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for end_boxcar method
            * override this method for handling normal response from end_boxcar operation
            */
           public void receiveResultend_boxcar(
                    org.apache.axiom.om.OMElement result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from end_boxcar operation
           */
            public void receiveErrorend_boxcar(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for addAccountToBank2 method
            * override this method for handling normal response from addAccountToBank2 operation
            */
           public void receiveResultaddAccountToBank2(
                    org.wso2.ws.dataservice.samples.dtp_sample.Entry[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addAccountToBank2 operation
           */
            public void receiveErroraddAccountToBank2(java.lang.Exception e) {
            }
                


    }
    