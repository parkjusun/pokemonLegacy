/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.36
 * Generated at: 2020-06-24 03:59:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\r\n");
      out.write("<link rel=\"icon\" href=\"/favicon.ico\">\r\n");
      out.write("<title>frontend</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@mdi/font@latest/css/materialdesignicons.min.css\">\r\n");
      out.write("<link href=\"/js/app.js\" rel=\"preload\" as=\"script\">\r\n");
      out.write("<link href=\"/js/chunk-vendors.js\" rel=\"preload\" as=\"script\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".loginMain {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 60%;\r\n");
      out.write("\theight: 1000px;\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl(\"https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292870465/f03af8a80dbb666e73e9744ed4fea64f.png\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginMain_1 {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tpadding-top: 7%;\r\n");
      out.write("\tmargin-left: 13%;\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- 부가적인 테마 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("<!-- 합쳐지고 최소화된 최신 자바스크립트 -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"app\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t\t\t<div class=\"navbar-brand font-italic\">PokeMon</div>\r\n");
      out.write("\t\t\t<button type=\"button\" aria-label=\"Toggle navigation\"\r\n");
      out.write("\t\t\t\tclass=\"navbar-toggler collapsed\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbar-toggle-collapse\">\r\n");
      out.write("\t\t\t\t<svg viewBox=\"0 0 16 16\" width=\"1em\" height=\"1em\" focusable=\"false\"\r\n");
      out.write("\t\t\t\t\trole=\"img\" alt=\"icon\" xmlns=\"http://www.w3.org/2000/svg\"\r\n");
      out.write("\t\t\t\t\tfill=\"currentColor\" class=\"bi-chevron-bar-down b-icon bi\">\r\n");
      out.write("\t\t\t\t\t<g>\r\n");
      out.write("\t\t\t\t\t<path fill-rule=\"evenodd\"\r\n");
      out.write("\t\t\t\t\t\td=\"M3.646 4.146a.5.5 0 0 1 .708 0L8 7.793l3.646-3.647a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 0-.708zM1 11.5a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13a.5.5 0 0 1-.5-.5z\"></path></g></svg>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div id=\"navbar-toggle-collapse\" class=\"navbar-collapse collapse\"\r\n");
      out.write("\t\t\t\tstyle=\"display: none;\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" target=\"_self\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" target=\"_self\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">포켓몬 도감</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" target=\"_self\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">산책로</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div data-v-1902378e=\"\" class=\"loginMain\">\r\n");
      out.write("\t\t\t\t<div data-v-1902378e=\"\" id=\"loginMain_1\">\r\n");
      out.write("\t\t\t\t\t<h1 data-v-1902378e=\"\" class=\"font-weight-bold\">회원가입</h1>\r\n");
      out.write("\t\t\t\t\t<div data-v-1902378e=\"\" role=\"group\" class=\"input-group mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-text\">아이디</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input data-v-1902378e=\"\" id=\"userid\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<button data-v-1902378e=\"\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-outline-info\">중복검사</button>\r\n");
      out.write("\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-v-1902378e=\"\" role=\"group\" class=\"input-group mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-text\">비밀번호</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input data-v-1902378e=\"\" id=\"passwd\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-v-1902378e=\"\" role=\"group\" class=\"input-group mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-text\">주소</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input data-v-1902378e=\"\" id=\"email\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-v-1902378e=\"\" role=\"group\" class=\"input-group mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<div data-v-1902378e=\"\" class=\"input-group-text\">이메일</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input data-v-1902378e=\"\" id=\"addr\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-v-1902378e=\"\" class=\"mt-3\">\r\n");
      out.write("\t\t\t\t\t\t<div data-v-1902378e=\"\" role=\"group\" class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button data-v-1902378e=\"\" type=\"button\" class=\"btn btn-success\">가입하기</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button data-v-1902378e=\"\" type=\"button\" class=\"btn btn-info\">취소하기</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("</script>");
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
