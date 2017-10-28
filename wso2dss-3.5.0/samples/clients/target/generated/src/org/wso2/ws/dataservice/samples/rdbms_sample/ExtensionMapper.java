
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:28 UTC)
 */

        
            package org.wso2.ws.dataservice.samples.rdbms_sample;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "employees".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Employees.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "source_data_service_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.Source_data_service_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "customers".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Customers.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "customer".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Customer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "employee".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Employee.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "Numbers".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Numbers.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "Number".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Number.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "Product".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Product.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "customer-addresses".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.CustomerAddresses.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "Products".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.Products.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/rdbms_sample".equals(namespaceURI) &&
                  "customer-address".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.rdbms_sample.CustomerAddress.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    