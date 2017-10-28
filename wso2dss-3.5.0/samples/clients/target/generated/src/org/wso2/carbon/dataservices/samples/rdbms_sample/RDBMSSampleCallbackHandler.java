
/**
 * RDBMSSampleCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.rdbms_sample;

    /**
     *  RDBMSSampleCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RDBMSSampleCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RDBMSSampleCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RDBMSSampleCallbackHandler(){
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
            * auto generated Axis2 call back method for employeesByNumber method
            * override this method for handling normal response from employeesByNumber operation
            */
           public void receiveResultemployeesByNumber(
                    org.wso2.ws.dataservice.samples.rdbms_sample.Employee[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from employeesByNumber operation
           */
            public void receiveErroremployeesByNumber(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for thousandFive method
            * override this method for handling normal response from thousandFive operation
            */
           public void receiveResultthousandFive(
                    org.wso2.ws.dataservice.samples.rdbms_sample.Number[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from thousandFive operation
           */
            public void receiveErrorthousandFive(java.lang.Exception e) {
            }
                
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
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for customerAddress method
            * override this method for handling normal response from customerAddress operation
            */
           public void receiveResultcustomerAddress(
                    org.wso2.ws.dataservice.samples.rdbms_sample.CustomerAddress[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from customerAddress operation
           */
            public void receiveErrorcustomerAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addEmployee method
            * override this method for handling normal response from addEmployee operation
            */
           public void receiveResultaddEmployee(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addEmployee operation
           */
            public void receiveErroraddEmployee(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for productsInfo method
            * override this method for handling normal response from productsInfo operation
            */
           public void receiveResultproductsInfo(
                    org.wso2.ws.dataservice.samples.rdbms_sample.Product[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from productsInfo operation
           */
            public void receiveErrorproductsInfo(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for customersInBoston method
            * override this method for handling normal response from customersInBoston operation
            */
           public void receiveResultcustomersInBoston(
                    org.wso2.ws.dataservice.samples.rdbms_sample.Customer[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from customersInBoston operation
           */
            public void receiveErrorcustomersInBoston(java.lang.Exception e) {
            }
                


    }
    