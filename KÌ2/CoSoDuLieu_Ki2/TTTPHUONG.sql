CREATE DATABASE PHUONG_QUAN_LY

IF OBJECT_ID('MATHANG') IS NOT NULL
DROP TABLE MATHANG
CREATE TABLE MATHANG(
MSMH CHAR(10),
TENHANG NVARCHAR(50),
DONGIA INT CHECK(DONGIA >= 0),
DVT NVARCHAR(50),
PRIMARY KEY (MSMH)
);

IF OBJECT_ID('KHACHHANG') IS NOT NULL
DROP TABLE KHACHHANG
CREATE TABLE KHACHHANG(
MAKH CHAR(10),
TENKH NVARCHAR(50),
DIACHI NVARCHAR(50),
PRIMARY KEY (MAKH)
);


IF OBJECT_ID('PHIEUNHAP') IS NOT NULL
DROP TABLE PHIEUNHAP
CREATE TABLE PHIEUNHAP(
SOPN INT IDENTITY(1,1) PRIMARY KEY,
NGAYLAP DATE,
MAKH CHAR(10),
KHO NVARCHAR(50),
FOREIGN KEY (MAKH) REFERENCES KHACHHANG(MAKH)
);


IF OBJECT_ID('CTNHAP') IS NOT NULL
DROP TABLE CTNHAP
CREATE TABLE CTNHAP(
SOPN INT,
MSMH CHAR(10),
SOLUONG INT CHECK(SOLUONG >= 0),
PRIMARY KEY (SOPN,MSMH),
FOREIGN KEY (SOPN) REFERENCES PHIEUNHAP(SOPN),
FOREIGN KEY (MSMH) REFERENCES MATHANG(MSMH)
);


INSERT INTO MATHANG(MSMH, TENHANG, DONGIA, DVT) VALUES
('MH01', N'DAO', 50000, 'KG'),
('MH02', N'MÁY XẤY', 70000, 'KG'),
('MH03', N'QUẦN', 500000, 'GAM');

INSERT INTO KHACHHANG(MAKH, TENKH, DIACHI) VALUES
('KH01', N'TRẦN THỊ THU PHƯƠNG', N'60 DỤC VỌNG'),
('KH02', N'NGUYỄN QUANG TRẦN', N'22 HÀNG CÓT'),
('KH03', N'TRẦN KHẢI KHÍ', N'12 NAM TRẦN');

INSERT INTO PHIEUNHAP(NGAYLAP, MAKH, KHO) VALUES
('2003/08/09', 'KH01', N'LÀO'),
('2000/12/22', 'KH02', N'VIỆT NAM'),
('2012/08/06', 'KH03', N'VIỆT NAM');

INSERT INTO CTNHAP(SOPN, MSMH, SOLUONG) VALUES
(1, 'MH01', 2),
(2, 'MH02', 1),
(3, 'MH03', 3);


--CÂU2
--1
SELECT PN.SOPN, TENKH, NGAYLAP, DONGIA * SOLUONG AS N'THANHTIEN'
FROM PHIEUNHAP AS PN
JOIN KHACHHANG AS KH ON PN.MAKH = KH.MAKH
JOIN CTNHAP AS CT ON PN.SOPN = CT.SOPN
JOIN MATHANG AS MH ON CT.MSMH = MH.MSMH
WHERE YEAR(NGAYLAP) = '2003'

--2

--3
SELECT KH.MAKH, TENKH FROM KHACHHANG AS KH
JOIN PHIEUNHAP AS PN ON KH.MAKH=PN.MAKH
JOIN CTNHAP AS CT ON PN.SOPN=CT.SOPN
JOIN MATHANG AS MH ON CT.MSMH = MH.MSMH
WHERE DONGIA * CT.SOLUONG > 80000
--4

--5
SELECT MAKH, TENKH, DIACHI FROM KHACHHANG
WHERE MAKH NOT IN (SELECT MAKH FROM PHIEUNHAP)

 --6
 SELECT KH.MAKH, TENKH, DIACHI, COUNT(CT.SOPN) AS 'TONG SO PHIEU' FROM KHACHHANG AS KH
JOIN PHIEUNHAP AS PN ON KH.MAKH=PN.MAKH
JOIN CTNHAP AS CT ON PN.SOPN=CT.SOPN
JOIN MATHANG AS MH ON CT.MSMH = MH.MSMH
GROUP BY KH.MAKH, TENKH, DIACHI
HAVING COUNT(CT.SOPN) = (SELECT TOP(1) COUNT(CT.SOPN) FROM KHACHHANG AS KH
JOIN PHIEUNHAP AS PN ON KH.MAKH=PN.MAKH
JOIN CTNHAP AS CT ON PN.SOPN=CT.SOPN
JOIN MATHANG AS MH ON CT.MSMH = MH.MSMH
GROUP BY PN.MAKH, TENKH 
ORDER BY COUNT(CT.SOPN) DESC)