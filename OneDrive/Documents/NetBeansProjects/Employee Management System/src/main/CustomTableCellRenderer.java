/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author thanh
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    private List<Integer> workingEmployeeIds;

    public CustomTableCellRenderer(List<Integer> workingEmployeeIds) {
        this.workingEmployeeIds = workingEmployeeIds;
    }

   @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Kiểm tra giá trị cột "Nghi" (giả định cột "Nghi" là cột thứ 4 - index 3)
        String nghiStatus = (String) table.getValueAt(row, 3);
        if ("Nghi".equals(nghiStatus)) {
            cell.setBackground(Color.BLACK); // Tô màu đen cho nhân viên nghỉ
            cell.setForeground(Color.WHITE); // Đổi màu chữ để dễ đọc trên nền đen
        } else {
            cell.setBackground(Color.WHITE); // Màu nền mặc định
            cell.setForeground(Color.BLACK); // Màu chữ mặc định
        }

        return cell;
    }
}
