/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aayush
 */
public class Add_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_Employee
     */
    public Add_Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITLE = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dob2 = new javax.swing.JTextField();
        rollno11 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        back_2 = new javax.swing.JButton();
        name12 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        roll = new javax.swing.JLabel();
        employee_id2 = new javax.swing.JTextField();
        age2 = new javax.swing.JTextField();
        phone2 = new javax.swing.JTextField();
        aadhar2 = new javax.swing.JTextField();
        address2 = new javax.swing.JTextField();
        email2 = new javax.swing.JTextField();
        rollno13 = new javax.swing.JLabel();
        rollno14 = new javax.swing.JLabel();
        rollno16 = new javax.swing.JLabel();
        rollno17 = new javax.swing.JLabel();
        rollno18 = new javax.swing.JLabel();
        rollno12 = new javax.swing.JLabel();
        add_employee_2 = new javax.swing.JButton();
        position2 = new javax.swing.JTextField();
        dept2 = new javax.swing.JTextField();
        TITLE1 = new javax.swing.JLabel();
        rollno15 = new javax.swing.JLabel();
        course2 = new javax.swing.JTextField();
        qualification2 = new javax.swing.JTextField();
        rollno19 = new javax.swing.JLabel();

        TITLE.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TITLE.setText("      ADD STUDENT DETAILS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(31, 36, 42));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dob2.setBackground(new java.awt.Color(31, 36, 42));
        dob2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dob2.setForeground(new java.awt.Color(255, 255, 255));
        dob2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        dob2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dob2MouseMoved(evt);
            }
        });
        jPanel6.add(dob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 160, 40));

        rollno11.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno11.setForeground(new java.awt.Color(169, 224, 49));
        rollno11.setText("Position");
        jPanel6.add(rollno11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 90, 20));

        name11.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        name11.setForeground(new java.awt.Color(169, 224, 49));
        name11.setText("Age");
        jPanel6.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 20));

        back_2.setBackground(new java.awt.Color(152, 201, 45));
        back_2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        back_2.setForeground(new java.awt.Color(21, 25, 28));
        back_2.setText("Back");
        back_2.setBorder(null);
        back_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_2.setFocusPainted(false);
        back_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_2ActionPerformed(evt);
            }
        });
        jPanel6.add(back_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 290, 40));

        name12.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        name12.setForeground(new java.awt.Color(169, 224, 49));
        name12.setText("Name");
        jPanel6.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 20));

        name2.setBackground(new java.awt.Color(31, 36, 42));
        name2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        name2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                name2MouseMoved(evt);
            }
        });
        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });
        jPanel6.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 160, 40));

        roll.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        roll.setForeground(new java.awt.Color(169, 224, 49));
        roll.setText("EMPLOYEE ID");
        jPanel6.add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 20));

        employee_id2.setBackground(new java.awt.Color(31, 36, 42));
        employee_id2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        employee_id2.setForeground(new java.awt.Color(255, 255, 255));
        employee_id2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        employee_id2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                employee_id2MouseMoved(evt);
            }
        });
        employee_id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_id2ActionPerformed(evt);
            }
        });
        jPanel6.add(employee_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, 40));

        age2.setBackground(new java.awt.Color(31, 36, 42));
        age2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        age2.setForeground(new java.awt.Color(255, 255, 255));
        age2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        age2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                age2MouseMoved(evt);
            }
        });
        age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age2ActionPerformed(evt);
            }
        });
        jPanel6.add(age2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 160, 40));

        phone2.setBackground(new java.awt.Color(31, 36, 42));
        phone2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        phone2.setForeground(new java.awt.Color(255, 255, 255));
        phone2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        phone2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                phone2MouseMoved(evt);
            }
        });
        phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2ActionPerformed(evt);
            }
        });
        jPanel6.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 160, 40));

        aadhar2.setBackground(new java.awt.Color(31, 36, 42));
        aadhar2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        aadhar2.setForeground(new java.awt.Color(255, 255, 255));
        aadhar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        aadhar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                aadhar2MouseMoved(evt);
            }
        });
        aadhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar2ActionPerformed(evt);
            }
        });
        jPanel6.add(aadhar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 160, 40));

        address2.setBackground(new java.awt.Color(31, 36, 42));
        address2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        address2.setForeground(new java.awt.Color(255, 255, 255));
        address2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        address2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                address2MouseMoved(evt);
            }
        });
        address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address2ActionPerformed(evt);
            }
        });
        jPanel6.add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 160, 40));

        email2.setBackground(new java.awt.Color(31, 36, 42));
        email2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        email2.setForeground(new java.awt.Color(255, 255, 255));
        email2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        email2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                email2MouseMoved(evt);
            }
        });
        email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2ActionPerformed(evt);
            }
        });
        jPanel6.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 160, 40));

        rollno13.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno13.setForeground(new java.awt.Color(169, 224, 49));
        rollno13.setText("DOB");
        jPanel6.add(rollno13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 20));

        rollno14.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno14.setForeground(new java.awt.Color(169, 224, 49));
        rollno14.setText("Phone");
        jPanel6.add(rollno14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 20));

        rollno16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno16.setForeground(new java.awt.Color(169, 224, 49));
        rollno16.setText("AADHAR");
        jPanel6.add(rollno16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 90, 20));

        rollno17.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno17.setForeground(new java.awt.Color(169, 224, 49));
        rollno17.setText("Address");
        jPanel6.add(rollno17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 20));

        rollno18.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno18.setForeground(new java.awt.Color(169, 224, 49));
        rollno18.setText("E-Mail");
        jPanel6.add(rollno18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 20));

        rollno12.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno12.setForeground(new java.awt.Color(169, 224, 49));
        rollno12.setText("Qualification");
        jPanel6.add(rollno12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, 20));

        add_employee_2.setBackground(new java.awt.Color(152, 201, 45));
        add_employee_2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_employee_2.setForeground(new java.awt.Color(21, 25, 28));
        add_employee_2.setText("ADD EMPLOYEE");
        add_employee_2.setBorder(null);
        add_employee_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_employee_2.setFocusPainted(false);
        add_employee_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee_2ActionPerformed(evt);
            }
        });
        jPanel6.add(add_employee_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 290, 40));

        position2.setBackground(new java.awt.Color(31, 36, 42));
        position2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        position2.setForeground(new java.awt.Color(255, 255, 255));
        position2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        position2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                position2MouseMoved(evt);
            }
        });
        position2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                position2ActionPerformed(evt);
            }
        });
        jPanel6.add(position2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 160, 40));

        dept2.setBackground(new java.awt.Color(31, 36, 42));
        dept2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dept2.setForeground(new java.awt.Color(255, 255, 255));
        dept2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        dept2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dept2MouseMoved(evt);
            }
        });
        dept2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept2ActionPerformed(evt);
            }
        });
        jPanel6.add(dept2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 160, 40));

        TITLE1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(169, 224, 49));
        TITLE1.setText("   ADD EMPLOYEE DETAILS");
        jPanel6.add(TITLE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        rollno15.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno15.setForeground(new java.awt.Color(169, 224, 49));
        rollno15.setText("Course");
        jPanel6.add(rollno15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 20));

        course2.setBackground(new java.awt.Color(31, 36, 42));
        course2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        course2.setForeground(new java.awt.Color(255, 255, 255));
        course2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        course2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                course2MouseMoved(evt);
            }
        });
        course2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course2ActionPerformed(evt);
            }
        });
        jPanel6.add(course2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 160, 40));

        qualification2.setBackground(new java.awt.Color(31, 36, 42));
        qualification2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        qualification2.setForeground(new java.awt.Color(255, 255, 255));
        qualification2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        qualification2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                qualification2MouseMoved(evt);
            }
        });
        qualification2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualification2ActionPerformed(evt);
            }
        });
        jPanel6.add(qualification2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 160, 40));

        rollno19.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        rollno19.setForeground(new java.awt.Color(169, 224, 49));
        rollno19.setText("DEPT.");
        jPanel6.add(rollno19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        setBounds(320, 50, 738, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void dob2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dob2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_dob2MouseMoved

    private void back_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_2ActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_back_2ActionPerformed

    private void name2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_name2MouseMoved

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void employee_id2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_id2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_employee_id2MouseMoved

    private void employee_id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employee_id2ActionPerformed

    private void age2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_age2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_age2MouseMoved

    private void age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age2ActionPerformed

    private void phone2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2MouseMoved

    private void phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2ActionPerformed

    private void aadhar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aadhar2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar2MouseMoved

    private void aadhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar2ActionPerformed

    private void address2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_address2MouseMoved

    private void address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address2ActionPerformed

    private void email2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_email2MouseMoved

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void add_employee_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee_2ActionPerformed
        String A1=employee_id2.getText();
        String A2=name2.getText();
        String A3=age2.getText();
        String A4=dob2.getText();
        String A5=address2.getText();
        String A6=phone2.getText();
        String A7=email2.getText();
        String A8=aadhar2.getText();
        String A9=course2.getText();
        String A10=dept2.getText();
        String A11=qualification2.getText();
        String A12=position2.getText();
        try{
            database_connection cc2 = new database_connection();
            String query = "insert into employee values('"+A1+"','"+A2+"','"+A3+"','"+A4+"','"+A5+"','"+A6+"','"+A7+"','"+A8+"','"+A9+"','"+A10+"','"+A11+"','"+A12+"')";
            cc2.stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Employee Details Inserted Successfully");
        }catch(HeadlessException | SQLException ff){
            JOptionPane.showMessageDialog(null,"Can't Enter Details. Please Try Again");
            System.out.println("The error is:"+ff);
    }//GEN-LAST:event_add_employee_2ActionPerformed
        JOptionPane.showMessageDialog(null,"Now You Can Add Another Employee");
        employee_id2.setText("");
        name2.setText("");
        age2.setText("");
        dob2.setText("");
        address2.setText("");
        phone2.setText("");
        email2.setText("");
        aadhar2.setText("");
        position2.setText("");
        dept2.setText("");
        qualification2.setText("");
        position2.setText("");
    }
    private void position2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_position2MouseMoved

    private void position2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_position2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_position2ActionPerformed

    private void dept2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dept2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_dept2MouseMoved

    private void dept2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept2ActionPerformed

    private void course2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_course2MouseMoved

    private void course2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course2ActionPerformed

    private void qualification2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qualification2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_qualification2MouseMoved

    private void qualification2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualification2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualification2ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add_Employee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel TITLE;
    public javax.swing.JLabel TITLE1;
    private javax.swing.JTextField aadhar2;
    private javax.swing.JButton add_employee_2;
    private javax.swing.JTextField address2;
    private javax.swing.JTextField age2;
    private javax.swing.JButton back_2;
    private javax.swing.JTextField course2;
    private javax.swing.JTextField dept2;
    private javax.swing.JTextField dob2;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField employee_id2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField phone2;
    private javax.swing.JTextField position2;
    private javax.swing.JTextField qualification2;
    private javax.swing.JLabel roll;
    private javax.swing.JLabel rollno11;
    private javax.swing.JLabel rollno12;
    private javax.swing.JLabel rollno13;
    private javax.swing.JLabel rollno14;
    private javax.swing.JLabel rollno15;
    private javax.swing.JLabel rollno16;
    private javax.swing.JLabel rollno17;
    private javax.swing.JLabel rollno18;
    private javax.swing.JLabel rollno19;
    // End of variables declaration//GEN-END:variables
}
