package Task2;

import Task4.KiemTra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DonHang {

    private String maHoaDon;
    private String maKhachHang;
    private String maSanPham;
    private int soLuong;
    private Date ngayMua;
    private double donGia;
    private double tongTien;

    @Override
    public String toString() {
        return "DonHang:" +
                "maHoaDon='" + maHoaDon + '\'' +
                "; maKhachHang='" + maKhachHang + '\'' +
                "; maSanPham='" + maSanPham + '\'' +
                "; soLuong=" + soLuong +
                "; ngayMua=" + ngayMua +
                "; donGia=" + donGia +
                "; tongTien=" + tongTien +
                '}';
    }



    public DonHang(String maHoaDon, String maKhachHang, String maSanPham, int soLuong, Date ngayMua, double donGia, double tongTien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.donGia = donGia;
        this.tongTien = tongTien;
    }
    public DonHang(){

    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public DonHang Them(){
        KiemTra kt = new KiemTra();
    Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ma hoa don: ");
        String maHoaDon = scanner.nextLine();
        while (kt.isMADH(maHoaDon)==false){
        System.out.println("Nhap lai ma hoa don: ");
        maHoaDon = scanner.nextLine();
        }
    System.out.println("Nhap vao ma khach hang: ");
    String maKH=scanner.nextLine();
    System.out.println("Nhap vao ma san pham: ");
    String maSP=scanner.nextLine();
    System.out.println("Nhap vao so luong: ");
    int soLuong=Integer.parseInt(scanner.nextLine());
    while (soLuong<=0){
        System.out.println("Nhap lai so luong: ");
        soLuong=Integer.parseInt(scanner.nextLine());
    }
    Date ngayM = new Date();
    while (true) {
        System.out.println("Nhap vao ngay mua: ");
        String ngayMua = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayM = format.parse(ngayMua);
            break;
        } catch (Exception e) {
            System.out.println("Sai dinh dang ngay");
        }
    }
    System.out.println("Nhap vao don gia: ");
    double donGia=Double.parseDouble(scanner.nextLine());
    System.out.println("Nhap vao tong tien: ");
    double tongTien=Double.parseDouble(scanner.nextLine());
    DonHang dh = new DonHang(maHoaDon,maKH,maSP,soLuong,ngayM,donGia,tongTien);
    return dh;
}

}
