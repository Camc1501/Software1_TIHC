
/**
 * ExcelSampleServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:16 UTC)
 */

    package org.wso2.carbon.dataservices.samples.excel_sample_service;

    /**
     *  ExcelSampleServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ExcelSampleServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ExcelSampleServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ExcelSampleServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getProductClassifications method
            * override this method for handling normal response from getProductClassifications operation
            */
           public void receiveResultgetProductClassifications(
                    org.wso2.ws.dataservice.samples.excel_sample_service.ProductE[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductClassifications operation
           */
            public void receiveErrorgetProductClassifications(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProducts method
            * override this method for handling normal response from getProducts operation
            */
           public void receiveResultgetProducts(
                    org.wso2.ws.dataservice.samples.excel_sample_service.getproducts.Product[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProducts operation
           */
            public void receiveErrorgetProducts(java.lang.Exception e) {
            }
                


    }
    