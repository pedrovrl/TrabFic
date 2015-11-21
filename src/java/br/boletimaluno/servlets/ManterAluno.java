/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.servlets;

import br.boletimaluno.dao.AlunoAtividadeDao;
import br.boletimaluno.dao.AlunoDao;
import br.boletimaluno.dao.AtividadeDao;
import br.boletimaluno.models.Aluno;
import br.boletimaluno.models.AlunoAtividade;
import br.boletimaluno.models.Atividade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro
 */
public class ManterAluno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String path = request.getServletPath();
            if (path.equals("/cadastrar.act")) {
                String alun_nome = request.getParameter("nome");
                //montar o objeto
                Aluno aluno = new Aluno();
                aluno.setAlunNome(alun_nome);
                // salvando dados no DAO
                AlunoDao dao = new AlunoDao();
                dao.adiciona(aluno);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet cadastroAluno</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Aluno " + aluno.getAlunNome() + " adicionado.</h1>");
                out.println("<a href='cadastrar.html'>Voltar</a>");
                out.println("</body>");
                out.println("</html>");
            }
            
            if (path.equals("/cadastrarAtividade.act")) {
                int alun_id = Integer.parseInt(request.getParameter("alun_id"));
                int ativ_tipo = Integer.parseInt(request.getParameter("ativ_tipo"));
                String ativ_nome = request.getParameter("ativ_nome");
                double nota = Double.parseDouble(request.getParameter("nota"));
                
                
                Atividade atividade = new Atividade();
                atividade.setAtivNome(ativ_nome);
                atividade.setAtivTipo(ativ_tipo);
                
                AtividadeDao ativDao = new AtividadeDao();
                int ativ_id = ativDao.adiciona(atividade);
                
                AlunoAtividade alunoAtividade = new AlunoAtividade();
                alunoAtividade.setNota(nota);
                alunoAtividade.setAlunFkId(alun_id);
                alunoAtividade.setAtividadeFkId(ativ_id);            
                
                AlunoAtividadeDao alunAtiDao = new AlunoAtividadeDao();
                alunAtiDao.adicionar(alunoAtividade);
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet cadastroAluno</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Atividade adicionada" + nota + ".</h1>");
                out.println("<a href='cadastrar.html'>Voltar</a>");
                out.println("</body>");
                out.println("</html>");
            }
            
            if (path.equals("/excluir.act")) {
                Integer alun_id = Integer.parseInt(request.getParameter("id"));
                //montar o objeto
                Aluno aluno = new Aluno();
                aluno.setAlunId(alun_id);
                
                // excluindo dados no DAO
                AlunoDao dao = new AlunoDao();
                dao.remove(aluno);
                
                response.sendRedirect("gerenciar.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
