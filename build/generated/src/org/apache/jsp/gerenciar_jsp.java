package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Fic - Sistema de Alunos</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-default\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"  aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">Boletim Virtual</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"cadastrar.html\">Cadastrar Alunos</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"gerenciar.html\">Gerenciar Alunos</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" >Sair</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"navbar-line\"></div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h4 class=\"title\">Gerenciar Alunos</h4> <hr/>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                   <table class=\"table table-bordered\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("                            <tr>\n");
      out.write("\t\t\t\t<th colspan=\"1\">Nome</th>\n");
      out.write("\t\t\t\t<th colspan=\"4\" style=\"width: 200px; text-align: center\">Ações</th>\n");
      out.write("                            </tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td>Pedro Victor</td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-warning\">Boletim</a></td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-primary\">Atualizar Dados</a></td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-info\">Gerenciar Atividades</a></td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-danger\">Excluir</a></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td>Gustavo Santiago</td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-warning\">Boletim</a></td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-primary\">Atualizar Dados</a></td>\n");
      out.write("                           <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-info\">Gerenciar Atividades</a></td>\n");
      out.write("                            <td style=\"width: 1px\"><a href=\"jogo.php?j=14\" class=\"btn btn-danger\">Excluir</a></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t</tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\t</div>\n");
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
