package hong.com.springboot.service;

import hong.com.springboot.model.DBKhachHang;

import java.util.List;
import java.util.Optional;

public interface KhachHangService {
    List<DBKhachHang> findAll();
    void saveKH(DBKhachHang khachHang);
    Optional<DBKhachHang> getKhachHang(int theID) ;
    void delelteKH(int theID);
}
