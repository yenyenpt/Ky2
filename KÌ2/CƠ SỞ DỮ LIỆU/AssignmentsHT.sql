CREATE DATABASE AssignmentHT;



IF OBJECT_ID('LoaiSach') IS NOT NULL
DROP TABLE LoaiSach
CREATE TABLE LoaiSach(
    MaLoai NVARCHAR(10) PRIMARY KEY NOT NULL ,
    TenLoai NVARCHAR(50)

 
);

IF OBJECT_ID('PHIEUMUON') IS NOT NULL
DROP TABLE PHIEUMUON
CREATE TABLE PHIEUMUON(
    MaPhieuMuon NVARCHAR(10) PRIMARY KEY NOT NULL,
    NgayMuon DATE,
    NgayTra DATE,
    MaSinhVien NVARCHAR(10),
    TrangThai NVARCHAR(50),
    CONSTRAINT FK_SinhVien_PhieuMuon FOREIGN KEY(MaSinhVien) REFERENCES SinhVien(MaSinhVien)
);


IF OBJECT_ID('SINHVIEN') IS NOT NULL
DROP TABLE SINHVIEN
CREATE TABLE SinhVien(
    MaSinhVien NVARCHAR(10) PRIMARY KEY NOT NULL,
    TenSinhVien NVARCHAR(50),
    NgayHetHan DATE,
    ChuyenNganh NVARCHAR(50),
    Email NVARCHAR(50),
    SoDienThoai NVARCHAR(13)
);

IF OBJECT_ID('TACGIA') IS NOT NULL
DROP TABLE TACGIA
CREATE TABLE TACGIA(
    MaTacGia NVARCHAR(50) PRIMARY KEY,
    TENTG NVARCHAR(50),
    MaLoai NVARCHAR(10),

 
);



IF OBJECT_ID('ChiTiet_PhieuMuon') IS NOT NULL
DROP TABLE ChiTiet_PhieuMuon
CREATE TABLE ChiTiet_PhieuMuon(
    ID INT PRIMARY KEY NOT NULL,
    MaPhieuMuon NVARCHAR(10) NOT NULL,
    MaSach NVARCHAR(10) NOT NULL,
    GhiChu NVARCHAR(255),
    CONSTRAINT FK_Sach_ChiTiet_PhieuMuon FOREIGN KEY(MaSach) REFERENCES Sach(MaSach),
    CONSTRAINT FK_PhieuMuon_ChiTiet_PhieuMuon FOREIGN KEY(MaPhieuMuon) REFERENCES PhieuMuon(MaPhieuMuon)
);



IF OBJECT_ID('SACH') IS NOT NULL
DROP TABLE SACH
CREATE TABLE Sach(
    MaSach NVARCHAR(10) PRIMARY KEY NOT NULL,
    TenSach NVARCHAR(50),
    NhaXuatBan NVARCHAR(50),
    MaTacGia NVARCHAR(50),
    SoLuongBanSao INT,
    GiaTien Float,
    NgayNhapKho DATE,
    ViTri NVARCHAR(50),
    MaLoai NVARCHAR(10),
    SoTrang INT,
    CONSTRAINT FK_LoaiSach_Sach FOREIGN KEY(MaLoai) REFERENCES LoaiSach(MaLoai),
    FOREIGN KEY(MaTacGia) REFERENCES TACGIA(MaTacGia)
  
);

INSERT INTO TACGIA(MaTacGia,TENTG,MaLoai) VALUES
( N'Le Duan',N'DUẬN','KT'),
( N'Le Duan',N'DƯƠNG','KT'),
( N'Le Duan',N'KIÊN','KT'),
( N'Le Duan',N'DUẬN','IT');

INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00001', 'Nguyen Huu Toan', '2022/12/12', 'UDPM', 'toan@fpt.edu.vn','0909090909');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00002', 'Nguyen Huu Thang', '2022/12/12', 'Mobile', 'thang@fpt.edu.vn', '0909090908');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00003', 'Nguyen Trong Son', '2022/12/12', 'Do hoa', 'son@fpt.edu.vn', '0909090907');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00004', 'Nguyen Thanh Hau', '2022/12/12', 'Kinh te', 'hau@fpt.edu.vn', '0909090906');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00005', 'Nguyen Cao Cuong', '2022/12/12', 'Mobile', 'cuong@fpt.edu.vn', '0903020906');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00006', 'Chau Quang Tam', '2022/12/12', 'Do hoa', 'tam@fpt.edu.vn', '0909090904');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00007', 'Tran Van Quang', '2022/12/12', 'UDPM', 'quang@fpt.edu.vn', '0909090903');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00008', 'Doan Van Thanh', '2022/12/12', 'Marketing', 'thanh@fpt.edu.vn', '0923090903');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00009', 'Trinh Van Hieu', '2022/12/12', 'Web', 'hieu@fpt.edu.vn', '0909090901');
INSERT INTO SinhVien(MaSinhVien, TenSinhVien, NgayHetHan, ChuyenNganh, Email, SoDienThoai) VALUES('PD00010', 'Pham Thanh Trung', '2022/12/12', 'Web', 'trung@fpt.edu.vn', '0909090900');
SELECT * FROM SinhVien
DELETE FROM SinhVien

INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM02', '2021/03/25', '2021/04/02', 'PD00002', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM03', '2010/04/20', '2010/04/07', 'PD00003', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM04', '2021/04/25', '2021/05/02', 'PD00004', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM05', '2009/01/19', '2009/01/26', 'PD00005', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM06', '2017/01/16', '2021/01/23', 'PD00006', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM07', '2021/02/10', '2021/02/17', 'PD00007', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM08', '2010/02/22', '2010/03/01', 'PD00008', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM09', '2021/03/16', '2021/03/23', 'PD00009', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM10', '2017/01/01', '2017/01/07', 'PD00010', 'Chua tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM11', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM12', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM13', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM14', '2017/01/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM15', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM16', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM17', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM18', '2017/01/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM19', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM20', '2009/04/16', '2009/04/23', 'PD00001', 'Da tra');
INSERT INTO PhieuMuon(MaPhieuMuon, NgayMuon, NgayTra, MaSinhVien, TrangThai) VALUES('PM01', '2021/04/16', '2021/04/23', 'PD00001', 'Da tra');

SELECT * FROM PHIEUMUON

INSERT INTO LoaiSach(MaLoai, TenLoai) VALUES('DH', 'Do Hoa');
INSERT INTO LoaiSach(MaLoai, TenLoai) VALUES('EN', 'Tieng Anh');
INSERT INTO LoaiSach(MaLoai, TenLoai) VALUES('IT', 'Cong Nghe Thong Tin');
INSERT INTO LoaiSach(MaLoai, TenLoai) VALUES('KS', 'Khach San');
INSERT INTO LoaiSach(MaLoai, TenLoai) VALUES('KT', 'Kinh Te');
SELECT * FROM LoaiSach

INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('ACC1013', 'Nguyen ly ke toan', 'Nha xuat ban FPT', N'Le Duan', 100, 120000, '2020/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('ACC2043', 'Ke toan quan tri', 'Nha xuat ban FPT', N'Le Duan', 100, 120000, '2020/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('BUS2042', 'Quan tri ban hang', 'Nha xuat ban FPT', N'Le Duan', 100, 120000, '2014/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM1012', 'Tin hoc co so', 'Nha xuat ban FPT', N'Le Duan', 105, 120000, '2020/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM1022', 'Tin hoc van phong', 'Nha xuat ban FPT', N'Le Duan', 150, 150000, '2020/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM2012', 'Co so du lieu - SQL', 'Nha xuat ban FPT', N'Le Duan', 105, 120000, '2014/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('HOS1011', 'Nghiep vu le tan', 'FPT', N'Le Hong Phong', 35, 100000, '2015/12/12', 1, 'KS', 300);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan,MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('MOB1013', 'Lap trinh Android', 'Nha xuat ban FPT', N'Le Duan', 70, 120000, '2015/12/12', 1, 'IT', 200);
SELECT * FROM Sach


INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(1, 'PM01', 'ACC1013',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(2, 'PM01', 'ACC2043',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(3, 'PM02', 'BUS2042',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(4, 'PM02', 'COM1012',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(5, 'PM03', 'COM2012',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(6, 'PM04', 'HOS1011',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(7, 'PM04', 'MOB1013',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(8, 'PM05', 'MOB1013',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(9, 'PM05', 'ACC1013',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(10, 'PM06', 'ACC2043',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(11, 'PM06', 'ACC2043',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(12, 'PM07', 'BUS2042',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(13, 'PM08', 'BUS2042',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(14, 'PM09', 'HOS1011',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(15, 'PM09', 'HOS1011',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(16, 'PM10', 'COM2012',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(17, 'PM10', 'COM2012',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(18, 'PM03', 'MOB1013',NULL);
INSERT INTO ChiTiet_PhieuMuon(ID, MaPhieuMuon, MaSach, GhiChu) VALUES(19, 'PM08', 'ACC1013',NULL);
SELECT * FROM ChiTiet_PhieuMuon

INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('ACC1013', 'Nguyen ly ke toan', 'Nha xuat ban FPT', 'Le Duan', 100, 120000, '2020/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('ACC2043', 'Ke toan quan tri', 'Nha xuat ban FPT', 'Le Duan', 100, 120000, '2020/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('BUS2042', 'Quan tri ban hang', 'Nha xuat ban FPT', 'Le Duan', 100, 120000, '2014/12/12', 1, 'KT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM1012', 'Tin hoc co so', 'Nha xuat ban FPT', 'Le Duan', 105, 120000, '2020/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM1022', 'Tin hoc van phong', 'Nha xuat ban FPT', 'Le Duan', 150, 150000, '2020/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('COM2012', 'Co so du lieu - SQL', 'Nha xuat ban FPT', 'Le Duan', 105, 120000, '2014/12/12', 1, 'IT', 200);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('HOS1011', 'Nghiep vu le tan', 'FPT', 'Le Hong Phong', 35, 100000, '2015/12/12', 1, 'KS', 300);
INSERT INTO Sach(MaSach, TenSach, NhaXuatBan, MaTacGia, SoLuongBanSao, GiaTien, NgayNhapKho, ViTri, MaLoai, SoTrang) VALUES ('MOB1013', 'Lap trinh Android', 'Nha xuat ban FPT', 'Le Duan', 70, 120000, '2015/12/12', 1, 'IT', 200);
 SELECT * FROM Sach

-- 6.1 Liệt kê tất cả thông tin của các đầu sách gồm tên sách, mã sách, giá tiền , tác giả
-- thuộc loại sách có mã “IT”.
SELECT TenSach, MaSach, GiaTien, MaTacGia FROM Sach WHERE MaLoai = 'IT';
SELECT * FROM SACH

-- 6.2 Liệt kê các phiếu mượn gồm các thông tin mã phiếu mượn, mã sách , ngày mượn, mã
-- sinh viên có ngày mượn trong tháng 01/2017.
SELECT PhieuMuon.MaPhieuMuon, ChiTiet_PhieuMuon.MaSach, PhieuMuon.NgayMuon, PhieuMuon.MaSinhVien
FROM PhieuMuon INNER JOIN ChiTiet_PhieuMuon ON PhieuMuon.MaPhieuMuon = ChiTiet_PhieuMuon.MaPhieuMuon 
INNER JOIN Sach ON Sach.MaSach = ChiTiet_PhieuMuon.MaSach
WHERE NgayMuon Like '2017-01%';

-- 6.3 Liệt kê các phiếu mượn chưa trả sách cho thư viên theo thứ tự tăng dần của ngày
-- mượn sách.
SELECT * FROM PhieuMuon 
WHERE TrangThai = 'Chua tra'
ORDER BY NgayMuon ASC;

-- 6.4 Liệt kê tổng số đầu sách của mỗi loại sách ( gồm mã loại sách, tên loại sách, tổng số
-- lượng sách mỗi loại).
SELECT Sach.MaLoai, LoaiSach.TenLoai, COUNT(LoaiSach.MaLoai) AS 'So luong'
FROM Sach 
INNER JOIN LoaiSach ON Sach.MaLoai = LoaiSach.MaLoai
GROUP BY Sach.MaLoai, LoaiSach.TenLoai;

-- 6.5 Đếm xem có bao nhiêu lượt sinh viên đã mượn sách.
SELECT MaSinhVien, COUNT(MaSinhVien) AS 'So Luot Muon'
FROM PhieuMuon
GROUP BY MaSinhVien;

-- 6.6 Hiển thị tất cả các quyển sách có tiêu đề chứa từ khoá “SQL”.
SELECT * FROM Sach WHERE TenSach LIKE '%SQL%';

-- 6.7 Hiển thị thông tin mượn sách gồm các thông tin: mã sinh viên, tên sinh viên, mã
-- phiếu mượn, tiêu đề sách, ngày mượn, ngày trả. Sắp xếp thứ tự theo ngày mượn sách.
SELECT SinhVien.MaSinhVien, SinhVien.TenSinhVien, PhieuMuon.MaPhieuMuon, Sach.TenSach, PhieuMuon.NgayMuon, PhieuMuon.NgayTra
FROM SinhVien 
INNER JOIN PhieuMuon ON SinhVien.MaSinhVien = PhieuMuon.MaSinhVien
INNER JOIN ChiTiet_PhieuMuon ON PhieuMuon.MaPhieuMuon = ChiTiet_PhieuMuon.MaPhieuMuon
INNER JOIN Sach ON ChiTiet_PhieuMuon.MaSach = Sach.MaSach
ORDER BY NgayMuon;

-- 6.8 Liệt kê các đầu sách có lượt mượn lớn hơn 20 lần.
SELECT Sach.MaSach, Count(ChiTiet_PhieuMuon.MaSach) AS 'Luot muon'
FROM Sach
INNER JOIN ChiTiet_PhieuMuon ON ChiTiet_PhieuMuon.MaSach = Sach.MaSach
GROUP BY Sach.MaSach
HAVING COUNT(ChiTiet_PhieuMuon.MaSach) > 20;

-- 6.9 Viết câu lệnh cập nhật lại giá tiền của các quyển sách có ngày nhập kho trước năm
-- 2014 giảm 30%.
UPDATE Sach 
SET GiaTien = GiaTien - GiaTien*0.3
WHERE YEAR(NgayNhapKho) <= 2014
SELECT*FROM Sach;

-- 6.10 Viết câu lệnh cập nhật lại trạng thái đã trả sách cho phiếu mượn của sinh viên có mã
-- sinh viên PD12301 (ví dụ).
UPDATE PhieuMuon 
SET TrangThai = 'Da tra'
WHERE MaSinhVien = 'PD00006';
SELECT*FROM PhieuMuon;

-- 6.11 Lập danh sách các phiếu mượn quá hạn chưa trả gồm các thông tin: mã phiếu mượn,
-- tên sinh viên, email, danh sách các sách đã mượn, ngày mượn.
SELECT PhieuMuon.MaPhieuMuon, SinhVien.Email, PhieuMuon.NgayMuon, PhieuMuon.NgayTra, PhieuMuon.TrangThai, DATEDIFF(DAY, PhieuMuon.NgayTra, GETDATE()) AS 'So ngay vuot'
FROM PhieuMuon
INNER JOIN SinhVien ON SinhVien.MaSinhVien = PhieuMuon.MaSinhVien
WHERE TrangThai LIKE 'Chua tra'
AND DATEDIFF(DAY, PhieuMuon.NgayMuon, GETDATE()) >= 0;

-- 6.12 Viết câu lệnh cập nhật lại số lượng bản sao tăng lên 5 đơn vị đối với các đầu sách có
-- lượt mượn lớn hơn 10
UPDATE Sach 
SET SoLuongBanSao = SoLuongBanSao + 5
WHERE MaSach 
IN (SELECT Sach.MaSach FROM Sach
INNER JOIN ChiTiet_PhieuMuon ON ChiTiet_PhieuMuon.MaSach = Sach.MaSach
GROUP BY Sach.MaSach 
HAVING COUNT(ChiTiet_PhieuMuon.MaSach) > 10);

SELECT*FROM Sach;

-- 6.13 Viết câu lệnh xoá các phiếu mượn có ngày mượn và ngày trả trước „1/1/2010‟
DELETE FROM ChiTiet_PhieuMuon
WHERE MaPhieuMuon IN (SELECT MaPhieuMuon FROM PhieuMuon WHERE NgayMuon < '2010/01/01');

SELECT * FROM ChiTiet_PhieuMuon;

DELETE FROM PhieuMuon
WHERE MaPhieuMuon IN(SELECT MaPhieuMuon FROM PhieuMuon WHERE NgayMuon <'2010/01/01');
SELECT * FROM PhieuMuon;








