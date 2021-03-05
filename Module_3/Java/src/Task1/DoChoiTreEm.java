package Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DoChoiTreEm extends SanPham {

    protected String xuatXu;
    protected String thuongHieu;
    protected String nhaCungCap;
    protected String huongDanSuDung;

    @Override
    public String toString() {
        return "DoChoiTreEm:" +
                "xuatXu='" + xuatXu + '\'' +
                "; thuongHieu='" + thuongHieu + '\'' +
                "; nhaCungCap='" + nhaCungCap + '\'' +
                "; huongDanSuDung='" + huongDanSuDung + '\'' +
                "; maSP='" + maSP + '\'' +
                "; tenSP='" + tenSP + '\'' +
                "; soLuong=" + soLuong +
                "; donGia=" + donGia +
                "; thuocDanhMuc='" + thuocDanhMuc + '\'' +
                '.';
    }

    public DoChoiTreEm(){

    }

    public DoChoiTreEm(String maSP, String tenSP, int soLuong,
                       double donGia, String thuocDanhMuc, String xuatXu,
                       String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(maSP, tenSP, soLuong, donGia, thuocDanhMuc);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return huongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        this.huongDanSuDung = huongDanSuDung;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(this.toString());
    }

    @Override
    public DoChoiTreEm Them() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma san pham: ");
        String maSP=scanner.nextLine();
        System.out.println("Nhap vao ten san pham: ");
        String tenSP=scanner.nextLine();
        System.out.println("Nhap vao so luong: ");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao don gia: ");
        double donGia=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao danh muc: ");
        String danhMuc=scanner.nextLine();
        System.out.println("Nhap vao xuat xu: ");
        String xuatXu=scanner.nextLine();
        System.out.println("Nhap vao thuong hieu: ");
        String thuongHieu=scanner.nextLine();
        System.out.println("Nhap vao nha cung cap: ");
        String nhaCungCap=scanner.nextLine();
        System.out.println("Nhap vao huong dan su dung: ");
        String huongDanSuDung=scanner.nextLine();
        DoChoiTreEm item = new DoChoiTreEm(maSP,tenSP,soLuong,donGia,danhMuc,xuatXu,thuongHieu,nhaCungCap,huongDanSuDung);
        return item;
    }

    @Override
    public double PhanTramGiamGia(String loaiKhachHang) {
        switch (loaiKhachHang){
            case "Normal":
                return 0.02;
            case "Vip1":
                return 0.05;
            case "Vip2":
                return 0.07;
        }
        return 0;
    }
}
