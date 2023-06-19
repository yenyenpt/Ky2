 CREATE DATABASE ONG_CHU

IF OBJECT_ID('KHACHHANG') is not null
DROP TABLE KHACHHANG
CREATE TABLE KHACHHANG(
MAKH CHAR(10) PRIMARY KEY,
HOTENLOT NVARCHAR(20),
TEN NVARCHAR(10),
DIACHI NVARCHAR(50),
EMAIL CHAR(50),
SDT CHAR(13)
);



IF OBJECT_ID('SP') IS NOT NULL
DROP TABLE SP
CREATE TABLE SP(
MASP INT identity(1,1) PRIMARY KEY,
MOTA CHAR(225),
SOLUONG INT CHECK(SOLUONG>=0),
DONGIA MONEY CHECK(DONGIA >=0),
TENSP NVARCHAR(50)
);

IF OBJECT_ID('HOADON') IS NOT NULL
DROP TABLE HOADON
CREATE TABLE HOADON(
MAHOADON INT PRIMARY KEY,
NGAYMUAHANG DATE,
MAKH CHAR(10) FOREIGN KEY (MAKH) REFERENCES KHACHHANG(MAKH),
TRANGTHAI NVARCHAR(30)
);
IF OBJECT_ID('HOADONCHITIET') IS NOT NULL
DROP TABLE HOADONCHITIET
CREATE TABLE HOADONCHITIET(
MAHOADON INT FOREIGN KEY (MAHOADON) REFERENCES HOADON(MAHOADON),
MASP INT FOREIGN KEY (MASP) REFERENCES SP(MASP),
SOLUONGMUA INT,
MAHOADONCHITIET INT IDENTITY(1,1) PRIMARY KEY
);

SELECT *FROM KHACHHANG
SELECT *FROM SP
SELECT *FROM HOADON
SELECT *FROM HOADONCHITIET

INSERT INTO KHACHHANG(MAKH, HOTENLOT, TEN, DIACHI, EMAIL, SDT) VALUES
('KH01', N'NGUYEN KHA CHUONG',N'CHUONG', 'THON1', 'chuongnk@vietdevelopers.com', '0628293748'),
('KH02', N'LE HONG CUC ',N'CUC', 'THON2', 'cuchl@vietdevelopers.com', '0236749816'),
('KH03', N'PHAM THI YEN',N'YEN', 'THON3', 'yenpt@vietdevelopers.com', '0362783619'),
('KH04', N'TRAN THI THU PHUONG',N'PHUONG', 'THON4', 'phuongttt@vietdevelopers.com', '0969691630');
DELETE FROM KHACHHANG


INSERT INTO SP( MOTA, SOLUONG,DONGIA, TENSP) VALUES
('NGOT',2, 1100, 'DUONG'),
('DANG',4, 2200, 'MUOP DANG'),
('CAY',6, 3300, 'OT'),
('CHUA',8, 4400, 'CHANH');

DELETE FROM SP
INSERT INTO HOADON(MAHOADON, NGAYMUAHANG, MAKH, TRANGTHAI) VALUES
(2, '2020/11/20', 'KH01','NGOT'),
(4, '2021/08/09', 'KH02','DANG'),
(6, '2022/01/10', 'KH03','CAY'),
(8, '2023/08/31', 'KH04','CHUA');
DELETE FROM HOADON
INSERT INTO HOADONCHITIET(MAHOADON, MASP, SOLUONGMUA) VALUES
(2,1002,3),
(4,1004,4),
(6,1003,5),
(8,1005,6);
DELETE FROM HOADONCHITIET

/* 1.Hiển thị tất cả thông tin có trong bảng khách hàng bao gồm tất cả các cột */
SELECT * FROM KHACHHANG

/* 2.Hiển thị 10 khách hàng đầu tiên trong bảng khách hàng bao gồm các cột: mã khách hàng, họ và tên, email, số điện thoại */

SELECT TOP 2 MAKH, HOTENLOT, EMAIL, SDT 
FROM KHACHHANG

/* 3.Hiển thị thông tin từ bảng Sản phẩm gồm các cột: mã sản phẩm, tên sản phẩm, tổng tiền tồn kho.
Với tổng tiền tồn kho = đơn giá* số lượng */

SELECT MASP, TENSP, DONGIA* SOLUONG 
AS 'TONG_TIEN' 
FROM SP

/* 4.Hiển thị danh sách khách hàng có tên bắt đầu bởi kí tự ‘H’ gồm các cột: maKhachHang, hoVaTen, diaChi. 
Trong đó cột hoVaTen ghép từ 2 cột hoVaTenLot và Ten */

SELECT MAKH, HOTENLOT, DIACHI 
FROM KHACHHANG
WHERE TEN LIKE N'P%'

/* 5.Hiển thị tất cả thông tin các cột của khách hàng có địa chỉ chứa chuỗi ‘Đà Nẵng’ */
SELECT *
FROM KHACHHANG
WHERE DIACHI LIKE N'%THON1%'
/* 6.Hiển thị các sản phẩm có số lượng nằm trong khoảng từ 100 đến 500 */
SELECT * 
FROM SP
WHERE SOLUONG BETWEEN 1 AND 10
/* 7.Hiển thị danh sách các hoá hơn có trạng thái là chưa thanh toán và ngày mua hàng 
trong năm 2016*/
SELECT *
FROM HOADON
WHERE TRANGTHAI LIKE N'NGOT'
AND YEAR(NGAYMUAHANG) = '2020'

