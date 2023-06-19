var Username = document.querySelector('.Username');
var Password = document.querySelector('.Password');
var Repassword = document.querySelector('.Repassword');
var Submit = document.querySelector('.Submit');
var error = document.querySelector(".error");

var users = [
    {
        id: 1,
        username: "thienth",
        password: "thiendeptrai"
    },
    {
        id: 2,
        username: "minhdq",
        password: "minhdiachu"
    },
    {
        id: 3,
        username: "tiennh",
        password: "tiencute"
    }
]


Submit.onclick = function (x) {
    x.preventDefault();
    if (Username.value.trim() == "") {
        error.innerHTML = " Username khong duoc de trong"
        return false;
    }
    if (Password.value.trim() == "") {

        error.innerHTML = "Password khong duoc de trong"
        return false;
    }
    if (Repassword.value.trim() == "") {

        error.innerHTML = "Repassword khong duoc de trong"
        return false;

    }
    if (Password.value != Repassword.value) {
        error.innerHTML = 'password và repassword không giống nhau'
        return false;
    }

    if (check(Username.value, Password.value)) {
        error.innerHTML = 'Đăng nhập thành công!';
    } else {
        error.innerHTML = 'Tài khoản không tồn tại';
    }
}
function check(Username, Password) {
    let checked = false
    users.forEach(x => {
        if (x.username == Username && x.password == Password) {
            checked = true;
        }
    });
    return checked;
}
