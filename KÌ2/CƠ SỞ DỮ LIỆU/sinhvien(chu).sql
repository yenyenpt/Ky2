CREATE DATABASE MAXSINHVIEN

IF OBJECT_ID('SINHVIEN') IS NOT NULL
DROP TABLE SINHVIEN
CREATE TABLE SINHVIEN(
NAME NVARCHAR(50),
ADDRESS NVARCHAR(50),
PHONE VARCHAR(10),
MASV INT PRIMARY KEY,
);
DROP TABLE SINHVIEN


IF OBJECT_ID('TENMON') IS NOT NULL
DROP TABLE TENMON
CREATE TABLE  TENMON(
MAMON VARCHAR(50) ,
MASV INT REFERENCES SINHVIEN(MASV),
TENMON NVARCHAR(50),
DIEM INT,
PRIMARY KEY(MAMON, MASV)
);
DROP TABLE TENMON

INSERT INTO SINHVIEN()

INSERT INTO SINHVIEN(NAME,ADDRESS,PHONE,MASV) VALUES
(N'NGUYỄN HỒNG LAM',N'CỦ CHI','0976123764','1'),
(N'LÊ TRÚC PHƯỢNG',N'TPHCM','0976190264','2'),
(N'NGUYỄN THỊ MỸ NGỌC',N'HIỆP HOÀ','0976123012','3');
SELECT * FROM SINHVIEN
DELETE FROM SINHVIEN

delete from tenMon
INSERT INTO TENMON(MAMON,DIEM,TENMON,MASV)VALUES
('VAN','9',N'VĂN','1'),
('TOAN','10',N'TOÁN','1'),
('ANH','8',N'ANH','1'),
('TOAN','8',N'TOÁN','2'),
('VAN','8',N'VĂN','2'),
('ANH','8',N'ANH','2'),
('ANH','8',N'ANH','3'),
('TOAN','7',N'TOÁN','3'),
('VAN','9',N'VĂN','3');
SELECT * FROM TENMON

SELECT SINHVIEN.MASV, NAME, AVG(DIEM) DIEMTB FROM TENMON 
JOIN SINHVIEN ON TENMON.MASV=SINHVIEN.MASV
GROUP BY SINNHVIEN.MASV, NAME

SELECT SINHVIEN.MASV, NAME, AVG(DIEM) DIEMTB FROM TENMON 
JOIN SINHVIEN ON TENMON.MASV=SINHVIEN.MASV
GROUP BY SINHVIEN.MASV, NAME
HAVING AVG(DIEM) >= ALL( SELECT AVG(DIEM) FROM TENMON GROUP BY MASV)
