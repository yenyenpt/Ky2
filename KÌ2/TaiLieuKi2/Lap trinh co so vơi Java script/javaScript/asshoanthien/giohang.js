
function initTable(){
	
	var list_tr=document.querySelectorAll("table tbody tr");

	for(var i=0;i<list_tr.length;i++){
		var the_tr=list_tr[i];
		the_tr.style.display="table-row";

		var chk=the_tr.querySelector("input[type=checkbox]");

		chk.setAttribute("onchange","changeCheckbox(this)"); 

		
		var txt_number=the_tr.querySelector("input[type=number]");
		txt_number.setAttribute("onchange","changeNumber(this)");
	}

}
initTable();

function checkAll(objCHK){
	var kt_true=objCHK.checked;
	
	var list_tr=document.querySelectorAll("table tbody tr");
	
	for(var i=0;i<list_tr.length;i++){
		var the_tr=list_tr[i];
		var chk=the_tr.querySelector("input[type=checkbox]");
		chk.checked=kt_true;

		var txt_number=the_tr.querySelector("input[type=number]");
		txt_number.disabled = !kt_true ? true : false;
	}	
}

function changeCheckbox(objCheckbox){
	
	var the_tr=objCheckbox.parentElement.parentElement;
	var kt_true=objCheckbox.checked;
	var txt_number=the_tr.querySelector("input[type=number]");
	txt_number.disabled = !kt_true ? true : false;
}

function changeNumber(objNumber){
	var soLuong=objNumber.value;
	var td_dongia =objNumber.parentElement.previousElementSibling.innerHTML;
	var td_thanh_tien =objNumber.parentElement.nextElementSibling;
	var tong_thanh_tien=Number(td_dongia)*soLuong;

	td_thanh_tien.innerHTML=tong_thanh_tien;
	TongTien();
}

function TongTien(){
	var list_tr=document.querySelectorAll("table tbody tr");
	var tong_tien=0;
	for(var i=0;i<list_tr.length;i++){
		var the_tr=list_tr[i];
		if(the_tr.style.display="table-row"){
			var the_th=the_tr.lastElementChild.innerHTML;
			console.log(the_th);
			tong_tien=tong_tien+Number(the_th);
		}

		document.getElementById("tongtien").innerHTML=tong_tien;
	}
}

function filterProduct(objSelect){
	var list_tr=document.querySelectorAll("table tbody tr");
	console.log(list_tr);
	switch(objSelect.value){
		case "0":
		for(var i=0;i<list_tr.length;i++){
				list_tr[i].style.display = "table-row";
			}
		break;
		
		case "1":
		for(var i=0;i<list_tr.length;i++){
			var td_dongia=list_tr[i].children[2].innerHTML;
			if(Number(td_dongia)<100){
				list_tr[i].style.display = "table-row";
			}else{
				list_tr[i].style.display = "none";
			}
		}
		break;

		case "2":
		for(var i=0;i<list_tr.length;i++){
			var td_dongia=list_tr[i].children[2].innerHTML;
			if(Number(td_dongia)>100 && Number(td_dongia)<500){
				list_tr[i].style.display = "table-row";
			}else{
				list_tr[i].style.display = "none";
			}
		}
		break;
		case "3":
		for(var i=0;i<list_tr.length;i++){
			var td_dongia=list_tr[i].children[2].innerHTML;
			if(Number(td_dongia)>500){
				list_tr[i].style.display = "table-row";
			}else{
				list_tr[i].style.display = "none";
			}
		}
		break;

		default: 
		for(var i=0;i<list_tr.length;i++){
				list_tr[i].style.display = "table-row";
			}
		break;
	}
}



