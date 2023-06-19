function tinh_toan(a, b){
    var tong = a + b;
    var hieu = a - b;
    var tich = a * b;
    var thuong = a / b;
    document.write("Tong = " + tong + "<br/>")
    document.write("Hieu = " + hieu + "<br/>")
    document.write("Tich = " + tich + "<br/>")
    document.write("Thuong = " + thuong + "<br/>")
}

function dien_tich(a,b,c) {
    var p = (a+b+c)/2;
    var s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    document.write("Diện tích tam giác = " + s)
}

function cong() {
    var arr = document.getElementsByTagName('input');
    console.log(arr);
    var so1 = arr[0].value;
    var so2 = arr[1].value;
    var ketqua = 0;
    if(so1 == "" || so2 == "" || ketqua != "") {
        alert("Error!!");
        return;
    } 
    if(isNaN(so1) || isNaN(so2)) {
        alert("must be number");
        return;
    } else {
        ketqua = parseInt(so1) + parseInt(so2);
        document.getElementById('kq').value = ketqua;
    }
    
}
function tru() {
    var arr = document.getElementsByTagName('input');
    console.log(arr);
    var so1 = arr[0].value;
    var so2 = arr[1].value;
    var ketqua = 0;
    if(so1 == "" || so2 == "" || ketqua != "") {
        alert("Error!!");
        return;
    } 
    if(isNaN(so1) || isNaN(so2)) {
        alert("must be number");
        return;
    } else {
        ketqua = parseInt(so1) - parseInt(so2);
        document.getElementById('kq').value = ketqua;
    }
    
}
function nhan() {
    var arr = document.getElementsByTagName('input');
    console.log(arr);
    var so1 = arr[0].value;
    var so2 = arr[1].value;
    var ketqua = 0;
    if(so1 == "" || so2 == "" || ketqua != "") {
        alert("Error!!");
        return;
    } 
    if(isNaN(so1) || isNaN(so2)) {
        alert("must be number");
        return;
    } else {
        ketqua = parseInt(so1) * parseInt(so2);
        document.getElementById('kq').value = ketqua;
    }
    
}
function chia() {
    var arr = document.getElementsByTagName('input');
    console.log(arr);
    var so1 = arr[0].value;
    var so2 = arr[1].value;
    var ketqua = 0;
    if(so1 == "" || so2 == "" || ketqua != "") {
        alert("Error!!");
        return;
    } 
    if(isNaN(so1) || isNaN(so2)) {
        alert("must be number");
        return;
    } else {
        ketqua = parseInt(so1) / parseInt(so2);
        document.getElementById('kq').value = ketqua;
    }
    
}
function lay_du() {
    var arr = document.getElementsByTagName('input');
    console.log(arr);
    var so1 = arr[0].value;
    var so2 = arr[1].value;
    var ketqua = 0;
    if(so1 == "" || so2 == "" || ketqua != "") {
        alert("Error!!");
        return;
    } 
    if(isNaN(so1) || isNaN(so2)) {
        alert("must be number");
        return;
    } else {
        ketqua = parseInt(so1) % parseInt(so2);
        document.getElementById('kq').value = ketqua;
    }
    
}