package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class evaluate extends employee {
    private Date ngay;
    private String nguoidanhgia;
    private double diem;
    private String xeploai;

    // Constructors
    public evaluate() {
        super(); // Gọi constructor của lớp cha để khởi tạo các thuộc tính kế thừa từ lớp Employee
    }

    public evaluate(int id, String fname,Date ngay, String nguoidanhgia, double diem, String xeploai) {
        super(); // Gọi constructor của lớp cha
        this.ngay = ngay;
        this.nguoidanhgia = nguoidanhgia;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    // Getters and setters
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

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    // Phương thức lưu đánh giá vào cơ sở dữ liệu
    public void saveEvaluation(Connection conn) {
        try {
            String insertSQL = "INSERT INTO `employee_evaluate` (`id`, `name`, `ngay`, `nguoidanhgia`, `diem`, `xeploai`) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertSQL);
            
            // Chuyển đổi Date thành String với định dạng yyyy-MM-dd
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(this.getNgay());

            ps.setDouble(1, this.getId());
            ps.setString(2, this.getFname());
            ps.setString(3, formattedDate);
            ps.setString(4, this.getNguoidanhgia());
            ps.setDouble(5, this.getDiem());
            ps.setString(6, this.getXeploai());
            
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Đánh giá đã được lưu.");
            } else {
                JOptionPane.showMessageDialog(null, "Không thể lưu đánh giá.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lưu đánh giá.");
            ex.printStackTrace();
        }
    }
}
