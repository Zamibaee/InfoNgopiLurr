/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inpongopi;

/**
 *
 * @author ThinkPad
 */
public class C_industrial extends javax.swing.JFrame {

    /**
     * Creates new form C_industrial
     */
    public C_industrial() {
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

        btnblackChamp = new javax.swing.JLabel();
        btnmineralcafe = new javax.swing.JLabel();
        btnmenantisenja = new javax.swing.JLabel();
        btnchiefCoffe = new javax.swing.JLabel();
        btnduaCoffe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnblackChamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/I_blackcamp.png"))); // NOI18N
        getContentPane().add(btnblackChamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 170, 210, 300));

        btnmineralcafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/I_mineral.png"))); // NOI18N
        getContentPane().add(btnmineralcafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, 310));

        btnmenantisenja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/I_menantisenja.png"))); // NOI18N
        getContentPane().add(btnmenantisenja, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, 300));

        btnchiefCoffe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/I_chief.png"))); // NOI18N
        getContentPane().add(btnchiefCoffe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 210, 310));

        btnduaCoffe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/I_duaCoffe.png"))); // NOI18N
        getContentPane().add(btnduaCoffe, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 210, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_cafe/C_industrial.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(C_industrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_industrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_industrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_industrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_industrial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnblackChamp;
    private javax.swing.JLabel btnchiefCoffe;
    private javax.swing.JLabel btnduaCoffe;
    private javax.swing.JLabel btnmenantisenja;
    private javax.swing.JLabel btnmineralcafe;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
