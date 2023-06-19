var a = document.getElementsByClassName("conso");
var length = a.length;
var i;
var j;
var arr = Array(length);

function swap(arr, i, j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

//-binary search
//-stack, queue
//-linkedList


//sap xep nổi bọt
function sapxepnoibot(arr, length) {
    for (var i = 0; i < length; i++) {
        for (var j = i + 1; j < length; j++) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
        }
    }
}

//sapXepChen
function sapXepChen(arr, length) {
    for (var i = 1; i < length; i++) {
        var temp = arr[i];
        var j = i - 1;
        while (j >= 0 && temp < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}

//sapXepChon
function sapXepChon(arr, length) {
    for (var i = 0; i < length; i++) {
        var min = i;
        for (var j = i + 1; j < length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        swap(arr, i, min);
    }
}

function thaydoisapxep() {
    var x = document.getElementById("chon");
    var i = x.selectedIndex;
    document.getElementById("tensapxep").innerHTML = x.options[i].text;
}

window.addEventListener('load', function() {
    var a = document.getElementsByClassName("conso");
    var length = a.length;
    var arr = [];

    var luachon = document.getElementById("start");
    luachon.addEventListener('click', function() {


        for (var i = 0; i < length; i++) {
            arr[i] = a[i].id;
        }
        for (var i = 0; i < length; i++) {
            arr[i] = Number(arr[i]);
        }

        sapxepnoibot(arr, length);

        for (var i = 0; i < length; i++) {
            a[i].id = arr[i];
        }

        for (var i = 0; i < length; i++) {
            a[i].innerHTML = a[i].id;
        }
    })

    var reset = document.getElementById("reset");
    reset.addEventListener("click", function() {

    })

})