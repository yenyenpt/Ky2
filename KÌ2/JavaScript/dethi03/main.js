var  sanpham = document.querySelector("#sp");
var thuonghieu = document.querySelector("#thuonghieu");
var noisx = document.querySelector("#noisx");
var giasp = document.querySelector("#giasp");
var linkimg = document.querySelector("#link");
var themmoi = document.querySelector("#themmoi");
var error1 = document.querySelector(".error1");
var error2 = document.querySelector(".error2");
var error3 = document.querySelector(".error3");
var error4 = document.querySelector(".error4");
var error5 = document.querySelector(".error5");
var options = thuonghieu.options

var products = [];

themmoi.onclick = function(e){
    e.preventDefault();
    if(sp.value.trim() == ""){
        error1.innerHTML = "sản phẩm không được để trống"
        return false;
    }else{
        error1.style.display = 'none';
    }

    if(thuonghieu.value == "" ){
        error2.innerHTML = "thương hiệu không được để trống"
        return false;
    }else{
        error2.style.display = 'none';
    }

    if(giasp.value.trim() == ""){
        error3.innerHTML = "giá sp không được để trống"
    } else if(giasp.value.trim() < 0){
        error3.innerHTML = "giá sp phải là số dương"
    }else{
        error3.style.display = 'none';
    }

    if(noisx.value.trim() == ""  ){
        error4.innerHTML = " nơi sản xuất không được để trống và phải là số dương"
        return false;
    }else{
        error4.style.display = 'none';
    }
    
    if(linkimg.value.trim() == ""){
        error5.innerHTML = "link không được để trống"
        return false;
    }else{
        error5.style.display = 'none';
    }

  var  product = {
        sanpham : sanpham .value,
        thuonghieu :  thuonghieu.value,
        noisx : noisx.value,
        giasp : giasp.value,
        linkimg : linkimg.value
    }
products.push(product);
runproduct();

alert("đăng ký thành công")
    return true;
}


var product = document.querySelector(".product")
function runproduct (){
    product.innerHTML ="";
for(var i = 0 ; i < products.length; i++){
    product.innerHTML += `
    <p>${products[i].sanpham}</p>
    <p>${products[i].thuonghieu}</p>
    <p>${products[i].noisx}</p>
    <p>${products[i].giasp}</p>
    <img src="${products[i].linkimg }" alt="">
    <button type="submit" style="width: 40px;" onclick=deleted(${i})>xóa</button>
    `;
}
}
function deleted(i){
    if(confirm("Bạn có muốn xóa?") == true){
        products.splice(i,1);
        runproduct();
    }
}