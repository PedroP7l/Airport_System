package GerenciamentoViagem;

import Controle.Controle;
import Principal.MenuGerenciamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GabrielFelipe
 */
public class MenuViagem extends javax.swing.JFrame {

    public MenuViagem() {
        initComponents();
    }

    public static int selectedRow = -1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBotões = new javax.swing.JPanel();
        BotãoCadastroV = new javax.swing.JButton();
        BotãoEditarV = new javax.swing.JButton();
        BotãoExcluirV = new javax.swing.JButton();
        PesquisarV = new javax.swing.JButton();
        CampoPesquisarV = new javax.swing.JTextField();
        BotãoVoltarV = new javax.swing.JButton();
        ScrollTabelaViagem = new javax.swing.JScrollPane();
        TabelaViagem = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        PainelBotões.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BotãoCadastroV.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoCadastroV.setText("Novo");
        BotãoCadastroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroVActionPerformed(evt);
            }
        });

        BotãoEditarV.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoEditarV.setText("Editar");
        BotãoEditarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoEditarVActionPerformed(evt);
            }
        });

        BotãoExcluirV.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoExcluirV.setText("Excluir");
        BotãoExcluirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoExcluirVActionPerformed(evt);
            }
        });

        PesquisarV.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        PesquisarV.setText("Pesquisar:");
        PesquisarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarVActionPerformed(evt);
            }
        });

        CampoPesquisarV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BotãoVoltarV.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoVoltarV.setText("Voltar");
        BotãoVoltarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarVActionPerformed(evt);
            }
        });

        TabelaViagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TabelaViagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TabelaViagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Avião", "Origem", "Destino", "Data", "Embarque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaViagem.setToolTipText("");
        ScrollTabelaViagem.setViewportView(TabelaViagem);

        javax.swing.GroupLayout PainelBotõesLayout = new javax.swing.GroupLayout(PainelBotões);
        PainelBotões.setLayout(PainelBotõesLayout);
        PainelBotõesLayout.setHorizontalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollTabelaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelBotõesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotãoCadastroV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoEditarV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoExcluirV)
                        .addGap(18, 18, 18)
                        .addComponent(PesquisarV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPesquisarV)
                        .addGap(114, 114, 114)
                        .addComponent(BotãoVoltarV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(21, 21, 21))
        );
        PainelBotõesLayout.setVerticalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotãoCadastroV, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotãoEditarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotãoExcluirV)
                        .addComponent(PesquisarV)
                        .addComponent(CampoPesquisarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotãoVoltarV)))
                .addGap(18, 18, 18)
                .addComponent(ScrollTabelaViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(PainelBotões);
        PainelBotões.setBounds(110, 140, 1062, 310);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu Viagem");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 0, 1260, 65);

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoMenus3.PNG"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-6, -6, 1270, 570);

        setSize(new java.awt.Dimension(1273, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações:
    private void BotãoCadastroVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastroVActionPerformed
        // Click Botão de Cadastro:

        CadViagem CV = new CadViagem();
        CV.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoCadastroVActionPerformed

    private void BotãoEditarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoEditarVActionPerformed
        // Click Botão de Editar:

        selectedRow = TabelaViagem.getSelectedRow();
        if (selectedRow >= 0) 
        {
            EditViagem EdV = new EditViagem();
            EdV.setVisible(true);
            dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Selecione uma Viagem!!!");
        }


    }//GEN-LAST:event_BotãoEditarVActionPerformed

    private void BotãoExcluirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoExcluirVActionPerformed
        // Click Botão de Excluir:

        selectedRow = TabelaViagem.getSelectedRow();
        if (selectedRow >= 0) 
        {
            ExclViagem ExV = new ExclViagem();
            ExV.setVisible(true);
            dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Selecione uma Viagem!!!");
        }


    }//GEN-LAST:event_BotãoExcluirVActionPerformed

    private void BotãoVoltarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarVActionPerformed
        // Click Botão de Voltar:

        MenuGerenciamento MG = new MenuGerenciamento();
        MG.setVisible(true);
        dispose();

    }//GEN-LAST:event_BotãoVoltarVActionPerformed

    private void PesquisarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarVActionPerformed
        // Click Botão de Pesquisar:

        DefaultTableModel TF = (DefaultTableModel) TabelaViagem.getModel();
        TF.setNumRows(0);

        for (int i = 0; i < Controle.viagens.size(); i++) 
        {
            if(CampoPesquisarV.getText().equalsIgnoreCase("[aA-zZ]"))
            {
                JOptionPane.showMessageDialog(null,"Digite um Destino!!!");
            }
            
            if (Controle.viagens.get(i).getDestino().equals(CampoPesquisarV.getText())) 
            {
                TF.setNumRows(0);

                TF.addRow(new Object[]{
                    Controle.viagens.get(i).getAvião().getNserie(),
                    Controle.viagens.get(i).getDestino(),
                    Controle.viagens.get(i).getOrigem(),
                    Controle.viagens.get(i).getData(),
                    Controle.viagens.get(i).getHora()
                });
            }

            if (CampoPesquisarV.getText().equalsIgnoreCase("")) 
            {
                TF.addRow(new Object[]{
                    Controle.viagens.get(i).getAvião().getNserie(),
                    Controle.viagens.get(i).getDestino(),
                    Controle.viagens.get(i).getOrigem(),
                    Controle.viagens.get(i).getData(),
                    Controle.viagens.get(i).getHora()
                });
            }
        }

    }//GEN-LAST:event_PesquisarVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:

        DefaultTableModel TF = (DefaultTableModel) TabelaViagem.getModel();
        TF.setNumRows(0);

        for (int i = 0; i < Controle.viagens.size(); i++) 
        {
            TF.addRow(new Object[]
            {
                Controle.viagens.get(i).getAvião().getNserie(),
                Controle.viagens.get(i).getDestino(),
                Controle.viagens.get(i).getOrigem(),
                Controle.viagens.get(i).getData(),
                Controle.viagens.get(i).getHora()
            });
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuViagem().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCadastroV;
    private javax.swing.JButton BotãoEditarV;
    private javax.swing.JButton BotãoExcluirV;
    private javax.swing.JButton BotãoVoltarV;
    private javax.swing.JTextField CampoPesquisarV;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelBotões;
    private javax.swing.JButton PesquisarV;
    private javax.swing.JScrollPane ScrollTabelaViagem;
    private javax.swing.JTable TabelaViagem;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
  
}