/* 8.Hiển thị các hoá đơn có mã Khách hàng thuộc 1 trong 3 mã sau: KH001, KH003, 
KH006*/
SELECT * FROM HOADON
WHERE MAKH = 'KH03' OR MAKH = 'KH02' OR MAKH = 'KH01'


/*a. Hiển thị số lượng khách hàng có trong bảng khách hàng */
SELECT COUNT(*) FROM KHACHHANG 
/*b. Hiển thị đơn giá lớn nhất trong bảng SanPham */
SELECT MAX(DONGIA) FROM SP
/*c. Hiển thị số lượng sản phẩm thấp nhất trong bảng sản phẩm */
SELECT MIN(SOLUONG) FROM SP
/*d. Hiển thị tổng tất cả số lượng sản phẩm có trong bảng sản phẩm */
SELECT SUM(SOLUONG) FROM SP
/*e. Hiển thị số hoá đơn đã xuất trong tháng 12/2016 mà có trạng thái chưa thanh toán */
SELECT* FROM HOADON
/*f. Hiển thị mã hoá đơn và số loại sản phẩm được mua trong từng hoá đơn */
/*g. Hiển thị mã hoá đơn và số loại sản phẩm được mua trong từng hoá đơn. Yêu cầu
chỉ hiển thị hàng nào có số loại sản phẩm được mua >=5. */
/*h. Hiển thị thông tin bảng HoaDon gồm các cột maHoaDon, ngayMuaHang, maKhachHang.
 Sắp xếp theo thứ tự giảm dần của ngayMuaHang */

 
/*LAB6*/
 --a. Hiển thị tất cả thông tin có trong 2 bảng Hoá đơn và Hoá đơn chi tiết gồm các cột sau:maHoaDon, maKhachHang, trangThai, maSanPham, soLuong, ngayMua
SELECT a.MAHOADON, MAKH, TRANGTHAI,MASP, SOLUONGMUA, NGAYMUAHANG 
FROM HOADON a
INNER JOIN HOADONCHITIET b
ON a.MAHOADON = b.MAHOADON

--b.
SELECT HD.MAHOADON, MAKH, TRANGTHAI,MASP, SOLUONGMUA, NGAYMUAHANG 
FROM HOADON HD
INNER JOIN HOADONCHITIET HDCT
ON HD.MAHOADON = HDCT.MAHOADON
WHERE MAKH = 'KH01'
/*C.Hiển thị thông tin từ 3 bảng Hoá đơn, Hoá đơn chi tiết và Sản phẩm gồm các cột sau: 
maHoaDon, ngayMua, tenSP, donGia, soLuong mua trong hoá đơn, thành tiền. 
Với thành tiền= donGia* soLuong*/
SELECT HD.MAHOADON, NGAYMUAHANG, TENSP, DONGIA, SOLUONG,
SOLUONG * DONGIA AS 'THANH TIEN'
FROM HOADON HD
INNER JOIN HOADONCHITIET HDCT
ON HD.MAHOADON = HDCT.MAHOADON
INNER JOIN SP SP
ON HDCT.MASP = SP.MASP
/*d. Hiển thị thông tin từ bảng khách hàng, bảng hoá đơn, hoá đơn chi tiết gồm các cột: 
họ và tên khách hàng, email, điện thoại, mã hoá đơn, trạng thái hoá đơn và tổng tiền đã mua trong hoá đơn. Chỉ hiển thị thông tincáchoá đơn chưa thanh toán.*/
SELECT HOTENLOT, EMAIL, SDT,HD.MAHOADON, TRANGTHAI, HDCT.SOLUONGMUA * DONGIA AS 'TONGTIEN'
FROM KHACHHANG KH
INNER JOIN HOADON HD
ON KH.MAKH = HD.MAKH
INNER JOIN HOADONCHITIET HDCT
ON HD.MAHOADON = HDCT.MAHOADON
INNER JOIN SP SP
ON SP.MASP = HDCT.MASP
WHERE TRANGTHAI LIKE N'CHUA'
/*e. Hiển thị maHoaDon, ngàyMuahang, tổng số tiền đã mua trong từng hoá đơn.
Chỉ hiển thị những hóa đơn có tổng số tiền >=500.000 
và sắp xếp theo thứ tự giảm dần của cột tổng tiền.*/
SELECT HD.MAHOADON, NGAYMUAHANG, SUM(SOLUONG *DONGIA)AS 'TONGTIEN'  
FROM HOADON HD
INNER JOIN HOADONCHITIET HDCT
ON HD.MAHOADON = HDCT.MAHOADON
INNER JOIN SP SP
ON SP.MASP = HDCT.MASP
GROUP BY HD.MAHOADON, NGAYMUAHANG
HAVING SUM(SOLUONG *DONGIA) >= 3000.00
ORDER BY TONGTIEN DESC
--BÀI 2:
/*a. Hiển thị danh sách các khách hàng chưa mua hàng lần nào kể từ tháng 1/1/2016.*/
SELECT * FROM KHACHHANG
WHERE MAKH NOT IN (SELECT MAKH FROM HOADON WHERE NGAYMUAHANG >='2025/12/01')

