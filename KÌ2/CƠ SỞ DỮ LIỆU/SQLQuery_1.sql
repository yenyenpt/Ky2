CREATE DATABASE LAB2
IF OBJECT_ID('KHACHHANG') IS NOT NULL
DROP TABLE KHACHHANG
CREATE TABLE KHACHHANG(
    MAKHACHHANG VARCHAR(5) PRIMARY KEY,
    HOTENLOT VARCHAR(30),
    TEN VARCHAR(10),
    DIACHI VARCHAR(10),
    EMAIL VARCHAR(30),
    DIENTHOAI VARCHAR(13),
    

);
IF OBJECT_ID('SAMPHAM') IS NOT NULL
DROP TABLE SANPHAM
CREATE TABLE SANPHAM(
    MASANPHAM INT PRIMARY KEY,
    MOTA VARCHAR(255),
    SOLUONG INT,
    DONGIA INT,
    TENSANPHAM VARCHAR(50),

);
IF OBJECT_ID('HOADON') IS NOT NULL
DROP TABLE HOADON
CREATE TABLE HOADON(
    MAHOADON INT PRIMARY KEY,
    NGAYMUA DATE,
    MAKHACHHANG VARCHAR(5),
    TRANGTHAI VARCHAR(30),
    FOREIGN KEY (MAKHACHHANG) REFERENCES KHACHHANG(MAKHACHHANG)

);
IF OBJECT_ID('HOADONCHITIET') IS NOT NULL
DROP TABLE HOADONCHITIET
CREATE TABLE HOADONCHITIET(
    MAHOADON INT,
    MASANPHAM INT,
    SOLUONG INT,
    MAHOADONCHITIET INT PRIMARY KEY,
    FOREIGN KEY (MASANPHAM) REFERENCES SANPHAM(MASANPHAM),
    FOREIGN KEY (MAHOADON) REFERENCES HOADON(MAHOADON)

);
INSERT INTO KHACHHANG(MAKHACHHANG,HOTENLOT,TEN,DIACHI,EMAIL,DIENTHOAI) VALUES
('PH29','YEN','NHI','CUCHI','YENNHI@12',0834244343),
('PH28','NGOC','MAI','HANOI','NGOCMAI@13',0976198642);
SELECT * FROM KHACHHANG
DELETE FROM HOADONCHITIET

INSERT INTO SANPHAM(MASANPHAM,MOTA,SOLUONG,DONGIA,TENSANPHAM) VALUES
(21,'TOT',2,10,'MI'),
(23,'TRUNGBINH',3,16,'TRUNG');
SELECT * FROM SANPHAM

INSERT INTO HOADON(MAHOADON,NGAYMUA,MAKHACHHANG,TRANGTHAI) VALUES
(30,'2022/08/23','PH29','NHANH'),
(40,'2020/09/10','PH28','CHAM');
SELECT * FROM HOADON

INSERT INTO HOADONCHITIET(MAHOADON,MASANPHAM,SOLUONG,MAHOADONCHITIET) VALUES
(30,21,2,100),
(40,23,3,200);
SELECT * FROM HOADONCHITIET

--CÂU 2
--A.ĐƯA RA THÔNG TIN CỦA KHACH HANG CÓ TEN  QUÊ QUÁN LÀ HA NOI
SELECT * FROM KHACHHANG
WHERE
TEN LIKE N'%MAI' 
AND
DIACHI LIKE N'%HANOI'




--B.ĐƯA RA THÔNG TIN KHÁCH HÀNG LỚN HƠN 1 TUỔI
SELECT MAHOADON,YEAR(GETDATE()) - YEAR(NGAYMUA) AS 'NGAYMUA'FROM HOADON
WHERE
YEAR(GETDATE()) - YEAR(NGAYMUA) > 1



--C.ĐƯA RA TH TIN KH CÓ TỔNG THÀNH TIỀN HÓA ĐƠN HƠN 1000000
SELECT HD.MAKHACHHANG,TEN,DIACHI,EMAIL,DIENTHOAI,SP.DONGIA * HDCT.SOLUONG AS 'THANHTIEN'FROM KHACHHANG AS KH
JOIN HOADON AS HD
ON KH.MAKHACHHANG = HD.MAKHACHHANG
JOIN HOADONCHITIET AS HDCT
ON HD.MAHOADON = HDCT.MAHOADON
JOIN SANPHAM AS SP
ON HDCT.MASANPHAM = SP.MASANPHAM

WHERE
SP.DONGIA * HDCT.SOLUONG > 7


--D.CHO BT THÔNG TIN KHÁCH HÀNG CHƯA ĐẶT ĐƠN HÀNG NÀO


--E.e.    Liệt kê thông tin: Makh, Tenkh, Mahang, Tenhang, Dongia, Soluong của khách hàng có tên khách hàng là Trần Triệu Vy


--F.ĐUA RA TH TIN KH MUA HÀNG TRONG THÁNG 1/2022, SAWP XEP GIAM DAN THEO NGAY LAP HOA DON

--CÂU 3
--A.THÊM MỘT BẢN GHI MS

--B.THAY ĐỔI QUÊ QUÁN

--C.XÓA MẶT HÀNG CÓ TÊN HÀNG KEM DƯỠNG OHUI
