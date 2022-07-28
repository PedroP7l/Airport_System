
package ComponentesCliente;

import GerenciamentoViagem.*;
import Controle.Controle;
import Principal.ÁreaCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class CprPassagem extends javax.swing.JFrame 
{
    Viagem V = new Viagem();
    ÁreaCliente AC = new ÁreaCliente();
    
    public CprPassagem() 
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
        classe = new javax.swing.JLabel();
        ClasseV = new javax.swing.JComboBox<>();
        valor = new javax.swing.JLabel();
        ValorV = new javax.swing.JLabel();
        BotãoConfirmaV = new javax.swing.JButton();
        BotãoCancV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Questão.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        Questão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Questão.setText("Comprar Passagem:");
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

        classe.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        classe.setText("Classe:");
        classe.setToolTipText("");

        ClasseV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ClasseV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe A", "Executiva", "Econômica" }));

        valor.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        valor.setText("Valor:");
        valor.setToolTipText("");

        ValorV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValorV.setText("???");

        BotãoConfirmaV.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoConfirmaV.setText("Conffirmar");
        BotãoConfirmaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoConfirmaVActionPerformed(evt);
            }
        });

        BotãoCancV.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCancV.setText("Cancelar");
        BotãoCancV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCancVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Questão, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotãoConfirmaV, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCancV, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classe)
                            .addComponent(avião)
                            .addComponent(destino)
                            .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data)
                            .addComponent(hora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DataV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(DestinoV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HoraV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AviaoV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OrigemV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClasseV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorV, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                .addGap(69, 69, 69))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClasseV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classe)
                    .addComponent(valor)
                    .addComponent(ValorV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotãoConfirmaV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCancV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(366, 359));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações
    private void BotãoCancVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCancVActionPerformed
        // Click no Botão Cancelar:

        AC.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCancVActionPerformed

    private void BotãoConfirmaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoConfirmaVActionPerformed
        // Click no Botão Sim:
        
        

        JOptionPane.showMessageDialog(null,"Viagem Reservada com Sucesso!!!");

    }//GEN-LAST:event_BotãoConfirmaVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        AviaoV.setText(Controle.viagens.get(AC.selectedRow).getAvião().getEmpresa());
        OrigemV.setText(Controle.viagens.get(AC.selectedRow).getOrigem());
        DestinoV.setText(Controle.viagens.get(AC.selectedRow).getDestino());
        DataV.setText(String.valueOf(Controle.viagens.get(AC.selectedRow).getData()));
        HoraV.setText(String.valueOf(Controle.viagens.get(AC.selectedRow).getHora()));
        //ValorV.setText(String.valueOf(Controle.aviões.get(AC.selectedRow)));
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
            java.util.logging.Logger.getLogger(CprPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CprPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CprPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CprPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CprPassagem().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AviaoV;
    private javax.swing.JButton BotãoCancV;
    private javax.swing.JButton BotãoConfirmaV;
    private javax.swing.JComboBox<String> ClasseV;
    private javax.swing.JLabel DataV;
    private javax.swing.JLabel DestinoV;
    private javax.swing.JLabel HoraV;
    private javax.swing.JLabel OrigemV;
    private javax.swing.JLabel Questão;
    private javax.swing.JLabel ValorV;
    private javax.swing.JLabel avião;
    private javax.swing.JLabel classe;
    private javax.swing.JLabel data;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel origem;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
