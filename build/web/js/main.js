/*  login  */

$("login").ready(function(){
    $("#modal-login").modal({ "backdrop" : "static", "keyboard" : true, "show" : true });
});

function func(){
    $(".formulario-login").submit(function(){
        var form = $(this);
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
        
        
    });
}
/*  login  */


