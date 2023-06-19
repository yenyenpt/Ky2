window.addEventListener('load', function() {
    var chuoiPhepTinh = "";

    var mangCacSo = document.getElementsByClassName("conso");
    for (var i = 0; i < mangCacSo.length; i++) {
        mangCacSo[i].addEventListener('click', function() {
            chuoiPhepTinh += this.id;
            document.getElementById("hienthi").innerText = chuoiPhepTinh;
        })
    }

    var mangPhepTinh = document.getElementsByClassName("pheptinh");
    for (var i = 0; i < mangPhepTinh.length; i++) {
        mangPhepTinh[i].addEventListener('click', function() {
            chuoiPhepTinh = chuoiPhepTinh.toString();
            if (chuoiPhepTinh.includes("+") || chuoiPhepTinh.includes("-") || chuoiPhepTinh.includes("*") || chuoiPhepTinh.includes("/")) {
                chuoiPhepTinh = chuoiPhepTinh.substring(0, chuoiPhepTinh - 1);
            } else {
                chuoiPhepTinh += this.id;
            }
            document.getElementById("hienthi").innerText = chuoiPhepTinh;
        })
    }

    var dauBang = document.getElementsByClassName("bang")[0];
    dauBang.addEventListener("click", function() {
        chuoiPhepTinh = eval(chuoiPhepTinh);
        document.getElementById("hienthi").innerText = chuoiPhepTinh
    })


})