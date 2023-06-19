var user = document.querySelector("#user");
var pass = document.querySelector("#pass");
var repassword = document.querySelector('#Re_password');
var Email = document.querySelector("#Email");
var tinhTrang = document.querySelector("#tinhTrang");
var submit = document.querySelector("#submit");

var error = document.querySelector("#error");

var erroruser = document.querySelector("#erroruser");
var errorpass = document.querySelector("#errorpass");
var ErrorRe_password = document.querySelector('#ErrorRe_password');
var errorEmail = document.querySelector("#errorEmail");
var errortinhTrang = document.querySelector("#errortinhTrang");
var errorsubmit = document.querySelector("#errorsubmit");

submit.addEventListener('click', function(e){
    e.preventDefault();
console.log(repass.value);
    if(user.value.trim() == ""){
        erroruser.innerHTML = 'User không được để trống!!';
        return false;
    }


    if(pass.value.trim() == ""){
        errorpass.innerHTML = 'Pass không được để trống!!';
        return false;
    } if(pass.value.length < 8){
        errorpass.innerHTML = 'Pass tối thiểu 8 ký tự!!';
        return  false;
    }

    if(repassword.value.trim()== ""){
        ErrorRe_password.innerHTML = "Re_password không được để trống"

    }else if ( password.value.trim() != repassword.value.trim()){
       
        ErrorRe_password.innerHTML = "Re_password không giống pasword"
       
    }

    if(Email.value.trim() == ""){
        errorEmail.innerHTML = 'Email không được để trống!!';
     
    }

    if(tinhTrang.value.trim() == ""){
        errortinhTrang.innerHTML = ' Tình trạng không được để trống!!';
      
    }

    error.value.trim() = "Đăng nhập thành công!!"
    
})