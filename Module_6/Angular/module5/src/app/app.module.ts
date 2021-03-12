import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import { KhachHangComponent } from './menu/khach-hang/khach-hang.component';
import { NhanVienComponent } from './menu/nhan-vien/nhan-vien.component';
import { SanPhamComponent } from './menu/san-pham/san-pham.component';
import { ListKhachHangComponent } from './menu/khach-hang/list-khach-hang/list-khach-hang.component';
import { SachComponent } from './menu/san-pham/sach/sach.component';
import { AddSachComponent } from './menu/san-pham/sach/add-sach/add-sach.component';
import { DochoiComponent } from './menu/san-pham/dochoi/dochoi.component';
import { ListdochoiComponent } from './menu/san-pham/dochoi/listdochoi/listdochoi.component';
import { DungcuComponent } from './menu/san-pham/dungcu/dungcu.component';
import { AdddungcuComponent } from './menu/san-pham/dungcu/adddungcu/adddungcu.component';
import { DonhangComponent } from './menu/donhang/donhang.component';
import { AdddonhangComponent } from './menu/donhang/adddonhang/adddonhang.component';
import { ChitietdonhangComponent } from './menu/donhang/chitietdonhang/chitietdonhang.component';
import { AddchitietdonhangComponent } from './menu/donhang/addchitietdonhang/addchitietdonhang.component';
import {ListNhanVienComponent} from "./menu/nhan-vien/list-nhan-vien/list-nhan-vien.component";

@NgModule({
  declarations: [
    AppComponent,
    KhachHangComponent,
    NhanVienComponent,
    ListNhanVienComponent,
    SanPhamComponent,
    ListKhachHangComponent,
    SachComponent,
    AddSachComponent,
    DochoiComponent,
    ListdochoiComponent,
    DungcuComponent,
    AdddungcuComponent,
    DonhangComponent,
    AdddonhangComponent,
    ChitietdonhangComponent,
    AddchitietdonhangComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
