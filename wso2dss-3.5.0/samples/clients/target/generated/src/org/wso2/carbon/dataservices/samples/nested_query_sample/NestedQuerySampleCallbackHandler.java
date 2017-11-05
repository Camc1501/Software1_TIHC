
/**
 * NestedQuerySampleCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.nested_query_sample;

    /**
     *  NestedQuerySampleCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class NestedQuerySampleCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public NestedQuerySampleCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public NestedQuerySampleCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for customerOrders method
            * override this method for handling normal response from customerOrders operation
            */
           public void receiveResultcustomerOrders(
                    org.wso2.ws.dataservice.samples.nested_query_sample.Order[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from customerOrders operation
           */
            public void receiveErrorcustomerOrders(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for customerName method
            * override this method for handling normal response from customerName operation
            */
           public void receiveResultcustomerName(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from customerName operation
           */
            public void receiveErrorcustomerName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listOffices method
            * override this method for handling normal response from listOffices operation
            */
           public void receiveResultlistOffices(
                    org.wso2.ws.dataservice.samples.nested_query_sample.Office[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listOffices operation
           */
            public void receiveErrorlistOffices(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for employeesInOffice method
            * override this method for handling normal response from employeesInOffice operation
            */
           public void receiveResultemployeesInOffice(
                    org.wso2.ws.dataservice.samples.nested_query_sample.Employee[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from employeesInOffice operation
           */
            public void receiveErroremployeesInOffice(java.lang.Exception e) {
            }
                


    }
    