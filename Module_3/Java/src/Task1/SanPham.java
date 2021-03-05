package Task1;

public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected int soLuong;
    protected double donGia;
    protected String thuocDanhMuc;

    public SanPham(){

    }
    @Override
    public String toString() {
        return "abtractSanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", thuocDanhMuc='" + thuocDanhMuc + '\'' +
                '}';
    }

    public SanPham(String maSP, String tenSP, int soLuong, double donGia, String thuocDanhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thuocDanhMuc = thuocDanhMuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getThuocDanhMuc() {
        return thuocDanhMuc;
    }

    public void setThuocDanhMuc(String thuocDanhMuc) {
        this.thuocDanhMuc = thuocDanhMuc;
    }

    public abstract void HienThiThongTin();
    public abstract SanPham Them();
    public abstract double PhanTramGiamGia(String loaiKhachHang);
}
