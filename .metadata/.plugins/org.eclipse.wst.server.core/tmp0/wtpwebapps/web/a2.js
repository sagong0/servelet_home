var data;
var arrayFromJson;

function aaa(){
	function win(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	
	function file(){
		if(data.readyState == XMLHttpRequest.DONE && data.status ==200){
			arrayFromJson = JSON.parse(this.response);
			console.log(arrayFromJson);
		}else if(data.status == 404 || data.status == 405){
			console.log("해당 파일 및 서버에 접속할 수 없습니다.");
		}
	}
	
	data = win();
	data.onreadystatechange = file;
	data.open("get","./data.json","true");
	
	data.send();
}