/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thanh
 */
public class ChartAdminPanel extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    /**
     * Creates new form ChartAdminPanel
     */
    public ChartAdminPanel() {
        initComponents();
        conn = MyConnection.getConnection();
//        showPieChart();
//        showLineChart();
//        showBarChart();
//        showHistogram();
        setLocationRelativeTo(null);
    }
    private void btnCountDepartmentsActionPerformed(ActionEvent evt) {
        
    }

//    public void showPieChart() {
//        try {
//            // Step 1: Query to get the count of employees in each department
//            String sql = "SELECT  `department`, COUNT(*) AS department_count FROM employee_list GROUP BY department";
////            Thiết lập PreparedStatement với ResultSet.TYPE_SCROLL_INSENSITIVE và ResultSet.CONCUR_READ_ONLY:
//            ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            rs = ps.executeQuery();
//
//            // Create dataset
//            DefaultPieDataset pieDataset = new DefaultPieDataset();
//
//            // Step 2: Calculate the total number of employees
//            int totalEmployees = 0;
//            while (rs.next()) {
//                totalEmployees += rs.getInt("department_count");
//            }
//
//            // Move the cursor back to the beginning
////            Chuyển con trỏ về đầu của ResultSet bằng rs.beforeFirst() để có thể lặp lại từ đầu:
//            rs.beforeFirst();
//            Map<String, Color> departmentColors = new HashMap<>();
//            departmentColors.put("Accounts", new Color(255, 102, 102));
//            departmentColors.put("Manufacturing", new Color(102, 255, 102));
//            departmentColors.put("Packing", new Color(102, 102, 255));
//            departmentColors.put("Sales", new Color(255, 255, 102));
//            // Step 3: Calculate percentage and add to dataset
//            while (rs.next()) {
//                String department = rs.getString("department"); // Lấy tên phòng ban
//                int count = rs.getInt("department_count");
//                double percentage = (double) count / totalEmployees * 100;
//                pieDataset.setValue(department, percentage); // Thêm tên phòng ban và phần trăm vào dataset
//            }
//
//            // Create chart
//            JFreeChart pieChart = ChartFactory.createPieChart("Department Distribution", pieDataset, true, true, false);
//
//            // Customize plot
//            PiePlot piePlot = (PiePlot) pieChart.getPlot();
//            piePlot.setBackgroundPaint(Color.white);
//            for (Map.Entry<String, Color> entry : departmentColors.entrySet()) {
//                piePlot.setSectionPaint(entry.getKey(), entry.getValue());
//            }
//            // Step 4: Create chart panel and display
//            ChartPanel chartPanel = new ChartPanel(pieChart);
//            panelPieChart.removeAll();
//            panelPieChart.add(chartPanel, BorderLayout.CENTER);
//            panelPieChart.validate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error while fetching department data: " + ex.getMessage());
//        }
//    }
//    public void showLineChart(){
//        //create dataset for the graph
//         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.setValue(200, "Amount", "january");
//        dataset.setValue(150, "Amount", "february");
//        dataset.setValue(18, "Amount", "march");
//        dataset.setValue(100, "Amount", "april");
//        dataset.setValue(80, "Amount", "may");
//        dataset.setValue(250, "Amount", "june");
//        
//        //create chart
//        JFreeChart linechart = ChartFactory.createLineChart("contribution","monthly","amount", 
//                dataset, PlotOrientation.VERTICAL, false,true,false);
//        
//        //create plot object
//         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
//       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
//        lineCategoryPlot.setBackgroundPaint(Color.white);
//        
//        //create render object to change the moficy the line properties like color
//        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
//        Color lineChartColor = new Color(204,0,51);
//        lineRenderer.setSeriesPaint(0, lineChartColor);
//        
//         //create chartPanel to display chart(graph)
//        ChartPanel lineChartPanel = new ChartPanel(linechart);
//        panelLineChart.removeAll();
//        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
//        panelLineChart.validate();
//    }
//    public double[] getEmployeeScores() {
//        ArrayList<Double> scoresList = new ArrayList<>();
//    
//    try {
//        // Kết nối tới cơ sở dữ liệu
//        
//        String sql = "SELECT `id`, `name`, `ngay`, `nguoidanhgia`, `diem`, `xeploai` FROM `employee_evaluate` ";
//        ps = conn.prepareStatement(sql);
//        rs = ps.executeQuery();
//        
//        // Truy vấn dữ liệu
//        String query = "SELECT `diem` FROM `employee_evaluate`";
//        ResultSet rs = ps.executeQuery(query);
//        
//        // Lấy điểm số và thêm vào danh sách
//        while (rs.next()) {
//            scoresList.add(rs.getDouble("diem"));
//        }
//        
//        // Đóng kết nối
//        rs.close();
//        ps.close();
//        conn.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    
//    // Chuyển đổi ArrayList thành mảng
//    double[] scores = new double[scoresList.size()];
//    for (int i = 0; i < scoresList.size(); i++) {
//        scores[i] = scoresList.get(i);
//    }
//    
//    return scores;
//}
//
//    public void showHistogram(){
//        
//        double[] values = getEmployeeScores();  // Lấy dữ liệu từ cơ sở dữ liệu
//    
//    HistogramDataset dataset = new HistogramDataset();
//    dataset.addSeries("key", values, 20);
//    
//    JFreeChart chart = ChartFactory.createHistogram("JFreeChart Histogram", "Data", "Frequency", dataset, PlotOrientation.VERTICAL, false, true, false);
//    XYPlot plot = chart.getXYPlot();
//    plot.setBackgroundPaint(Color.WHITE);
//    
//    ChartPanel barChartPanel2 = new ChartPanel(chart);
//    jPanel3.removeAll();
//    jPanel3.setLayout(new BorderLayout());
//    jPanel3.add(barChartPanel2, BorderLayout.CENTER);
//    jPanel3.validate();
//    }
//    public void showBarChart() {
//    try {
//        String sql = "SELECT department, COUNT(*) AS employee_count FROM employee_list GROUP BY department";
//        ps = conn.prepareStatement(sql);
//        rs = ps.executeQuery();
//
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        while (rs.next()) {
//            String department = rs.getString("department");
//            int count = rs.getInt("employee_count");
//            dataset.setValue(count, "Employees", department);
//        }
//
//        JFreeChart barChart = ChartFactory.createBarChart(
//            "Number of Employees per Department",
//            "Department",
//            "Number of Employees",
//            dataset,
//            PlotOrientation.VERTICAL,
//            false, true, false);
//
//        CategoryPlot plot = barChart.getCategoryPlot();
//        plot.setBackgroundPaint(Color.white);
//        BarRenderer renderer = (BarRenderer) plot.getRenderer();
//        renderer.setSeriesPaint(0, new Color(204, 0, 51));
//
//        ChartPanel barChartPanel = new ChartPanel(barChart);
//        jPanel1.removeAll();
//        jPanel1.add(barChartPanel, BorderLayout.CENTER);
//        jPanel1.validate();
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error while fetching department data: " + ex.getMessage());
//    }
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPieChart = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(950, 650));
        setSize(new java.awt.Dimension(900, 600));

        panelPieChart.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Quay lại");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
//        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChartAdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelPieChart;
    // End of variables declaration//GEN-END:variables
}
