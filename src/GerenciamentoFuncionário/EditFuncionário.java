
package GerenciamentoFuncionário;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class EditFuncionário extends javax.swing.JFrame 
{
    public EditFuncionário() 
    {
        initComponents();
    }

    Funcionário F = new Funcionário();
    MenuFuncionário MF = new MenuFuncionário();
    
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
        BotãoEditarF = new javax.swing.JButton();
        BotãoCanEditF = new javax.swing.JButton();
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

        BotãoEditarF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoEditarF.setText("Editar");
        BotãoEditarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarFActionPerformed(evt);
            }
        });

        BotãoCanEditF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanEditF.setText("Cancelar");
        BotãoCanEditF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanEditFActionPerformed(evt);
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
                            .addComponent(cpf)
                            .addComponent(nome)
                            .addComponent(função)
                            .addComponent(salário)
                            .addComponent(nvoos)
                            .addComponent(comissão))
                        .addGap(10, 10, 10)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoFnvoos)
                                    .addComponent(CampoFsalário)
                                    .addComponent(CampoFcpf)
                                    .addComponent(CampoFnome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CampoFcomissão, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34))
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addComponent(CaixaFfunção, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addComponent(BotãoEditarF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCanEditF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(CampoFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpf)
                    .addComponent(CampoFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(função)
                    .addComponent(CaixaFfunção, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoEditarF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanEditF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelCadastro);
        PainelCadastro.setBounds(80, 240, 530, 310);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar de Funcionário ");
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
    private void BotãoEditarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarFActionPerformed
        // Click no Botão Editar:
        
        try
        {
            F.setNome(CampoFnome.getText());
            F.setCpf(CampoFcpf.getText());
            F.setFunção((String)CaixaFfunção.getSelectedItem());
            F.setSalário(Double.parseDouble(CampoFsalário.getText()));
            F.setComissão(Double.parseDouble(CampoFcomissão.getText()));
            F.setNvoos(Integer.parseInt(CampoFnvoos.getText()));
        
            Controle.funcionários.remove(MF.selectedRow);
            Controle.funcionários.add(F);
        
            MF.setVisible(true);
            dispose();
        
            JOptionPane.showMessageDialog(null,"Funcionário Editado com Sucesso!!!");
        
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!!");
        }
        
        
    }//GEN-LAST:event_BotãoEditarFActionPerformed

    private void BotãoCanEditFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanEditFActionPerformed
        // Click no Botão Cancelar:
        
        MF.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoCanEditFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando Abre a Janela: 
        
        CampoFnome.setText(Controle.funcionários.get(MF.selectedRow).getNome());
        CampoFcpf.setText(Controle.funcionários.get(MF.selectedRow).getCpf());
        CaixaFfunção.setActionCommand(Controle.funcionários.get(MF.selectedRow).getFunção());
        CampoFsalário.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getSalário()));
        CampoFnvoos.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getNvoos()));
        CampoFcomissão.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getComissão()));
        
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
            java.util.logging.Logger.getLogger(EditFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new EditFuncionário().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanEditF;
    private javax.swing.JButton BotãoEditarF;
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
