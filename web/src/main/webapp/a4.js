function check() {
	if (f.mid.value == "") {
		alert("사용자 아이디를 입력해주세요.")
	} else {
		ajaxfunc(f.mid.value);
	}
}

let request;
let arrayFromJson;

function ajaxfunc(idData) {
	var ajax_data = "mid=" + idData;
	//console.log(ajax_data);

	function aaa() {
		if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		}
	}

	function bbb() {
		if (request.readyState == XMLHttpRequest.DONE && request.status == 200) {
			arrayFromJson = this.response;
			console.log(arrayFromJson);
			return_cehck(arrayFromJson);
		}
	}
	request = aaa();
	request.onreadystatechange = bbb;
	request.open("POST", "http://121.130.239.202:8081/web/login_idck.jsp", true);
	request.setRequestHeader("content-type", "application/x-www-form-urlencoded");
	request.send(ajax_data);
}


function return_cehck(resp) {
	if (resp == "no") {
		alert("중복된 아이디다");
	} else if (resp == "error") {
		alert("올바른 접근 방식이 아니다");
	} else {
		alert("사용가능한 아이디입니다.")
		document.getElementById("mid").readOnly= true;
	}
}