function checkNum(num) {
    if (num == "") {
        alert("ban chua nhap so dien thoai");

        return false;
    }
    if (isNaN(num)) {
        alert("nhap so dien thoai khong hop le");
        return false;
    } else {
        return true;
    }
}

function helo() {
    var email = document.passform.email;
    var password = document.passform.password;
    var cpassword = document.passform.cpassword;
    var name = document.passform.name;
    var company = document.passform.company;
    var telephone = document.passform.telephone;
    var address = document.passform.address;
    var city = document.passform.city;
    var country = document.passform.country;
    var kt = true;
    if (email.value == "") {
        alert("ban chua nhap email");
        kt = false;
    }
    if (password.value == "") {
        alert("ban chua nhap password");
        kt = false;
    }
    if (cpassword.value == "") {
        alert("ban chua nhap Cpassword");
        kt = false;
    } else if (cpassword.value != password.value) {
        alert("Cpassword không trùng với password");
        kt = false;
    }
    if (name.value == "") {
        alert("ban chua nhap name");
        kt = false;
    }
    if (company.value == "") {
        alert("ban chua nhap company");
        kt = false;
    }
    if (address.value == "") {
        alert("ban chua nhao Address");
        kt = false;
    }

    if (city.value == "") {
        kt = false;
        alert("ban chua nhap city");

    }
    if (country.value == "") {
        kt = false;
        alert("ban chua nhap country");
    }
    var check = checkNum(telephone.value);
    if (check == false) {
        kt = false;
    }
    if (kt == true) {
        alert("Tạo tài khoảng thành công");
    }
    console.log(kt);
}


function xoa() {

    document.getElementById('email').value = "";
    document.getElementById('password').value = "";
    document.getElementById('cpassword').value = "";
    document.getElementById('name').value = "";
    document.getElementById('company').value = "";
    document.getElementById('telephone').value = "";
    document.getElementById('address').value = "";
    document.getElementById('city').value = "";
    document.getElementById('country').value = "";
}