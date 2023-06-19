CREATE DATABASE TESST2_COM2012

IF OBJECT_ID('THUOC') IS NOT NULL
DROP TABLE THUOC
CREATE TABLE THUOC(
    MATHUOC VARCHAR(50) PRIMARY KEY,
    TENTHUOC NVARCHAR(50),
    DONVITINH NVARCHAR(50),
    GIA INT,
    NHOMDIEUTRI NVARCHAR(50),
    
);


IF OBJECT_ID('HOSO') IS NOT NULL
DROP TABLE HOSO
CREATE TABLE HOSO(
   MAHS VARCHAR(50) PRIMARY KEY,
   HOTEN NVARCHAR(50),
   NGAYSINH DATE,
   GIOITINH NVARCHAR(50),
   CANCUOC INT,
   NGAYLAP DATE,
);


IF OBJECT_ID('KHAMBENH') IS NOT NULL
DROP TABLE KHAMBENH
CREATE TABLE KHAMBENH(
   MAKB VARCHAR(50) PRIMARY KEY,
   MAHS VARCHAR(50),
   NGAYKHAM DATE,
   BACSI NVARCHAR(50),
   KETLUON NVARCHAR(50),

   FOREIGN KEY (MAHS) REFERENCES HOSO(MAHS),
       
);



IF OBJECT_ID('TOATHUOC') IS NOT NULL
DROP TABLE TOATHUOC
CREATE TABLE TOATHUOC(
    MAKB VARCHAR(50),
    MATHUOC VARCHAR(50),
    SOLUONG INT,
    PRIMARY KEY(MAKB,MATHUOC),

    FOREIGN KEY (MATHUOC) REFERENCES THUOC(MATHUOC),
    FOREIGN KEY (MAKB) REFERENCES KHAMBENH(MAKB),  

);



INSERT INTO THUOC(MATHUOC,TENTHUOC,DONVITINH,GIA,NHOMDIEUTRI) VALUES
('MT24',N'EDUMON',N'ĐỒNG','500',N'TIÊU HOÁ'),
('MT25',N'NHUKSU',N'TRĂM','700',N'COVIT19'),
('MT26',N'MADOEU',N'NGHÌN','100000',N'XƯƠNG KHỚP');
SELECT * FROM THUOC
DELETE FROM THUOC


INSERT INTO HOSO(MAHS,HOTEN,NGAYSINH,GIOITINH,CANCUOC,NGAYLAP) VALUES
('024',N'NGUYỄN VĂN HUY','1975/12/09',N'NAM',12344321,'1980/09/10'),
('025',N'NGUYỄN THỊ HUYỀN','1920/03/09',N'NỮ',1082734321,'1930/02/10'),
('026',N'NGUYỄN NGỌC ANH','2002/10/09',N'NỮ',082694289,'1909/09/10');
SELECT * FROM HOSO
DELETE FROM HOSO

INSERT INTO KHAMBENH(MAKB,MAHS,NGAYKHAM,BACSI,KETLUON) VALUES
('MKB34','024','2003/12/03',N'HIỀN HOẠ',N'UNG THƯ'),
('MKB111','025','2022/01/11',N'XUÂN XUÂN',N'DẠ DÀY'),
('MKB203','026','2013/02/13',N'HIỀN NGUYỄN',N'PHỔI');
SELECT * FROM KHAMBENH
DELETE FROM KHAMBENH

INSERT INTO TOATHUOC(MAKB,MATHUOC,SOLUONG) VALUES
('MKB34','MT24',4),
('MKB111','MT25',2),
('MKB203','MT26',1);
SELECT * FROM TOATHUOC
DELETE FROM TOATHUOC


----CAU1


SELECT THUOC.MATHUOC,THUOC.TENTHUOC,SOLUONG FROM KHAMBENH
 JOIN TOATHUOC ON KHAMBENH.MAKB = TOATHUOC.MAKB
 JOIN THUOC ON THUOC.MATHUOC = TOATHUOC.MATHUOC
 JOIN HOSO ON HOSO.MAHS = KHAMBENH.MAHS
WHERE HOSO.MAHS = '024'
GROUP BY THUOC.MATHUOC,THUOC.TENTHUOC,SOLUONG

--- CAU2
SELECT KHAMBENH.MAHS,HOTEN,NGAYSINH,BACSI,KETLUON,YEAR(GETDATE()) - YEAR(NGAYSINH) TUOI FROM HOSO 
JOIN KHAMBENH ON KHAMBENH.MAHS = HOSO.MAHS
WHERE NGAYKHAM = '2022/01/11'
GROUP BY  KHAMBENH.MAHS,HOTEN,NGAYSINH,BACSI,KETLUON


-----CAU3
SELECT HOSO.MAHS,HOTEN,BACSI,KETLUON,NGAYKHAM FROM HOSO
 JOIN KHAMBENH ON  HOSO.MAHS = KHAMBENH.MAHS
 WHERE KETLUON = N'UNG THƯ'
 GROUP BY HOSO.MAHS,HOTEN,BACSI,KETLUON,NGAYKHAM

 ---CAU4
 SELECT NHOMDIEUTRI,GIA FROM THUOC
 WHERE NHOMDIEUTRI = N'TIÊU HOÁ' AND GIA >= 500 AND  GIA <= 1000
 SELECT * FROM THUOC


 ---CAU5

 SELECT NGAYKHAM,BACSI,KETLUON,NGAYSINH FROM KHAMBENH
  JOIN HOSO ON HOSO.MAHS = KHAMBENH.MAHS
  WHERE YEAR(NGAYSINH) = '1975'
  GROUP BY NGAYKHAM,BACSI,KETLUON,NGAYSINH
  

  --CAU6
SELECT NGAYKHAM,BACSI,KETLUON,HOTEN FROM KHAMBENH JOIN HOSO ON HOSO.MAHS = KHAMBENH.MAHS 
WHERE HOTEN = N'NGUYỄN VĂN HUY'
GROUP  BY NGAYKHAM,BACSI,KETLUON,HOTEN


 ----CAU7
 SELECT YEAR(GETDATE()) - YEAR(NGAYSINH) TUOI, * FROM HOSO
WHERE YEAR(GETDATE()) - YEAR(NGAYSINH) >= ALL(SELECT YEAR(GETDATE()) - YEAR(NGAYSINH) FROM HOSO )
--CAU8

SELECT YEAR(GETDATE()) - YEAR(NGAYSINH) TUOI, * FROM HOSO
WHERE YEAR(GETDATE()) - YEAR(NGAYSINH) >= '50'

--CAU9

SELECT HOTEN, BACSI, TOATHUOC.MAKB,SUM(SOLUONG* GIA) TONGTIEN FROM HOSO 
JOIN KHAMBENH  ON HOSO.MAHS = KHAMBENH.MAHS
JOIN TOATHUOC ON TOATHUOC.MAKB = KHAMBENH.MAKB
JOIN THUOC ON THUOC.MATHUOC = TOATHUOC.MATHUOC
GROUP BY HOTEN, BACSI, TOATHUOC.MAKB

---CAU10
UPDATE THUOC 
SET GIA = GIA* 0.9
WHERE NHOMDIEUTRI = N'COVIT19'
SELECT * FROM THUOC



---CAU11
DELETE  FROM  TOATHUOC
WHERE MAKB = 'MKB34' OR MAKB = 'MKB111'
SELECT * FROM TOATHUOC


---- CAU12
DELETE FROM THUOC
WHERE GIA >= 100000
SELECT * FROM THUOC