
/**
 * FaultDBServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.fault_dataservice;

    /**
     *  FaultDBServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FaultDBServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FaultDBServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FaultDBServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for basic_merge_op method
            * override this method for handling normal response from basic_merge_op operation
            */
           public void receiveResultbasic_merge_op(
                    org.wso2.ws.dataservice.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from basic_merge_op operation
           */
            public void receiveErrorbasic_merge_op(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for basic_array_type_op method
            * override this method for handling normal response from basic_array_type_op operation
            */
           public void receiveResultbasic_array_type_op(
                    org.wso2.ws.dataservice.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from basic_array_type_op operation
           */
            public void receiveErrorbasic_array_type_op(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for _postcustomers2 method
            * override this method for handling normal response from _postcustomers2 operation
            */
           public void receiveResult_postcustomers2(
                    org.wso2.ws.dataservice.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _postcustomers2 operation
           */
            public void receiveError_postcustomers2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for _getcustomers1 method
            * override this method for handling normal response from _getcustomers1 operation
            */
           public void receiveResult_getcustomers1(
                    org.wso2.ws.dataservice.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from _getcustomers1 operation
           */
            public void receiveError_getcustomers1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for select_op_given_fields method
            * override this method for handling normal response from select_op_given_fields operation
            */
           public void receiveResultselect_op_given_fields(
                    org.wso2.ws.dataservice.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from select_op_given_fields operation
           */
            public void receiveErrorselect_op_given_fields(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for select_op_count method
            * override this method for handling normal response from select_op_count operation
            */
           public void receiveResultselect_op_count(
                    org.wso2.ws.dataservice.OrderDetails[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from select_op_count operation
           */
            public void receiveErrorselect_op_count(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for select_attributes_op method
            * override this method for handling normal response from select_attributes_op operation
            */
           public void receiveResultselect_attributes_op(
                    org.wso2.ws.dataservice.Payment[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from select_attributes_op operation
           */
            public void receiveErrorselect_attributes_op(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for select_op_all_fields method
            * override this method for handling normal response from select_op_all_fields operation
            */
           public void receiveResultselect_op_all_fields(
                    org.wso2.ws.dataservice.Product[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from select_op_all_fields operation
           */
            public void receiveErrorselect_op_all_fields(java.lang.Exception e) {
            }
                


    }
    