/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class HomePage1 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomePage1.class.getName());


    public HomePage1() {
        initComponents();
        setLocationRelativeTo(null);
    setResizable(false);
        getContentPane().setBackground(new java.awt.Color(153,203,255)); 
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 153));
        
        viewProfileButton.setBackground(new java.awt.Color(0, 0, 153));
        viewProfileButton.setForeground(new java.awt.Color(255, 255, 255)); 
        
        settingsButton.setBackground(new java.awt.Color(0, 0, 153));
        settingsButton.setForeground(new java.awt.Color(255, 255, 255));
        
        logoutButton.setBackground(new java.awt.Color(0, 0, 153));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
         }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        viewProfileButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        welcomeLabel.setText("Welcome User!");

        viewProfileButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        viewProfileButton.setText("View Profile");
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });

        settingsButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(viewProfileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(settingsButton)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(logoutButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(welcomeLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewProfileButton)
                    .addComponent(settingsButton))
                .addGap(28, 28, 28)
                .addComponent(logoutButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose(); // closes the homepage
new LoginFrame().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
       new ViewProfile1().setVisible(true);
    }//GEN-LAST:event_viewProfileButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        new Settings1().setVisible(true); 
    }//GEN-LAST:event_settingsButtonActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new HomePage1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton viewProfileButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
