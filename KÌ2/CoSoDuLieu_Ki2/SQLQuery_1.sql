CREATE DATABASE AS_TRANTHITHUPHUONG_WE17330

IF OBJECT_ID('NHAXB') IS NOT NULL
DROP TABLE NHAXB
CREATE TABLE NHAXB(
MANXB CHAR(10),
TENNXB NVARCHAR(50),
DIACHI NVARCHAR(50),
PRIMARY KEY (MANXB)
);

IF OBJECT_ID('TACGIA') IS NOT NULL
DROP TABLE TACGIA
CREATE TABLE TACGIA(
MATG CHAR(10),
HOTENTG NVARCHAR(50),
NGAYSINH DATE,
PRIMARY KEY (MATG)
);

IF OBJECT_ID('PHANLOAI') IS NOT NULL
DROP TABLE PHANLOAI
CREATE TABLE PHANLOAI(
MAPL CHAR(10),
TENPL NVARCHAR(50),
PRIMARY KEY (MAPL)
);

IF OBJECT_ID('SACH') IS NOT NULL
DROP TABLE SACH
CREATE TABLE SACH(
MAS CHAR(10),
TIEUDE NVARCHAR(50),
SOTRANG NVARCHAR(1000),
SOLUONGBS NVARCHAR(50),
GIATIEN NVARCHAR(50),
NGAYNK DATE,
VITRI NVARCHAR(50),
MANXB CHAR(10),
MATG CHAR(10),
MAPL CHAR(10),
PRIMARY KEY (MAS),
FOREIGN KEY (MANXB) REFERENCES NHAXB(MANXB),
FOREIGN KEY (MATG) REFERENCES TACGIA(MATG),
FOREIGN KEY (MAPL) REFERENCES PHANLOAI(MAPL)
);

if OBJECT_ID('SACH') is not null
drop table SACH
create table SACH(
MAS varchar(10) primary key,
TIEUDE nvarchar(50),
SOTRANG int check (SOTRANG>5),
SOLUONGBANSAO int check(SOLUONGBANSAO>1),
GIATIEN money check (GIATIEN>0),
VITRI nvarchar(50),
NGAYNHAP date,
MAPL char(10),
MATG Char(10),
MANXB char(10),
foreign key (MATG) references TACGIA(MATG),
foreign key (MAPL) references PHANLOAI(MAPL),
foreign key (MANXB) references NHAXB(MANXB)
);

IF OBJECT_ID('LOP') IS NOT NULL
DROP TABLE LOP
CREATE TABLE LOP(
MALOP CHAR(10),
TENLOP NVARCHAR(50),
PRIMARY KEY (MALOP)
);

IF OBJECT_ID('CHUYENNGANH') IS NOT NULL
DROP TABLE CHUYENNGANH
CREATE TABLE CHUYENNGANH(
MACN CHAR(10),
TENCN NVARCHAR(50),
PRIMARY KEY (MACN)
);

IF OBJECT_ID('SINHVIEN') IS NOT NULL
DROP TABLE SINHVIEN
CREATE TABLE SINHVIEN(
MASV CHAR(10),
NGAYHETHAN DATE,
MACN CHAR(10),
SĐT NVARCHAR(50),
EMAIL NVARCHAR(50),
PRIMARY KEY (MASV),
FOREIGN KEY (MACN) REFERENCES CHUYENNGANH(MACN)
);

IF OBJECT_ID('SVLOP') IS NOT NULL
DROP TABLE SVLOP
CREATE TABLE SVLOP(
MASV CHAR(10),
MALOP CHAR(10),
DIADIEM NVARCHAR(50),
PRIMARY KEY (MASV, MALOP),
FOREIGN KEY (MASV) REFERENCES SINHVIEN(MASV),
FOREIGN KEY (MALOP) REFERENCES LOP(MALOP),
);

if OBJECT_ID('PHIEUMUON') is not null
drop table phieumuon
create table phieumuon (
sophieu int identity(1,1) primary key,
masv char(10),
ngaymuon date,
ngaytra date,
foreign key (masv) references sinhvien(masv)
);

IF OBJECT_ID('CHITIET_PM') IS NOT NULL
DROP TABLE CHITIET_PM
CREATE TABLE CHITIET_PM(
SOPHIEU INT,
MAS VARCHAR(10),
GHICHU NVARCHAR(50),
PRIMARY KEY (SOPHIEU,MAS),
FOREIGN KEY (SOPHIEU) REFERENCES PHIEUMUON(SOPHIEU),
FOREIGN KEY (MAS) REFERENCES SACH(MAS),
);

