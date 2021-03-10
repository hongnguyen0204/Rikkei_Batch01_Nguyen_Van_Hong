package hong.com.springboot.repository;

import hong.com.springboot.model.DBKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<DBKhachHang,Integer> {
}
