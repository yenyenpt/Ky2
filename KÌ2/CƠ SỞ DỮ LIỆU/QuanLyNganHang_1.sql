CREATE DATABASE QUANLYNGANHANG
IF OBJECT_ID('CONNGUOI') IS NOT NULL
DROP TABLE CONNGUOI
CREATE TABLE CONNGUOI(
    HOTEN NVARCHAR(50),
    SODIENTHOAI INT PRIMARY KEY,
    GIOITINH NVARCHAR(10),

);
IF OBJECT_ID('THE') IS NOT NULL
DROP TABLE THE
CREATE TABLE THE(
    MATHE INT PRIMARY KEY,
    NGAYHETHAN DATETIME,
    MANGANHANG NVARCHAR(50) REFERENCES,
    MAPIN INT,
    SODU INT,
    SODIENTHOAI INT,

);
IF OBJECT_ID('NGANHANG') IS NOT NULL
DROP TABLE NGANHANG
CREATE TABLE NGANHANG(
    TENNGANHANG NVARCHAR(50),
    MANGANHANG NVARCHAR(50),
);
IF OBJECT_ID('CAYATM') IS NOT NULL
DROP TABLE CAYATM
CREATE TABLE CAYATM(
    MAATM INT,
    MANGANHANG NVARCHAR(50),
    DIACHIATM NVARCHAR(50),

);
IF OBJECT_ID('GIAO DICH') IS NOT NULL
DROP TABLE GIAODICH
CREATE TABLE GIAODICH(
    MAGIADICH INT,
    SOTIENRUT INT,
    GIO INT,
    NGAYRUT DATETIME,
    TRANGTHAI NVARCHAR(50),

);
INSERT INTO CONNGUOI(HOTEN,SODIENTHOAI,GIOITINH) VALUES
(N'NGUYỄN KHẢ CHƯƠNG','0374647306',N'NAM'),
(N'NGUYỄN KHẢ CHƯƠNG','0987654321',N'NỮ');
SELECT * FROM CONNGUOI
DELETE FROM CONNGUOI

INSERT INTO THE(MATHE,NGAYHETHAN,MAPIN,SODU,SODIENTHOAI,MANGANHANG) VALUES
('123','2023/09/23','09123','2000','0987123987',N'HỒNG'),
('231','2024/10/09','97519','3000','0823489214',N'SÁU');
SELECT * FROM THE
DELETE FROM THE

INSERT INTO NGANHANG(TENNGANHANG,MANGANHANG) VALUES
(N'NGÂN HÀNG PHÁT TRIỂN',N'HỒNG'),
(N'NGÂN HÀNG ĐẦU TƯ',N'SÁU');
SELECT * FROM NGANHANG
DELETE FROM NGANHANG


INSERT INTO CAYATM(MAATM,MANGANHANG,DIACHIATM) VALUES
('082',N'HỒNG',N'CỦ CHI'),
('907',N'SÁU',N'HÀ NỘI');
SELECT * FROM CAYATM
DELETE FROM CAYATM

INSERT INTO GIAODICH(MAGIADICH,SOTIENRUT,GIO,NGAYRUT,TRANGTHAI) VALUES
('900','120','14','2026/09/08',N'THÀNH CÔNG'),
('560','190','19','2025/10/01',N'KHÔNG THÀNH CÔNG');
SELECT * FROM GIAODICH
DELETE FROM GIAODICH