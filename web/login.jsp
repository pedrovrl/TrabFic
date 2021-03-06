<%-- 
    Document   : login
    Created on : 23/11/2015, 19:54:52
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% if(session.getAttribute("profid")!=null){response.sendRedirect("principal.html");};%>
   <head>
        <title>Login</title>
        <meta charset="UTF-8">
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
        <script src="js/main.js"></script>
    </head>
    <body>
          <div id="modal-login" class="modal fade">
           <div class="modal-dialog">
            <div class="modal-content" style="-webkit-box-shadow: none; border: none">
              <!-- dialog body -->
              <div class="modal-body">
                <h1 class="logo">Sistema de Notas</h1>
                <section>
                  <div class="container" style="width: 100%;">     
                    <div id="loginbox">                    
                      <div class="panel panel-info" >
                        <div class="panel-heading">
                          <div class="panel-title">Login</div>
                          <!--<div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Esqueceu sua senha?</a> </div>-->
                        </div>     
                        <div style="padding-top:30px" class="panel-body" >
                          <div style="display:none" id="login-alert" class="alert alert-danger"></div>
                          <form  action="javascript:funcLogin()" method="post" id="login" class="form-horizontal ">
                            <div class="alert alert-danger" role="alert" style="display: none"><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span></div>
                            <div style="margin-bottom: 25px" class="input-group">
                              <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                              <input id="login-username" type="text" class="form-control nome" name="nome" value="" placeholder="nome" required>                                        
                            </div>
                            <div style="margin-bottom: 25px" class="input-group">
                              <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                              <input id="login-password" type="password" class="form-control senha" name="senha" placeholder="senha" required>
                            </div>
                            <div style="margin-top:10px" class="form-group">
                              <!-- Button -->
                              <div class="col-sm-12 ">
                                <button class="btn btn-success" style="width: 100px">Login</button>
                              </div>
                            </div>
                            <div class="form-group">
                              <div class="col-md-12 ">
                                <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                  Não tem uma conta? 
                                  <a class="" href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                    Inscreva-se aqui
                                  </a>
                                </div>
                              </div>
                            </div>    
                          </form>     
                        </div>                     
                      </div>  
                    </div>
                    <div id="signupbox" style="display:none;" >
                      <div class="panel panel-info">
                        <div class="panel-heading">
                          <div class="panel-title">Cadastro</div>
                          <div style="float:right; font-size: 85%; position: relative; top:-10px"><a class="" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Login</a></div>
                        </div>  
                        <div class="panel-body" >
                          <form id="register" action="javascript:registerTeacher()" method="post" class="form-horizontal">
                            <div class="alert alert-success" role="alert" style="display: none">...</div>
                            <div class="alert alert-danger" role="alert" style="display: none"><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span></div>
                            <div style="margin-bottom: 25px" class="input-group">
                              <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                              <input id="cadastro-login-username" type="text" class="form-control nome" name="nome" value="" placeholder="nome" required maxlength="100" pattern=".{5,}" title="5 caracteres no mínimo.">                                        
                            </div>
                            <div style="margin-bottom: 25px" class="input-group">
                              <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                              <input id="cadastro-login-password" type="password" class="form-control senha" name="senha" placeholder="senha" required maxlength="30" pattern=".{6,}" title="6 caracteres no mínimo.">
                            </div>
                            <div style="margin-bottom: 25px" class="input-group">
                              <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                              <input id="cadastro-login-password-repeat" type="password" class="form-control senha_confirma" name="senha_confirma" placeholder="confirme sua senha" required maxlength="30">
                            </div>
                            <div style="margin-top:10px" class="form-group">

                              <div class="col-sm-12 ">
                                <button class="btn btn-success" style="width: 100px">Enviar</button>
                              </div>
                            </div>
                          </form>
                        </div>
                      </div>
                    </div>
                  </div>  
                </section>
              </div>
            </div>
          </div>
        </div>
    </body>
</html>
