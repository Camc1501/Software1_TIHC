
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v15  Built on : Sep 11, 2015 (11:33:28 UTC)
 */

        
            package org.wso2.ws.dataservice.samples.file_service.file_size;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_names".equals(namespaceURI) &&
                  "File".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_names.File6.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "source_data_service_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.Source_data_service_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_names".equals(namespaceURI) &&
                  "Files".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_names.Files5.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_records".equals(namespaceURI) &&
                  "File".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_records.File3.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_size".equals(namespaceURI) &&
                  "Files".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_size.Files.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_type".equals(namespaceURI) &&
                  "Files".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_type.Files0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_type".equals(namespaceURI) &&
                  "File".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_type.FileE.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_records".equals(namespaceURI) &&
                  "Files".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_records.Files2.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_size".equals(namespaceURI) &&
                  "File".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_size.File.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_exists".equals(namespaceURI) &&
                  "File".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_exists.File9.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice/samples/file_service/file_exists".equals(namespaceURI) &&
                  "Files".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.samples.file_service.file_exists.Files8.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    