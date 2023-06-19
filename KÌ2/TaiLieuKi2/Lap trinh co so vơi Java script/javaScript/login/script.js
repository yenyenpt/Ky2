var account = {
    email: 'admin',
    password: '123'
}
ktTK = true;
ktMk = true;
window.addEventListener('load', function() {

    var btn3 = document.getElementById("btn3");
    btn3.addEventListener('click', function() {
        var email = document.getElementById("email")
        var password = document.getElementById("password");
        if (email.value == account.email) {
            ktTK = false;
        }
        if (password.value == account.password) {
            ktMK = false;
        }
        if (ktTK == false && ktMK == false) {
            window.location.href = "https://www.w3schools.com/js/js_window_location.asp";
        } else {
            email.value = '';
            password.value = '';
            alert("Tài Khoản hoặc mật khẩu không đúng");
        }
    })


})

function onMouseOverEvent() {
    document.img_hoa.src = "image/banner.jpeg";
}

function onMouseOutEvent() {
    document.img_hoa.src = "image/image1.jpg";
}

var anhAr = [];
var currentIndex = 0;

function loadAnh() {
    for (var i = 1; i < 4; i++) {
        anhAr[i] = new Image();
        anhAr[i].src = "image/anh" + i + ".jpeg";
    }
}

function next() {
    if (currentIndex < 3) {
        currentIndex++;
        document.getElementById("hoa").src = anhAr[currentIndex].src;
    }
}

function back() {
    if (currentIndex > 0) {
        currentIndex--;
        document.getElementById("hoa").src = anhAr[currentIndex].src;
    }
}