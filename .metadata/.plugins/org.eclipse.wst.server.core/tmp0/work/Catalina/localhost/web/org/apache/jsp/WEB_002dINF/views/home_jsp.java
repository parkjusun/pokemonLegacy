/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-06-24 06:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "heder.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div id=\"app\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t\t\t<div class=\"navbar-brand font-italic\">PokeMon</div>\r\n");
      out.write("\t\t\t<button type=\"button\" aria-label=\"Toggle navigation\"\r\n");
      out.write("\t\t\t\tclass=\"navbar-toggler collapsed\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbar-toggle-collapse\">\r\n");
      out.write("\t\t\t\t<svg viewBox=\"0 0 16 16\" width=\"1em\" height=\"1em\" focusable=\"false\"\r\n");
      out.write("\t\t\t\t\trole=\"img\" alt=\"icon\" xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("\t\t\t\t\tfill=\"currentColor\" class=\"bi-chevron-bar-down b-icon bi\">\r\n");
      out.write("    <g>\r\n");
      out.write("    <path fill-rule=\"evenodd\"\r\n");
      out.write("\t\t\t\t\t\td=\"M3.646 4.146a.5.5 0 0 1 .708 0L8 7.793l3.646-3.647a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 0-.708zM1 11.5a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13a.5.5 0 0 1-.5-.5z\"></path>\r\n");
      out.write("    </g>\r\n");
      out.write("    </svg>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div id=\"navbar-toggle-collapse\" class=\"navbar-collapse collapse\"\r\n");
      out.write("\t\t\t\tstyle=\"display: none;\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a id=\"login\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" target=\"_self\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">포켓몬 도감</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" target=\"_self\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">산책로</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div class=\"homeMain\">\r\n");
      out.write("\t\t\t\t<div role=\"region\" id=\"carousel-1\" aria-busy=\"false\"\r\n");
      out.write("\t\t\t\t\tclass=\"carousel slide\"\r\n");
      out.write("\t\t\t\t\tstyle=\"text-shadow: rgb(51, 51, 51) 1px 1px 2px;\">\r\n");
      out.write("\t\t\t\t\t<div id=\"carousel-1___BV_inner_\" role=\"list\" class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item\" aria-current=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\taria-posinset=\"1\" aria-setsize=\"6\" id=\"__BVID__16\"\r\n");
      out.write("\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/16954a32052d2fcef4368736f8b522e7.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>고라파덕</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item\" aria-current=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\taria-posinset=\"2\" aria-setsize=\"6\" id=\"__BVID__17\"\r\n");
      out.write("\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292870465/99b983892094b5c6d2fc3736e15da7d1_1.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>이상해꽃</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item\" aria-current=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\taria-posinset=\"3\" aria-setsize=\"6\" id=\"__BVID__18\"\r\n");
      out.write("\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292870465/f03af8a80dbb666e73e9744ed4fea64f.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>피카츄</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item active\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"true\" aria-posinset=\"4\" aria-setsize=\"6\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"__BVID__19\" aria-hidden=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/a5d4ca67bf30a1033b6e4d2dde9cebc8.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>고스트</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item\" aria-current=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\taria-posinset=\"5\" aria-setsize=\"6\" id=\"__BVID__20\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/7db935e2b1b244b190d06b7323998955.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>파이리</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div role=\"listitem\" class=\"carousel-item\" aria-current=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\taria-posinset=\"6\" aria-setsize=\"6\" id=\"__BVID__21\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/3f3435a302e4c35a623f60d454c7b5b8.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"1024\" height=\"480\" class=\"img-fluid w-100 d-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>야도란</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" role=\"button\" aria-controls=\"carousel-1___BV_inner_\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-prev\"><span aria-hidden=\"true\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-prev-icon\"></span><span class=\"sr-only\">Previous\r\n");
      out.write("\t\t\t\t\t\t\tSlide</span></a><a href=\"#\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-next\"><span aria-hidden=\"true\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-next-icon\"></span><span class=\"sr-only\">Next\r\n");
      out.write("\t\t\t\t\t\t\tSlide</span></a>\r\n");
      out.write("\t\t\t\t\t<ol id=\"carousel-1___BV_indicators_\" aria-hidden=\"false\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Select a slide to display\"\r\n");
      out.write("\t\t\t\t\t\taria-owns=\"carousel-1___BV_inner_\" class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_1_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"false\" aria-label=\"Goto Slide 1\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__16\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_2_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"false\" aria-label=\"Goto Slide 2\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__17\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_3_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"false\" aria-label=\"Goto Slide 3\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__18\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_4_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"true\" aria-label=\"Goto Slide 4\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"active\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__19\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_5_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"false\" aria-label=\"Goto Slide 5\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__20\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"button\" id=\"carousel-1___BV_indicator_6_\" tabindex=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\taria-current=\"false\" aria-label=\"Goto Slide 6\"\r\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"carousel-1___BV_inner_\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"__BVID__21\"></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script>\r\n");
      out.write("$('#login').click(function(){\r\n");
      out.write("\tconsole.log('이동화면 진입')\r\n");
      out.write("\talert(\"");
      out.print(application.getContextPath());
      out.write("\");\r\n");
      out.write("\tlocation.href= \"");
      out.print(application.getContextPath());
      out.write("/web/user/join/form\"\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
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
}
