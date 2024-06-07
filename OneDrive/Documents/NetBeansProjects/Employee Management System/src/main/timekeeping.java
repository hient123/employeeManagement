/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author thanh
 */
public class timekeeping extends employee{
    
    private int LamViec;
    private Integer Nghi;
    private Integer Tre;
    private Integer LamThem;
    private Date Ngay;

    public timekeeping(int id, String name, int LamViec, Integer Nghi, Integer Tre, Integer LamThem, Date Ngay) {
        this.LamViec = LamViec;
        this.Nghi = Nghi;
        this.Tre = Tre;
        this.LamThem = LamThem;
        this.Ngay = Ngay;
    }

    // Getters and Setters

    public int getLamViec() {
        return LamViec;
    }

    public void setLamViec(int LamViec) {
        this.LamViec = LamViec;
    }

    public Integer getNghi() {
        return Nghi;
    }

    public void setNghi(Integer Nghi) {
        this.Nghi = Nghi;
    }

    public Integer getTre() {
        return Tre;
    }

    public void setTre(Integer Tre) {
        this.Tre = Tre;
    }

    public Integer getLamThem() {
        return LamThem;
    }

    public void setLamThem(Integer LamThem) {
        this.LamThem = LamThem;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }
    public void Tre(int soGioTre) {
        if (this.Nghi == null) {
            this.Nghi = soGioTre;
        } else {
            this.Nghi += soGioTre;
        }
    }

    // Phương thức để ghi nhận giờ làm thêm của nhân viên
    public void lamThem(int soGioLamThem) {
        if (this.LamThem == null) {
            this.LamThem = soGioLamThem;
        } else {
            this.LamThem += soGioLamThem;
        }
    }
}
