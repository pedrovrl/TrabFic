<%-- 
    Document   : gerenciar
    Created on : 28/09/2015, 19:44:29
    Author     : Pedro
--%>

<%@page import="br.boletimaluno.models.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="br.boletimaluno.dao.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Fic - Sistema de Alunos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <script src="js/jquery-2.1.4.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
       <nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"  aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Boletim Virtual</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="cadastrar.html">Cadastrar Alunos</a></li>
					<li class="active"><a href="gerenciar.html">Gerenciar Alunos</a></li>
					<li class="dropdown">
						<ul class="dropdown-menu" role="menu">
							<li><a href="#" >Sair</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="navbar-line"></div>

	<div class="container">
		<h4 class="title">Gerenciar Alunos</h4> <hr/>
                <div class="col-md-12">
                   <table class="table table-bordered">
			<thead>
                            <tr>
				<th colspan="1">Nome</th>
				<th colspan="4" style="width: 200px; text-align: center">Ações</th>
                            </tr>
			</thead>
			<tbody>
                        <% AlunoDao dao = new AlunoDao();
                           List<Aluno> listaAlunos = dao.getLista("");
                           
                           for(Aluno aluno : listaAlunos){
                        
                        %>
			<tr>
                            <td><%= aluno.getAlunNome() %></td>
                            <td style="width: 1px"><a href="boletim.jsp?id=<%= aluno.getAlunId() %>" class="btn btn-warning">Boletim</a></td>
                            <td style="width: 1px"><a href="alterar.jsp?id=<%= aluno.getAlunId() %>,nome=<%= aluno.getAlunNome()%>" class="btn btn-primary">Atualizar Dados</a></td>
                            <td style="width: 1px"><a href="cadastrarAtividade.jsp?id=<%= aluno.getAlunId() %>" class="btn btn-info">Cadastrar Atividades</a></td>
                            <td style="width: 1px"><a href="excluir.jsp?id=<%= aluno.getAlunId() %>" class="btn btn-danger">Excluir</a></td>
			</tr>
                        <%                           }%>
			</tbody>
                    </table>
                </div>
	</div>
    </body>
</html>
