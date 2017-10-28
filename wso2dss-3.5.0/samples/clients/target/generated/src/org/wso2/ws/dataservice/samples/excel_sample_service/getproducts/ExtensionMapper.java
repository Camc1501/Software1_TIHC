
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:28 UTC)
 */

        
            package org.wso2.ws.dataservice.samples.excel_sample_service.getproducts;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "source_data_service_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.Source_data_service_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/excel_sample_service/getProducts".equals(namespaceURI) &&
                  "Product".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.excel_sample_service.getproducts.Product.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/excel_sample_service/getProducts".equals(namespaceURI) &&
                  "Products".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.excel_sample_service.getproducts.Products.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/excel_sample_service".equals(namespaceURI) &&
                  "Products".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.excel_sample_service.Products0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/excel_sample_service".equals(namespaceURI) &&
                  "Product".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.excel_sample_service.ProductE.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    