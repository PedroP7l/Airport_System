
package GerenciamentoFuncionário;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class CadFuncionário extends javax.swing.JFrame 
{
    Funcionário F1 = new Funcionário();
    MenuFuncionário MF = new MenuFuncionário();
    
    public CadFuncionário() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastro = new javax.swing.JPanel();
        cpf = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        função = new javax.swing.JLabel();
        salário = new javax.swing.JLabel();
        nvoos = new javax.swing.JLabel();
        comissão = new javax.swing.JLabel();
        CampoFnome = new javax.swing.JTextField();
        CampoFcpf = new javax.swing.JTextField();
        CaixaFfunção = new javax.swing.JComboBox<>();
        CampoFsalário = new javax.swing.JTextField();
        CampoFnvoos = new javax.swing.JTextField();
        CampoFcomissão = new javax.swing.JTextField();
        BotãoCadastrarF = new javax.swing.JButton();
        BotãoCanCadastroF = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        PainelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cpf.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        cpf.setText("CPF: ");
        cpf.setToolTipText("");

        nome.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nome.setText("Nome: ");
        nome.setToolTipText("");

        função.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        função.setText("Função: ");
        função.setToolTipText("");

        salário.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        salário.setText("Salário:");
        salário.setToolTipText("");

        nvoos.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nvoos.setText("N° de Voos:");
        nvoos.setToolTipText("");

        comissão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissão.setText("Comissão:");
        comissão.setToolTipText("");

        CampoFnome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoFcpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoFcpf.setToolTipText("");

        CaixaFfunção.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CaixaFfunção.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piloto", "Co-Piloto", "Comissário" }));
        CaixaFfunção.setAlignmentX(1.0F);
        CaixaFfunção.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CampoFsalário.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoFnvoos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoFcomissão.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BotãoCadastrarF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCadastrarF.setText("Cadastrar");
        BotãoCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastrarFActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nome)
                            .addComponent(função)
                            .addComponent(cpf)
                            .addComponent(salário)
                            .addComponent(nvoos)
                            .addComponent(comissão))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoFcomissão)
                                    .addComponent(CampoFnvoos)
                                    .addComponent(CampoFsalário)
                                    .addComponent(CampoFcpf)
                                    .addComponent(CampoFnome, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34))
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addComponent(CaixaFfunção, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addComponent(BotãoCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCanCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addGap(9, 9, 9)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf))
                .addGap(11, 11, 11)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaFfunção, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(função))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFsalário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salário))
                .addGap(9, 9, 9)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFnvoos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nvoos))
                .addGap(9, 9, 9)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFcomissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelCadastro);
        PainelCadastro.setBounds(80, 240, 530, 310);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cadastro de Funcionário ");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 10, 660, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus4.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-10, -6, 690, 680);

        setSize(new java.awt.Dimension(693, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastrarFActionPerformed
        // Click no Botão Cadastar:
        try
        {
            F1.setNome(CampoFnome.getText());
            F1.setCpf(CampoFcpf.getText());
            F1.setFunção((String)CaixaFfunção.getSelectedItem());
            F1.setSalário(Double.parseDouble(CampoFsalário.getText()));
            F1.setComissão(Double.parseDouble(CampoFcomissão.getText()));
            F1.setNvoos(Integer.parseInt(CampoFnvoos.getText()));
        
            Controle.funcionários.add(F1);
     
            JOptionPane.showMessageDialog(null,"Funcionário Cadastrado com Sucesso!!!");
        
            MF.setVisible(true);
            dispose();
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!!");
        }
        
    }//GEN-LAST:event_BotãoCadastrarFActionPerformed

    private void BotãoCanCadastroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanCadastroFActionPerformed
        // Click no Botão Cancelar:
        
        MF.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoCanCadastroFActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CadFuncionário().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastrarF;
    private javax.swing.JButton BotãoCanCadastroF;
    private javax.swing.JComboBox<String> CaixaFfunção;
    private javax.swing.JTextField CampoFcomissão;
    private javax.swing.JTextField CampoFcpf;
    private javax.swing.JTextField CampoFnome;
    private javax.swing.JTextField CampoFnvoos;
    private javax.swing.JTextField CampoFsalário;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel comissão;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel função;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nvoos;
    private javax.swing.JLabel salário;
    // End of variables declaration//GEN-END:variables
}
