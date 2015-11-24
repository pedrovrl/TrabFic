<%-- 
    Document   : cadastrarAtividade
    Created on : 30/09/2015, 12:15:07
    Author     : Gustavo
--%>

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
                        <li ><a href="cadastrar.html">Cadastrar Alunos</a></li>
                        <li class="active"><a href="cadastrarAtividade.jsp">Cadastrar Atividade</a></li>
                        <li ><a href="gerenciar.jsp">Gerenciar Alunos</a></li>
                       <li ><a style="padding: 0" href="#" class="logout"><img src="img/logout.png" style="width:36%"></a></li>    
                    </ul>
                </div>
            </div>
	</nav>
        
        <div class="navbar-line"></div>
        
        <div class="container">
            <h4 class="title">Cadastro de Atividades</h4> <hr/>
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form role="form" action="cadastrarAtividade.act" method="POST">
                    <div class="form-group">
                        <label for="text">Tipo de Atividade: </label>
                          <select class="form-control" name="ativ_tipo">
                              <option>Selecione...</option>
                              <option value="1">Avaliação</option>
                              <option value="2">Trabalho</option>     
                          </select>
                    </div>
                    
                    <div class="form-group">
                        <label for="text">Nome da Atividade: </label>
                          <input type="text" class="form-control" name="ativ_nome">
                    </div>
                    
                    <div class="form-group">
                        <label for="text">Nota:</label>
                          <input type="text" class="form-control" name="nota">
                    </div>
                    <input type="hidden" name="alun_id" value=<%= request.getParameter("id") %> >
                        <input type="submit" class="btn btn-default" value="Cadastrar" />
                 </form>
            </div>
            <div class="col-md-4"></div>
	</div>
    </body>
</html>
