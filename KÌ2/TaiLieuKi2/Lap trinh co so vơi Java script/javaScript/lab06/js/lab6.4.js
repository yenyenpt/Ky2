function check() {

    // kiểm tra họ
    var ho = document.getElementById("ho");
    var err1 = document.getElementById("err1");

    if (ho.value.length == 0) {
        ho.style.border = "1px solid red";
        err1.innerHTML = "k để trống họ";
        return false;
    } else {
        ho.style.border = "1px solid black";
        err1.innerHTML = "";
    }
    // kiểm tra tên
    var ten = document.getElementById("ten");
    var err2 = document.getElementById("err2");

    if (ten.value.length == 0) {
        ten.style.border = "1px solid red";
        err2.innerHTML = "k để trống tên";
        return false;
    } else {
        ten.style.border = "1px solid black";
        err2.innerHTML = "";
    }
    // kiểm tra giới tính
    var gioitinh = document.getElementsByName("gioitinh");
    var err4 = document.getElementById("err4");

    if (!gioitinh[0].checked && !gioitinh[1].checked) {
        err4.innerHTML = "Chọn giới tính";
        return false;
    } else {
        err4.innerHTML = "";
    }
    // kiểm tra ngay sinh
    var ngay = document.getElementById("ngay");
    var thang = document.getElementById("thang");
    var nam = document.getElementById("nam");
    var err3 = document.getElementById("err3");
    if (ngay.value == "") {
        err3.innerHTML = "Chưa chọn ngày.";
        return false;
    } else {
        err3.innerHTML = "";
    }
    if (thang.value == "") {
        err3.innerHTML = "Chưa chọn tháng.";
        return false;
    } else {
        err3.innerHTML = "";
    }
    if (nam.value == "") {
        err3.innerHTML = "Chưa chọn năm.";
        return false;
    } else {
        err3.innerHTML = "";
    }
    // kiểm tra sdt

    var sdt = document.getElementById("sdt");
    var err5 = document.getElementById("err5");

    if (sdt.value.length == 0) {
        sdt.style.border = "1px red solid";
        err5.innerHTML = "SDT k đc để trống";
        return false;
    } else if(isNaN(sdt)) {
        sdt.style.border = "1px red solid";
        err5.innerHTML = "SDT phải là số";
    }else {
        sdt.style.border = "1px black solid";
        err5.innerHTML = "";
    }

    // kiểm tra sở thích
    var sothich = document.getElementsByName("sothich");
    var err6 = document.getElementById("err6");
    var dem = 0;
    for (var i = 0; i < sothich.length; i++) {
        if (sothich[i].checked) {
            dem++;
        }
    }
    if (dem == 0) {
        err6.innerHTML = "Phải chọn ít nhất một sở thích";
        return false;
    }
}

function khac(visible) {
    var khac = document.getElementById("khac");
    khac.style.display = visible ? "" : "none";
}