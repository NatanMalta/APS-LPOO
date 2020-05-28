/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.loop.java.apresentacao;

import aps.loop.java.modelo.ControleCena;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class frmGame extends javax.swing.JDialog
{
    private ControleCena controleCena;
    /**
     * Creates new form Game
     */
    public frmGame(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jspPainel = new javax.swing.JScrollPane();
        txaHistoria = new javax.swing.JTextArea();
        btnOpcao1 = new javax.swing.JButton();
        btnOpcao3 = new javax.swing.JButton();
        btnOpcao2 = new javax.swing.JButton();
        btnOpcao4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowActivated(java.awt.event.WindowEvent evt)
            {
                formWindowActivated(evt);
            }
        });

        txaHistoria.setEditable(false);
        txaHistoria.setColumns(20);
        txaHistoria.setRows(5);
        txaHistoria.setText("Lorem ipsum dolor sit amet, consectetur adipiscing \nelit. Proin ac purus posuere, faucibus tellus sed, \nvarius est. Praesent pulvinar elit nec vulputate \nsuscipit. Nam sit amet gravida ipsum. \nMaecenas molestie urna vitae.");
        jspPainel.setViewportView(txaHistoria);
        txaHistoria.getAccessibleContext().setAccessibleName("área de texto");
        txaHistoria.getAccessibleContext().setAccessibleDescription("História");
        txaHistoria.getAccessibleContext().setAccessibleParent(this);

        btnOpcao1.setText("Alternativa 1");
        btnOpcao1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao1ActionPerformed(evt);
            }
        });

        btnOpcao3.setText("Alternativa 3");
        btnOpcao3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao3ActionPerformed(evt);
            }
        });

        btnOpcao2.setText("Alternativa 2");
        btnOpcao2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao2ActionPerformed(evt);
            }
        });

        btnOpcao4.setText("Alternativa 4");
        btnOpcao4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jspPainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpcao4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpcao1)
                    .addComponent(btnOpcao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpcao3)
                    .addComponent(btnOpcao4))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limpar()
    {
        this.txaHistoria.setText("");
        this.btnOpcao1.setText("");
        this.btnOpcao1.setVisible(false);
        this.btnOpcao2.setText("");
        this.btnOpcao2.setVisible(false);
        this.btnOpcao3.setText("");
        this.btnOpcao3.setVisible(false);
        this.btnOpcao4.setText("");
        this.btnOpcao4.setVisible(false);
    }

    private void btnOpcao1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpcao1ActionPerformed
    {//GEN-HEADEREND:event_btnOpcao1ActionPerformed
        this.executaEscolha(0);
    }//GEN-LAST:event_btnOpcao1ActionPerformed

    private void btnOpcao3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpcao3ActionPerformed
    {//GEN-HEADEREND:event_btnOpcao3ActionPerformed
        this.executaEscolha(2);
    }//GEN-LAST:event_btnOpcao3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.limpar();
        this.controleCena = new ControleCena();
    }//GEN-LAST:event_formWindowActivated

    private void btnOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao2ActionPerformed
        this.executaEscolha(1);
    }//GEN-LAST:event_btnOpcao2ActionPerformed

    private void btnOpcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao4ActionPerformed
        this.executaEscolha(3);
    }//GEN-LAST:event_btnOpcao4ActionPerformed

    private void executaEscolha(int num)
    {
        try
        {
            controleCena.executaEscolha(num);
        } catch (Exception ex)
        {
            Logger.getLogger(frmGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmGame dialog = new frmGame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcao1;
    private javax.swing.JButton btnOpcao2;
    private javax.swing.JButton btnOpcao3;
    private javax.swing.JButton btnOpcao4;
    private javax.swing.JScrollPane jspPainel;
    private javax.swing.JTextArea txaHistoria;
    // End of variables declaration//GEN-END:variables
}
