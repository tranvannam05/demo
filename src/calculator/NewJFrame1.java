package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class NewJFrame1 extends javax.swing.JFrame {

    // tao 2 bien
    String tinhToan = "";
    String toanTu = " ";
    // để nhận biết khi nào bấm dấu =
    boolean ktdaubang = false;
    private boolean DarkMode = false;

    private void doiGiaoDien(boolean darkMode) {
        Color nen = darkMode ? Color.DARK_GRAY : Color.WHITE;
        Color chu = darkMode ? Color.WHITE : Color.BLACK;

        // Thay đổi màu nền và chữ
        this.getContentPane().setBackground(nen);  // background form

        nhap.setBackground(nen);
        nhap.setForeground(chu);

        lichSu.setBackground(nen);
        lichSu.setForeground(chu);

        number_cong.setBackground(nen);
        number_cong.setForeground(chu);

        number_tru.setBackground(nen);
        number_tru.setForeground(chu);

        number_nhan.setBackground(nen);
        number_nhan.setForeground(chu);

        number_chia.setBackground(nen);
        number_chia.setForeground(chu);

        number_bang.setBackground(nen);
        number_bang.setForeground(chu);

        number_XmuY.setBackground(nen);
        number_XmuY.setForeground(chu);

        number_canbac2.setBackground(nen);
        number_canbac2.setForeground(chu);

        number_cham.setBackground(nen);
        number_cham.setForeground(chu);

        number_huy.setBackground(nen);
        number_huy.setForeground(chu);

        number_phantram.setBackground(nen);
        number_phantram.setForeground(chu);

        // Gọi phương thức xử lý sự kiện
        // Sau đó đổi màu nền cho button number1 (giả sử bạn đã khai báo number1)
        log.setForeground(chu);
        log.setBackground(nen);
        jButton10.setForeground(chu);
        jButton10.setBackground(nen);
        jButton12.setForeground(chu);
        jButton12.setBackground(nen);
        jButton13.setForeground(chu);
        jButton13.setBackground(nen);
        jButton14.setForeground(chu);
        jButton14.setBackground(nen);
        jButton15.setForeground(chu);
        jButton15.setBackground(nen);
        jButton16.setForeground(chu);
        jButton16.setBackground(nen);
        jButton17.setForeground(chu);
        jButton17.setBackground(nen);
        jButton18.setForeground(chu);
        jButton18.setBackground(nen);
        jButton2.setForeground(chu);
        jButton2.setBackground(nen);
        jButton3.setForeground(chu);
        jButton3.setBackground(nen);
        jButton4.setForeground(chu);
        jButton4.setBackground(nen);
        jButton5.setForeground(chu);
        jButton5.setBackground(nen);
        jButton6.setForeground(chu);
        jButton6.setBackground(nen);
        jButton7.setForeground(chu);
        jButton7.setBackground(nen);
        jButton8.setForeground(chu);
        jButton8.setBackground(nen);
        jButton9.setForeground(chu);
        jButton9.setBackground(nen);
        jButton1.setForeground(chu);
        jButton1.setBackground(nen);
        number1.setForeground(chu);
        number1.setBackground(nen);
        number_xoa.setForeground(chu);
        number_xoa.setBackground(nen);
        xoaLichSu.setForeground(chu);
        xoaLichSu.setBackground(nen);          
       // Lặp lại với các thành phần khác bạn có
    }

    private double xuli(String input) throws Exception {
        input = input.replaceAll("\\s+", ""); // Xoá khoảng trắng

        if (input.contains("+")) {
            String[] parts = input.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (input.contains("-")) {
            String[] parts = input.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (input.contains("*")) {
            String[] parts = input.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (input.contains("/")) {
            String[] parts = input.split("/");
            double b = Double.parseDouble(parts[1]);
            if (b == 0) {
                throw new Exception("Không chia cho 0");
            }
            return Double.parseDouble(parts[0]) / b;
        } else {
            throw new Exception("Cú pháp không hợp lệ");
        }
    }

    private void ghiVaoFile(String dongLichSu) {
        try (FileWriter fw = new FileWriter("E:\\Project\\file.txt", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(dongLichSu);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public NewJFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        nhap = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        number_canbac2 = new javax.swing.JButton();
        number_phantram = new javax.swing.JButton();
        number_XmuY = new javax.swing.JButton();
        number_xoa = new javax.swing.JButton();
        number_huy = new javax.swing.JButton();
        number_cham = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        number_chia = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        number_nhan = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        number_tru = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        number_cong = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        number_bang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lichSu = new javax.swing.JTextArea();
        xoaLichSu = new javax.swing.JButton();
        color = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nhap.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nhap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 5, 5));

        number_canbac2.setText("√x");
        number_canbac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_canbac2ActionPerformed(evt);
            }
        });
        jPanel2.add(number_canbac2);

        number_phantram.setText("%");
        number_phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_phantramActionPerformed(evt);
            }
        });
        jPanel2.add(number_phantram);

        number_XmuY.setText("xʸ");
        number_XmuY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_XmuYActionPerformed(evt);
            }
        });
        jPanel2.add(number_XmuY);

        number_xoa.setText("Backspace");
        number_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(number_xoa);

        number_huy.setBackground(new java.awt.Color(204, 255, 255));
        number_huy.setText("C");
        number_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_huyActionPerformed(evt);
            }
        });
        jPanel2.add(number_huy);

        number_cham.setText(".");
        number_cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_chamActionPerformed(evt);
            }
        });
        jPanel2.add(number_cham);

        jButton3.setText("n!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton12.setText("°");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);

        jButton14.setText("Radian");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        number_chia.setText("/");
        number_chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_chiaActionPerformed(evt);
            }
        });
        jPanel2.add(number_chia);

        jButton16.setText("cos(x)");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);

        jButton7.setText("9");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        log.setText("log₁₀ x");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel2.add(log);

        jButton13.setText("ln x");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);

        number_nhan.setText("*");
        number_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_nhanActionPerformed(evt);
            }
        });
        jPanel2.add(number_nhan);

        jButton15.setText("sin(x)");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton6.setText("8");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton1.setText("7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("6");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        number_tru.setText("-");
        number_tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_truActionPerformed(evt);
            }
        });
        jPanel2.add(number_tru);

        jButton18.setText("cot(x)");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton4.setText("5");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton8.setText("3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        number_cong.setText("+");
        number_cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_congActionPerformed(evt);
            }
        });
        jPanel2.add(number_cong);

        jButton17.setText("tan(x)");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton10.setText("2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(number1);

        jButton9.setText("0");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        number_bang.setText("=");
        number_bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_bangActionPerformed(evt);
            }
        });
        jPanel2.add(number_bang);

        lichSu.setColumns(20);
        lichSu.setRows(5);
        jScrollPane2.setViewportView(lichSu);

        xoaLichSu.setText("xóa");
        xoaLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaLichSuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(xoaLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        color.setText("Color");
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(color)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapActionPerformed
        String input = nhap.getText().trim();
        try {
            double result = xuli(input); // Gọi hàm xử lý biểu thức
            nhap.setText("" + result); // Hiển thị kết quả ngay trên textfield
        } catch (Exception e) {
            nhap.setText("Lỗi cú pháp");
        }
    }//GEN-LAST:event_nhapActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed

        // xử lí nhập số khi đã nhập  kết quả 
        if (ktdaubang) {
            ktdaubang = false;
            // xóa trắng kết quả
            nhap.setText("");
        }

        String tmd = evt.getActionCommand();

        nhap.setText(nhap.getText() + tmd);
    }//GEN-LAST:event_number1ActionPerformed

    private void number_congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_congActionPerformed
        // TODO add your handling code here:
        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_congActionPerformed

    private void number_bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_bangActionPerformed

        if (nhap.getText().equals("") || tinhToan.equals("")) {
            // kiểm tra lỗi nếu nhập bị sai,thiếu
            JOptionPane.showMessageDialog(this, "Lỗi: Chưa nhập đủ dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
            // kết thúc không thực hiện phép tính
            return;
        }
        try {
            // chuyển về số thực
            double nhap1 = Double.parseDouble(tinhToan);
            double nhap2 = Double.parseDouble(nhap.getText());
            double ketQua = 0;
            // nếu mà tổng thì cộng 2 giá trị
            if (toanTu.equals("+")) {
                ketQua = nhap1 + nhap2;
            } else if (toanTu.equals("-")) {
                ketQua = nhap1 - nhap2;
            } else if (toanTu.equals("*")) {
                ketQua = nhap1 * nhap2;
            } else if (toanTu.equals("/")) {
                // nếu nhập phần tử thứ 2 thì sẽ hiện thị ra thông báo lỗi vì không chia được
                if (nhap2 == 0) {
                    // hiện thị ra câu thông báo
                    JOptionPane.showMessageDialog(this, "Lỗi: Không thể chia cho 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    nhap.setText("");
                    return;
                }
                ketQua = nhap1 / nhap2;

            } else if (toanTu.equals("xʸ")) {
                ketQua = Math.pow(nhap1, nhap2);

            }

            // Làm tròn kết quả để loại bỏ sai số nhỏ
            ketQua = Math.round(ketQua * 100.0) / 100.0; // Làm tròn kết quả đến 2 chữ số thập phân
            String dongLichSu = ""; // tạo dòng lịch sử để ghi file

            if (Math.floor(ketQua) == ketQua) {
                nhap.setText("" + (int) ketQua); // Hiển thị số nguyên
                dongLichSu = (int) nhap1 + " " + toanTu + " " + (int) nhap2 + " = " + (int) ketQua;
            } else {
                nhap.setText("" + ketQua); // Hiển thị số thực
                dongLichSu = nhap1 + " " + toanTu + " " + nhap2 + " = " + ketQua;
            }

            lichSu.append(dongLichSu + "\n"); // ghi vào lịch sử giao diện
            ghiVaoFile(dongLichSu);
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_number_bangActionPerformed

    private void number_truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_truActionPerformed

        String tmd = evt.getActionCommand();

        // kiem tra xem nhap co bi rong khong
        if (nhap.getText().isEmpty()) {
            // neu o rong thi nhap dau -
            nhap.setText("-");
            return;
        }
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_truActionPerformed

    private void number_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_nhanActionPerformed

        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_nhanActionPerformed

    private void number_chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_chiaActionPerformed

        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_chiaActionPerformed

    private void number_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_huyActionPerformed
        // TODO add your handling code here:
        // chuyển tất cả bằng rổng hết
        nhap.setText("");
        tinhToan = "";
        toanTu = "";
        // để xóa trắng toàn bộ
        ktdaubang = false;
    }//GEN-LAST:event_number_huyActionPerformed

    private void number_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_xoaActionPerformed
        // TODO add your handling code here:
        // lấy nội dung hiển thị từ nhập ra
        String text = nhap.getText();
        // kiểm tra xem có bị rỗng hay không
        if (!text.isEmpty()) {
            nhap.setText(text.substring(0, text.length() - 1));// xóa ký tự chỗi cuối cùng       
        }
    }//GEN-LAST:event_number_xoaActionPerformed

    private void number_phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_phantramActionPerformed
        String tmd = evt.getActionCommand();
        // nếu mà nhâp để không thì không có chuyện gì xảy ra
        if (nhap.getText().equals("")) {
            return;
        }
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("%")) {
                a = a * 0.01;
            }
            nhap.setText("" + a);
            // lưu lịch sử vào phép tính
            String lichsu = sobandau + "%" + " = " + a;
            // thêm vào trong LichSu
            lichSu.append(lichsu + "\n");
            // kiểm tra dấu bằng để khỏ nhập tiếp tục từ bàn phím
            ghiVaoFile(lichsu);
            ktdaubang = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_number_phantramActionPerformed

    private void number_canbac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_canbac2ActionPerformed
        if (nhap.getText().equals("")) {
            return; // Nếu ô nhập rỗng thì không làm gì cả
        }
        String tmd = evt.getActionCommand();
        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;
            if (tmd.equals("√x")) {
                if (a < 0) {
                    // Hiển thị hộp thoại lỗi
                    JOptionPane.showMessageDialog(this, "Lỗi: Không thể tính căn bậc hai của số âm!", "Lỗi", JOptionPane.ERROR_MESSAGE);

                    // Xóa nội dung của text field
                    nhap.setText("");
                    return; // Dừng chương trình ngay tại đây, không tiếp tục tính toán
                }
                a = Math.sqrt(a);
            }

            // Hiển thị kết quả
            nhap.setText("" + a);

            // Lưu lịch sử vào phép tính
            String lichsu = "√" + sobandau + " = " + a;
            lichSu.append(lichsu + "\n");

            // Đánh dấu rằng có thể nhập số mới
            ghiVaoFile(lichsu);
            ktdaubang = true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            // Xóa nội dung của text field nếu có lỗi nhập liệu
            nhap.setText("");
        }
    }//GEN-LAST:event_number_canbac2ActionPerformed

    private void number_XmuYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_XmuYActionPerformed

        // lấy nội dung từ các nút
        String tmd = evt.getActionCommand();
        // lưu tmd vào trong Toán tử
        toanTu = tmd;
        // lưu tính toán thứ nhất  ở trong toán tử
        tinhToan = nhap.getText();
        // thực hiện xóa trắng để cho phép nhập tiếp
        nhap.setText("");
    }//GEN-LAST:event_number_XmuYActionPerformed

    private void number_chamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_chamActionPerformed

        // lấy nội dung từ nhập ra 
        String text = nhap.getText();
        if (text.isEmpty()) {
            nhap.setText("0."); // nếu trong lần nhập bị rỗng thì bắt đầu với số 0 đầu tiên           
        } else if (!text.contains(".")) {
            // thêm vào trong nhập
            nhap.setText(text + ".");

        }
    }//GEN-LAST:event_number_chamActionPerformed

    private void xoaLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaLichSuActionPerformed
        // để  lịch sử thành rỗng
        lichSu.setText("");
        // Xóa nội dung file
        try {
            FileWriter fw = new FileWriter("E:\\Project\\file.txt", false); // false để ghi đè
            fw.write(""); // Ghi rỗng để xóa nội dung
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_xoaLichSuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (nhap.getText().equals("")) {
            return; // Nếu ô nhập rỗng thì không làm gì cả
        }

        try {
            double a = Double.parseDouble(nhap.getText());
            int n = (int) a; // Lấy phần nguyên vì giai thừa chỉ áp dụng cho số nguyên không âm
            double sobandau = a;

            if (a < 0 || a != n) {
                // Giai thừa không định nghĩa cho số âm hoặc số thực
                JOptionPane.showMessageDialog(this, "Lỗi: Giai thừa chỉ áp dụng cho số nguyên không âm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                nhap.setText("");
                return;
            }

            long giaithua = 1;
            for (int i = 2; i <= n; i++) {
                giaithua *= i;
            }

            nhap.setText("" + giaithua);

            // Lưu lịch sử vào phép tính
            String lichsu = n + "! = " + giaithua;
            lichSu.append(lichsu + "\n");

            // Đánh dấu rằng có thể nhập số mới
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        if (nhap.getText().equals("")) {
            return; // Nếu ô nhập rỗng thì không làm gì cả
        }

        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;

            if (a <= 0) {
                // log10 không xác định với x <= 0
                JOptionPane.showMessageDialog(this, "Lỗi: log₁₀(x) chỉ xác định với x > 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                nhap.setText("");
                return;
            }

            double ketqua = Math.log10(a);

            nhap.setText("" + ketqua);

            // Lưu vào lịch sử
            String lichsu = "log₁₀(" + sobandau + ") = " + ketqua;
            lichSu.append(lichsu + "\n");

            // Cho phép nhập mới
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_logActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (nhap.getText().equals("")) {
            return; // Nếu ô nhập rỗng thì không làm gì cả
        }

        try {
            double a = Double.parseDouble(nhap.getText());
            double sobandau = a;

            if (a <= 0) {
                // ln không xác định với x <= 0
                JOptionPane.showMessageDialog(this, "Lỗi: ln(x) chỉ xác định với x > 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                nhap.setText("");
                return;
            }

            double ketqua = Math.log(a); // log tự nhiên (cơ số e)

            nhap.setText("" + ketqua);

            // Lưu vào lịch sử
            String lichsu = "ln(" + sobandau + ") = " + ketqua;
            lichSu.append(lichsu + "\n");

            // Cho phép nhập mới
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double a = Double.parseDouble(nhap.getText());
            double radian = Math.toRadians(a); // hoặc degree * Math.PI / 180

            nhap.setText("" + radian);
            lichSu.append(a + "° = " + radian + " rad\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double radian = Double.parseDouble(nhap.getText());
            double a = Math.toDegrees(radian); // hoặc radian * 180 / Math.PI

            nhap.setText("" + a);
            lichSu.append(radian + " rad = " + a + "°\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double x = Double.parseDouble(nhap.getText());

            double tong = Math.sin(x);
            nhap.setText("" + tong);
            lichSu.append("sin(" + x + " rad) = " + tong + "\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double x = Double.parseDouble(nhap.getText());

            double tong = Math.cos(x);
            nhap.setText("" + tong);
            lichSu.append("cos(" + x + " rad) = " + tong + "\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double x = Double.parseDouble(nhap.getText());

            if (Math.cos(x) == 0) {
                JOptionPane.showMessageDialog(this, "Lỗi: tan(x) không xác định tại góc này!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                nhap.setText("");
                return;
            }

            double tong = Math.tan(x);
            nhap.setText("" + tong);
            lichSu.append("tan(" + x + " rad) = " + tong + "\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (nhap.getText().equals("")) {
            return;
        }

        try {
            double x = Double.parseDouble(nhap.getText());

            double tan = Math.tan(x);

            if (tan == 0) {
                JOptionPane.showMessageDialog(this, "Lỗi: cot(x) không xác định tại góc này!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                nhap.setText("");
                return;
            }

            double result = 1.0 / tan;
            nhap.setText("" + result);
            lichSu.append("cot(" + x + " rad) = " + result + "\n");
            ktdaubang = true;

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: Đầu vào không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            nhap.setText("");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        DarkMode = !DarkMode;
        doiGiaoDien(DarkMode);

        // (Tùy chọn) Đổi lại text trên nút
        if (DarkMode) {
            color.setText("light");
        } else {
            color.setText("dark");
        }
    }//GEN-LAST:event_colorActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton color;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea lichSu;
    private javax.swing.JButton log;
    private javax.swing.JTextField nhap;
    private javax.swing.JButton number1;
    private javax.swing.JButton number_XmuY;
    private javax.swing.JButton number_bang;
    private javax.swing.JButton number_canbac2;
    private javax.swing.JButton number_cham;
    private javax.swing.JButton number_chia;
    private javax.swing.JButton number_cong;
    private javax.swing.JButton number_huy;
    private javax.swing.JButton number_nhan;
    private javax.swing.JButton number_phantram;
    private javax.swing.JButton number_tru;
    private javax.swing.JButton number_xoa;
    private javax.swing.JButton xoaLichSu;
    // End of variables declaration//GEN-END:variables
}
