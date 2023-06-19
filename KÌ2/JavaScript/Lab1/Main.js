
do{
    console.log("1: Nhap diem cua sinh vien!");
    console.log("2: Nhap chieu dai cua chuoi!!");
    console.log("3: Tien ngan hang!");
    console.log("4: Nhap mot so tu ban phim!!");
    console.log("5: Kiem tra xem so hay chu!");
    console.log("6: Kiem tra diem xem sinh vien qua mon hay khong!!");
    console.log("7: Trang trai bo!");
    console.log("8: Tien thuong va tien luong!!");
    console.log("9: Nhap diem quiz,ass,thi,lab!");
    console.log("10: Nhap so duong kiem tra xem chia het cho 3 va 5 khong!!");
    var luaChon;
    switch(luaChon){
        case 1:
            //Bai1
            var diem = prompt("Bai1:Vui long nhap diem: ");
            if(diem > 0 && diem <= 5){
                console.log("Hoc luc yeu!");
            }else if(diem >= 5 && diem <= 6.5){
                console.log("Hoc luc trung binh!");
            }else if(diem >= 6.5 && diem <= 8){
                console.log("Hoc luc kha!");
            }else if(diem >= 8 && diem <= 10){
                console.log("Hoc luc gioi!");
            }else{
                console.log("Diem loi, vui long nhap lai!");

                }
                break;
        case 2:
            //Bai2

            var chieuDai = prompt("Bai2: Vui long nhap chieu dai: ");

            if(chieuDai >= 10 && chieuDai <= 15){
                console.log("Chuoi tam duoc!");
            }else if(chieuDai <= 0){
                console.log("Nhap sai, vui long nhap lai!");
            }else{
                console.log("Chuoi khung, mua ngay!");
            }
            break;
        case 3:
                //Bai 3

            var tienGoc = 1000;

            var tongTienLai;
            var tongTien;
                for(i = 1; i < 12; i++){
                tongTienLai = ((tienGoc *10)/100)*i;
                console.log("Tien lai:"+tongTienLai);

                tongTien = tienGoc + tongTienLai;
                console.log("Tong tien "+i+" thang: "+ tongTien);


                }
                break;
        case 4:
                //Bai4
   
            var n = prompt("Bai4: Vui long nhap n: ");
            var dem = 0;
            for(i = 1; i < n; i++){
                if(i % 2 == 0){
                    console.log(i);
                    dem++;
                
                }
                
            }
                console.log("Day la cac so chia het cho 2!");
                break;
        case 5:
                    //Bai5
            var x = prompt("Bai5: Vui long nhap x: ");
            if(isNaN(x) == false){
                console.log("Day la so!!")
            }else{
                console.log("Day k phai so!!")
            }
            break;
        case 6:
             //Bai6
            var tenSV = prompt("Bai6: Vui long nhap ten sinh vien: ");
            var diem = prompt("Vui long nhap diem sinh vien: ");
            
            switch(diem){
                case "A":
                case "B":
                case "C":
                    console.log("Sinh vien da qua mon!!!");
                case "D":
                case "F":
                    console.log("Sinh vien da khong qua mon!!!");
                default:
                    console.log("Diem cua sinh vien k xac dinh dc!!");

            }
            break;
        case 7:
            //Bai7
            var soLuongBo = 1000;
            var soLuongBoMuaThem = 0;
            console.log("So luong bo ban dau: "+soLuongBo);
            for( i = 1; i <= 9; i++){
                soLuongBoMuaThem += 15;
                console.log("So luong bo mua them duoc sau thang "+i+"la: "+soLuongBoMuaThem);


            }
            console.log("Tong so luong bo sau khi mua them: "+(soLuongBoMuaThem + soLuongBo));
        case 8:
            //Bai8
            var hoTen = prompt("Bai8: Vui long nhap ho ten: ");
            var tuoi = prompt("Bai8: Vui long nhap tuoi: ");
            var muaLuong = prompt("Bai8: Vui long nhap mua luong: ");
            var thang = prompt("Bai8: Nhap so thang: ");
            var tienThuong;

            console.log("Tong luong: "+(muaLuong*thang));
            if(thang <= 3){
                tienThuong = 2000000;
                console.log("Ban duoc thuong "+tienThuong);
            }else if(thang >= 3 && thang <= 6){
                tienThuong = 6000000;
                console.log("Ban duoc thuong "+tienThuong);

            }else{
                tienThuong = 12000000;
                console.log("Ban duoc thuong "+tienThuong);
            }
            console.log("Tong thu nhap ca luong va thuong: "+((muaLuong*thang)+tienThuong));
            break;
        case 9:
                    //Bai9
            var diemLab = prompt("Bai 9: Vui long nhap diem lab: ");
            var diemQuiz = prompt("Bai 9:Vui long nhap diem quiz: ");
            var diemAss = prompt("Bai 9:Vui long nhap diem ass: ");
            var diemThi = prompt("Bai 9:Vui long nhap diem diem thi: ");
            var diemTrungBinh = diemLab*0.3 + diemQuiz*0.1 + diemAss*0.2 + diemThi *0.4;
            if(diemLab < 0 || diemQuiz < 0 || diemAss < 0 ||diemThi < 0 || diemLab > 10 || diemQuiz > 10 || diemAss > 10 ||diemThi > 10 ){
                console.log("Loi nhap diem!!");
            }else{
                console.log("Diem trung binh: "+diemTrungBinh);
                console.log("Diem lab: "+diemLab);
                console.log("Diem quiz: "+diemQuiz);
                console.log("Diem Ass: "+diemAss);
                console.log("Diem thi: "+diemThi);

                if(diemTrungBinh < 5){
                    console.log("Ban da truot mon!!")
                }else{
                    console.log("Ban da qua mon!!");
                }
            }
            break;
        case 10:
                    //Bai 10
            var so = prompt("Vui long nhap so bat ki: ");
            var tong = 0;
            if(so < 0){
                console.log("Nhap lai.Vui long nhap so duong!")
            }else{
                for(i = 0 ; i <= so; i++){
                    if(i %3 == 0 && i %5 == 0){
                        tong += i;
                    
                    }
                }
                console.log("Day la so chia het cho 3 va 5!!")

                
            }
   

            }
        }while(luaChon != 0);










        
    
    
    
   
    
    

     
    