package Task1;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham {

    protected String nhaXuatBan;
    protected int namXuatBan;
    protected String tacGia;
    protected Date ngayXuatBan;
    protected int lanTaiBan;

    @Override
    public String toString() {
        return
                " maSP='" + maSP + '\'' +
                "; tenSP='" + tenSP + '\'' +
                "; soLuong=" + soLuong +
                "; donGia=" + donGia +
                "; thuocDanhMuc='" + thuocDanhMuc + '\'' +
                ";nhaXuatBan='" + nhaXuatBan + '\'' +
                "; namXuatBan='" + namXuatBan + '\'' +
                "; tacGia='" + tacGia + '\'' +
                "; ngayXuatBan='" + ngayXuatBan + '\'' +
                "; lanTaiBan=" + lanTaiBan +
                '}';
    }
    public Sach(){

    }

    public Sach(String maSP, String tenSP, int soLuong, double donGia, String thuocDanhMuc,
                String nhaXuatBan, int namXuatBan, String tacGia, Date ngayXuatBan, int lanTaiBan) {
        super(maSP, tenSP, soLuong, donGia, thuocDanhMuc);
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
        this.ngayXuatBan = ngayXuatBan;
        this.lanTaiBan = lanTaiBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }



    @Override
    public void HienThiThongTin() {
        System.out.println(this.toString());
    }

    @Override
    public Sach Them() {
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
        System.out.println("Nhap vao nha xuat ban: ");
        String nhaXuatBan=scanner.nextLine();
        System.out.println("Nhap vao nam xuat ban: ");
        int namXuatBan = Integer.parseInt(scanner.nextLine());
        while (namXuatBan<1000 && namXuatBan>2021){
            System.out.println("Nhap lai nam xuat ban: ");
            namXuatBan = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhap vao tac gia: ");
        String tacGia=scanner.nextLine();
        Date ngayXB = new Date();
        while (true) {
            System.out.println("Nhap vao ngay xuat ban: ");
            String ngayXuatBan = scanner.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                ngayXB = format.parse(ngayXuatBan);
                break;
            } catch (Exception e) {
                System.out.println("Sai dinh dang ngay");
            }
        }
        System.out.println("Nhap vao lan tai ban: ");
        int lanTaiBan = Integer.parseInt(scanner.nextLine());
        while (lanTaiBan<0){
            System.out.println("Nhap lai lan tai ban: ");
            lanTaiBan = Integer.parseInt(scanner.nextLine());
        }

        Sach sach = new Sach(maSP,tenSP,soLuong,donGia,danhMuc,nhaXuatBan,namXuatBan,tacGia,ngayXB,lanTaiBan);
        return sach;
    }

    @Override
    public double PhanTramGiamGia(String loaiKhachHang) {
        switch (loaiKhachHang){
            case "Normal":
                return 0.02;
            case "Vip1":
                return 0.05;
            case "Vip2":
                return 0.1;
        }
        return 0;
    }

}
