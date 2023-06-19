CREATE DATABASE QUANLYNHANVIEN

IF OBJECT_ID('VANPHONG') IS NOT NULL
DROP TABLE VANPHONG
CREATE TABLE VANPHONG(
    MAVP VARCHAR(50) PRIMARY KEY,
    TENVP NVARCHAR(50),
);

IF OBJECT_ID('NHANVIEN') IS NOT NULL
DROP TABLE NHANVIEN
CREATE TABLE NHANVIEN(
    MANV VARCHAR(50) ,
    HOTENNV NVARCHAR(50),
    NGAYSINH DATE,
    GIOITINH NVARCHAR(50),
    MAVP VARCHAR(50),
    EMAIL VARCHAR(50),
    SDT VARCHAR(50),
    PRIMARY KEY (MANV),
    FOREIGN KEY(MAVP) REFERENCES VANPHONG(MAVP),
);

IF OBJECT_ID('THANNHAN') IS NOT NULL
DROP TABLE THANNHAN
CREATE TABLE THANNHAN(
    MATN VARCHAR(50),
    HOTENTN NVARCHAR(50),
    NGAYSINHTN DATE,
    MOLLH NVARCHAR(50),
    MANV VARCHAR(50),

PRIMARY KEY(MATN,MANV),
FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV),
);

INSERT INTO VANPHONG(MAVP,TENVP) VALUES
('HC',N'HÀNH CHÍNH'),
('CTSV',N'CỘNG TÁC SINH VIÊN');
SELECT * FROM VANPHONG

--CAU6
INSERT INTO VANPHONG(MAVP,TENVP) VALUES
('TC',N'TAI CHÍNH');
SELECT * FROM VANPHONG

INSERT INTO NHANVIEN(MANV,HOTENNV,NGAYSINH,GIOITINH,MAVP,EMAIL,SDT) VALUES
('NV1',N'NGUYỄN ANH TUẤN','1989/11/12',N'NAM','HC','TUANA5@FPT.EDU.VN','0988554303'),
('NV2',N'TRẦN THANH TÙNG','1988/01/02',N'NAM','CTSV','TUNGTT2@FPT.EDU.VN','0987792457'),
('NV3',N'PHẠM THỊ YẾN','2003/08/08',N'NỮ','CTSV','YENPTPH@FPT.EDU.VN','0976198642');
SELECT * FROM NHANVIEN
DELETE FROM NHANVIEN

INSERT INTO THANNHAN(MATN,HOTENTN,NGAYSINHTN,MOLLH,MANV) VALUES
('TN01',N'NGUYỄN NGỌC ANH','1969/12/07',N'VỢ',N'NV2'),
('TN02',N'TRẦN TUẤN TÚ','1970/06/06',N'CHỒNG',N'NV2');
SELECT * FROM THANNHAN
DELETE FROM THANNHAN
--CAU2
SELECT MANV,HOTENNV,VANPHONG.MAVP FROM NHANVIEN JOIN VANPHONG ON NHANVIEN.MAVP = VANPHONG.MAVP
WHERE MONTH(NGAYSINH) ='08'
GROUP BY MANV,HOTENNV,VANPHONG.MAVP 

--CAU3


SELECT MANV,HOTENNV,VANPHONG.MAVP,YEAR(GETDATE()) - YEAR(NGAYSINH) TUOI FROM NHANVIEN 
JOIN VANPHONG ON NHANVIEN.MAVP = VANPHONG.MAVP
WHERE YEAR(GETDATE()) - YEAR(NGAYSINH) > '19'
GROUP BY MANV,HOTENNV,VANPHONG.MAVP,YEAR(GETDATE()) - YEAR(NGAYSINH)

--CAU4
SELECT MANV,NHANVIEN.HOTENNV,TENVP,NGAYSINH,GIOITINH,EMAIL,SDT FROM VANPHONG 
JOIN NHANVIEN ON VANPHONG.MAVP = NHANVIEN.MAVP
WHERE HOTENNV = N'TRẦN THANH TÙNG'
GROUP BY MANV,HOTENNV,TENVP,NGAYSINH,GIOITINH,EMAIL,SDT


---CAU7
UPDATE NHANVIEN
SET SDT = '0987792444'
WHERE MANV = 'NV2'
SELECT * FROM NHANVIEN

---CAU8




