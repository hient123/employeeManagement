package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class employee {
    private double id;
    private String fname;
    private String department;
    private String designation;
    private double number;
    private String status;
    private String address;
    private double salary;

    // Constructors
    public employee() {
    }

    public employee(double id, String fname){
        this.id = id;
        this.fname = fname;
    }

    public employee(double id, String fname, String department, String designation, double number, String status, String address, double salary) {
        this.id = id;
        this.fname = fname;
        this.department = department;
        this.designation = designation;
        this.number = number;
        this.status = status;
        this.address = address;
        this.salary = salary;
    }

    // Getters and setters (you can generate these automatically in many IDEs)
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phương thức thêm nhân viên
    public static void addEmployee(Connection conn, double id, String fname, String department, String designation, double number, String status, String address, double salary) {
        try {
            String sql = "INSERT INTO employee_list (id, fname, department, designation, number, status, address, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, id);
            ps.setString(2, fname);
            ps.setString(3, department);
            ps.setString(4, designation);
            ps.setDouble(5, number);
            ps.setString(6, status);
            ps.setString(7, address);
            ps.setDouble(8, salary);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nhân viên đã được thêm.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm nhân viên.");
            ex.printStackTrace();
        }
    }

    // Phương thức cập nhật nhân viên
    public static void updateEmployee(Connection conn, double id, String fname, String department, String designation, double number, String status, String address, double salary) {
        try {
            String sql = "UPDATE employee_list SET fname=?, department=?, designation=?, number=?, status=?, address=?, salary=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, fname);
            ps.setString(2, department);
            ps.setString(3, designation);
            ps.setDouble(4, number);
            ps.setString(5, status);
            ps.setString(6, address);
            ps.setDouble(7, salary);
            ps.setDouble(8, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nhân viên đã được cập nhật.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật nhân viên.");
            ex.printStackTrace();
        }
    }

    // Phương thức xóa nhân viên
    public static void deleteEmployee(Connection conn, double id) {
        try {
            String sql = "DELETE FROM employee_list WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nhân viên đã được xóa.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa nhân viên.");
            ex.printStackTrace();
        }
    }

    // Phương thức in ra thông tin nhân viên
    public static void printEmployeeInfo(Connection conn, double id) {
        try {
            String sql = "SELECT * FROM employee_list WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String info = String.format("ID: %f\nName: %s\nDepartment: %s\nDesignation: %s\nNumber: %f\nStatus: %s\nAddress: %s\nSalary: %f",
                        rs.getDouble("id"), rs.getString("fname"), rs.getString("department"), rs.getString("designation"),
                        rs.getDouble("number"), rs.getString("status"), rs.getString("address"), rs.getDouble("salary"));
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy thông tin nhân viên.");
            ex.printStackTrace();
        }
    }
}
