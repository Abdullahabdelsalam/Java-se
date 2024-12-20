      /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javase.gui;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullah
 */
public class JFrameTestComponents extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTestComponents
     */
    public JFrameTestComponents() {
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

        buttonGroupColor = new javax.swing.ButtonGroup();
        jPanelWelcome = new javax.swing.JPanel();
        jButtonWelcome = new javax.swing.JButton();
        jLabelUserName = new javax.swing.JLabel();
        jTextFieldWelcome = new javax.swing.JTextField();
        jTextFieldSetMassage = new javax.swing.JTextField();
        jPanelColorPanel = new javax.swing.JPanel();
        jRadioButtonRed = new javax.swing.JRadioButton();
        jRadioButtonBlue = new javax.swing.JRadioButton();
        jRadioButtonGreen = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldReadColor = new javax.swing.JTextField();
        jPanelSports = new javax.swing.JPanel();
        jCheckBoxFootball = new javax.swing.JCheckBox();
        jCheckBoxBasketball = new javax.swing.JCheckBox();
        jCheckBoxValleyball = new javax.swing.JCheckBox();
        jCheckBoxHandball = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSport = new javax.swing.JTextArea();
        jButtonReadSports = new javax.swing.JButton();
        jLabelImge = new javax.swing.JLabel();
        jPanelCountry = new javax.swing.JPanel();
        jLabelSelectCountry = new javax.swing.JLabel();
        jLabelCountrySelected = new javax.swing.JLabel();
        jComboBoxCountry = new javax.swing.JComboBox<>();
        jTextFieldSetcountry = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelWelcome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Welcome Panel"));
        jPanelWelcome.setOpaque(false);

        jButtonWelcome.setText("Say Hello");
        jButtonWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWelcomeActionPerformed(evt);
            }
        });

        jLabelUserName.setText("User Name");

        javax.swing.GroupLayout jPanelWelcomeLayout = new javax.swing.GroupLayout(jPanelWelcome);
        jPanelWelcome.setLayout(jPanelWelcomeLayout);
        jPanelWelcomeLayout.setHorizontalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldSetMassage)
                    .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                        .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldWelcome))))
                .addGap(17, 17, 17))
        );
        jPanelWelcomeLayout.setVerticalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName)
                    .addComponent(jTextFieldWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldSetMassage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelColorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Color Panel"));
        jPanelColorPanel.setToolTipText("");
        jPanelColorPanel.setOpaque(false);

        buttonGroupColor.add(jRadioButtonRed);
        jRadioButtonRed.setSelected(true);
        jRadioButtonRed.setText("Red");
        jRadioButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRedActionPerformed(evt);
            }
        });

        buttonGroupColor.add(jRadioButtonBlue);
        jRadioButtonBlue.setText("Blue");
        jRadioButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBlueActionPerformed(evt);
            }
        });

        buttonGroupColor.add(jRadioButtonGreen);
        jRadioButtonGreen.setText("Green");
        jRadioButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGreenActionPerformed(evt);
            }
        });

        jButton1.setText("Read Color Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColorPanelLayout = new javax.swing.GroupLayout(jPanelColorPanel);
        jPanelColorPanel.setLayout(jPanelColorPanelLayout);
        jPanelColorPanelLayout.setHorizontalGroup(
            jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonRed, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColorPanelLayout.createSequentialGroup()
                        .addComponent(jTextFieldReadColor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColorPanelLayout.setVerticalGroup(
            jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonRed)
                .addGap(18, 18, 18)
                .addGroup(jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBlue)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanelColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldReadColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonGreen))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelSports.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Sports Panel"));
        jPanelSports.setOpaque(false);

        jCheckBoxFootball.setText("Football");
        jCheckBoxFootball.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxFootballItemStateChanged(evt);
            }
        });
        jCheckBoxFootball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFootballActionPerformed(evt);
            }
        });

        jCheckBoxBasketball.setText("Basketball");
        jCheckBoxBasketball.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxBasketballItemStateChanged(evt);
            }
        });

        jCheckBoxValleyball.setText("valleyball");
        jCheckBoxValleyball.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxValleyballItemStateChanged(evt);
            }
        });
        jCheckBoxValleyball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxValleyballActionPerformed(evt);
            }
        });

        jCheckBoxHandball.setText("Handball");
        jCheckBoxHandball.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxHandballItemStateChanged(evt);
            }
        });

        jTextAreaSport.setColumns(20);
        jTextAreaSport.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSport);

        jButtonReadSports.setText("Read Sports");
        jButtonReadSports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadSportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSportsLayout = new javax.swing.GroupLayout(jPanelSports);
        jPanelSports.setLayout(jPanelSportsLayout);
        jPanelSportsLayout.setHorizontalGroup(
            jPanelSportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFootball, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxBasketball, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxValleyball, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSportsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonReadSports)
                .addGap(56, 56, 56))
        );
        jPanelSportsLayout.setVerticalGroup(
            jPanelSportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxFootball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxBasketball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxValleyball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxHandball)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSportsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReadSports)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jLabelImge.setIcon(new javax.swing.ImageIcon("E:\\sd\\WhatsApp Image 2024-01-07 at 13.16.12_ac70a896.jpg")); // NOI18N

        jPanelCountry.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Choose Country"));
        jPanelCountry.setToolTipText("");

        jLabelSelectCountry.setText("select Country");

        jLabelCountrySelected.setText("Country Selected");

        jComboBoxCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egypt", "Qatar", "Saudi", "Geramany", "France", " ", " " }));
        jComboBoxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCountryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCountryLayout = new javax.swing.GroupLayout(jPanelCountry);
        jPanelCountry.setLayout(jPanelCountryLayout);
        jPanelCountryLayout.setHorizontalGroup(
            jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCountryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSelectCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCountrySelected, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxCountry, 0, 96, Short.MAX_VALUE)
                    .addComponent(jTextFieldSetcountry))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCountryLayout.setVerticalGroup(
            jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCountryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSelectCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCountryLayout.createSequentialGroup()
                        .addComponent(jComboBoxCountry)
                        .addGap(5, 5, 5)))
                .addGap(42, 42, 42)
                .addGroup(jPanelCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCountrySelected, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSetcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImge, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImge, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWelcomeActionPerformed
        // TODO add your handling code here:
       String name = jTextFieldWelcome.getText();
       // System.out.println("welcome to my progect"+" " + name);
        JOptionPane.showConfirmDialog(null, "welcome to my progect"+" : " + name);
        jTextFieldSetMassage.setText("welcome to my progect"+" : " +name);
    }//GEN-LAST:event_jButtonWelcomeActionPerformed

    private void jRadioButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRedActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_jRadioButtonRedActionPerformed

    private void jRadioButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBlueActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_jRadioButtonBlueActionPerformed

    private void jRadioButtonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGreenActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.green);
    }//GEN-LAST:event_jRadioButtonGreenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         this.getContentPane().setBackground(Color.red);
         //set setActionCommand to radio button color
         jRadioButtonRed.setActionCommand("Red");
         jRadioButtonBlue.setActionCommand("Blue");
         jRadioButtonGreen.setActionCommand("Green");
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String radioChoosen = buttonGroupColor.getSelection().getActionCommand();
        System.out.println("Radio Choosen : " +radioChoosen);
        jTextFieldReadColor.setText(radioChoosen);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxValleyballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxValleyballActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxValleyballActionPerformed

    private void jCheckBoxFootballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFootballActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxFootballActionPerformed

    private void jCheckBoxFootballItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxFootballItemStateChanged
        // TODO add your handling code here:
        printSportsSelected();
    }//GEN-LAST:event_jCheckBoxFootballItemStateChanged

    private void jCheckBoxBasketballItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxBasketballItemStateChanged
        // TODO add your handling code here:
        printSportsSelected();
    }//GEN-LAST:event_jCheckBoxBasketballItemStateChanged

    private void jCheckBoxValleyballItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxValleyballItemStateChanged
        // TODO add your handling code here:
        printSportsSelected();
    }//GEN-LAST:event_jCheckBoxValleyballItemStateChanged

    private void jCheckBoxHandballItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxHandballItemStateChanged
        // TODO add your handling code here:
        printSportsSelected();
    }//GEN-LAST:event_jCheckBoxHandballItemStateChanged

    private void jButtonReadSportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadSportsActionPerformed
     
     jTextAreaSport.setText(ef);
    }//GEN-LAST:event_jButtonReadSportsActionPerformed

    private void jComboBoxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCountryActionPerformed
        // TODO add your handling code here:
        String selectedCountry=jComboBoxCountry.getSelectedItem().toString();
        jTextFieldSetcountry.setText(selectedCountry); 
    }//GEN-LAST:event_jComboBoxCountryActionPerformed
