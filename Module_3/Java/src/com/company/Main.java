package com.company;

import Task1.Sach;
import Task2.DonHang;
import Task2.KhachHang;
import Task2.MainmenuControll;
import Task4.KiemTra;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MainmenuControll mn=new MainmenuControll();

        Scanner sc  = new Scanner(System.in);
        int functionID=0;
        boolean flag = true;
        do{
            showMenu();
            functionID = sc.nextInt();
            sc.nextLine();
            switch (functionID){
                case 1:
                    System.out.println("==============Thêm sách===============");
                    mn.AddFileSach();
                    break;
                case 2:
                    System.out.println("==============Thêm đồ dùng học tập===============");
                    mn.AddFileDoDung();
                    break;
                case 3:
                    System.out.println("==============Thêm đồ chơi trẻ em===============");
                    mn.AddFileDoChoi();
                    break;
                case 4:
                    System.out.println("==============Thêm đơn hàng===============");
                    mn.ThemDonHang();
                    break;
                case 5:
                    mn.HienThiSach();
                    break;
                case 6:
                    mn.HienThiDoDungHocTap();
                    break;
                case 7:
                    mn.HienThiDoChoiTreEm();
                    break;
                case 8:
                    mn.HienThi();
                    break;
                case 9:
                    mn.HienThiDanhSachDonHang();
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    flag = false;
                    break;
            }
        }while(flag == true);
        sc.close();
    }
        public static void showMenu(){
        System.out.println("1.Thêm sách");
        System.out.println("2.Thêm Đồ dùng học tập");
        System.out.println("3.Thêm đồ chơi trẻ em");
        System.out.println("4.Thêm đơn hàng");
        System.out.println("5.Hiển thị tất cả sản phẩm sách");
        System.out.println("6.Hiển thị tất cả sản phẩm đồ dùng học tập");
        System.out.println("7.Hiển thị tất cả sản phẩm đồ chơi trẻ em");
        System.out.println("8.Hiển thị tất cả sản phẩm có trong nhà sách");
        System.out.println("9.Hiển thị danh sách đơn hàng");
        System.out.println("10.Tìm kiếm theo mã sản phẩm");
        System.out.println("11.Tìm kiếm theo mã khách hàng");
        System.out.println("12.Thoát");
  }

}


