package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
 session.invalidate(); if(session.getAttribute("profid")==null){response.sendRedirect("login.jsp");}else{response.sendRedirect("gerenciar.jsp");};
      out.write("\n");
      out.write("   <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">  \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div id=\"modal-login\" class=\"modal fade\">\n");
      out.write("           <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\" style=\"-webkit-box-shadow: none; border: none\">\n");
      out.write("              <!-- dialog body -->\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                <h1 class=\"logo\">Sistema de Notas</h1>\n");
      out.write("                <section>\n");
      out.write("                  <div class=\"container\" style=\"width: 100%;\">     \n");
      out.write("                    <div id=\"loginbox\">                    \n");
      out.write("                      <div class=\"panel panel-info\" >\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                          <div class=\"panel-title\">Login</div>\n");
      out.write("                          <!--<div style=\"float:right; font-size: 80%; position: relative; top:-10px\"><a href=\"#\">Esqueceu sua senha?</a> </div>-->\n");
      out.write("                        </div>     \n");
      out.write("                        <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("                          <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger\"></div>\n");
      out.write("                          <form  action=\"javascript:funcLogin()\" method=\"post\" id=\"login\" class=\"form-horizontal \">\n");
      out.write("                            <div class=\"alert alert-danger\" role=\"alert\" style=\"display: none\"><span class=\"glyphicon glyphicon-exclamation-sign\" aria-hidden=\"true\"></span></div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                              <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                              <input id=\"login-username\" type=\"text\" class=\"form-control nome\" name=\"nome\" value=\"\" placeholder=\"nome\" required>                                        \n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                              <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                              <input id=\"login-password\" type=\"password\" class=\"form-control senha\" name=\"senha\" placeholder=\"senha\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("                              <!-- Button -->\n");
      out.write("                              <div class=\"col-sm-12 \">\n");
      out.write("                                <button class=\"btn btn-success\" style=\"width: 100px\">Login</button>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              <div class=\"col-md-12 \">\n");
      out.write("                                <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%\" >\n");
      out.write("                                  Não tem uma conta? \n");
      out.write("                                  <a class=\"\" href=\"#\" onClick=\"$('#loginbox').hide(); $('#signupbox').show()\">\n");
      out.write("                                    Inscreva-se aqui\n");
      out.write("                                  </a>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>    \n");
      out.write("                          </form>     \n");
      out.write("                        </div>                     \n");
      out.write("                      </div>  \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"signupbox\" style=\"display:none;\" >\n");
      out.write("                      <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                          <div class=\"panel-title\">Cadastro</div>\n");
      out.write("                          <div style=\"float:right; font-size: 85%; position: relative; top:-10px\"><a class=\"\" href=\"#\" onclick=\"$('#signupbox').hide(); $('#loginbox').show()\">Login</a></div>\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"panel-body\" >\n");
      out.write("                          <form id=\"register\" action=\"javascript:registerTeacher()\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                            <div class=\"alert alert-success\" role=\"alert\" style=\"display: none\">...</div>\n");
      out.write("                            <div class=\"alert alert-danger\" role=\"alert\" style=\"display: none\"><span class=\"glyphicon glyphicon-exclamation-sign\" aria-hidden=\"true\"></span></div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                              <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                              <input id=\"cadastro-login-username\" type=\"text\" class=\"form-control \" name=\"nome\" value=\"\" placeholder=\"nome\" required maxlength=\"100\" pattern=\".{5,}\" title=\"5 caracteres no mínimo.\">                                        \n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                              <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                              <input id=\"cadastro-login-password\" type=\"password\" class=\"form-control \" name=\"senha\" placeholder=\"senha\" required maxlength=\"30\" pattern=\".{6,}\" title=\"6 caracteres no mínimo.\">\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                              <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                              <input id=\"cadastro-login-password-repeat\" type=\"password\" class=\"form-control \" name=\"senha_confirma\" placeholder=\"confirme sua senha\" required maxlength=\"30\">\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("\n");
      out.write("                              <div class=\"col-sm-12 \">\n");
      out.write("                                <button class=\"btn btn-success\" style=\"width: 100px\">Enviar</button>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                          </form>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>  \n");
      out.write("                </section>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
