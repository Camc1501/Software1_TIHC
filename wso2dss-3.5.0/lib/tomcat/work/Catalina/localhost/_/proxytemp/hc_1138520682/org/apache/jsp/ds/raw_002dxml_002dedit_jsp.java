/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2017-10-18 23:31:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ds;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.CarbonError;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.CarbonConstants;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.dataservices.ui.DataServiceAdminClient;
import org.wso2.carbon.utils.ServerConstants;
import org.apache.axis2.AxisFault;

public final class raw_002dxml_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1444649860000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1444649860000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\r\n");
      out.write(" ~\r\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\r\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\r\n");
      out.write(" ~ in compliance with the License.\r\n");
      out.write(" ~ You may obtain a copy of the License at\r\n");
      out.write(" ~\r\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write(" ~\r\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\r\n");
      out.write(" ~ software distributed under the License is distributed on an\r\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\r\n");
      out.write(" ~ specific language governing permissions and limitations\r\n");
      out.write(" ~ under the License.\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Yahoo includes for dom event handling-->\r\n");
      out.write("<script src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--EditArea javascript syntax hylighter -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ui-validations.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"../editarea/edit_area_full.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.flot.js\"></script>\r\n");
      out.write("\r\n");

String serviceName = request.getParameter("serviceName");
String serviceContents = "";
try{
	String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
	ConfigurationContext configContext =
        (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
	String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
	DataServiceAdminClient client = new DataServiceAdminClient(cookie,backendServerURL,configContext);
	serviceContents = client.getDataServiceContents(serviceName);
   }catch(AxisFault e){
	   CarbonError carbonError = new CarbonError();
	   carbonError.addError("Error occurred while saving data service configuration.");
	   request.setAttribute(CarbonError.ID, carbonError);
		String errorMsg = e.getLocalizedMessage();
		
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tlocation.href = \"dsErrorPage.jsp?errorMsg=");
      out.print(errorMsg);
      out.write("\";\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t");

   }

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function cancelSaveHandler() {\r\n");
      out.write("        document.location.href = \"handler.jsp?region=region3&item=registry_handler_menu\";\r\n");
      out.write("    }\r\n");
      out.write("    YAHOO.util.Event.onDOMReady(function() {\r\n");
      out.write("        editAreaLoader.init({\r\n");
      out.write("            id : \"dsConfig\"        // textarea id\r\n");
      out.write("            ,syntax: \"xml\"            // syntax to be uses for highgliting\r\n");
      out.write("            ,start_highlight: true        // to display with highlight mode on start-up\r\n");
      out.write("            ,allow_resize: \"both\"\r\n");
      out.write("            ,min_height:250\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fbundle_005f0.setParent(null);
      // /ds/raw-xml-edit.jsp(75,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.dataservices.ui.i18n.Resources");
      int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
      if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_005fbundle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_005fbundle_005f0.doInitBody();
        }
        do {
          out.write('\r');
          out.write('\n');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_005fbreadcrumb_005f0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_005fbreadcrumb_005f0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_005fbreadcrumb_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
          // /ds/raw-xml-edit.jsp(76,0) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setLabel("dataservice.xml.editor");
          // /ds/raw-xml-edit.jsp(76,0) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setResourceBundle("org.wso2.carbon.dataservices.ui.i18n.Resources");
          // /ds/raw-xml-edit.jsp(76,0) name = topPage type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setTopPage(false);
          // /ds/raw-xml-edit.jsp(76,0) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_carbon_005fbreadcrumb_005f0.setRequest(request);
          int _jspx_eval_carbon_005fbreadcrumb_005f0 = _jspx_th_carbon_005fbreadcrumb_005f0.doStartTag();
          if (_jspx_th_carbon_005fbreadcrumb_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("<div id=\"middle\">\r\n");
          out.write("    <h2>");
          if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
            return;
          out.write('(');
          out.print(serviceName);
          out.write(")</h2>\r\n");
          out.write("    \r\n");
          out.write("<div id=\"workArea\">\r\n");
          out.write("\t<form method=\"post\" onsubmit=\"return isValidXml();\"\r\n");
          out.write("\t\t");
          out.write("\r\n");
          out.write("            action=\"");
          out.print( "./rawXMLProcessor.jsp?saveConfig=true&caller=../service-mgt/index.jsp&serviceName="+serviceName);
          out.write("\">\r\n");
          out.write("<table class=\"styledLeft\">\r\n");
          out.write("<tr><td>\r\n");
          out.write("            <textarea id =\"dsConfig\" name=\"dsConfig\"\r\n");
          out.write("                      style=\"background-color:lavender; width:99%;height:470px;*height:500px;\r\n");
          out.write("                      font-family:verdana;\r\n");
          out.write("                      font-size:11px;\r\n");
          out.write("                      color: darkblue;\r\n");
          out.write("                      border:solid 1px #9fc2d5;\r\n");
          out.write("                      overflow-x:auto;\r\n");
          out.write("                      overflow-y:auto\">");
          out.print(serviceContents.replaceAll("&", "&amp;"));
          out.write("</textarea>\r\n");
          out.write("                     \r\n");
          out.write("        </td></tr>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td class=\"buttonRow\">\r\n");
          out.write("            <input class=\"button\" type=\"submit\" name=\"save\" value=\"Save\"/>\r\n");
          out.write("            <input class=\"button\" type=\"reset\" name=\"cancel\" value=\"Cancel\" onclick=\"javascript:location.href='../service-mgt/service_info.jsp?serviceName=");
          out.print(serviceName );
          out.write("';\"/>\r\n");
          out.write("\t</td>\r\n");
          out.write("         </tr>\r\n");
          out.write("       </table>\r\n");
          out.write("    </form>\r\n");
          out.write("</div>\r\n");
          out.write("</div>\r\n");
          int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$('dsConfig').innerHTML = format_xml($('dsConfig').value);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
    // /ds/raw-xml-edit.jsp(83,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("dataservice.xml.editor");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }
}