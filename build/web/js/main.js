/*  login  */

    $("login").ready(function(){
        $("#modal-login").modal({ "backdrop" : "static", "keyboard" : true, "show" : true });

    });

    function funcLogin(){
            var form = $("#login");
            var nome = form.find('.nome').val();
            var senha = form.find('.senha').val();
            var parametros = { nome: nome, senha: senha, tipo: "login"};
            $.ajax({
                method: "POST",
                url: "login",
                dataType: "JSON",
                data: parametros,
                complete: function (jqXHR, textStatus) {
                    window.location = "index.jsp";
                }         
            });
    }
    /*  login  */

    function registerTeacher(){
         var form = $("#register");
            var nome = form.find('.nome').val();
            var pass = form.find('.senha').val();
            var passConfirmation = form.find('.senha_confirma').val();
            var parametros = { nome: nome, password: pass};
            if (pass == passConfirmation) {
                $.ajax({
                    method: "POST",
                    url: "login",
                    dataType: "JSON",
                    data: parametros,
                    complete: function (jqXHR, textStatus) {
                        alert( jqXHR.responseText );
                    }   

                });
            } else {
                alert("erro");
            }
            alert(parametros);
    }
$(document).ready(function(){
    $('.logout').click(function(e){
        e.preventDefault();
        var parametros = { logout: "logout"};
        $.ajax({
            method: "POST",
            url: "login",
            dataType: "JSON",
            data: parametros,
            complete: function (jqXHR, textStatus) {
                window.location = "index.jsp";
            }   

        });
    });
})
