package Task2;

import Task4.KiemTra;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {

    private String maKh;
    private String hoTen;
    private String soDienThoai;
    private String email;
    private Date ngaySinh;
    private String loaiKH;

    public KhachHang(String maKh, String hoTen, String soDienThoai, String email, Date ngaySinh, String loaiKH) {
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.loaiKH = loaiKH;
    }

    public KhachHang(){

    }

    @Override
    public String toString() {
        return "KhachHang:" +
                "maKh='" + maKh + '\'' +
                "; hoTen='" + hoTen + '\'' +
                "; soDienThoai='" + soDienThoai + '\'' +
                "; email='" + email + '\'' +
                "; ngaySinh=" + ngaySinh +
                "; loaiKH='" + loaiKH + '\'' +
                '}';
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public KhachHang Them(){
        KiemTra kt=new KiemTra();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============Khach Hang==============");
        System.out.println("Nhap vao ma khach hang: ");
        String maKH=scanner.nextLine();
        System.out.println("Nhap vao ho ten: ");
        String hoTen=scanner.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        String soDienThoai=scanner.nextLine();
        while (!kt.isNumeric(soDienThoai) || soDienThoai.length()!=12){
            System.out.println("Nhap lai so dien thoai: ");
            soDienThoai=scanner.nextLine();
        }
        System.out.println("Nhap vao email: ");
        String email=scanner.nextLine();
        while (!kt.validate(email)){
            System.out.println("Nhap lai email: ");
            email=scanner.nextLine();
        }
        Date ngayS = new Date();
        while (true) {
            System.out.println("Nhap vao ngay sinh : ");
            String ngaySinh = scanner.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy");
            try {
                ngayS = format.parse(ngaySinh);
                String nam= format2.format(ngayS);
                System.out.println(nam);
                while(LocalDate.now().getYear()-Integer.parseInt(nam)<16){
                    System.out.println("Nhap lai ngay sinh: ");
                    ngaySinh = scanner.nextLine();
                    ngayS = format.parse(ngaySinh);
                    nam= format2.format(ngayS);
                }
                break;
            } catch (Exception e) {
                System.out.println("Sai dinh dang ngay");
            }
        }
        System.out.println("Nhap vao loai khach hang: ");
        String loaiKH= scanner.nextLine();
        while (loaiKH.toLowerCase().equals("thường")==false&&
                loaiKH.toLowerCase().equals("vip1")==false&&
                loaiKH.toLowerCase().equals("vip2")==false){
            if(loaiKH.trim().equals("")||loaiKH==null){
                loaiKH="Thường";
                break;
                }
            else {
                System.out.println("Nhap lai loai khach hang: ");
                loaiKH= scanner.nextLine();
            }
        }
        KhachHang kh = new KhachHang(maKH,hoTen,soDienThoai,email,ngayS,loaiKH);
        return kh;
    }

}
