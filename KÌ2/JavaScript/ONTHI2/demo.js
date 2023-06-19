var user = document.querySelector('#User');
var password = document.querySelector('#Pass');
var repassword = document.querySelector('#Re_password');
var email = document.querySelector('#email');
var tingtrang = document.querySelector('#tinhTrang');
var submit = document.querySelector('#submit');
var tbody = document.querySelector('tbody');

var error = document.querySelector('#error');

var ErrorUser = document.querySelector('#ErrorUser');
var ErrorPass = document.querySelector('#ErrorPass');
var ErrorRe_password = document.querySelector('#ErrorRe_password');
var ErrorEmail = document.querySelector('#ErrorEmail');
var ErrorTinhTrang = document.querySelector('#ErrorTinhTrang');
var ErrorSubmit = document.querySelector('#ErrorSubmit');

var Array = [];
var object = {}



submit.addEventListener('click', function(e) {
    e.preventDefault();
    
    if(user.value.trim()== ""){
        ErrorUser.innerHTML = "User không được để trống"
        return false;
    }

    if(password.value.trim()== ""){
        ErrorPass.innerHTML = "Pass không được để trống"
  
    }else if(password.value.length <= 8){
      
        ErrorPass.innerHTML = "Pass phải tối thiểu 8 ký tự"
        return false;
    }
 

    if(repassword.value.trim()== ""){
        ErrorRe_password.innerHTML = "Re_password không được để trống"

    }else if ( password.value.trim() != repassword.value.trim()){
       
        ErrorRe_password.innerHTML = "Re_password không giống pasword"
        return false;
    }



    if(email.value.trim()== ""){
        ErrorEmail.innerHTML = "Email không được để trống"
        return false;
    }


    if(tingtrang.value.trim()== ""){
        ErrorTinhTrang.innerHTML = "Tinh trang không được để trống"
        return false;
    }

    error.innerHTML ="Đăng nhập thành công"

    object.user= user.value
    object.pass= password.value
    object.email= email.value
    object.tingtrang= tingtrang.value
   

    Array.push(object)
  
    for(var i of Array){
        tbody.innerHTML="";
        tbody.innerHTML+= `
      
        <tr>
        <td>${i.user}</td>
        <td>${i.pass}</td>
        <td>${i.email}</td>
        <td>${i.tingtrang}</td>
        <td >
            <center><button id ="xoa" onclick = "return confirm('Bạn có chắc muốn xoá không')">Xoá</button></center>
        </td> <br>

        
    </tr>
        `
    }

    
})
