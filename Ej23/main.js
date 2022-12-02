function suma(){
    var n1 = parseInt( document.querySelector("#n1").value );
    var n2 = parseInt( document.querySelector("#n2").value );
    document.querySelector("#resultado").innerText= n1+n2;
}
function resta(){
    var n1 = parseInt( document.querySelector("#n1").value );
    var n2 = parseInt( document.querySelector("#n2").value );
    document.querySelector("#resultado").innerText= n1-n2;
}
function multiplica(){
    var n1 = parseInt( document.querySelector("#n1").value );
    var n2 = parseInt( document.querySelector("#n2").value );
    document.querySelector("#resultado").innerText= n1*n2;
}
function divide(){
    var n1 = parseInt( document.querySelector("#n1").value );
    var n2 = parseInt( document.querySelector("#n2").value );
    document.querySelector("#resultado").innerText= n1/n2;
}
function potencia(){
    var n1 = parseInt( document.querySelector("#n1").value );
    var n2 = parseInt( document.querySelector("#n2").value );
    document.querySelector("#resultado").innerText= Math.pow(n1,n2);
}
function longitud(){
    var n1 = parseInt( document.querySelector("#n1").value );
    document.querySelector("#resultado").innerText= Math.floor(Math.PI*n1);
}