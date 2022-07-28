
package GerenciamentoFuncionário;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExclFuncionário extends javax.swing.JFrame 
{
    Funcionário F = new Funcionário();
    MenuFuncionário MF = new MenuFuncionário();
    
    public ExclFuncionário() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questão = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        NomeF = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        CpfF = new javax.swing.JLabel();
        função = new javax.swing.JLabel();
        FunçãoF = new javax.swing.JLabel();
        salário = new javax.swing.JLabel();
        SalárioF = new javax.swing.JLabel();
        nvoos = new javax.swing.JLabel();
        NdevoosF = new javax.swing.JLabel();
        comissão = new javax.swing.JLabel();
        ComissãoF = new javax.swing.JLabel();
        BotãoExcluirF = new javax.swing.JButton();
        BotãoCanExcluirF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Questão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Questão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Questão.setText("Excluir o Funcionário: ");
        Questão.setToolTipText("");

        nome.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nome.setText("Nome:");
        nome.setToolTipText("");

        NomeF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NomeF.setText("???");

        cpf.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        cpf.setText("CPF:");
        cpf.setToolTipText("");

        CpfF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CpfF.setText("???");

        função.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        função.setText("Função:");
        função.setToolTipText("");

        FunçãoF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FunçãoF.setText("???");

        salário.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        salário.setText("Salário:");
        salário.setToolTipText("");

        SalárioF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SalárioF.setText("???");

        nvoos.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nvoos.setText("N° de Voos:");
        nvoos.setToolTipText("");

        NdevoosF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NdevoosF.setText("???");

        comissão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissão.setText("Comissão:");
        comissão.setToolTipText("");

        ComissãoF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComissãoF.setText("???");

        BotãoExcluirF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoExcluirF.setText("Sim");
        BotãoExcluirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoExcluirFActionPerformed(evt);
            }
        });

        BotãoCanExcluirF.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanExcluirF.setText("Cancelar");
        BotãoCanExcluirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanExcluirFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(função)
                                        .addComponent(nome)
                                        .addComponent(cpf))
                                    .addComponent(salário)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comissão)
                                    .addComponent(nvoos))
                                .addGap(1, 1, 1)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NdevoosF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComissãoF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalárioF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FunçãoF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CpfF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeF, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotãoExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCanExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Questão)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(NomeF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(CpfF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(função)
                    .addComponent(FunçãoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salário)
                    .addComponent(SalárioF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nvoos)
                    .addComponent(NdevoosF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comissão)
                    .addComponent(ComissãoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCanExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanExcluirFActionPerformed
        // Click no Botão Cancelar:

        MF.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanExcluirFActionPerformed

    private void BotãoExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirFActionPerformed
        // Click no Botão Sim:

        Controle.funcionários.remove(MF.selectedRow);
        MF.setVisible(true);
        dispose();

        JOptionPane.showMessageDialog(null,"Funcionário Excluido com Sucesso!!!");

    }//GEN-LAST:event_BotãoExcluirFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        NomeF.setText(Controle.funcionários.get(MF.selectedRow).getNome());
        CpfF.setText(Controle.funcionários.get(MF.selectedRow).getCpf());
        FunçãoF.setText(Controle.funcionários.get(MF.selectedRow).getFunção());
        SalárioF.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getSalário()));
        NdevoosF.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getNvoos()));
        ComissãoF.setText(String.valueOf(Controle.funcionários.get(MF.selectedRow).getComissão()));
        
        
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
            java.util.logging.Logger.getLogger(ExclFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExclFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExclFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExclFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExclFuncionário().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanExcluirF;
    private javax.swing.JButton BotãoExcluirF;
    private javax.swing.JLabel ComissãoF;
    private javax.swing.JLabel CpfF;
    private javax.swing.JLabel FunçãoF;
    private javax.swing.JLabel NdevoosF;
    private javax.swing.JLabel NomeF;
    private javax.swing.JLabel Questão;
    private javax.swing.JLabel SalárioF;
    private javax.swing.JLabel comissão;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel função;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nvoos;
    private javax.swing.JLabel salário;
    // End of variables declaration//GEN-END:variables
}
