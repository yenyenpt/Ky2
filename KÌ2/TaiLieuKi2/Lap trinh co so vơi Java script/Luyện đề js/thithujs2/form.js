function reset() {
    location.reload();
}
function hienthi() {
    var tensach = document.getElementById('tensach');
    var nhaxuatban = document.getElementById('nhaxuatban');
    var soluong = document.getElementById('soluong')
    var dongia = document.getElementById('dongia')
    var tongtien = document.getElementById('tongtien')
    var ngaythangnam = document.getElementById('ngaythangnam')
    var loaisach = document.getElementById('loaisach')
    var nguoinhap = document.getElementById('nguoinhap')
    var sanpham = document.getElementsByClassName('sanphamdangco')
    var noigiao = document.getElementsByName('vitri')

    var error1 = document.getElementById('error1')
    var error2 = document.getElementById('error2')
    var error3 = document.getElementById('error3')
    var error4 = document.getElementById('error4')
    var error5 = document.getElementById('error5')
    var error6 = document.getElementById('error6')
    var error7 = document.getElementById('error7')
    var error8 = document.getElementById('error8')
    var error9 = document.getElementById('error9')
    var error10 = document.getElementById('error10')

    if(tensach.value == "") {
        error1.innerText = "Bạn chưa nhập tên sách"
    } else {
        error1.innerText = "";
    }

    if(nhaxuatban.value == "") {
        error2.innerText="Bạn chưa nhập nhà xuất bản"
    } else {
        error2.innerText = ""
    }

    if(soluong.value == "") {
        error3.innerText = "Bạn chưa nhập số lượng"
    } else if(isNaN(soluong.value)) {
        error3.innerText = "Số lượng phải là số"
    } else {
        error3.innerText =""
    }

    if(dongia.value == "") {
        error4.innerText ="Bạn chưa nhập đơn giá"
    } else if(isNaN(dongia.value)) {
        error4.innerText ="Đơn giá phải là số"
    }
    else {
        error4.innerText =""
    }

    if(ngaythangnam.value == "") {
        error6.innerText ="Bạn chưa chọn ngày/tháng/năm"
    } else {
        error6.innerText =""
    }

    var checkten = /^[a-zA-Z\s]+$/;
    if(nguoinhap.value == "") {
        error8.innerText ="Bạn chưa nhập tên người nhập"
    } else if (!checkten.test(nguoinhap.value)) {
        error8.innerText ="Tên người nhập không hợp lệ"
    } else {
        error8.innerText =""
    }

    if(noigiao[0].checked !== true && noigiao[1].checked !== true) {
        error10.innerText = "Bạn chưa chọn nơi giao hàng"
    } 
    else {
        error10.innerText =""
    }
}

function checksoluong(num) {
    if(num < 0) {
        var error3 = document.getElementById('error3')
        error3.innerText = "Số lượng phải nguyên dương"
        return false
    } else if(isNaN(num)) {
        var error3 = document.getElementById('error3')
        error3.innerText = "Số lượng phải là số"
        return false
    } else {
        var error3 = document.getElementById('error3')
        error3.innerText = ''
        return true;
    }
}
function checkdongia(num) {
    if(num < 0) {
        var error4 = document.getElementById('error4')
        error4.innerText = "Đơn giá phải nguyên dương"
        return false
    } else if(isNaN(num)) {
        var error4 = document.getElementById('error4')
        error4.innerText = "Đơn giá phải là số"
        return false
    } else {
        var error4 = document.getElementById('error4')
        error4.innerText =""
        return true
    }
}

function tongtien() {
    var soluong = document.getElementById('soluong').value
    var dongia = document.getElementById('dongia').value
    if(checksoluong(soluong) && checkdongia(dongia)) {
        var tongtien = document.getElementById('tongtien')
        tongtien.value = dongia * soluong
    }
}

function hienthiship() {
    var vitri = document.getElementsByName('vitri')
    if(vitri[1].checked == true) {
        var phivc = document.getElementById('phivc');
        phivc.style.display =  "inline";
        var phivc1 = document.getElementById('phivc1');
        phivc1.style.display =  "none";
    }
}
function hienthiship1() {
    var vitri = document.getElementsByName('vitri')
    if(vitri[0].checked == true) {
        var phivc1 = document.getElementById('phivc1');
        phivc1.style.display =  "inline";
        var phivc = document.getElementById('phivc');
        phivc.style.display =  "none";
    }
}