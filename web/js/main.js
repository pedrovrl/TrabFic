/*  login  */

$("login").ready(function(){
    $("#modal-login").modal({ "backdrop" : "static", "keyboard" : true, "show" : true });
});

function funcLogin(){
        
    var form = $("#login");
      
        console.log(form);
        var nome = form.find('.nome').val();
        var senha = form.find('.senha').val();
        var parametros = { nome: nome, password: senha};
        
        $.ajax({
            method: "POST",
            url: "login",
            dataType: "JSON",
            data: parametros,
            complete: function (jqXHR, textStatus) {
                alert( jqXHR.responseText );
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


