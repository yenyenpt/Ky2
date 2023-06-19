var user = document.querySelector('#Username');
var pass = document.querySelector('#password');
var repassword = document.querySelector('#repassword');
var email = document.querySelector('#email');
var tinhtrang = document.querySelector('#tinhtrang');
var submit = document.querySelector('#submit');
var tbody = document.querySelector('tbody')

var erroruser = document.querySelector('#errorUser');
var errorpass = document.querySelector('#errorPass');
var errorrepass = document.querySelector('#error_repassword');
var erroremail = document.querySelector('#erroremail');
var errortinhtrang = document.querySelector('#ErrorTinhTrang');
var errorsubmit = document.querySelector('#Errorsubmit');

var error = document.querySelector('#error');

var Array = [];
var obj = {};

submit.addEventListener('click' ,function(e){
    e.preventDefault();

    if(user.value.trim() == ""){
        erroruser.innerHTML = "User không được để trống";
        return false;
    }


    if(pass.value.trim() == ""){
        errorpass.innerHTML= "Pass không được để trống";
        
    }else if(pass.value.trim() <= 8){
        errorpass.innerHTML= "pass tối thiểu 8 ký tự";
        return false;
    }



    if(repassword.value.trim() == ""){
        errorrepass.innerHTML="Re_pass không được để trống";
        
    }else if(pass.value.trim() != repassword.value.trim()){
        errorrepass.innerHTML="repassword và pass k trùng nhau";
        return false;
    }


    if(email.value.trim() == ""){
        erroremail.innerHTML= "Email không được để trống";
        return false;
    }

    
    if(tinhtrang.value.trim() == ""){
        errortinhtrang.innerHTML="Tinh trang không được để trống";
        return false;
    }

    error.innerHTML="Đăng nhập thành công";
/*
    obj.user = user.value
    obj.pass = pass.value
    obj.repassword = repassword.value
    obj.email = email.value

    Array.push(obj)
    showInfo()
   
   
})



function showInfo() {
    tbody.innerHTML="";
    for(var i = 0; i < Array.length; i++ ){

        tbody.innerHTML+= `
      
        <tr>
        <td>${Array[i].user}</td>
        <td>${Array[i].pass}</td>
        <td>${Array[i].email}</td>
        <td>${Array[i].tingtrang}</td>
        <td >
            <center><button id ="xoa" onclick="check(${i})">Xoá</button></center>
        </td> <br>

        
    </tr>
        `
    }
    console.log(Array)
}

function check(index) {
    console.log(index)
        if(confirm("Bạn có chắc muốn xóa user này không !!") == true) {
            Array.splice(index, 1)
            alert("Bạn đã xóa thành công !!")
            showInfo()
        } else {
            alert("Bạn đã canceled!!")
        }
}

*/
obj.user=user.value
obj.pass=pass.value
obj.repassword=repassword.value
obj.email=email.value

Array.push(obj);
show();
})

function show(){
    tbody.innerHTML="";
    for(var i = 0; i < Array.length;i++){
        tbody.innerHTML+=`
        <tr>
        <td>${Array[i].user}</td>
        <td>${Array[i].pass}</td>
        <td>${Array[i].email}</td>
        <td>${Array[i].tingtrang}</td>
        <td >
            <center><button id ="xoa" onclick  = "check(${i})">Xoá</button></center>
        </td> <br>

        `
    }
}
function check(index){
    if(confirm("Banj muon xoa k!1")== true){
        Array.splice(index,1);
        show();
        alert("xoa thanh cong!!")
    }
}


