window.onload = ()=>{
    var f = document.createElement("form");
    var ln = document.createElement("label");
    ln.innerText = "nombre";
    var inputn = document.createElement("input");
    inputn.type = "text";
    inputn.name = "nombre";
    ln.appendChild(inputn);
    f.appendChild(ln);
    var lp = document.createElement("label");
    lp.innerText = "contraseña";
    var inputp = document.createElement("input");
    inputp.type = "password";
    inputp.name = "contra";
    lp.appendChild(inputp);
    f.appendChild(lp);
    var enviar = document.createElement("input");
    enviar.type = "submit";
    enviar.value = "enviar";
    f.appendChild(enviar);
    f.onsubmit = ()=>{
        console.log("Enviando formulario");
        return false;
    }
    document.body.appendChild(f);
}