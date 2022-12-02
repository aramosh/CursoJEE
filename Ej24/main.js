function add(){
    var b = document.createElement("button");
    b.innerText = "boton añadido";
    document.querySelector("#botones").appendChild(b);
}
function quitar(){
    var botones = document.querySelectorAll("#botones button");
    if(botones.length > 0){
        document.querySelector("#botones").removeChild(botones[botones.length-1])   
    }
}