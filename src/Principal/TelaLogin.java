package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class TelaLogin extends javax.swing.JFrame 
{
    public TelaLogin() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ÁreaCliente = new javax.swing.JButton();
        PainelLogin = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Usuário = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ÁreaCliente.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        ÁreaCliente.setText("Área do Cliente");
        ÁreaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÁreaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ÁreaCliente);
        ÁreaCliente.setBounds(320, 260, 260, 40);

        PainelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Titulo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Acesso de Gerenciamento");

        Usuário.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Usuário.setText("Usuário:");

        Senha.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Senha.setText("Senha:");

        CampoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoUsuario.setText("admin");

        CampoSenha.setText("1234");

        Login.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLoginLayout = new javax.swing.GroupLayout(PainelLogin);
        PainelLogin.setLayout(PainelLoginLayout);
        PainelLoginLayout.setHorizontalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Senha)
                    .addComponent(Usuário))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CampoSenha)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        PainelLoginLayout.setVerticalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuário, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelLogin);
        PainelLogin.setBounds(310, 310, 280, 170);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoPrincipal.PNG"))); // NOI18N
        Fundo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 870, 540);

        setSize(new java.awt.Dimension(881, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Login e Senha: 
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // Click Botão de Login
        
        MenuGerenciamento MG = new MenuGerenciamento();
        
        if(CampoUsuario.getText().equals("admin") && CampoSenha.getText().equals("1234"))
        {
            MG.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Usuário ou Senha Incorreta!!!");
        }
        
        
    }//GEN-LAST:event_LoginActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // Click Botão de Sair
        
        dispose();
        
    }//GEN-LAST:event_SairActionPerformed

    private void ÁreaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÁreaClienteActionPerformed
        // Click Área do Cliente:
        
        ÁreaCliente  MC = new ÁreaCliente();
        
        MC.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ÁreaClienteActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton Login;
    private javax.swing.JPanel PainelLogin;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuário;
    private javax.swing.JButton ÁreaCliente;
    // End of variables declaration//GEN-END:variables
}
