import { Component, OnInit } from '@angular/core';
import {ISSach} from "../dbsanpham";

@Component({
  selector: 'app-sach',
  templateUrl: './sach.component.html',
  styleUrls: ['./sach.component.css']
})
export class SachComponent implements OnInit {

  sachs:ISSach[]=[
    {maSP:'S-0001',tenSP:'DragonBall',soLuong:3,donGia:25000,donVi:'Cuốn',maDanhMucSach:'1',nhaXuatBan:'JAV',namXuatBan:1998,tacGia:'Toriyama Akira',lanTaiBan:2},
    {maSP:'S-0002',tenSP:'OnePiece',soLuong:4,donGia:20000,donVi:'Cuốn',maDanhMucSach:'1',nhaXuatBan:'JAV',namXuatBan:1998,tacGia:'Toriyama Akira',lanTaiBan:2},
    {maSP:'S-0003',tenSP:'NOW',soLuong:3,donGia:20000,donVi:'Cuốn',maDanhMucSach:'1',nhaXuatBan:'JAV',namXuatBan:1998,tacGia:'Toriyama Akira',lanTaiBan:2},

  ]

  constructor() { }

  ngOnInit(): void {
  }

}
