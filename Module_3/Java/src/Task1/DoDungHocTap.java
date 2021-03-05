package Task1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DoDungHocTap extends SanPham {

    protected String xuatXu;
    protected String thuongHieu;
    protected String nhaCungCap;
    protected String huongDanSuDung;
    protected String mauSac;
    protected String chatLieu;
    protected float kichThuoc;

    @Override
    public String toString() {
        return
                "xuatXu='" + xuatXu + '\'' +
                "; thuongHieu='" + thuongHieu + '\'' +
                "; nhaCungCap='" + nhaCungCap + '\'' +
                "; huongDanSuDung='" + huongDanSuDung + '\'' +
                "; mauSac='" + mauSac + '\'' +
                "; chatLieu='" + chatLieu + '\'' +
                "; kichThuoc='" + kichThuoc + '\'' +
                "; maSP='" + maSP + '\'' +
                "; tenSP='" + tenSP + '\'' +
                "; soLuong=" + soLuong +
                "; donGia=" + donGia +
                "; thuocDanhMuc='" + thuocDanhMuc + '\'' +
                '.';
    }

    public DoDungHocTap(String maSP, String tenSP, int soLuong, double donGia, String thuocDanhMuc,
                        String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung,
                        String mauSac, String chatLieu, float kichThuoc) {
        super(maSP, tenSP, soLuong, donGia, thuocDanhMuc);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
    }

    public DoDungHocTap(){

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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(this.toString());
    }

    @Override
    public DoDungHocTap Them() {
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
        System.out.println("Nhap vao mau sac: ");
        String mauSac=scanner.nextLine();
        while (mauSac.toLowerCase().equals("Xanh")==false &&
                mauSac.toLowerCase().equals("Đỏ")==false &&
                mauSac.toLowerCase().equals("Vàng")==false &&
                mauSac.toLowerCase().equals("Đen")==false &&
                mauSac.toLowerCase().equals("Trắng")==false){
            System.out.println("Sai màu.");
            System.out.println("Nhap lai mau sac: ");
            mauSac=scanner.nextLine();
        }
        System.out.println("Nhap vao chat lieu: ");
        String chatLieu=scanner.nextLine();
        while (true) {
            try {
                System.out.println("Nhap vao kich thuoc: ");
                float kichThuoc=Float.parseFloat(scanner.nextLine());
                while(kichThuoc<0){
                    System.out.println("Kich thuoc phai > 0");
                    System.out.println("Nhap lai kich thuoc: ");
                    kichThuoc=Float.parseFloat(scanner.nextLine());
                }
                break;
            } catch (Exception e) {
                System.out.println("Phai la kieu so thuc");
            }
        }


        DoDungHocTap item = new DoDungHocTap(maSP,tenSP,soLuong,donGia,danhMuc,xuatXu,thuongHieu,nhaCungCap,huongDanSuDung,mauSac,chatLieu,kichThuoc);
        return item;
    }

    @Override
    public double PhanTramGiamGia(String loaiKhachHang) {
        switch (loaiKhachHang){
            case "Normal":
                return 0.01;
            case "Vip1":
                return 0.03;
            case "Vip2":
                return 0.07;
        }
        return 0;
    }
}
