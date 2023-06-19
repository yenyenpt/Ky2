var a = document.getElementsByClassName("conso");
var length = a.length;
var i;
var j;
var arr = Array(length);

function swap(arr, i, j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    //
}

//-binary search
//-stack, queue
//-linkedList




//first.style.fontSize = "10px";
mangcacso = "";
//sap xep nổi bọt
function sapxepnoibot(arr, length) {
    for (var i = 0; i < length; i++) {
        for (var j = i + 1; j < length; j++) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
        }
    }
    /*mangcacso = arr.join(" ");
    document.getElementById("helo").innerText = mangcacso;*/
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



        /*var lop = document.getElementById("element");
        lop.style.position = 'relative';
        lop.style.display = 'flex';
        lop.style.flexDirection = 'row-reverse';
        lop.style.color = 'blue';

        var so = document.getElementsByClassName('conso');
        console.log(so.length);*/




        var reset = document.getElementById("reset");
        reset.addEventListener("click", function() {

            /* for (var i = 0; i < b; i++) {
                arr[i] = a[i].id;
            }
            for (var i = 0; i < b; i++) {
                arr[i] = Number(arr[i]);
            }
            for (var i = 0; i < b; i++) {
                for (var j = b - 1; j >= 0; j--) {
                    if (arr[j + 1] < arr[j]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
            for (var i = 0; i < b; i++) {
                var mangcacso = "";
                mangcacso = arr.join(" ");
                document.getElementById("helo").innerText = mangcacso;
            }
            var conso = document.getElementsByClassName('conso');
            for (var i = 0; i < b; i++) {
                conso[i].id = Number(conso[i].id);
            }

            console.log(conso[1].id);
            for (var i = 0; i < b; i++) {
                //conso[i].id = arr[i];
                console.log(conso[i].id);
            }*/

            /*var lop = document.getElementById("element");
            lop.style.position = 'relative';
            lop.style.display = 'flex';
            lop.style.flexDirection = 'row';
            lop.style.color = 'blue';*/
        })
    })

})