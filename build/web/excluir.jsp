<%-- 
    Document   : excluir
    Created on : 28/09/2015, 20:14:00
    Author     : Pedro
--%>

<%@page import="java.util.List"%>
<%@page import="br.boletimaluno.models.Aluno"%>
<%@page import="br.boletimaluno.dao.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Fic - Sistema de Alunos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <script src="js/jquery-2.1.4.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
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
				<a class="navbar-brand" href="index.jsp">Boletim Virtual</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="cadastrar.html">Cadastrar Alunos</a></li>
                                        <li><a href="cadastrarAtividades.html">Cadastrar Atividades</a></li>
					<li class="active"><a href="gerenciar.html">Gerenciar Alunos</a></li>
					<li ><a style="padding: 0" href="#" class="logout"><img src="img/logout.png" style="width:36%"></a></li>    
				</ul>
			</div>
		</div>
	</nav>
	<div class="navbar-line"></div>
        
        <% AlunoDao dao = new AlunoDao();
           List<Aluno> listaAlunos = dao.getLista("Where alun_id="+request.getParameter("id"));
                           
           for(Aluno aluno : listaAlunos){
             
        %>
	<div class="container">
		<h4 class="title">Exclusão de aluno</h4> <hr/>
                <div class="col-md-12">
                    <p>Tem certeza que deseja excluir o aluno <%= aluno.getAlunNome() %> ?</p>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-sm-2 col-md-3 col-lg-4">
                    </div>
                    <div class="col-xs-6  col-sm-4 col-md-3 col-lg-2">
                            <a class="thumbnail" href="excluir.act?id=<%= aluno.getAlunId() %>"  ><img src="img/status-on.png"></a>
                            <h5 class="text-muted text-center">Excluir agora!</h5>
                    </div>
                    <div class="col-xs-6  col-sm-4 col-md-3 col-lg-2">
                            <a class="thumbnail" href="gerenciar.jsp"><img src="img/status-off.png"></a>
                            <h5 class="text-muted text-center">Agora não!</h5>
                    </div>
                </div>
	</div>
        <% }%>
    </body>
</html>
