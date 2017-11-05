
/**
 * BatchRequestSampleCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.batch_request_sample;

    /**
     *  BatchRequestSampleCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BatchRequestSampleCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BatchRequestSampleCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BatchRequestSampleCallbackHandler(){
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
            * auto generated Axis2 call back method for addEmployee_batch_req method
            * override this method for handling normal response from addEmployee_batch_req operation
            */
           public void receiveResultaddEmployee_batch_req(
                    org.wso2.ws.dataservice.REQUEST_STATUS result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addEmployee_batch_req operation
           */
            public void receiveErroraddEmployee_batch_req(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addEmployee method
            * override this method for handling normal response from addEmployee operation
            */
           public void receiveResultaddEmployee(
                    org.wso2.ws.dataservice.REQUEST_STATUS result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addEmployee operation
           */
            public void receiveErroraddEmployee(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for employeeExists method
            * override this method for handling normal response from employeeExists operation
            */
           public void receiveResultemployeeExists(
                    org.wso2.ws.dataservice.samples.batch_request_sample.EmployeesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from employeeExists operation
           */
            public void receiveErroremployeeExists(java.lang.Exception e) {
            }
                


    }
    