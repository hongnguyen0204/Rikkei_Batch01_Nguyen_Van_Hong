package hong.com.springboot.controller.KhachHangController;

import hong.com.springboot.model.DBKhachHang;
import hong.com.springboot.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class KhachHangController {

    @Autowired
    KhachHangService khachHangService;
    @GetMapping("/khachhang")
    public ModelAndView testModel(Pageable pageable){
        Page<DBKhachHang> listkh=khachHangService.findAllKH((java.awt.print.Pageable) pageable);
        ModelAndView modelAndView=new ModelAndView("/KhachHang/list");
        modelAndView.addObject("listkh",listkh);
        return modelAndView;
    }

    @GetMapping("/khachhang/create")
    public String createKH(Model model){
        model.addAttribute("customer",new DBKhachHang());
        return "/KhachHang/Create";
    }

    @PostMapping("/khachhang/save")
    public String addKhachHang(DBKhachHang dbKhachHang, RedirectAttributes redirect){
        dbKhachHang.setId((int)(Math.random()*10000));
        khachHangService.saveKH(dbKhachHang);
        redirect.addFlashAttribute("success","Save successful");
        return "redirect:/khachhang";
    }

    @GetMapping("/khachhang/delete/{id}")
    public String deleteKH(@PathVariable int id){
        khachHangService.delelteKH(id);
        return "redirect:/khachhang";
    }

    @GetMapping("khachhang/edit/{id}")
    public ModelAndView getKH(@PathVariable int id){
        return new ModelAndView("/KhachHang/Edit","customer",khachHangService.getKhachHang(id));
    }

    @PostMapping("/khachhang/edit")
    public String editKH(@ModelAttribute DBKhachHang dbKhachHang,RedirectAttributes redirect){
        dbKhachHang.setId((int)(Math.random()*10000));
        khachHangService.saveKH(dbKhachHang);
        redirect.addFlashAttribute("success","Save successful");
        return "redirect:/khachhang";
    }



}

