window.addEventListener('load', function() {

    var chuoiPhepTinh = "";

    var mangCacSo = document.getElementsByClassName("conso")
    for (var i = 0; i < mangCacSo.length; i++) {
        mangCacSo[i].addEventListener("click", function() {
            chuoiPhepTinh += this.id
            document.getElementById("hienthi").innerText = chuoiPhepTinh
        })
    }

    var mangCacPhepTinh = document.getElementsByClassName("pheptinh")
    for (var i = 0; i < mangCacPhepTinh.length; i++) {
        mangCacPhepTinh[i].addEventListener("click", function() {
            chuoiPhepTinh = chuoiPhepTinh.toString()
            if (chuoiPhepTinh.includes("+") || chuoiPhepTinh.includes("-") || chuoiPhepTinh.includes("*") || chuoiPhepTinh.includes("/")) {
                chuoiPhepTinh = chuoiPhepTinh.substring(0, chuoiPhepTinh.length - 1); //xoa phep tinh  
            }
            chuoiPhepTinh += this.id
            document.getElementById("hienthi").innerText = chuoiPhepTinh
        })
    }


    var phepBang = document.getElementsByClassName("bang")[0]
    phepBang.addEventListener("click", function() {
        chuoiPhepTinh = eval(chuoiPhepTinh)
        document.getElementById("hienthi").innerText = eval(chuoiPhepTinh)
    })

    var dauXoa = document.getElementsByClassName("dauxoa")[0]
    dauXoa.addEventListener("click", function() {
        chuoiPhepTinh = ""
        document.getElementById("hienthi").innerText = ""
    })

    document.getElementById("hienthicu").innerText
})