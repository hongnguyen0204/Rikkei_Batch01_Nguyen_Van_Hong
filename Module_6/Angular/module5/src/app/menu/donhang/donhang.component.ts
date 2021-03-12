import { Component, OnInit } from '@angular/core';
import {ISDonHang} from "./dbDonHang";

@Component({
  selector: 'app-donhang',
  templateUrl: './donhang.component.html',
  styleUrls: ['./donhang.component.css']
})
export class DonhangComponent implements OnInit {
  donhangs:ISDonHang[]=[
    {maDonHang:'23211',maKhachHang:'KH-0001',maNhanVien:'NV-0001',ngayMuaHang:'02/04/2021',tongTien:200000},
    {maDonHang:'23202',maKhachHang:'KH-0002',maNhanVien:'NV-0002',ngayMuaHang:'12/04/2021',tongTien:250000},
    {maDonHang:'23244',maKhachHang:'KH-0003',maNhanVien:'NV-0011',ngayMuaHang:'22/04/2021',tongTien:200500},
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
