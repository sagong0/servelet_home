let data;
let array;

function calldata(data){
	console.log(data)
	this.array = data;
}

function home(){
	this.array["member_list"].sort(function(a,b){
		
		return b["point"]-a["point"];
	});
	
	let html = document.getElementById("boxbox")
	
	var a;
	for(a in this.array["member_list"]){
		html.innerHTML += "<ul>";
		//console.log(a)
	var b;
	
	for(b in this.array["member_list"][a]){
		console.log(this.array["member_list"][a][b]);
		if(b == "point"){
			html.innerHTML += "<li>"+this.array["member_list"][a][b].toLocaleString()+"</li>"
		}else{
			html.innerHTML += "<li>"+this.array["member_list"][a][b]+"</li>"
		}
	}
  	}
  	html.innerHTML += "</ul>";
  	
}