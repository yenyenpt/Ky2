function display() {
    var pro = document.getElementById('pro');
    var qty = document.getElementById('qty')
    var name = pro.innerText;
    var price = pro.getAttribute('data-price');
    var chiso = qty.value;
    var amount = price * chiso;
    document.getElementById('name').innerText = name;
    document.getElementById('amount').innerText = amount;
}