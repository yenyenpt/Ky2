window.addEventListener('load', function() {
    var chuoipheptinh = "";
    var so = document.getElementsByClassName("conso");
    for (var i = 0; i < so.length; i++) {
        so[i].addEventListener('click', function() {
            chuoipheptinh += this.id;
            document.getElementById("hienthi").innerHTML = chuoipheptinh;
        })
    }
    var pheptinh = document.getElementsByClassName("pheptinh");
    for (var i = 0; i < pheptinh.length; i++) {
        pheptinh[i].addEventListener('click', function() {
            chuoipheptinh = chuoipheptinh.toString()
            if (chuoipheptinh.includes("+") || chuoipheptinh.includes("-") || chuoipheptinh.includes("*") || chuoipheptinh.includes("/")) {
                chuoipheptinh = chuoipheptinh.substring(0, chuoipheptinh.length - 1); //xoa phep tinh  
            }
            chuoipheptinh += this.id;
            document.getElementById("hienthi").innerHTML = chuoipheptinh;
        })
    }
    var ketqua = document.getElementsByClassName("bang");
    ketqua[0].addEventListener('click', function() {
        chuoipheptinh = eval(chuoipheptinh);
        document.getElementById("hienthi").innerHTML = eval(chuoipheptinh);
    })
    var xoa = document.getElementsByClassName("dauxoa")
    xoa[0].addEventListener('click', function() {
        chuoipheptinh = "";
        document.getElementById("hienthi").innerHTML = chuoipheptinh;
    })
})