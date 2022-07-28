
package GerenciamentoViagem;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class ExclViagem extends javax.swing.JFrame 
{
    Viagem V = new Viagem();
    MenuViagem MV = new MenuViagem();
    
    public ExclViagem() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questão = new javax.swing.JLabel();
        avião = new javax.swing.JLabel();
        AviaoV = new javax.swing.JLabel();
        origem = new javax.swing.JLabel();
        OrigemV = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        DestinoV = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        DataV = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        HoraV = new javax.swing.JLabel();
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
        Questão.setText("Excluir Viagem:");
        Questão.setToolTipText("");

        avião.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        avião.setText("Avião:");
        avião.setToolTipText("");

        AviaoV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AviaoV.setText("???");

        origem.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        origem.setText("Origem:");
        origem.setToolTipText("");

        OrigemV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OrigemV.setText("???");

        destino.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        destino.setText("Destino:");
        destino.setToolTipText("");

        DestinoV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DestinoV.setText("???");

        data.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        data.setText("Data:");
        data.setToolTipText("");

        DataV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DataV.setText("???");

        hora.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        hora.setText("Hora:");
        hora.setToolTipText("");

        HoraV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HoraV.setText("???");

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
                .addComponent(Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avião)
                            .addComponent(destino)
                            .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data)
                            .addComponent(hora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DataV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(DestinoV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HoraV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AviaoV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrigemV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotãoExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCanExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Questão)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avião)
                    .addComponent(AviaoV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origem)
                    .addComponent(OrigemV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destino)
                    .addComponent(DestinoV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(DataV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora)
                    .addComponent(HoraV))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(374, 335));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCanExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanExcluirFActionPerformed
        // Click no Botão Cancelar:

        MV.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCanExcluirFActionPerformed

    private void BotãoExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirFActionPerformed
        // Click no Botão Sim:

        Controle.viagens.remove(MV.selectedRow);
        MV.setVisible(true);
        dispose();

        JOptionPane.showMessageDialog(null,"Viagem Excluida com Sucesso!!!");

    }//GEN-LAST:event_BotãoExcluirFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        AviaoV.setText(Controle.viagens.get(MV.selectedRow).getAvião().getNserie());
        OrigemV.setText(Controle.viagens.get(MV.selectedRow).getOrigem());
        DestinoV.setText(Controle.viagens.get(MV.selectedRow).getDestino());
        DataV.setText(String.valueOf(Controle.viagens.get(MV.selectedRow).getData()));
        HoraV.setText(String.valueOf(Controle.viagens.get(MV.selectedRow).getHora()));
        
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
            java.util.logging.Logger.getLogger(ExclViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExclViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExclViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExclViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExclViagem().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AviaoV;
    private javax.swing.JButton BotãoCanExcluirF;
    private javax.swing.JButton BotãoExcluirF;
    private javax.swing.JLabel DataV;
    private javax.swing.JLabel DestinoV;
    private javax.swing.JLabel HoraV;
    private javax.swing.JLabel OrigemV;
    private javax.swing.JLabel Questão;
    private javax.swing.JLabel avião;
    private javax.swing.JLabel data;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel origem;
    // End of variables declaration//GEN-END:variables
}
