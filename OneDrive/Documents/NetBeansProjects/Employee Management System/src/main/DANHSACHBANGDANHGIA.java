/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import main.DANHGIA;

/**
 *
 * @author thanh
 */
public class DANHSACHBANGDANHGIA {
     private ArrayList<DANHGIA> list;

    public DANHSACHBANGDANHGIA() {
        list = new ArrayList<>();
    }

    public DANHSACHBANGDANHGIA(ArrayList<DANHGIA> list) {
        this.list = list;
    }

    public ArrayList<DANHGIA> getList() {
        return this.list;
    }

    public void setList(ArrayList<DANHGIA> list) {
        this.list = list;
    }

    public void getDataFromDatabase() {
        list = (ArrayList<DANHGIA>) access_BANGDANHGIA.getList();
    }

    public DANHSACHBANGDANHGIA getDANHSACHDANHGIATheoMaNhanVien(String id) {
        DANHSACHBANGDANHGIA data = new DANHSACHBANGDANHGIA();
        for (DANHGIA i : list) {
            if (i.getId().equals(id)) {
                data.getList().add(i);
            }
        }
        return data;
    }

    public Object[][] getObjectToRender() {
        Object[][] obj = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            obj[i] = new Object[]{
                i + 1, list.get(i).getId() + " - " + list.get(i).getName(), SUPPORT.LocalDateToString(list.get(i).getNgay()),
                  list.get(i).getNguoidanhgia(), list.get(i).getDiem(), list.get(i).getXeploai(), list.get(i).getXeploai()
            };
        }

        return obj;
    }

    public DANHGIA getDanhGia(String maDanhGia) {
        for (DANHGIA i : list) {
            if (i.getId().equals(maDanhGia)) {
                return i;
            }
        }
        return null;
    }

    public DANHSACHBANGDANHGIA getDANHSACHBANGDANHGIA(String loaiDanhGia, Date batDau, Date ketThuc) {
        ArrayList<DANHGIA> arr = new ArrayList<>();
        for (DANHGIA i : list) {
            if (i.getXeploai().equalsIgnoreCase(loaiDanhGia) && i.getNgay().compareTo(batDau) >= 0 && i.getNgay().compareTo(ketThuc) <= 0) {
                arr.add(i);
            }
        }
        return new DANHSACHBANGDANHGIA(arr);
    }

    public DANHSACHBANGDANHGIA getDANHSACHBANGDANHGIA(Date batDau, Date ketThuc) {
        ArrayList<DANHGIA> arr = new ArrayList<>();
        for (DANHGIA i : list) {
            if (i.getNgay().compareTo(batDau) >= 0 && i.getNgay().compareTo(ketThuc) <= 0) {
                arr.add(i);
            }
        }
        return new DANHSACHBANGDANHGIA(arr);
    }

    public void sortByPoint(int type) {
        list.sort((o1, o2) -> o1.getDiem() - o2.getDiem());
        if (type == 0) {
            Collections.reverse(list);
        }
    }

    public void sortByDay(int type) {
        list.sort((o1, o2) -> o1.getNgay().compareTo(o2.getNgay()));
        if (type == 0) {
            Collections.reverse(list);
        }
    }
}
