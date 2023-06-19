var user = document.querySelector('#user');
var password = document.querySelector('#password');
var re_password = document.querySelector('#re_password');
var email = document.querySelector('#email');
var tinhTrang = document.querySelector('#tinhTrang');
var submit = document.querySelector('#submit');
var tbody = document.querySelector('tbody');

var error = document.querySelector('#error');

var e_user = document.querySelector('#e_user');
var e_password = document.querySelector('#e_password');
var e_re_password = document.querySelector('#e_re_password');
var e_email = document.querySelector('#e_email');
var e_tinhTrang = document.querySelector('#e_tinhTrang');
var e_submit = document.querySelector('#e_submit');

var Array = [];
var obj ={};

submit.addEventListener('click', function(e){
    e.preventDefault();

    if(user.value.trim() == ""){
        e_user.innerHTML='User không được để trống!!';
        return false;
    }

    if(password.value.trim() == ""){
        e_password.innerHTML='Pass không được để trống';
    }else if(password.value.length < 8){
        e_password.innerHTML='Pass tối thiểu 8 ký tự';
    }

    if(re_password.value.trim() == ""){
        e_re_password.innerHTML='Repass không được để trống';
    }else if(re_password.value.trim() != password.value.trim()){
        e_re_password.innerHTML='Repass  và pass phải trùng nhau';
    }

    if(email.value.trim() == ""){
        e_email.innerHTML = 'Email không được để trống';
        return false;
    }

    if(tinhTrang.value.trim() == ""){
        e_tinhTrang .innerHTML = 'Tình trạng không được để trống';
        return false;
    }

    error.innerHTML='Đăng nhập thành công';

    obj.user = user.value
    obj.password = password.value
    obj.email = email.value
    obj.tinhTrang = tinhTrang.value

    Array.push(obj);
    showinfo();


 
})

function showinfo(){
    tbody.innerHTML = "";
    for(var i = 0; i < Array.length;i++){
        tbody.innerHTML +=`
        <tr>
            
                    <td>${Array[i].user}</td>
                    <td>${Array[i].password}</td>
                    <td>${Array[i].re_password}</td>
                    <td>${Array[i].tinhTrang}</td>
                    <td>
                        <button type="submit" id="xoa" onclick = "check(${i})">Xoá</button>
                    </td>
                
        </tr>

        `
    }
    console.log(Array);

}
function check(index){
    console.log(index);
    if(confirm("Bạn có muốn xoá không!!") == true){
        Array.splice(index,1);
        alert("Bạn xoá thành công!")
    }

}