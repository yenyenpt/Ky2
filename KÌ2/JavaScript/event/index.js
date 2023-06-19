var email = document.querySelector('#email');
var password = document.querySelector('#password');
var age = document.querySelector('#age' );
var register = document.querySelector('#submit');
var error = document.querySelector('#error');
var nam = document.querySelector('#nam');
var nu = document.querySelector('#nu');

register.onclick = function(x){
    x.preventDefault();
    if(email.value.trim() == ""){
        error.innerHTML = "Email khong duoc de trong"
        return false;
    }
    if(password.value.trim() == ""){
        
        error.innerHTML = "Password khong duoc de trong"
        return false;
    }
    if(age.value.trim() == ""){
        
        error.innerHTML = "Age khong duoc de trong"
        return false;
    } else if(age.value <18){
        error.innerHTML = "Age phải lớn hơn 18"
        return false;
    }
    if(!nam.check && !nu.check){
        error.innerHTML = "Giới tính không được để trống"
        return false;
    }

    error.innerHTML= "";
    return true;
}
