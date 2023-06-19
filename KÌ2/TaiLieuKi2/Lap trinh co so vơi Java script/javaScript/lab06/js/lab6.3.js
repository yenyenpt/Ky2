function hien_thi(visible){
    var phi_vc = document.getElementById('phi_vc');
    phi_vc.style.display = visible ? "":"none";
}
function kiem_tra(){
    var sp = document.getElementById('san_pham');
    if(sp.value.length == 0){
        alert("Vui long nhap ten san pham!")
        return false;
    }
    var gia = document.getElementById('don_gia');
    if(isNaN(gia.value)){
        alert("Vui long nhap so!");
        return false;
    }
    var loai = document.getElementById('loai');
    if(loai.value.length == 0){
        alert("Vui long chon loai san pham!");
        return false;
    }
    var radios = document.getElementsByName('nh');
    if(!radios[0].checked && !radios[1].checked){
        alert("Vui long chon noi nhan hang!");
        return false;
    }
    alert("Chuc mung ban da dat hang thanh cong!");
    return true;
}