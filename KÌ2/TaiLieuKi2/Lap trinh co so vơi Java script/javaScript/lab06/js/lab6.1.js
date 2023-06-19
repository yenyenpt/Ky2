var out = new Image();
out.src = "anh/0.JPG";
var over = new Image();
over.src = "anh/1.JPG";
function fover(){
    var anh = document.getElementById('anh');
    anh.src = over.src;
}
function fout(){
    var anh = document.getElementById('anh')
    anh.src = out.src;
}