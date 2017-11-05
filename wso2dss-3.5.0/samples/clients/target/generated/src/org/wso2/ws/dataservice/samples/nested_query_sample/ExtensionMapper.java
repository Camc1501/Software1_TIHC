
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:28 UTC)
 */

        
            package org.wso2.ws.dataservice.samples.nested_query_sample;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Orders".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Orders.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Offices".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Offices.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "source_data_service_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.Source_data_service_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Order".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Order.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Employees".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Employees.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Office".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Office.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Employee".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Employee.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/nested_query_sample".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.nested_query_sample.Customer.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    