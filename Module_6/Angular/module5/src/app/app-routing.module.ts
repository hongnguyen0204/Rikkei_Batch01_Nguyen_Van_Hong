import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {KhachHangComponent} from "./menu/khach-hang/khach-hang.component";
import {NhanVienComponent} from "./menu/nhan-vien/nhan-vien.component";
import {SanPhamComponent} from "./menu/san-pham/san-pham.component";
import {ListKhachHangComponent} from "./menu/khach-hang/list-khach-hang/list-khach-hang.component";
import {SachComponent} from "./menu/san-pham/sach/sach.component";
import {AddSachComponent} from "./menu/san-pham/sach/add-sach/add-sach.component";
import {ListNhanVienComponent} from "./menu/nhan-vien/list-nhan-vien/list-nhan-vien.component";
import {DochoiComponent} from "./menu/san-pham/dochoi/dochoi.component";
import {ListdochoiComponent} from "./menu/san-pham/dochoi/listdochoi/listdochoi.component";
import {DungcuComponent} from "./menu/san-pham/dungcu/dungcu.component";
import {AdddungcuComponent} from "./menu/san-pham/dungcu/adddungcu/adddungcu.component";
import {DonhangComponent} from "./menu/donhang/donhang.component";
import {AdddonhangComponent} from "./menu/donhang/adddonhang/adddonhang.component";
import {ChitietdonhangComponent} from "./menu/donhang/chitietdonhang/chitietdonhang.component";
import {AddchitietdonhangComponent} from "./menu/donhang/addchitietdonhang/addchitietdonhang.component";

const routes: Routes = [
  {path:'addkhachhang',component: KhachHangComponent },
  {path:'khachhang',component: ListKhachHangComponent },
  {path:'nhanvien',component:  ListNhanVienComponent},
  {path:'addnhanvien',component: NhanVienComponent },
  {path:'sanpham',component: SanPhamComponent },
  {path:'sach',component: SachComponent },
  {path:'addsach',component: AddSachComponent },
  {path:'dochoi',component: DochoiComponent },
  {path:'adddochoi',component: ListdochoiComponent },
  {path:'dungcu',component: DungcuComponent },
  {path:'adddungcu',component: AdddungcuComponent },
  {path:'donhang',component: DonhangComponent },
  {path:'adddonhang',component: AdddonhangComponent },
  {path:'chitietdonhang',component: ChitietdonhangComponent },
  {path:'addchitietdonhang',component: AddchitietdonhangComponent},
  {path:'',redirectTo:'/khachhang',pathMatch:'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
