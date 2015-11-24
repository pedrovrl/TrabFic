<%-- 
    Document   : alterar
    Created on : 28/09/2015, 21:10:22
    Author     : Pedro
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
                        <li ><a href="cadastrasprAtividade.j">Cadastrar Atividades</a></li>
                        <li class="active"><a href="gerenciar.jsp">Gerenciar Alunos</a></li>
                        <li ><a style="padding: 0" href="#" class="logout"><img src="img/logout.png" style="width:36%"></a></li>    
                    </ul>
                </div>
            </div>
	</nav>
	
        <div class="navbar-line"></div>

	<div class="container">
            <h4 class="title">Alterar dados</h4> <hr/>
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form role="form" action="alterar.act" method="POST">
                    <div class="form-group">
                        <label for="text">Nome:</label>
                          <input type="text" class="form-control" name="nome" value="<%= request.getParameter("nome")%>">
                    </div>
                        <p style="color: #c12e2a"> * O aluno permanecerá com a mesma matrícula.</p>
                        <input type="submit" class="btn btn-default" value="Cadastrar" />
                 </form>
            </div>
            <div class="col-md-4"></div>
	</div>
    </body>
</html>
