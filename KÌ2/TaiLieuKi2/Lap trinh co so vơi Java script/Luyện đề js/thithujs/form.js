function reset() {
    location.reload();
}
function dangki() {
    var tendn = document.getElementById("tendn");
    var password = document.getElementById("password");
    var cdpassword = document.getElementById("cdpassword");
    var name = document.getElementById("name");
    var hodem = document.getElementById("hodem");
    var datebith = document.getElementById("datebith");
    var email = document.getElementById("email");
    var phone = document.getElementById("phone");

    var error1 = document.getElementById("error1")
    var error2 = document.getElementById("error2")
    var error3 = document.getElementById("error3")
    var error4 = document.getElementById("error4")
    var error5 = document.getElementById("error5")
    var error6 = document.getElementById("error6")
    var error7 = document.getElementById("error7")
    var error8 = document.getElementById("error8")

    var check = true;

    if(tendn.value == "") {
        error1.style.color ="red"
        error1.innerText ="Tên đăng nhâp không được để trống"
        check = false;
    } else {
        error1.innerText = ""
    }

    if(password.value == "") {
        error2.style.color ="red"
        error2.innerText = "Mật khẩu không được để trống"
        check = false;
    } else {
        error2.innerText = ""
    }


    if(cdpassword.value == "") {
        error3.style.color="red"
        error3.innerText = "Mật khẩu nhập lại không được để trống"
        check = false
    } else if(cdpassword.value != password.value) {
        error3.style.color = "red"
        error3.innerText ="Mật khẩu không trùng khớp"
        check = false
    }else {
        error3.innerText = ""
    }


    if(name.value == "") {
        error4.style.color = "red"
        error4.innerText ="Tên không được để trống"
        check = false
    }else {
        error4.innerText = ""
    }


    if(hodem.value =="") {
        error5.style.color ="red"
        error5.innerText ="Họ đệm không được để trống"
        check = false
    }else {
        error5.innerText = ""
    }


    if(datebith.value == "") {
        error6.style.color ="red"
        error6.innerText ="Ngày sinh không được để trống"
        check = false
    }else {
        error6.innerText = ""
    }


    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if(email.value == "") {
        error7.style.color ="red"
        error7.innerText ="Email không được để trống"
        check = false
    } else if (!filter.test(email.value)) {
        error7.style.color ="red"
        error7.innerText ="Phải nhập đúng định dạng email"
        check = false
    }else {
        error7.innerText = ""
    }


    if(phone.value == "") {
        error8.style.color ="red"
        error8.innerText="Số điện thoại không được để trống"
        check = false
    } else if (isNaN(phone.value)) {
        error8.style.color="red"
        error8.innerText = "Số điện thoại phải là một số"
        check = false
    }else {
        error8.innerText = ""
    }

    if (check) {
        document.body.innerText = "Đăng Kí Thành Công"  + "\nTên đăng nhập: "+ tendn.value + "\nMật khẩu: " + password.value + "\nTên: " + name.value + "\nHọ đệm: " + hodem.value + "\nNgày sinh: " + datebith.value + "\nEmail: " + email.value + "\nSố điện thoại: " + phone.value
    }


    
}