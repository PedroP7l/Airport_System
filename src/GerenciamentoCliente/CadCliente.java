
package GerenciamentoCliente;

import Controle.Controle;
import Principal.ÁreaCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class CadCliente extends javax.swing.JFrame 
{
    Cliente C = new Cliente();
    ÁreaCliente AC = new ÁreaCliente();
    
    public CadCliente() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastro = new javax.swing.JPanel();
        cpfC = new javax.swing.JLabel();
        NomeC = new javax.swing.JLabel();
        CampoCnome = new javax.swing.JTextField();
        CampoCcpf = new javax.swing.JTextField();
        BotãoCadastrarC = new javax.swing.JButton();
        BotãoCanCadastroF = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        PainelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cpfC.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        cpfC.setText("CPF: ");
        cpfC.setToolTipText("");

        NomeC.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        NomeC.setText("Nome: ");
        NomeC.setToolTipText("");

        CampoCnome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoCcpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoCcpf.setToolTipText("");

        BotãoCadastrarC.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCadastrarC.setText("Cadastrar");
        BotãoCadastrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastrarCActionPerformed(evt);
            }
        });

        BotãoCanCadastroF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanCadastroF.setText("Cancelar");
        BotãoCanCadastroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanCadastroFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomeC)
                            .addComponent(cpfC))
                        .addGap(18, 18, 18)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoCnome)
                            .addComponent(CampoCcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(BotãoCadastrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCanCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeC)
                    .addComponent(CampoCnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfC)
                    .addComponent(CampoCcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoCadastrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelCadastro);
        PainelCadastro.setBounds(140, 250, 380, 170);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cadastro de Clientes");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 10, 660, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus4.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-10, -6, 690, 680);

        setSize(new java.awt.Dimension(693, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoCanCadastroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanCadastroFActionPerformed
        // Click no Botão Cancelar:

        AC.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanCadastroFActionPerformed

    // Botoões de Ações
    private void BotãoCadastrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastrarCActionPerformed
        // Click no Botão Cadastar:
        try
        {
            C.setNome(CampoCnome.getText());
            C.setCpf(CampoCcpf.getText());

            Controle.clientes.add(C);

            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso!!!");

            AC.setVisible(true);
            dispose();
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!!");
        }

    }//GEN-LAST:event_BotãoCadastrarCActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CadCliente().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastrarC;
    private javax.swing.JButton BotãoCanCadastroF;
    private javax.swing.JTextField CampoCcpf;
    private javax.swing.JTextField CampoCnome;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel NomeC;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cpfC;
    // End of variables declaration//GEN-END:variables
}
