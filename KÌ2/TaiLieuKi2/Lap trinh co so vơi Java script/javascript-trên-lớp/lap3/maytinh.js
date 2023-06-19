var bieuThuc = "";

function toan_hang(x) {
    bieuThuc = bieuThuc + x;
}

function toan_tu(pt) {
    bieuThuc = bieuThuc + pt;
}

function thuc_hien() {
    var kq = eval(bieuThuc);
    bieuThuc = "";
    alert("Ket Qua:" + kq)
}