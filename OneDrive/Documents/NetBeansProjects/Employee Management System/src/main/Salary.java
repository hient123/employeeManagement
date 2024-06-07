/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author thanh
 */
class Salary extends employee{
    private double sal;
    private double allow;
    private double thuong;
    private double gross;
    private double wel;
    private double thue;
    private double total;
    private String status1;
    private double bhxh;
    private String status2;
    private double bhyt;
    private String status3;
    private double bhtn;
    private double net;

    // Default constructor
    public Salary() {
    }

    // Parameterized constructor
    public Salary(String id, String fname, double sal, double allow, double thuong, double gross, double wel, double thue, double total,
                  String status1, double bhxh, String status2, double bhyt, String status3, double bhtn, double net) {
        this.sal = sal;
        this.allow = allow;
        this.thuong = thuong;
        this.gross = gross;
        this.wel = wel;
        this.thue = thue;
        this.total = total;
        this.status1 = status1;
        this.bhxh = bhxh;
        this.status2 = status2;
        this.bhyt = bhyt;
        this.status3 = status3;
        this.bhtn = bhtn;
        this.net = net;
    }

    // Getters and Setters
    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getAllow() {
        return allow;
    }

    public void setAllow(double allow) {
        this.allow = allow;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getWel() {
        return wel;
    }

    public void setWel(double wel) {
        this.wel = wel;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public double getBhxh() {
        return bhxh;
    }

    public void setBhxh(double bhxh) {
        this.bhxh = bhxh;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public double getBhyt() {
        return bhyt;
    }

    public void setBhyt(double bhyt) {
        this.bhyt = bhyt;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public double getBhtn() {
        return bhtn;
    }

    public void setBhtn(double bhtn) {
        this.bhtn = bhtn;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public void addSalary(Connection conn, String id, String empname, String empDes, double otherAllow, double thuong,
                          double wel, String thuePercentStr, boolean isBHXHSelected, boolean isBHYTSelected, boolean isBHTNSelected) {
        try {
            double bhxh = 0, bhyt = 0, bhtn = 0;
            if (isBHXHSelected) {
                bhxh = sal * 8 / 100;
            }
            if (isBHYTSelected) {
                bhyt = sal * 1.5 / 100;
            }
            if (isBHTNSelected) {
                bhtn = sal * 1 / 100;
            }

            double thuePercent = Double.parseDouble(thuePercentStr.replace("%", "").trim());
            double thue = sal * (thuePercent / 100);
            gross = sal + thuong + otherAllow;
            total = bhxh + bhyt + bhtn + wel + thue;
            net = gross - total;

            String sql = "INSERT INTO `employee_salary`(`id`, `empnam`, `des`, `sal`, `allow`, `thuong`, `gross`, `wel`, `thue`, `total`,`status1`,`BHXH`, `status2`, `BHYT`, `status3`,  `BHTN`,  `net`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, id);
            ps.setString(2, empname);
            ps.setString(3, empDes);
            ps.setDouble(4, sal);
            ps.setDouble(5, otherAllow);
            ps.setDouble(6, thuong);
            ps.setDouble(7, gross);
            ps.setDouble(8, wel);
            ps.setDouble(9, thue);
            ps.setDouble(10, total);
            ps.setString(11, status1);
            ps.setDouble(12, bhxh);
            ps.setString(13, status2);
            ps.setDouble(14, bhyt);
            ps.setString(15, status3);
            ps.setDouble(16, bhtn);
            ps.setDouble(17, net);

            ps.execute();

            String sqlAddEmployeeList = "UPDATE `employee_list` SET `salary`=? WHERE `id`=?";
            ps = conn.prepareStatement(sqlAddEmployeeList);
            ps.setDouble(1, net);
            ps.setString(2, id);
            ps.executeUpdate();

//            JOptionPane.showMessageDialog(null, "Lương đã được thêm thành công");
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void updateEmployeeSalary(Connection conn, int id, double salaryChange) {
        try {
            String updateSalarySQL = "UPDATE `employee_list` SET `salary` = `salary` + ? WHERE `id` = ?";
            PreparedStatement ps = conn.prepareStatement(updateSalarySQL);
            ps.setDouble(1, salaryChange);
            ps.setInt(2, id);
            ps.executeUpdate();

            String loadSalarySQL = "SELECT `salary` FROM `employee_salary` WHERE `id` = ?";
            ps = conn.prepareStatement(loadSalarySQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                double newSalary = rs.getDouble("salary");
                this.net = newSalary; // Cập nhật trường lương ròng (net salary)
                this.gross = newSalary;
            }
//            JOptionPane.showMessageDialog(null, "Cập nhật lương thành công");
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Salary{" +
                "sal=" + sal +
                ", allow=" + allow +
                ", thuong=" + thuong +
                ", gross=" + gross +
                ", wel=" + wel +
                ", thue=" + thue +
                ", total=" + total +
                ", status1='" + status1 + '\'' +
                ", bhxh=" + bhxh +
                ", status2='" + status2 + '\'' +
                ", bhyt=" + bhyt +
                ", status3='" + status3 + '\'' +
                ", bhtn=" + bhtn +
                ", net=" + net +
                '}';
    }
}
