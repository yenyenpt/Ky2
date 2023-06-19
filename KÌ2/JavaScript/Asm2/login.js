var username = document.querySelector('#username');
var password = document.querySelector('#password');
var repassword = document.querySelector('#re-password' );
var login = document.querySelector('#submit');
var error = document.querySelector('#error')
users = [
    {
        id:1,
        username:"thienth",
        password:"thiendeptrai"
    },
    {
        id:2,
        username:"minhdq",
        password:"minhdiachu"
    },
    {
        id:3,
        username:"tiennh",
        password:"tiencute"
    }
]

login.onclick = function(x){
    x.preventDefault();
    if(username.value.trim() == ""){
        error.innerHTML = "Username khong duoc de trong"
        return false;
    }
    if(password.value.trim() == ""){
        
        error.innerHTML = "Password khong duoc de trong"
        return false;
    }
    if(repassword.value.trim() == ""){
        
        error.innerHTML = "Re-password khong duoc de trong"
        return false;
    }
    if(password.value != repassword.value){
        error.innerHTML = "Password và Re-password phải trùng nhau"
        return false;
    }
    for(var i=0; i< users.length ; i++){
        if(username.value=== users[i].username && password.value=== users[i].password){
            error.innerHTML = 'Đăng nhập thành công!';
            break;
        }
        else if(username.value !== users[i].username || password.value !== users[i].password){
            error.innerHTML = 'Username hoặc password không đúng';
            
        }
    }
    

    
    
}


