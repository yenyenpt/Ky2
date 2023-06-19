var images = [];

function load() {
    for (var i = 0; i < 6; i++) {
        images[i] = new Image();
        images[i].src = 'anh/' + i + '.JPG';
       
    }
}

var index = 0;

function first() {
    index = 0;
    var anh = document.getElementById('anh');
    anh.src = images[index].src;
}

function last() {
    index = images.length - 1;
    var anh = document.getElementById('anh');
    anh.src = images[index].src;
}

function next() {
    index++;
    if(index >= images.length){
         index = 0;
    }
    var anh = document.getElementById("anh"); anh.src = images[index].src;
    /*if (index < images.length ) {
        index++;
        var anh = document.getElementById('anh');
         anh.src = images[index].src;
    }
    if (index == images.length ) {
        index = 0;
        var anh = document.getElementById('anh');
         anh.src = images[index].src;
    }*/
}

function prev() {
    index--;
    if(index < 0){
        index = images.length - 1;
    }
    var anh = document.getElementById("anh"); anh.src = images[index].src;
    /*if (index > 0) {
        index--;
        var anh = document.getElementById('anh');
         anh.src = images[index].src;
    }
    if(index == 0) {
        index = images.length - 1;
        var anh = document.getElementById('anh');
        anh.src = images[index].src;
    }*/
}