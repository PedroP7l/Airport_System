
package GerenciamentoCliente;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExclCliente extends javax.swing.JFrame 
{
    Cliente C = new Cliente();
    MenuCliente MC = new MenuCliente();
    
    public ExclCliente() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questão = new javax.swing.JLabel();
        NomeExC = new javax.swing.JLabel();
        NomeC = new javax.swing.JLabel();
        cpfExC = new javax.swing.JLabel();
        CpfC = new javax.swing.JLabel();
        BotãoExcluirC = new javax.swing.JButton();
        BotãoCanExcluirC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Questão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Questão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Questão.setText("Excluir o Cliente:");
        Questão.setToolTipText("");

        NomeExC.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        NomeExC.setText("Nome:");
        NomeExC.setToolTipText("");

        NomeC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NomeC.setText("???");

        cpfExC.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        cpfExC.setText("CPF:");
        cpfExC.setToolTipText("");

        CpfC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CpfC.setText("???");

        BotãoExcluirC.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoExcluirC.setText("Sim");
        BotãoExcluirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoExcluirCActionPerformed(evt);
            }
        });

        BotãoCanExcluirC.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanExcluirC.setText("Cancelar");
        BotãoCanExcluirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanExcluirCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomeExC)
                            .addComponent(cpfExC))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CpfC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BotãoExcluirC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCanExcluirC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Questão)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeExC)
                    .addComponent(NomeC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfExC)
                    .addComponent(CpfC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoExcluirC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanExcluirC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(372, 223));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCanExcluirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanExcluirCActionPerformed
        // Click no Botão Cancelar:

        MC.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanExcluirCActionPerformed

    private void BotãoExcluirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirCActionPerformed
        // Click no Botão Sim:

        Controle.clientes.remove(MC.selectedRow);
        MC.setVisible(true);
        dispose();

        JOptionPane.showMessageDialog(null,"Cliente Excluido com Sucesso!!!");

    }//GEN-LAST:event_BotãoExcluirCActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        NomeC.setText(Controle.clientes.get(MC.selectedRow).getNome());
        CpfC.setText(Controle.clientes.get(MC.selectedRow).getCpf());
     
        
    }//GEN-LAST:event_formWindowOpened

    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(ExclCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExclCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExclCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExclCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ExclCliente().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanExcluirC;
    private javax.swing.JButton BotãoExcluirC;
    private javax.swing.JLabel CpfC;
    private javax.swing.JLabel NomeC;
    private javax.swing.JLabel NomeExC;
    private javax.swing.JLabel Questão;
    private javax.swing.JLabel cpfExC;
    // End of variables declaration//GEN-END:variables
}
