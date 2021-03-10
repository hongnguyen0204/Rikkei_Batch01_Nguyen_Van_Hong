package hong.com.springboot.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "khachhang")
    public class DBKhachHang {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String tenKhachHang;

    @Column(name = "phone")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "dateofbirth")
    private Date ngaySinh;

    @Column(name = "type")
    private int maLoai;

    @Column(name = "adress")
    private String diaChi;

    public DBKhachHang(int id, String tenKhachHang, String soDienThoai, String email, Date ngaySinh, int maLoai, String diaChi) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.maLoai = maLoai;
        this.diaChi = diaChi;
    }
    public DBKhachHang()
    {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
