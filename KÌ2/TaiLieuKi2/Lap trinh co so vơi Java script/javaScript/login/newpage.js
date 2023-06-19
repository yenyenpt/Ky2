window.addEventListener('load', function() {

    //hiển thị giá trị
    var so;

    function layGiaTriCu() {
        return document.getElementById("hienthicu").innerText;
    }

    function inGiaTriCu(so) {
        document.getElementById("hienthicu").innerText = so;
    }

    function layKetQuaMoi() {
        return document.getElementById("hienthi").innerText;
    }

    function inKetQuaMoi(so) {
        document.getElementById("hienthi").innerText = so;
    }

    //định dạng chuỗi
    function dinhDangChuoi(so) {
        var n = Number(so);
        var gia_tri = n.toLocaleString("en");
        return gia_tri;
    }

    //xoá định dạng chuỗi
    function xoaDinhDangChuoi(so) {
        return Number(so.replace(/,/g, ''))
    }

    //hiển thị số khi ấn
    var conso = document.getElementsByClassName("conso");
    for (var i = 0; i < conso.length; i++) {
        conso[i].addEventListener("click", function() {
            var ketqua = xoaDinhDangChuoi(layKetQuaMoi());
            if (ketqua != NaN) {
                ketqua = ketqua + this.id;
                inKetQuaMoi(ketqua);
            }
        })
    }

    function inKetQuaMoi(so) {
        if (so == "") {
            document.getElementById("hienthi").innerText = so;
        } else {
            document.getElementById("hienthi").innerText = dinhDangChuoi(so);
        }
    }


    //eval("12+23")
    //xoá kết quả
    var heThong = document.getElementsByClassName("hethong");
    for (var i = 0; i < heThong.length; i++) {
        heThong[i].addEventListener("click", function() {
            if (this.id == "dauxoa") {
                inKetQuaMoi("");
                inGiaTriCu("");
            } else {
                var ket_qua = layKetQuaMoi();
                var ket_qua_cu = layGiaTriCu();
                if (ket_qua != "") {
                    ket_qua = xoaDinhDangChuoi(ket_qua);
                    // ket_qua_cu = ket_qua_cu + ket_qua;
                    if (this.id == "=") {
                        var ket_qua_cuoi = eval(ket_qua_cu + ket_qua); //eval(ket_qua_cu + ket_qua)
                        console.log(eval(ket_qua_cu + ket_qua))
                        inKetQuaMoi(ket_qua_cuoi)
                        inGiaTriCu("")
                    } else {
                        ket_qua_cu = ket_qua_cu + this.id;
                        inGiaTriCu(ket_qua_cu)
                        inKetQuaMoi("")
                    }
                }
            }

        })
    }


})