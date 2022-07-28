
package GerenciamentoCliente;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class EditCliente extends javax.swing.JFrame 
{
    public EditCliente() 
    {
        initComponents();
    }

    Cliente C1 = new Cliente();
    MenuCliente MC = new MenuCliente();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastro = new javax.swing.JPanel();
        cpf = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        EdCNome = new javax.swing.JTextField();
        EdCcpf = new javax.swing.JTextField();
        BotãoEditarC = new javax.swing.JButton();
        BotãoCanEditC = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        PainelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cpf.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        cpf.setText("CPF: ");
        cpf.setToolTipText("");

        nome.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nome.setText("Nome: ");
        nome.setToolTipText("");

        EdCNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        EdCcpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EdCcpf.setToolTipText("");

        BotãoEditarC.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoEditarC.setText("Editar");
        BotãoEditarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarCActionPerformed(evt);
            }
        });

        BotãoCanEditC.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanEditC.setText("Cancelar");
        BotãoCanEditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanEditCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cpf))
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nome)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EdCNome)
                            .addComponent(EdCcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BotãoEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCanEditC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdCNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(EdCcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanEditC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PainelCadastro);
        PainelCadastro.setBounds(150, 250, 370, 170);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar Clientes");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 10, 660, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus4.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-10, -6, 690, 680);

        setSize(new java.awt.Dimension(693, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando Abre a Janela: 
        
        EdCNome.setText(Controle.clientes.get(MC.selectedRow).getNome());
        EdCcpf.setText(Controle.clientes.get(MC.selectedRow).getCpf());
        
    }//GEN-LAST:event_formWindowOpened

    private void BotãoCanEditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanEditCActionPerformed
        // Click no Botão Cancelar:

        MC.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanEditCActionPerformed

    // Botoões de Ações
    private void BotãoEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarCActionPerformed
        // Click no Botão Editar:

        try
        {
            C1.setNome(EdCNome.getText());
            C1.setCpf(EdCcpf.getText());
            

            Controle.clientes.remove(MC.selectedRow);
            Controle.clientes.add(C1);

            MC.setVisible(true);
            dispose();

            JOptionPane.showMessageDialog(null,"Cliente alterado com Sucesso!!!");

        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!!");
        }

    }//GEN-LAST:event_BotãoEditarCActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(EditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new EditCliente().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanEditC;
    private javax.swing.JButton BotãoEditarC;
    private javax.swing.JTextField EdCNome;
    private javax.swing.JTextField EdCcpf;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
