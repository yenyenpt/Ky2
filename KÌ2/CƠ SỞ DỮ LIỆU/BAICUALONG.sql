CREATE DATABASE BAICUALONG

create table giaoVien(
maGV varchar (10) primary key ,
hoTen nvarchar (50),
ngSinh date ,
QueQuan nvarchar (50),
gTinh varchar (10),
);
drop table giaoVien

create table DeTai (
maDT nvarchar (10) ,
tenDT nvarchar (50),
primary key (maDT),
namThien int,
maGV varchar (10) references giaoVien(maGV)
);
drop table DeTai

create table sinhVien (
maSV varchar (10),
hoTen nvarchar (50),
ngSinh date ,
queQuan nvarchar (50),
diem float ,
maDT nvarchar (10) references DeTai(maDT),
primary key (maSV , maDT)
);
drop table sinhVien

insert into giaoVien(maGV,hoTen,ngSinh,QueQuan,gtinh) VALUES
('GV01' , N'Trần Thị Loan' , '1978/05/06' , N'Nam Định' , 'Nu'),
('GV02' , N'Lê Viết Thịnh' , '1989/03/05' , N'Hà Tĩnh' , 'Nam'),
('GV03' , N'Trần Hữu Thiện ' , '1991/01/09' , N'Hà Nội' , 'Nam');
select * from giaoVien

INSERT INTO DeTai(maDT,tenDT,namThien,maGV) VALUES
('D01',N'Công Nghệ 4.0','2017','GV01'),
('D02',N'Công Nghệ Blockchain','2018','GV03'),
('D03',N'Bitcoin','2018','GV03');
 select * from DeTai

 INSERT INTO sinhVien(maSV,hoTen,ngSinh,queQuan,diem,maDT) VALUES
 ('S001',N'Lê Quang Tèo','2000/01/01',N'Hà Nội',7,'D02'),
 ('S002',N'Đỗ Mỹ Linh','1998/08/05',N'Hà Tĩnh',10,'D01'),
 ('S003',N'Mai Phương Thúy','1999/09/06',N'Nghệ An',8,'D02');
 SELECT * FROM sinhVien


---cau1

SELECT MASV, GIAOVIEN.HOTEN, TENDT FROM SINHVIEN JOIN DETAI ON SINHVIEN.MADT = DETAI.MADT
JOIN GIAOVIEN ON GIAOVIEN.MAGV = DETAI.MAGV
WHERE GIAOVIEN.HOTEN = N'TRẦN THỊ LOAN'
GROUP BY  MASV, GIAOVIEN.HOTEN, TENDT