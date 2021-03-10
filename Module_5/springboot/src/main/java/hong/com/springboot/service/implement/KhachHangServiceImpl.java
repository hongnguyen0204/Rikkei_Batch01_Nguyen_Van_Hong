package hong.com.springboot.service.implement;

import hong.com.springboot.model.DBKhachHang;
import hong.com.springboot.repository.KhachHangRepository;
import hong.com.springboot.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class KhachHangServiceImpl implements KhachHangService {

  @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    @Transactional
    public List<DBKhachHang> findAll() {
        return khachHangRepository.findAll();
    }

  @Override
  @Transactional
  public void saveKH(DBKhachHang khachHang) {
    khachHangRepository.save(khachHang);
  }

  @Override
  @Transactional
  public Optional<DBKhachHang> getKhachHang(int theID)  {
    return khachHangRepository.findById(theID);
  }

  @Override
  @Transactional
  public void delelteKH(int theID) {
    khachHangRepository.deleteById(theID);
  }

  @Override
  @Transactional
  public Page<DBKhachHang> findAllKH(Pageable pageable) {
    return khachHangRepository.findAll((org.springframework.data.domain.Pageable) pageable);
  }


}
