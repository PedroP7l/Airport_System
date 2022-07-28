
package Principal;

import ComponentesCliente.CprPassagem;
import GerenciamentoCliente.CadCliente;
import Controle.Controle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author GabrielFelipe
 */
public class ÁreaCliente extends javax.swing.JFrame 
{
    
    public ÁreaCliente() 
    {
        initComponents();
    }
    
    public static int selectedRow = -1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelBotões = new javax.swing.JPanel();
        BotãoCadastro = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        BotãoCPassagem = new javax.swing.JButton();
        CampoPesquisar = new javax.swing.JTextField();
        BotãoVoltar = new javax.swing.JButton();
        ScrollTabelaViagens = new javax.swing.JScrollPane();
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

        BotãoCadastro.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoCadastro.setText("Cadastrar");
        BotãoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCadastroActionPerformed(evt);
            }
        });

        Pesquisar.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Pesquisar.setText("Pesquisar:");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        BotãoCPassagem.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BotãoCPassagem.setText("Comprar Passagem");
        BotãoCPassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoCPassagemActionPerformed(evt);
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
        ScrollTabelaViagens.setViewportView(TabelaViagem);

        javax.swing.GroupLayout PainelBotõesLayout = new javax.swing.GroupLayout(PainelBotões);
        PainelBotões.setLayout(PainelBotõesLayout);
        PainelBotõesLayout.setHorizontalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotãoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoCPassagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotãoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollTabelaViagens, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PainelBotõesLayout.setVerticalGroup(
            PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelBotõesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotõesLayout.createSequentialGroup()
                        .addGroup(PainelBotõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(ScrollTabelaViagens, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelBotõesLayout.createSequentialGroup()
                        .addComponent(BotãoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoCPassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotãoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(PainelBotões);
        PainelBotões.setBounds(190, 150, 910, 290);

        Titulo.setFont(new java.awt.Font("Airstrike Laser", 0, 45)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu do CLIENTE");
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
    private void BotãoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCadastroActionPerformed
        // Click Botão de Cadastro:
        
        CadCliente CC = new CadCliente();
        CC.setVisible(true);
        dispose(); 
        
    }//GEN-LAST:event_BotãoCadastroActionPerformed

    private void BotãoCPassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoCPassagemActionPerformed
        // Click Botão de Editar:
        
        selectedRow = TabelaViagem.getSelectedRow();
        if(selectedRow>=0)
        {
            CprPassagem CP = new CprPassagem();
            CP.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um Viagem!!!");
        }
        
        
        
    }//GEN-LAST:event_BotãoCPassagemActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // Click Botão de Voltar:
        
        TelaLogin TL = new TelaLogin();
        TL.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotãoVoltarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // Click Botão de Pesquisar:
               
        DefaultTableModel TV = (DefaultTableModel)TabelaViagem.getModel();
        TV.setNumRows(0);
        
        for(int i = 0 ; i<Controle.viagens.size() ; i++)
        {
            if(CampoPesquisar.getText().equalsIgnoreCase("[aA-zZ]"))
            {
                JOptionPane.showMessageDialog(null,"Digite um Destino!!!");
            }
            
            if(Controle.viagens.get(i).getDestino().equals(CampoPesquisar.getText()))
            {
                TV.setNumRows(0);
                
                TV.addRow(new Object[]
                {
                    Controle.viagens.get(i).getAvião().getEmpresa(),
                    Controle.viagens.get(i).getOrigem(),
                    Controle.viagens.get(i).getDestino(),
                    Controle.viagens.get(i).getData(),
                    Controle.viagens.get(i).getHora(),
                });
            }
            
            if(CampoPesquisar.getText().equalsIgnoreCase(""))
            {
                TV.addRow(new Object[]
                {
                    Controle.viagens.get(i).getAvião().getEmpresa(),
                    Controle.viagens.get(i).getOrigem(),
                    Controle.viagens.get(i).getDestino(),
                    Controle.viagens.get(i).getData(),
                    Controle.viagens.get(i).getHora(),
                });
            }
        }  
        
    }//GEN-LAST:event_PesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:
        
        DefaultTableModel TV = (DefaultTableModel)TabelaViagem.getModel();
        TV.setNumRows(0);
        
        for(int i = 0 ; i < Controle.viagens.size() ; i++)
        {
            TV.addRow(new Object[]
            {
                Controle.viagens.get(i).getAvião().getEmpresa(),
                Controle.viagens.get(i).getOrigem(),
                Controle.viagens.get(i).getDestino(),
                Controle.viagens.get(i).getData(),
                Controle.viagens.get(i).getHora(),
            });
        }
    }//GEN-LAST:event_formWindowOpened

    /*
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
    {
        int tamanho = (this.getLengh + str.length());
        
        if(tamanho <= 10)
        {
            super.insertString(offs, str.replaceAll("[0-9]","", a));
        }
        else
        {
            super.insertString(offs, str.replaceAll("[aA0-zZ9]","", a));
        }
        
    }
    */
    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ÁreaCliente().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoCPassagem;
    private javax.swing.JButton BotãoCadastro;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JPanel PainelBotões;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JScrollPane ScrollTabelaViagens;
    private javax.swing.JTable TabelaViagem;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
    /*
    public javax.swing.JTable getTabelaFuncionário()
    {
       return TabelaFuncionário;
    }
    */
}