public String ef=null; 
    public void printSportsSelected(){
               String sportsSelected = 
                "Football " +(jCheckBoxFootball.isSelected()? "Yas" :"NO")
                +"\nBasketball " +(jCheckBoxBasketball.isSelected()? "Yas" : "No")
                +"\nVolleyball " +(jCheckBoxValleyball.isSelected()? "Yes" : "No")
                +"\nHandball " +(jCheckBoxHandball.isSelected()? "Yas" : "NO");
                //System.out.println(sportsSelected);
                //jTextAreaSport.setText(sportsSelected);
                ef=sportsSelected;
                
    }
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
            java.util.logging.Logger.getLogger(JFrameTestComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTestComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTestComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTestComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTestComponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReadSports;
    private javax.swing.JButton jButtonWelcome;
    private javax.swing.JCheckBox jCheckBoxBasketball;
    private javax.swing.JCheckBox jCheckBoxFootball;
    private javax.swing.JCheckBox jCheckBoxHandball;
    private javax.swing.JCheckBox jCheckBoxValleyball;
    private javax.swing.JComboBox<String> jComboBoxCountry;
    private javax.swing.JLabel jLabelCountrySelected;
    private javax.swing.JLabel jLabelImge;
    private javax.swing.JLabel jLabelSelectCountry;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelColorPanel;
    private javax.swing.JPanel jPanelCountry;
    private javax.swing.JPanel jPanelSports;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JRadioButton jRadioButtonBlue;
    private javax.swing.JRadioButton jRadioButtonGreen;
    private javax.swing.JRadioButton jRadioButtonRed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSport;
    private javax.swing.JTextField jTextFieldReadColor;
    private javax.swing.JTextField jTextFieldSetMassage;
    private javax.swing.JTextField jTextFieldSetcountry;
    private javax.swing.JTextField jTextFieldWelcome;
    // End of variables declaration//GEN-END:variables
}
