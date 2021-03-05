package Task2;
import Task1.DoChoiTreEm;
import Task1.DoDungHocTap;
import Task1.Sach;
import Task1.SanPham;
import Task4.FileUtils;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainmenuControll {

    public static final String file_name="src/data/Sach.csv";
    public static final String file_name1="src/data/DoDungHocTap.csv";
    public static final String file_name2="src/data/Dochoitreem.csv";
    public static final String file_name3="src/data/Donhang.csv";
    public static final String file_name4="src/data/Khachhang.csv";

    public void AddFileSach(){
        MainmenuControll mn=new MainmenuControll();
        ArrayList<Sach> list = new ArrayList<>();
        Sach sach=new Sach();
        String ch="y";
        Scanner sc = new Scanner(System.in);
        while (ch.toLowerCase().equals("y")) {
            sach = sach.Them();
            list.add(sach);
            System.out.println("Nhap y de tiep tuc va s de dung lai.");
            ch=sc.nextLine();
        }
        for(Sach item:list){
            FileUtils.writeFile(file_name,item.toString());
        }
    }

    public void AddFileDoDung(){
        MainmenuControll mn=new MainmenuControll();
        ArrayList<DoDungHocTap> list = new ArrayList<>();
        DoDungHocTap present=new DoDungHocTap();
        String ch="y";
        Scanner sc = new Scanner(System.in);
        while (ch.toLowerCase().equals("y")) {
            present = present.Them();
            list.add(present);
            System.out.println("Nhap y de tiep tuc va s de dung lai.");
            ch=sc.nextLine();
        }
        for(DoDungHocTap item:list){
            FileUtils.writeFile(file_name1,item.toString());
        }
    }
    public void AddFileDoChoi(){
        MainmenuControll mn=new MainmenuControll();
        ArrayList<DoChoiTreEm> list = new ArrayList<>();
        DoChoiTreEm present=new DoChoiTreEm();
        String ch="y";
        Scanner sc = new Scanner(System.in);
        while (ch.toLowerCase().equals("y")) {
            present = present.Them();
            list.add(present);
            System.out.println("Nhap y de tiep tuc va s de dung lai.");
            ch=sc.nextLine();
        }
        for(DoChoiTreEm item:list){
            FileUtils.writeFile(file_name2,item.toString());
        }
    }
    public void AddFileDonHang(){
        MainmenuControll mn=new MainmenuControll();
        ArrayList<DonHang> list = new ArrayList<>();
        DonHang present=new DonHang();
        String ch="y";
        Scanner sc = new Scanner(System.in);
        while (ch.toLowerCase().equals("y")) {
            present = present.Them();
            list.add(present);
            System.out.println("Nhap y de tiep tuc va s de dung lai.");
            ch=sc.nextLine();
        }
        for(DonHang item:list){
            FileUtils.writeFile(file_name3,item.toString());
        }
    }

    public void AddFileKhachHang(){
        MainmenuControll mn=new MainmenuControll();
        ArrayList<KhachHang> list = new ArrayList<>();
        KhachHang present=new KhachHang();
        String ch="y";
        Scanner sc = new Scanner(System.in);
        while (ch.toLowerCase().equals("y")) {
            present = present.Them();
            list.add(present);
            System.out.println("Nhap y de tiep tuc va s de dung lai.");
            ch=sc.nextLine();
        }
        for(KhachHang item:list){
            FileUtils.writeFile(file_name4,item.toString());
        }
    }


    public void ThemDonHang(){
    AddFileKhachHang();
    AddFileDonHang();
    }
    FileUtils file=new FileUtils();
    public void HienThi(){

    System.out.println("=====Danh sach Sach=====");
        System.out.println(file.readFile(file_name));
    System.out.println("=====Danh sach Do Dung Hoc Tap=====");
        System.out.println(file.readFile(file_name1));
    System.out.println("=====Danh sach Do Choi Tre Em=====");
        System.out.println(file.readFile(file_name2));
    }

    public void HienThiSach(){
        System.out.println("=====Danh sach Sach=====");
        System.out.println(file.readFile(file_name));
    }

    public void HienThiDoDungHocTap(){
        System.out.println("=====Danh sach Do Dung Hoc Tap=====");
        System.out.println(file.readFile(file_name1));
    }

    public void HienThiDoChoiTreEm(){
        System.out.println("=====Danh sach Do Choi Tre Em=====");
        System.out.println(file.readFile(file_name2));
    }
    public void HienThiDanhSachDonHang(){
        System.out.println("=====Danh sach Don Hang=====");
        System.out.println(file.readFile(file_name3));
    }

    public ArrayList<SanPham> TimKiemSP(ArrayList<SanPham> list,String maSp){
        ArrayList<SanPham> l=new ArrayList<>();
        for(SanPham item:list){
           if(maSp.contains(item.getMaSP()))
               l.add(item);
        }
        return l;
    }

    public ArrayList<DonHang> TimKiemDH(ArrayList<DonHang> list,String maKhachHang){
        ArrayList<DonHang> l=new ArrayList<>();
        for(DonHang item:list){
            if(maKhachHang.contains(item.getMaKhachHang()))
                l.add(item);
        }
        return l;
    }

}
