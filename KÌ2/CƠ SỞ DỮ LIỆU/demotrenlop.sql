DROP TABLE khoa1;
DROP TABLE sinhvien1;
--because it is referenced by a FOREIGN KEY constraint. 
--phải xóa referent tới trc
drop database baitap
--Sửa table, add là thêm vào bảng
ALTER TABLE monhoc1
ADD Sophong int;
--sửa table, drop column là xóa cột trong bảng
ALTER TABLE monhoc1
DROP COLUMN Sophong;
--sửa table,sửa cột, sửa kiểu dữ liệu của cột
ALTER TABLE monhoc1
ALTER COLUMN SOTIET int;

--sửa add thêm check
ALTER TABLE monhoc1
ADD check(SOTIET >30)
--add primary key
ALTER TABLE monhoc1
ADD MAMH int references sinhvien1(MASV)
--Thêm dữ liệu vào bảng
INSERT INTO monhoc1 (MAMH, TENMH, SOTIET)
VALUES ('1', 'C', 31);
select * from monhoc1
--String or binary data would be truncated in table 'baitap.dbo.monhoc1', column 'MAMH'. Truncated value: 'c'.
-- lỗi quá 4 kí tự
-- Violation of  primary key constraint: lỗi trùng key, insert key khác đi

