
    var index = 1;
    var anhAr = [
        'anh1.jpg',
        'anh2.jpg',
        'anh3.jpg',
        'anh4.jpg'
    ]
    setInterval(function loadanh() {
        document.getElementById("cauthu").src = anhAr[index]
        index++;
        if(index == anhAr.length) {
            index = 1;
        }
    }, 1500)
