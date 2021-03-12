import { Component, OnInit } from '@angular/core';
import {ISCTDonHang} from "../dbDonHang";

@Component({
  selector: 'app-chitietdonhang',
  templateUrl: './chitietdonhang.component.html',
  styleUrls: ['./chitietdonhang.component.css']
})
export class ChitietdonhangComponent implements OnInit {
  chitiets:ISCTDonHang[]=[
    {maDonHang:'23211',maSanPham:'S-0001',soLuong:200},
    {maDonHang:'23200',maSanPham:'S-0002',soLuong:200},
    {maDonHang:'23229',maSanPham:'S-0003',soLuong:200},
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