SELECT * FROM NHAXB
SELECT * FROM TACGIA
SELECT * FROM PHANLOAI
SELECT * FROM SACH
SELECT * FROM LOP
SELECT * FROM CHUYENNGANH
SELECT * FROM SINHVIEN
SELECT * FROM SVLOP
SELECT * FROM PHIEUMUON
SELECT * FROM CHITIET_PM


INSERT INTO NHAXB(MANXB, TENNXB, DIACHI) VALUES 
('NXB01', N'LÊ HỒNG NHUNG', N'22 HÀNG TRỐNG'),
('NXB02', N'NGUYỄN THỊ HẠNH', N'42 TÂN THÀNH'),
('NXB03', N'VÕ TRẦN THI', N'31 LIỄU GIAI'),
('NXB04', N'NGUYỄN MINH BÁ', N'12 TÔN ĐỨC THẮNG');

INSERT INTO TACGIA(MATG, HOTENTG, NGAYSINH) VALUES 
('TG01', N'LÊ MING LỢI', '1974/01/01'),
('TG02', N'TRẦN THỊ TUYẾT', '1988/4/09'),
('TG03', N'NGUYỄN DUY ĐẠT', '1955/07/10'),
('TG04', N'QUÁ GIỎI GIANG', '1991/12/12');

INSERT INTO PHANLOAI(MAPL, TENPL) VALUES 
('PL01', N'A'),
('PL02', N'B'),
('PL03', N'C'),
('PL04', N'D');

INSERT INTO SACH(GIATIEN,MANXB,MAPL,MAS,MATG,TIEUDE,NGAYNHAP,SOLUONGBANSAO,SOTRANG, VITRI) VALUES 
(68000, 'NXB01', 'PL01', 'S01', 'TG01', N'CHIA RẼ', '2013/09/20', 7, 500, N'A1'),
(66000, 'NXB02', 'PL02', 'S02', 'TG02', N'CUỘC ĐỜI', '2009/10/12', 5, 350, N'B2'),
(75000, 'NXB03', 'PL03', 'S03', 'TG03', N'NHÌN LẠI QUÁ KHỨ', '2015/06/03', 6, 600, N'C4'),
(50000, 'NXB04', 'PL04', 'S04', 'TG04', N'QUÊ HƯƠNG', '2019/04/30', 5, 280, N'D12');

INSERT INTO LOP(MALOP, TENLOP) VALUES 
('WEB1013', N'JAVASCRIPT'),
('WEB1042', N'WEB'),
('COM2021', N'CSDL'),
('ENT1225', N'ENGLISH');

INSERT INTO CHUYENNGANH(MACN,TENCN) VALUES 
('CN01', N'TK WEB'),
('CN02', N'TK WEB'),
('CN03', N'ỨNG DỤNG PHẦN MỀM'),
('CN04', N'QUẢN TRỊ KINH DOANH');

INSERT INTO SINHVIEN(MASV, MACN, NGAYHETHAN, SĐT, EMAIL) VALUES 
('SV01', 'CN01', '2024/05/10', '0900448824', N'TRANLTPH28044@FPT.EDU.VN'),
('SV02', 'CN02', '2025/04/12', '0916004628', N'NHATNMPH26890@FPT.EDU.VN'),
('SV03', 'CN03', '2025/04/12', '0911024422', N'NGOTMPH26077@FPT.EDU.VN'),
('SV04', 'CN04', '2025/04/12', '0988204255', N'DUCLVPH27124@FPT.EDU.VN');

INSERT INTO SVLOP(MASV,MALOP,DIADIEM) VALUES 
('SV01', 'WEB1013', N'F301'),
('SV02', 'WEB1042', N'L302'),
('SV03', 'COM2021', N'P303'),
('SV04', 'ENT1225', N'F304');

INSERT INTO PHIEUMUON(masv, ngaymuon, ngaytra) VALUES 
('SV01', '2021/11/28', '2021/12/05'),
('SV02', '2022/03/13', '2022/03/20'),
('SV03', '2022/01/05', '2021/01/15'),
('SV04', '2022/03/01', '2021/03/08');

INSERT INTO CHITIET_PM(SOPHIEU, MAS, GHICHU) VALUES 
(4, 'S01', N'GIỮ NGUYÊN VẸN'),
(3, 'S02', N'MẤT PHẢI LÀM LẠI'),
(2, 'S03', N'KHÔNG LÀM MẤT'),
(1, 'S04', N'GIỮ CẨN THẬN');