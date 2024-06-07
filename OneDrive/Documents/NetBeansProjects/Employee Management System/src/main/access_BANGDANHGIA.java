/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;


/**
 *
 * @author thanh
 */
public class access_BANGDANHGIA {   
        public static List<DANHGIA> getList() {

    ArrayList<DANHGIA> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
    try {
            con = MyConnection.getConnection();
            String SQL = "SELECT `id`, `name`, `ngay`, `nguoidanhgia`, `diem`, `xeploai` FROM `employee_evaluate`";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                DANHGIA danhgia = new DANHGIA();
                danhgia.setId(rs.getString("id"));
                danhgia.setName(rs.getString("name"));
                danhgia.setNgay(rs.getDate("ngay"));
                danhgia.setNguoidanhgia(rs.getString("nguoidanhgia"));
                danhgia.setDiem(rs.getInt("diem"));
                danhgia.setXeploai(rs.getString("xeploai"));
                list.add(danhgia);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng các kết nối và tài nguyên
            if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (con != null) try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
            return list;
        } 
        public static boolean insertBangDanhGia(DANHGIA danhGia) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // Tạo kết nối tới cơ sở dữ liệu
            // Tạo kết nối tới cơ sở dữ liệu
            con = MyConnection.getConnection();
            String SQL = "INSERT INTO `employee_evaluate` (`id`, `name`, `ngay`, `nguoidanhgia`, `diem`, `xeploai`) VALUES (?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(SQL);
            ps.setString(1, danhGia.getId());
            ps.setString(2, danhGia.getName());
            ps.setDate(3, new java.sql.Date(danhGia.getNgay().getTime()));
            ps.setString(4, danhGia.getNguoidanhgia());
            ps.setInt(5, danhGia.getDiem());
            ps.setString(6, danhGia.getXeploai());

            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            // Đóng các kết nối và tài nguyên
            if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (con != null) try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
    
//    public boolean insertBangDanhGia(DANHGIA danhGia) {
//        String insertSQL = "INSERT INTO employee_evaluate (id, name, ngay, nguoidanhgia, diem, xeploai) VALUES (?, ?, ?, ?, ?, ?)";
//        try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
//            ps.setInt(1, Integer.parseInt(danhGia.getId()));
//            ps.setString(2, danhGia.getName());
//            ps.setDate(3, java.sql.Date.valueOf(danhGia.getNgay()));
//            ps.setString(4, danhGia.getNguoidanhgia());
//            ps.setInt(5, danhGia.getDiem());
//            ps.setString(6, danhGia.getXeploai());
//
//            int rowsInserted = ps.executeUpdate();
//            return rowsInserted > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        }


