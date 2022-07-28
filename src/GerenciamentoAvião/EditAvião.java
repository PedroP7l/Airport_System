
package GerenciamentoAvião;


import Controle.Controle;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielFelipe
 */
public class EditAvião extends javax.swing.JFrame 
{
    public EditAvião() 
    {
        initComponents();
    }

    Avião A = new Avião();
    MenuAvião MA = new MenuAvião();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelEdit = new javax.swing.JPanel();
        marca = new javax.swing.JLabel();
        Marca = new javax.swing.JComboBox<>();
        empresa = new javax.swing.JLabel();
        Empresa = new javax.swing.JComboBox<>();
        nserie = new javax.swing.JLabel();
        NdeSerie = new javax.swing.JTextField();
        piloto = new javax.swing.JLabel();
        Piloto = new javax.swing.JComboBox<>();
        copiloto = new javax.swing.JLabel();
        CoPiloto = new javax.swing.JComboBox<>();
        capacidade = new javax.swing.JLabel();
        Capacidade = new javax.swing.JComboBox<>();
        comissário1 = new javax.swing.JLabel();
        Comissário1 = new javax.swing.JComboBox<>();
        comissário2 = new javax.swing.JLabel();
        Comissário2 = new javax.swing.JComboBox<>();
        comissário3 = new javax.swing.JLabel();
        Comissário3 = new javax.swing.JComboBox<>();
        comissário4 = new javax.swing.JLabel();
        Comissário4 = new javax.swing.JComboBox<>();
        comissário5 = new javax.swing.JLabel();
        Comissário5 = new javax.swing.JComboBox<>();
        comissário6 = new javax.swing.JLabel();
        Comissário6 = new javax.swing.JComboBox<>();
        BotãoEditarA = new javax.swing.JButton();
        BotãoCanEditA = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        PainelEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        marca.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        marca.setText("Marca:");
        marca.setToolTipText("");

        Marca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Embraer", "Scoda Aeronáutica", "Seamax", "ACS Aviation" }));

        empresa.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        empresa.setText("Empresa:");
        empresa.setToolTipText("");

        Empresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Empresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avianca", "Azul", "Gol", "Latam", "Passaredo" }));

        nserie.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nserie.setText("N° de Serie:");
        nserie.setToolTipText("");

        NdeSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        piloto.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        piloto.setText("Piloto:");
        piloto.setToolTipText("");

        Piloto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Piloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        copiloto.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        copiloto.setText("Co-Piloto:");
        copiloto.setToolTipText("");

        CoPiloto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CoPiloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        capacidade.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        capacidade.setText("Capacidade:");
        capacidade.setToolTipText("");

        Capacidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Capacidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40", "60", "80", "120" }));

        comissário1.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário1.setText("Comissário:");
        comissário1.setToolTipText("");

        Comissário1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        comissário2.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário2.setText("Comissário:");
        comissário2.setToolTipText("");

        Comissário2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        comissário3.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário3.setText("Comissário:");
        comissário3.setToolTipText("");

        Comissário3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        comissário4.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário4.setText("Comissário:");
        comissário4.setToolTipText("");

        Comissário4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        comissário5.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário5.setText("Comissário:");
        comissário5.setToolTipText("");

        Comissário5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        comissário6.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        comissário6.setText("Comissário:");
        comissário6.setToolTipText("");

