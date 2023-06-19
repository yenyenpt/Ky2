//Bai9
/*var products =['mercedes', 'audi', 'ford', 'lamborghini'];
showProduct();
addProduct();
removeProduct();
updateProduct();
removeAllProduct();
function showProduct(){
    if(products.length == 0){
        console.log('Không có sản phẩm để hiển thị');
    }
    else{
        for(i=0; i<products.length; i++){
            console.log(products[i]);
        }
    }
    
}
function addProduct() {
    var tenSP = prompt('Bai9: Nhập tên sản phẩm muốn thêm: ');
    if(tenSP.length <5 ){
        tenSP = prompt('Bai9: Nhập lại tên sản phẩm >5 ký tự: ');
    }
    else{
        products.push(tenSP);
        console.log('Mảng products sau khi thêm: ');
        showProduct();
    }
}

function removeProduct(){
    var ten = prompt('Bai9: Nhập tên sản phẩm cần xóa: ');
    var dem =0;
    var a;
    for(i=0; i<products.length; i++){
        if(products[i] == ten){
            dem++;
            a=i;
        }
    }
    if(dem != 0){
        products.splice(a,1);
        console.log('Mảng products sau khi xóa: ');
        showProduct();
    }
    else if(dem == 0){
        console.log('Không tìm thấy sản phẩm cần xóa');
    }
}
function updateProduct(){
    var ten = prompt('Bai9: Nhập tên sản phẩm cần cập nhật: ');
    var dem = 0;
    var a;
    for(i=0; i<products.length; i++){
        if(products[i] == ten){
            dem++;
            a=i;
        }
    }
    if(dem != 0){
        var tenMoi = prompt('Bai9: Nhập tên mới: ');
        products.splice(a,1,tenMoi);
        console.log('Mảng products sau khi cập nhật: ');
        showProduct();
    }
    else if(dem == 0){
        console.log('Không tìm thấy sản phẩm cần cập nhật');
    }
}
function removeAllProduct(){
    products.splice(0,products.length);
    showProduct();
}

*/
var  products= ["mercedes", "audi","ford","lamborghini" ]
showProduct();
addProduct();
removeProduct();
updateProduct();


function showProduct(){
    if(products.length == 0){
        console.log("Khong co san pham de hien thi!!")
    }else{
        for(i = 0; i<products.length;i++ ){
           
            console.log(products[i]);
        }
    }
}
function addProduct(){
    var tenSanPham = prompt("Vui long nhap ten san pham: ");
    if(tenSanPham.length < 5){
        tenSanPham = prompt("Nhap thieu ki tu, Vui long nhap lai: ");
    }else{
        products.push(tenSanPham);
        console.log('Mảng products sau khi thêm: ');
        showProduct();
    }

}
function removeProduct(){
    var ten= prompt("Vui long nhap ten san pham can xoa: ");
    var dem = 0;
    var b;
    for(i = 0; i < products.length; i++){
        if(products[i] == ten){
            dem++;
        b=i;
        }
    }
    if(dem != 0){
        products.splice(b,1);
        console.log("Cac ten san pham con lai: ")
        showProduct();
        
    }else{
        console.log("Khong tim thay ten san pham can xoa!")
    }
}
function updateProduct(){
    var ten = products("Nhap ten san pham can cap nhat: ");
    
}








