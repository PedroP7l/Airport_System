
package GerenciamentoAvião;

import GerenciamentoFuncionário.*;
import Controle.Controle;
import Principal.MenuGerenciamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author GabrielFelipe
 */
public class MenuAvião extends javax.swing.JFrame 
{
    
    public MenuAvião() 
    {
        initComponents();
    }
    
    public static int selectedRow = -1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        PainelBotões = new javax.swing.JPanel();
        BotãoCadastro = new javax.swing.JButton();
        BotãoEditar = new javax.swing.JButton();
        BotãoExcluir = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        CampoPesquisar = new javax.swing.JTextField();
        BotãoVoltar = new javax.swing.JButton();
        ScrollTabelaAviões = new javax.swing.JScrollPane();
        TabelaAvião = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu de Aviões");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 0, 1260, 65);

        PainelBotões.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotãoCadastro.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoCadastro.setText("Novo");
        BotãoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroActionPerformed(evt);
            }
        });

        BotãoEditar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoEditar.setText("Editar");
        BotãoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarActionPerformed(evt);
            }
        });

        BotãoExcluir.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoExcluir.setText("Excluir");
        BotãoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoExcluirActionPerformed(evt);
            }
        });

        Pesquisar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Pesquisar.setText("Pesquisar:");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        CampoPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BotãoVoltar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoVoltar.setText("Voltar");
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });

        TabelaAvião.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TabelaAvião.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TabelaAvião.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Empresa", "N° de Serie", "Piloto", "Co-Piloto", "Capacidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAvião.setToolTipText("");
        ScrollTabelaAviões.setViewportView(TabelaAvião);

        javax.swing.GroupLayout PainelBotõesLayout = new javax.swing.GroupLayout(PainelBotões);
        PainelBotões.setLayout(PainelBotõesLayout);
        PainelBotõesLayout.setHorizontalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollTabelaAviões, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelBotõesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPesquisar)
                        .addGap(114, 114, 114)
                        .addComponent(BotãoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(21, 21, 21))
        );
        PainelBotõesLayout.setVerticalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotãoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotãoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotãoExcluir)
                        .addComponent(Pesquisar)
                        .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotãoVoltar)))
                .addGap(18, 18, 18)
                .addComponent(ScrollTabelaAviões, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(PainelBotões);
        PainelBotões.setBounds(110, 140, 1062, 310);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus3.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-6, -6, 1270, 570);

        setSize(new java.awt.Dimension(1273, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Botoões de Ações:
    private void BotãoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastroActionPerformed
        // Click Botão de Cadastro:
        
        CadAvião CA = new CadAvião();
        CA.setVisible(true);
        dispose(); 
        
    }//GEN-LAST:event_BotãoCadastroActionPerformed

    private void BotãoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarActionPerformed
        // Click Botão de Editar:
        
        selectedRow = TabelaAvião.getSelectedRow();
        if(selectedRow>=0)
        {
            EditAvião EdA = new EditAvião();
            EdA.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um Avião!!!");
        }
        
        
        
    }//GEN-LAST:event_BotãoEditarActionPerformed

    private void BotãoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirActionPerformed
        // Click Botão de Excluir:
      
        selectedRow = TabelaAvião.getSelectedRow();
        if(selectedRow>=0)
        {
            ExclAvião ExA = new ExclAvião();
            ExA.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um Avião!!!");
        }
        
      
    }//GEN-LAST:event_BotãoExcluirActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // Click Botão de Voltar:
        
        MenuGerenciamento MG = new MenuGerenciamento();
        MG.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoVoltarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // Click Botão de Pesquisar:
               
        DefaultTableModel TF = (DefaultTableModel)TabelaAvião.getModel();
        TF.setNumRows(0);
        
        for(int i = 0 ; i<Controle.aviões.size() ; i++)
        {
            if(CampoPesquisar.getText().equalsIgnoreCase("[aA-zZ]"))
            {
                JOptionPane.showMessageDialog(null,"Digite um N° de Serie!!!");
            }
            
            if(Controle.aviões.get(i).getNserie().equals(CampoPesquisar.getText()))
            {
                TF.setNumRows(0);
                
                TF.addRow(new Object[]
                {
                    Controle.aviões.get(i).getMarca(),
                    Controle.aviões.get(i).getEmpresa(),
                    Controle.aviões.get(i).getNserie(),
                    Controle.aviões.get(i).getPiloto().getNome(),
                    Controle.aviões.get(i).getCopiloto().getNome(),
                    Controle.aviões.get(i).getCapacidade()
                });
            }
            
            if(CampoPesquisar.getText().equalsIgnoreCase(""))
            {
                TF.addRow(new Object[]
                {
                    Controle.aviões.get(i).getMarca(),
                    Controle.aviões.get(i).getEmpresa(),
                    Controle.aviões.get(i).getNserie(),
                    Controle.aviões.get(i).getPiloto().getNome(),
                    Controle.aviões.get(i).getCopiloto().getNome(),
                    Controle.aviões.get(i).getCapacidade()
                });
            }
            
        }  
        
    }//GEN-LAST:event_PesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        DefaultTableModel TF = (DefaultTableModel)TabelaAvião.getModel();
        TF.setNumRows(0);
        
        for(int i = 0 ; i < Controle.aviões.size() ; i++)
        {
            try{
            TF.addRow(new Object[]
            {
                Controle.aviões.get(i).getMarca(),
                Controle.aviões.get(i).getEmpresa(),
                Controle.aviões.get(i).getNserie(),
                Controle.aviões.get(i).getPiloto().getNome(),
                Controle.aviões.get(i).getCopiloto().getNome(),
                Controle.aviões.get(i).getCapacidade()
            });
            }
            catch(Exception e){}
        }
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MenuAvião().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastro;
    private javax.swing.JButton BotãoEditar;
    private javax.swing.JButton BotãoExcluir;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelBotões;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JScrollPane ScrollTabelaAviões;
    private javax.swing.JTable TabelaAvião;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

}
