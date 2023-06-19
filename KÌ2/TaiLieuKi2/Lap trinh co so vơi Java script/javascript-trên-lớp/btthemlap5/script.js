function reset() {
    location.reload();
}
function checknum(n) {
     var kt = true;

    if(n == "") {
        var checktelephone = document.getElementById('checktelephone');
        checktelephone.style.color="red"
        checktelephone.innerText ="*Bạn chưa nhập số điện thoại"
    } else if(isNaN(n)) {
        var checktelephone = document.getElementById('checktelephone');
        checktelephone.style.color="red"
        checktelephone.innerText ="*Số điện thoại nhập vào phải là số";
    } else {
        var checktelephone = document.getElementById('checktelephone');
        checktelephone.innerText ="";
        kt = false;
    }
    return kt;
}

function submit() {
    var name = document.getElementById('name')
    var password = document.getElementById('password')
    var retype = document.getElementById('retype')
    var fullname = document.getElementById('fullname')
    var email = document.getElementById('email')
    var telephone = document.getElementById('telephone')
    var address = document.getElementById('address')
    var country = document.getElementById('country')
    var description = document.getElementById('description')

    var kt = true;
    if(name.value == "") {
        var checkname = document.getElementById('checkname');
        checkname.style.color="red"
        checkname.innerText ="*Bạn chưa nhập tên"
        kt=false;
    } 
    if(password.value == "") {
        var checkpassword = document.getElementById('checkpassword');
        checkpassword.style.color="red"
        checkpassword.innerText ="*Bạn chưa nhập mật khẩu"
        kt = false;
    } 
    if(retype.value != password.value) {
        var checkretype = document.getElementById('checkretype');
        checkretype.style.color="red"
        checkretype.innerText ="*Mật khẩu nhập lại không trùng khớp"
        kt = false;
    } else if (retype.value == "") {
        var checkretype = document.getElementById('checkretype');
        checkretype.style.color="red"
        checkretype.innerText ="*Bạn chưa nhập lại mật khẩu"
    } else {
        kt = true;
    }
    if(fullname.value == "") {
        var checkfullname = document.getElementById('checkfullname');
        checkfullname.style.color="red"
        checkfullname.innerText ="*Bạn chưa nhập họ và tên"
        kt = false;
    } 
    if(email.value == "") {
        var checkemail = document.getElementById('checkemail');
        checkemail.style.color="red"
        checkemail.innerText ="*Bạn chưa nhập email"
        kt = false;
    }
    if(telephone.value == "") {
        var checktelephone = document.getElementById('checktelephone');
        checktelephone.style.color="red"
        checktelephone.innerText ="*Bạn chưa nhập số điện thoại"
        kt = false;
    } else if (isNaN(telephone.value)) {
        var checktelephone = document.getElementById('checktelephone');
        checktelephone.style.color="red"
        checktelephone.innerText ="*Số điện thoại nhập vào phải là số";
        kt = false;
    } else {
        kt = true;
    }
    if(address.value == "") {
        var checkaddress = document.getElementById('checkaddress');
        checkaddress.style.color="red"
        checkaddress.innerText ="*Bạn chưa nhập địa chỉ"
        kt = false;
    } 
    if(country.value == 0) {
        var checkcountry = document.getElementById('checkcountry')
        checkcountry.style.color="red"
        checkcountry.innerText ="*Bạn chưa chọn quốc gia"
        kt = false;
    }
    checknum(telephone.value);
    if(kt == true) {
        document.body.innerHTML="nhập thông tin thành công"
    }
}