
package GerenciamentoViagem;

import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class CadViagem extends javax.swing.JFrame 
{
    Viagem V = new Viagem();
    MenuViagem MV = new MenuViagem();
    
    public CadViagem() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastro = new javax.swing.JPanel();
        avião = new javax.swing.JLabel();
        origem = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        embarque = new javax.swing.JLabel();
        CampoVOrigem = new javax.swing.JTextField();
        CampoVDestino = new javax.swing.JTextField();
        CampoDataV = new javax.swing.JTextField();
        CampoEmbarqueV = new javax.swing.JTextField();
        BotãoCadastrarV = new javax.swing.JButton();
        BotãoCanCadastroV = new javax.swing.JButton();
        Avião = new javax.swing.JComboBox<>();
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

        avião.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        avião.setText("Avião: ");
        avião.setToolTipText("");

        origem.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        origem.setText("Origem: ");
        origem.setToolTipText("");

        destino.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        destino.setText("Destino:");
        destino.setToolTipText("");

        data.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        data.setText("Data:");
        data.setToolTipText("");

        embarque.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        embarque.setText("Embarque:");
        embarque.setToolTipText("");

        CampoVOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoVOrigem.setToolTipText("");

        CampoVDestino.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoDataV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        CampoEmbarqueV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BotãoCadastrarV.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCadastrarV.setText("Cadastrar");
        BotãoCadastrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastrarVActionPerformed(evt);
            }
        });

        BotãoCanCadastroV.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanCadastroV.setText("Cancelar");
        BotãoCanCadastroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanCadastroVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(origem)
                            .addComponent(avião, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destino)
                            .addComponent(data)
                            .addComponent(embarque))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampoVOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(CampoDataV)
                    .addComponent(CampoVDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoEmbarqueV)
                    .addComponent(Avião, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addComponent(BotãoCadastrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotãoCanCadastroV, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avião)
                    .addComponent(Avião, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origem)
                    .addComponent(CampoVOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destino)
                    .addComponent(CampoVDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(CampoDataV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEmbarqueV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(embarque))
                .addGap(18, 18, 18)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoCadastrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanCadastroV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(PainelCadastro);
        PainelCadastro.setBounds(80, 240, 530, 280);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Cadastro de Viagem");
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
    private void BotãoCadastrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastrarVActionPerformed
        // Click no Botão Cadastar:
        try
        {
            for(int i = 0 ; i < Controle.aviões.size() ; i++)
            {
                if(Controle.aviões.get(i).getNserie().equals(Avião.getSelectedItem()))
                {
                   V.setAvião(Controle.aviões.get(i)); 
                }
            }
            
            V.setOrigem(CampoVOrigem.getText());
            V.setDestino(CampoVDestino.getText());
            V.setHora(CampoEmbarqueV.getText());
            V.setData(CampoDataV.getText());
        
            Controle.viagens.add(V);
     
            JOptionPane.showMessageDialog(null,"Viagem Cadastrada com Sucesso!!!");
        
            MV.setVisible(true);
            dispose();
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!!");
        }
        
    }//GEN-LAST:event_BotãoCadastrarVActionPerformed

    private void BotãoCanCadastroVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanCadastroVActionPerformed
        // Click no Botão Cancelar:
        
        MV.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoCanCadastroVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        for(int i = 0 ; i < Controle.aviões.size() ; i++)
        {
            Avião.addItem(Controle.aviões.get(i).getNserie());
        }
        
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
            java.util.logging.Logger.getLogger(CadViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadViagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CadViagem().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Avião;
    private javax.swing.JButton BotãoCadastrarV;
    private javax.swing.JButton BotãoCanCadastroV;
    private javax.swing.JTextField CampoDataV;
    private javax.swing.JTextField CampoEmbarqueV;
    private javax.swing.JTextField CampoVDestino;
    private javax.swing.JTextField CampoVOrigem;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel avião;
    private javax.swing.JLabel data;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel embarque;
    private javax.swing.JLabel origem;
    // End of variables declaration//GEN-END:variables
}
