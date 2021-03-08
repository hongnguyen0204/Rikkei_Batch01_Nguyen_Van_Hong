create database if not exists NhaSach;
use NhaSach;
create table IF NOT EXISTS DMSach(
maDMSach int,
theloai varchar(100),
mota varchar(1000),
primary key (maDMSach) 
);

create table IF NOT EXISTS DMDoChoi(
maDMDoChoi int,
nhom varchar(255),
moTa varchar(1000),
primary key (maDMDoChoi)
);


create table IF NOT EXISTS DMDungCu(
MaDMDungCu int,
Khoi varchar(20),
mota varchar(1000),
primary key (MaDMDungCu)
);

create table IF NOT EXISTS SanPhamSach(
maSPSach int,
tenSPSach varchar(255),
soLuong int,
donGia double,
donVi varchar(20),
maDMSach int,
nhaXuatBan varchar(255),
namXuatBan int,
tacGia varchar(255),
ngayXuatBan date,
lanTaiBan int,
primary key (maSPSach),
foreign key (maSPSach) references DMSach(maDMSach)
);

create table IF NOT EXISTS SanPhamDoChoi(
maSPDoChoi int,
tenSPDoChoi varchar(255),
soLuong int,
donGia double,
donVi varchar(20),
maDMDoChoi int,
xuatXu varchar(50),
thuongHieu varchar(50),
nhaCungCap varchar(50),
huongDan varchar(1000),
primary key (maSPDoChoi),
foreign key (maDMDoChoi) references DMDoChoi(maDMDoChoi)
);

create table IF NOT EXISTS SanPhamDungCu(
maSPDungCu int,
tenSPDungCu varchar(255),
soLuong int,
donGia double,
donVi varchar(20),
maDMDungCu int,
xuatXu varchar(50),
thuongHieu varchar(50),
nhaCungCap varchar(50),
mauSac varchar(10),
kichThuoc varchar(50),
chatLieu varchar(20),
huongDan varchar(1000),
primary key (maSPDungCu),
foreign key (maDMDungCu) references DMDungCu(MaDMDungCu)
);

create table IF NOT EXISTS NhanVien(
maNhanVien int,
tenNhanVien varchar(255),
ngaySinh date,
viTri varchar(20),
soDienThoai varchar(10),
email varchar(100),
diaChi varchar(255),
primary key (maNhanVien)
);

create table IF NOT EXISTS LoaiKhachHang(
maLoai int,
tenLoai varchar(50),
primary key (maLoai)
);

create table IF NOT EXISTS KhachHang(
maKhachHang int,
tenKhachHang varchar(50),
soDienThoai varchar(10),
email varchar(100),
ngaySinh date,
maLoai int,
primary key (maKhachHang),
foreign key (maLoai) references LoaiKhachHang(maLoai)
);

create table IF NOT EXISTS DonHang(
maDonHang int,
maKhachHang int,
maNhanVien int,
ngayMuaHang date,
tongTien double,
primary key (maDonHang),
foreign key (maKhachHang) references KhachHang(maKhachHang),
foreign key (maNhanVien) references NhanVien(maNhanVien)
);

create table IF NOT EXISTS ChiTietDonHang(
maDonHang int,
maSanPham int, 
soLuong int,
foreign key (maDonHang) references DonHang(maDonHang),
CONSTRAINT fk_sach foreign key (maSanPham) references SanPhamSach(maSPSach),
CONSTRAINT fk_dochoi foreign key (maSanPham) references SanPhamDoChoi(maSPDoChoi),
CONSTRAINT fk_dungcu foreign key (maSanPham) references SanPhamDungCu(maSPDungCu)
);

/*Hien thi thong tin san pham co so luong >20 va  don gia <1000000*/ 
select * from sanphamsach where (donGia<1000000 and soLuong>20);
select * from sanphamdungcu where (donGia<1000000 and soLuong>20);
select * from sanphamdochoi where (donGia<1000000 and soLuong>20);
/*Khach hang co do tuoi > 16  va <30 dia chi DN hoac nhung khach hang co tuoi >40 va dia chi o QN*/
select * from khachhang where round(datediff(now())/365) between 16 and 40;
/*San pham mua trong nam 2020*/

















