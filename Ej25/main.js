function add(){
    var b = document.createElement("button");
    b.onclick = quitarme;
    document.querySelector("#botones").appendChild(b);
    var botones = document.querySelectorAll("#botones button");
    b.innerText = "boton añadido "+botones.length;
}
function quitar(){
    var botones = document.querySelectorAll("#botones button");
    if(botones.length > 0){
        document.querySelector("#botones").removeChild(botones[botones.length-1])   
    }
}
function quitarme(e){
    document.querySelector("#botones").removeChild(e.target);
}