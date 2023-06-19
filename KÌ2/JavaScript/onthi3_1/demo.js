var tensp = document.querySelector('#tensp');
var thuonghieu = document.querySelector('#thuonghieu');
var gisp = document.querySelector('#gisp');
var nuoisx = document.querySelector('#noisx');
var linkhinhanh = document.querySelector('#linkhinhanh');
var submmit = document.querySelector('#submmit');
var table  = document.querySelector('table');

var error  = document.querySelector('#error');


var etensp = document.querySelector('#etensp');
var ethuonghieu = document.querySelector('#ethuonghieu');
var egisp = document.querySelector('#egisp');
var enoisx = document.querySelector('#enoisx');
var elinkhinhanh = document.querySelector('#elinkhinhanh');
var esubmmit = document.querySelector('#esubmmit');



var array = [];
var obj ={};

submmit.addEventListener('click', function(e){
    e.preventDefault();

    if(tensp.value.trim() == ""){
        etensp.innerHTML = 'Tên sản phẩm không đươc để trống!';
      
    }else if(tensp.value.length < 10){
        etensp.innerHTML = 'Tên sản phẩm tối thiểu 10 ký tự';
        return false;
    }

    if(thuonghieu.value.trim() == ""){
        ethuonghieu.innerHTML = 'Thương hiệu sản phẩm không đươc để trống!';
        return false;
    }

    if(gisp.value.trim() == ""){
        egisp.innerHTML = 'Giá  sản phẩm không đươc để trống!';
  
    }else if(gisp.value.trim() < 0){
        egisp.innerHTML = 'Giá sản phẩm phải à số dương';
        return false;
    }

    if(nuoisx.value.trim() == ""){
        enuoisx.innerHTML = 'Nơi sản xuất không đươc để trống!';
        return false;
    }

    if(linkhinhanh.value.trim() == ""){
        elinkhinhanh.innerHTML = 'Linh hình ảnh sản phẩm không đươc để trống!';
        return false;
    }
    error.innerHTML="Đăng nhập thành công!"

    obj.tensp=tensp.value
    obj.thuonghieu=thuonghieu.value
    obj.gisp=gisp.value
    obj.nuoisx=nuoisx.value

    Array.push(obj);
    show();
   
})

function show(){
    table.innerHTML="";
    for(var i = 0; i < Array.length;i++){
        table.innerHTML+=`
        <tr>
        <th>Tên sản phẩm</th>
        <td>${Array[i].tensp}</td>
    </tr>

    <tr>
        <th>Thương hiệu</th>
        <td>${Array[i].thuonghieu}</td>
    </tr>

    <tr>
        <th>Giá sản phẩm</th>
        <td>${Array[i].gisp}</td>
    </tr>

    <tr>
        <th>Nơi sản xuất</th>
        <td>${Array[i].nuoisx}</td>
    </tr>
    <tr>
    <td> <button type="submit" id="submit" onclick = 'show(${i})'>XOA</button></td>
</tr>
               
    <td>
    <img src="${Array[i].linkhinhanh}" alt="">
    </td>

        `
    }
}
function dele(index){
    if(confirm('bạn có chăc muôn xoá khôngg!!')){
        Array.sprice(index,1);
        show();
        alert("xoa thanh cong!")
    }
   
}