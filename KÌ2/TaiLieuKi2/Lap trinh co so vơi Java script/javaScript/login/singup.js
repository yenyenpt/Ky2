window.addEventListener('load', function(){
    btncreate = document.getElementById("btncreate");
    btncreate.addEventListener("click", function(){
        var name = document.getElementById("name");
        var email = document.getElementById("email");
        var password = document.getElementById("password");
        var typepassword = document.getElementById("typepassword");
        if(name.value.length > 10) {
            alert("Tên phải ngắn hơn 10 kí tự");
          
        }
        if(typepassword,value != password.value) {
            alert("Mật khẩu không trùng khớp");
     
        } 
        
    })
})