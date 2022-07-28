
package GerenciamentoAvião;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExclAvião extends javax.swing.JFrame 
{
    Avião A = new Avião();
    MenuAvião MA = new MenuAvião();
    
    public ExclAvião() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questão = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        empresa = new javax.swing.JLabel();
        Empresa = new javax.swing.JLabel();
        nserie = new javax.swing.JLabel();
        NdeSerie = new javax.swing.JLabel();
        piloto = new javax.swing.JLabel();
        Piloto = new javax.swing.JLabel();
        copiloto = new javax.swing.JLabel();
        CoPiloto = new javax.swing.JLabel();
        capacidade = new javax.swing.JLabel();
        Capacidade = new javax.swing.JLabel();
        BotãoExcluirA = new javax.swing.JButton();
        BotãoCanExcluirA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Questão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Questão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Questão.setText("Excluir o Avião: ");
        Questão.setToolTipText("");

        marca.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        marca.setText("Marca:");
        marca.setToolTipText("");

        Marca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Marca.setText("???");

        empresa.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        empresa.setText("Empresa:");
        empresa.setToolTipText("");

        Empresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Empresa.setText("???");

        nserie.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nserie.setText("N° de Serie:");
        nserie.setToolTipText("");

        NdeSerie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NdeSerie.setText("???");

        piloto.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        piloto.setText("Piloto:");
        piloto.setToolTipText("");

        Piloto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Piloto.setText("???");

        copiloto.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        copiloto.setText("Co-Piloto:");
        copiloto.setToolTipText("");

        CoPiloto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CoPiloto.setText("???");

        capacidade.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        capacidade.setText("Capacidade:");
        capacidade.setToolTipText("");

        Capacidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Capacidade.setText("???");

        BotãoExcluirA.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoExcluirA.setText("Sim");
        BotãoExcluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoExcluirAActionPerformed(evt);
            }
        });

        BotãoCanExcluirA.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanExcluirA.setText("Cancelar");
        BotãoCanExcluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanExcluirAActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(capacidade)
                                    .addComponent(copiloto)
                                    .addComponent(piloto))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nserie)
                                    .addComponent(marca)
                                    .addComponent(empresa))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Piloto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NdeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotãoExcluirA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCanExcluirA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(marca)
                    .addComponent(Marca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresa)
                    .addComponent(Empresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nserie)
                    .addComponent(NdeSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(piloto)
                    .addComponent(Piloto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copiloto)
                    .addComponent(CoPiloto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidade)
                    .addComponent(Capacidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoExcluirA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanExcluirA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCanExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanExcluirAActionPerformed
        // Click no Botão Cancelar:

        MA.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanExcluirAActionPerformed

    private void BotãoExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirAActionPerformed
        // Click no Botão Sim:

        Controle.aviões.remove(MA.selectedRow);
        MA.setVisible(true);
        dispose();

        JOptionPane.showMessageDialog(null,"Avião Excluido com Sucesso!!!");

    }//GEN-LAST:event_BotãoExcluirAActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        Marca.setText(Controle.aviões.get(MA.selectedRow).getMarca());
        Empresa.setText(Controle.aviões.get(MA.selectedRow).getEmpresa());
        NdeSerie.setText(Controle.aviões.get(MA.selectedRow).getNserie());
        Piloto.setText(Controle.aviões.get(MA.selectedRow).getPiloto().getNome());
        CoPiloto.setText(Controle.aviões.get(MA.selectedRow).getCopiloto().getNome());
        Capacidade.setText(String.valueOf(Controle.aviões.get(MA.selectedRow).getCapacidade()));
        
        
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
            java.util.logging.Logger.getLogger(ExclAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExclAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExclAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExclAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExclAvião().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanExcluirA;
    private javax.swing.JButton BotãoExcluirA;
    private javax.swing.JLabel Capacidade;
    private javax.swing.JLabel CoPiloto;
    private javax.swing.JLabel Empresa;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel NdeSerie;
    private javax.swing.JLabel Piloto;
    private javax.swing.JLabel Questão;
    private javax.swing.JLabel capacidade;
    private javax.swing.JLabel copiloto;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel nserie;
    private javax.swing.JLabel piloto;
    // End of variables declaration//GEN-END:variables
}