        Comissário6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Comissário6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        BotãoEditarA.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoEditarA.setText("Editar");
        BotãoEditarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarAActionPerformed(evt);
            }
        });

        BotãoCanEditA.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        BotãoCanEditA.setText("Cancelar");
        BotãoCanEditA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCanEditAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelEditLayout = new javax.swing.GroupLayout(PainelEdit);
        PainelEdit.setLayout(PainelEditLayout);
        PainelEditLayout.setHorizontalGroup(
            PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEditLayout.createSequentialGroup()
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nserie)
                                .addGroup(PainelEditLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(copiloto)
                                        .addComponent(marca)
                                        .addComponent(empresa)
                                        .addComponent(piloto))))
                            .addComponent(capacidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CoPiloto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Capacidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Piloto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NdeSerie)
                            .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEditLayout.createSequentialGroup()
                                .addComponent(comissário6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Comissário6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelEditLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(BotãoEditarA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BotãoCanEditA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PainelEditLayout.setVerticalGroup(
            PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário1)
                    .addComponent(Comissário1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresa)
                    .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário2)
                    .addComponent(Comissário2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nserie)
                    .addComponent(NdeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário3)
                    .addComponent(Comissário3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(piloto)
                    .addComponent(Piloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário4)
                    .addComponent(Comissário4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copiloto)
                    .addComponent(CoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário5)
                    .addComponent(Comissário5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidade)
                    .addComponent(Capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comissário6)
                    .addComponent(Comissário6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoEditarA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotãoCanEditA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(PainelEdit);
        PainelEdit.setBounds(50, 240, 590, 280);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar de Avião");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 0, 680, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus4.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-10, -6, 690, 680);

        setSize(new java.awt.Dimension(693, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void BotãoEditarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarAActionPerformed
        // Click no Botão Editar:
        
        try
        {
            A.setMarca((String)Marca.getSelectedItem());
            A.setEmpresa((String)Empresa.getSelectedItem());
            A.setNserie(NdeSerie.getText());
            A.setCapacidade(Integer.parseInt((String)Capacidade.getSelectedItem()));
            A.setEcclasse((int)(A.getCapacidade()*0.5));
            A.setExclasse((int)(A.getCapacidade()*0.3));
            A.setAclasse((int)(A.getCapacidade()*0.2));
            
            for(int i = 0 ; i < Controle.funcionários.size() ; i++)
            {
                if(Controle.funcionários.get(i).getNome().equals(Piloto.getSelectedItem()))
                {
                    A.setPiloto(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(CoPiloto.getSelectedItem()))
                {
                    A.setCopiloto(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário1.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário2.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário3.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário4.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário5.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
                
                if(Controle.funcionários.get(i).getNome().equals(Comissário6.getSelectedItem()))
                {
                    A.comissários.add(Controle.funcionários.get(i));
                    //Controle.funcionários.remove(i);
                }
               
            }
            
        Controle.aviões.remove(MA.selectedRow);   
        Controle.aviões.add(A);
        
        MA.setVisible(true);
        dispose();
        
        JOptionPane.showMessageDialog(null,"Avião Cadastrado com Sucesso!!!");
        
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!! ");
        }
        catch(ClassCastException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!! ");
        }
        catch(IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!! ");
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"Preencha Todos os Campos Corretamente!!! ");
        }

        
        
    }//GEN-LAST:event_BotãoEditarAActionPerformed

    private void BotãoCanEditAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCanEditAActionPerformed
        // Click no Botão Cancelar:
        
        MA.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoCanEditAActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando Abre a Janela:
        
        for(int i = 0 ; i < Controle.funcionários.size() ; i++)
        {
           if(Controle.funcionários.get(i).getFunção().equals("Piloto"))
           {
               Piloto.addItem(Controle.funcionários.get(i).getNome());
           }
                
           if(Controle.funcionários.get(i).getFunção().equals("Co-Piloto"))
           {
               CoPiloto.addItem(Controle.funcionários.get(i).getNome());
           }
                
           if(Controle.funcionários.get(i).getFunção().equals("Comissário"))
           {
               Comissário1.addItem(Controle.funcionários.get(i).getNome());
               Comissário2.addItem(Controle.funcionários.get(i).getNome());
               Comissário3.addItem(Controle.funcionários.get(i).getNome());
               Comissário4.addItem(Controle.funcionários.get(i).getNome());
               Comissário5.addItem(Controle.funcionários.get(i).getNome());
               Comissário6.addItem(Controle.funcionários.get(i).getNome());
           }
     
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
            java.util.logging.Logger.getLogger(EditAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAvião.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditAvião().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCanEditA;
    private javax.swing.JButton BotãoEditarA;
    private javax.swing.JComboBox<String> Capacidade;
    private javax.swing.JComboBox<String> CoPiloto;
    private javax.swing.JComboBox<String> Comissário1;
    private javax.swing.JComboBox<String> Comissário2;
    private javax.swing.JComboBox<String> Comissário3;
    private javax.swing.JComboBox<String> Comissário4;
    private javax.swing.JComboBox<String> Comissário5;
    private javax.swing.JComboBox<String> Comissário6;
    private javax.swing.JComboBox<String> Empresa;
    private javax.swing.JLabel Fundo;
    private javax.swing.JComboBox<String> Marca;
    private javax.swing.JTextField NdeSerie;
    private javax.swing.JPanel PainelEdit;
    private javax.swing.JComboBox<String> Piloto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel capacidade;
    private javax.swing.JLabel comissário1;
    private javax.swing.JLabel comissário2;
    private javax.swing.JLabel comissário3;
    private javax.swing.JLabel comissário4;
    private javax.swing.JLabel comissário5;
    private javax.swing.JLabel comissário6;
    private javax.swing.JLabel copiloto;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel nserie;
    private javax.swing.JLabel piloto;
    // End of variables declaration//GEN-END:variables
}
