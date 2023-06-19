function KiemTra(){
	var student=document.getElementById("student");
	var name=document.getElementById("name");
	var email=document.getElementById("email");
	var national=document.getElementById("national");
	var gender=document.getElementsByName("gender");
	var sothich=document.getElementsByClassName("sothich");
	var note=document.getElementById("note");


	var checkid=document.getElementById("checkid");
	var checkname=document.getElementById("checkname");
	var checkemail=document.getElementById("checkemail");
	var checkgender=document.getElementById("checkgender");
	var checksothich=document.getElementById("checksothich");
	var checknational=document.getElementById("checknational");
	var checknote=document.getElementById("checknote");
	
    var kt = true;

	if(student.value == ""){
		student.style.border="1px solid red";
        checkid.style.color="red"
		checkid.innerText="Mã sinh viên không được để trống!";
		kt = false;
	}else{
		student.style.border="none";
		checkid.innerText="";
	}
	
	if(name.value == ""){
		name.style.border="1px solid red";
        checkname.style.color="red";
		checkname.innerText="Họ tên sinh viên không được để trống!";
        kt = false;
	}else{
		name.style.border="none";
		checkname.innerText="";
	}


	if(email.value == ""){
		email.style.border="1px solid red";
        checkemail.style.color="red";
		checkemail.innerText="Email không được để trống!";
        kt = false;
	}else{
		email.style.border="none";
		checkemail.innerText="";
	}


	if(gender[0].checked!==true & gender[1].checked!==true){
        checkgender.style.color="red";
		checkgender.innerText="Bạn phải chọn giới tính!";
        kt = false;
	}else{
		checkgender.innerText="";
	}


	var check=0;
	for(var i=0;i<sothich.length;i++){
		if(sothich[i].checked==true){
			check++;
		}
	}
	if(check==0){
        kt = false;
        checksothich.style.color="red";
		checksothich.innerText="Bạn phải chọn ít nhất một sở thích!";

	}else{
		checksothich.innerText="";
	}

	if(national.value == 0){
        kt = false;
        checknational.style.color="red"
		checknational.innerText="Bạn phải chọn quốc tịch!";

	}else{
		checknational.innerText="";
	}

	if(note.value.length > 200){
        kt = false;
        checknote.style.color="red"
		checknote.innerText="Bạn chỉ được nhập tối đa 200 ký tự!";
		note.style.border="1px solid red";
	
	}else{
		checknote.innerText="";
		note.style.border="1px solid #ccc";
	}

    if(kt == true) {
        document.body.innerHTML="Đăng Ký thành công"
    }
}