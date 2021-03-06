/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.loop.java.apresentacao;

import aps.loop.java.modelo.Cena;
import aps.loop.java.modelo.ControleCena;
import aps.loop.java.modelo.Escolha;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class frmGame extends javax.swing.JDialog
{
    private ControleCena controleCena;
    private Cena cena;

    
    public frmGame(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.limpar();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jspPainel = new javax.swing.JScrollPane();
        txaHistoria = new javax.swing.JTextArea();
        btnOpcao1 = new javax.swing.JButton();
        btnOpcao2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evil Awakened");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        txaHistoria.setEditable(false);
        txaHistoria.setBackground(new java.awt.Color(75, 82, 85));
        txaHistoria.setColumns(20);
        txaHistoria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txaHistoria.setForeground(new java.awt.Color(255, 255, 255));
        txaHistoria.setLineWrap(true);
        txaHistoria.setRows(5);
        txaHistoria.setWrapStyleWord(true);
        txaHistoria.setBorder(null);
        txaHistoria.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                txaHistoriaMouseClicked(evt);
            }
        });
        jspPainel.setViewportView(txaHistoria);
        txaHistoria.getAccessibleContext().setAccessibleName("área de texto");
        txaHistoria.getAccessibleContext().setAccessibleDescription("História");
        txaHistoria.getAccessibleContext().setAccessibleParent(jPanel1);

        btnOpcao1.setBackground(new java.awt.Color(75, 82, 85));
        btnOpcao1.setForeground(new java.awt.Color(255, 255, 255));
        btnOpcao1.setText("Alternativa 1");
        btnOpcao1.setBorderPainted(false);
        btnOpcao1.setFocusPainted(false);
        btnOpcao1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao1ActionPerformed(evt);
            }
        });

        btnOpcao2.setBackground(new java.awt.Color(75, 82, 85));
        btnOpcao2.setForeground(new java.awt.Color(255, 255, 255));
        btnOpcao2.setText("Alternativa 2");
        btnOpcao2.setBorderPainted(false);
        btnOpcao2.setFocusPainted(false);
        btnOpcao2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpcao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOpcao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpcao1)
                    .addComponent(btnOpcao2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
       
    }
    
    
    private void setTextCena()
    {
        this.limpar();
        
        this.txaHistoria.setText(this.cena.getHistoria().replace("\n", "\n\n"));
        txaHistoria.setCaretPosition(0);
        
        List<Escolha> escolhas = this.cena.getEscolhas();
        
        int sizeEscolhas = escolhas.size();
            
        if(0 < sizeEscolhas)
        {
            Escolha get = escolhas.get(0);
            btnOpcao1.setText(get.getNome());
            btnOpcao1.setVisible(true);
        }
        
        if(1 < sizeEscolhas)
        {
            Escolha get = escolhas.get(1);
            btnOpcao2.setText(get.getNome());
            btnOpcao2.setVisible(true);
        }
    }

    private void btnOpcao1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpcao1ActionPerformed
    {//GEN-HEADEREND:event_btnOpcao1ActionPerformed
        
        this.executaEscolha(0);
        setTextCena();
    }//GEN-LAST:event_btnOpcao1ActionPerformed

    private void btnOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcao2ActionPerformed
        
        this.executaEscolha(1);
        setTextCena();
        
    }//GEN-LAST:event_btnOpcao2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            this.limpar();
            this.controleCena = new ControleCena();
            this.cena = this.controleCena.cena;
            
            String lerCena = this.cena.lerCena(this.cena.getInicial());
            
            if(this.cena.montaCena(lerCena));
            {
                setTextCena();
            }
           
        } catch (Exception ex)
        {
            Logger.getLogger(frmGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txaHistoriaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txaHistoriaMouseClicked
    {//GEN-HEADEREND:event_txaHistoriaMouseClicked
        
    }//GEN-LAST:event_txaHistoriaMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jspPainel;
    private javax.swing.JTextArea txaHistoria;
    // End of variables declaration//GEN-END:variables
}
