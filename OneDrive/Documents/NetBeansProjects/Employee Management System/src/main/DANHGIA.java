/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Date;

/**
 *
 * @author thanh
 */
public class DANHGIA {

    private String id;
    private String name;
    private Date ngay;
    private String nguoidanhgia;
    private int diem;
    private String xeploai;

        public DANHGIA(){
            
        }
    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getNguoidanhgia() {
        return nguoidanhgia;
    }

    public void setNguoidanhgia(String nguoidanhgia) {
        this.nguoidanhgia = nguoidanhgia;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
}
