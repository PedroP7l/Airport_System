
package Principal;

import GerenciamentoAvião.MenuAvião;
import GerenciamentoCliente.MenuCliente;
import GerenciamentoFuncionário.MenuFuncionário;
import GerenciamentoViagem.MenuViagem;
/**
 *
 * @author GabrielFelipe
 */
public class MenuGerenciamento extends javax.swing.JFrame 
{
    
    public MenuGerenciamento() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBotões = new javax.swing.JPanel();
        MenuFuncionário = new javax.swing.JButton();
        MenuCliente = new javax.swing.JButton();
        MenuAvião = new javax.swing.JButton();
        MenuViagem = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setName("MenuGerenciamento"); // NOI18N
        getContentPane().setLayout(null);

        PainelBotões.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MenuFuncionário.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        MenuFuncionário.setText("Funcionários");
        MenuFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionárioActionPerformed(evt);
            }
        });

        MenuCliente.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        MenuCliente.setText("Clientes");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });

        MenuAvião.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        MenuAvião.setText("Aviões");
        MenuAvião.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAviãoActionPerformed(evt);
            }
        });

        MenuViagem.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        MenuViagem.setText("Viagens");
        MenuViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuViagemActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelBotõesLayout = new javax.swing.GroupLayout(PainelBotões);
        PainelBotões.setLayout(PainelBotõesLayout);
        PainelBotõesLayout.setHorizontalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuFuncionário, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuAvião, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuViagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelBotõesLayout.setVerticalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuAvião, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PainelBotões);
        PainelBotões.setBounds(210, 140, 250, 470);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("menu de gerenciamento");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 10, 650, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus2.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 650, 680);

        setSize(new java.awt.Dimension(662, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Redirecionamento: 
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // Click Botão de Voltar
        
        TelaLogin TL = new TelaLogin();
        TL.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_VoltarActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        // Click Botão de Cliente:
        
        MenuCliente MC = new MenuCliente();
        MC.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void MenuAviãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAviãoActionPerformed
        // Click Botão de Avião:
        
        MenuAvião MA = new MenuAvião();
        MA.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_MenuAviãoActionPerformed

    private void MenuViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuViagemActionPerformed
        // Click Botão de Viagem:
        
        MenuViagem MV = new MenuViagem();
        MV.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_MenuViagemActionPerformed

    private void MenuFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionárioActionPerformed
        // Click Botão de Funcionário:

        MenuFuncionário MF = new MenuFuncionário();
        MF.setVisible(true);
        dispose();

    }//GEN-LAST:event_MenuFuncionárioActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MenuGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MenuGerenciamento().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton MenuAvião;
    private javax.swing.JButton MenuCliente;
    private javax.swing.JButton MenuFuncionário;
    private javax.swing.JButton MenuViagem;
    private javax.swing.JPanel PainelBotões;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Voltar;
    // End of variables declaration//GEN-END:variables
}
