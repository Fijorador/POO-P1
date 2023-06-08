
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 ** @author Mateus Moreira Fonseca RA:1426885
 */
public class Principal extends javax.swing.JFrame {

    private static Principal instancia;

    public Principal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static Principal getInstance() {
        if (instancia == null) {
            instancia = new Principal();
        }
        return instancia;
    }

    public void sair() {
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == 0) {
            System.exit(0);

        }
    }

    /**
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTituloPrinc = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        mCriarConta = new javax.swing.JMenu();
        iCriarContaCorrente = new javax.swing.JMenuItem();
        iCriarContaPoupanca = new javax.swing.JMenuItem();
        iCriarContaPoupanca1 = new javax.swing.JMenuItem();
        mOperaçõesBancarias = new javax.swing.JMenu();
        sbTodasContas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        sbMetodosUnicos = new javax.swing.JMenu();
        iTransferencia = new javax.swing.JMenuItem();
        mBuscarConta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotTituloPrinc.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        rotTituloPrinc.setText("Sistema Gerencial de Contas Bancarias");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        mCriarConta.setText("Criar Contas");

        iCriarContaCorrente.setText("Criar Conta Corrente");
        iCriarContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCriarContaCorrenteActionPerformed(evt);
            }
        });
        mCriarConta.add(iCriarContaCorrente);

        iCriarContaPoupanca.setText("Criar Conta Poupança");
        iCriarContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCriarContaPoupancaActionPerformed(evt);
            }
        });
        mCriarConta.add(iCriarContaPoupanca);

        iCriarContaPoupanca1.setText("Criar Conta Poupança Especial");
        iCriarContaPoupanca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCriarContaPoupanca1ActionPerformed(evt);
            }
        });
        mCriarConta.add(iCriarContaPoupanca1);

        BarraMenu.add(mCriarConta);

        mOperaçõesBancarias.setText("Operações Bacarias");

        sbTodasContas.setText("Todas Contas");

        jMenuItem1.setText("Realizar Saque");
        sbTodasContas.add(jMenuItem1);

        jMenuItem2.setText("Realizar Deposito");
        sbTodasContas.add(jMenuItem2);

        mOperaçõesBancarias.add(sbTodasContas);

        sbMetodosUnicos.setText("Métodos Unicos");

        iTransferencia.setText("Realizar Transferencia");
        sbMetodosUnicos.add(iTransferencia);

        mOperaçõesBancarias.add(sbMetodosUnicos);

        BarraMenu.add(mOperaçõesBancarias);

        mBuscarConta.setText("Pesquisar Contas");
        mBuscarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mBuscarContaMouseClicked(evt);
            }
        });
        mBuscarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBuscarContaActionPerformed(evt);
            }
        });
        BarraMenu.add(mBuscarConta);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rotTituloPrinc)
                .addGap(0, 240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rotTituloPrinc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void iCriarContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCriarContaCorrenteActionPerformed
        dispose();
        CriarContaCorrente criarContaCorrente = CriarContaCorrente.getInstance();
        criarContaCorrente.setVisible(true);
    }//GEN-LAST:event_iCriarContaCorrenteActionPerformed

    private void mBuscarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBuscarContaActionPerformed

     }//GEN-LAST:event_mBuscarContaActionPerformed

    private void mBuscarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mBuscarContaMouseClicked
        dispose();
        ConsultaContas consultaContas = ConsultaContas.getInstance();
        consultaContas.setVisible(true);    }//GEN-LAST:event_mBuscarContaMouseClicked

    private void iCriarContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCriarContaPoupancaActionPerformed
        dispose();
        CriarContaPoupanca criarContaPoupanca = CriarContaPoupanca.getInstance();
        criarContaPoupanca.setVisible(true);
    }//GEN-LAST:event_iCriarContaPoupancaActionPerformed

    private void iCriarContaPoupanca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCriarContaPoupanca1ActionPerformed

        CriarContaPoupancaEspecial criarContaPoupancaEspecial = CriarContaPoupancaEspecial.getInstance();
        criarContaPoupancaEspecial.setVisible(true);
    }//GEN-LAST:event_iCriarContaPoupanca1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BancoContas banco = BancoContas.getBanco();

        
        ContaPoupancaEspecial conta1 = new ContaPoupancaEspecial("123412", "001", "senha1", 1000.0, 0.05, 500.0,500.0);
        ContaPoupancaEspecial conta2 = new ContaPoupancaEspecial("567438", "002", "senha2", 2000.0, 0.04, 1000.0,500.0);
        ContaPoupancaEspecial conta3 = new ContaPoupancaEspecial("901632", "003", "senha3", 3000.0, 0.03, 1500.0,500.0);
        ContaPoupancaEspecial conta4 = new ContaPoupancaEspecial("318456", "004", "senha4", 4000.0, 0.02, 2000.0,500.0);
        ContaPoupancaEspecial conta5 = new ContaPoupancaEspecial("783990", "005", "senha5", 5000.0, 0.01, 2500.0,500.0);

        
        banco.addContaPoupancaEspecial(conta1);
        banco.addContaPoupancaEspecial(conta2);
        banco.addContaPoupancaEspecial(conta3);
        banco.addContaPoupancaEspecial(conta4);
        banco.addContaPoupancaEspecial(conta5);

        ContaCorrente contaCorrente1 = new ContaCorrente("120034", "001", "senha1", 1000.0, 500.0, 100.0);
        ContaCorrente contaCorrente2 = new ContaCorrente("567908", "002", "senha2", 2000.0, 1000.0, 200.0);
        ContaCorrente contaCorrente3 = new ContaCorrente("905102", "003", "senha3", 3000.0, 1500.0, 300.0);
        ContaCorrente contaCorrente4 = new ContaCorrente("324546", "004", "senha4", 4000.0, 2000.0, 400.0);
        ContaCorrente contaCorrente5 = new ContaCorrente("789073", "005", "senha5", 5000.0, 2500.0, 500.0);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("122734", "001", "senha1", 1000.0, 0.05);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("567278", "002", "senha2", 2000.0, 0.04);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca("901578", "003", "senha3", 3000.0, 0.03);
        ContaPoupanca contaPoupanca4 = new ContaPoupanca("345645", "004", "senha4", 4000.0, 0.02);
        ContaPoupanca contaPoupanca5 = new ContaPoupanca("789055", "005", "senha5", 5000.0, 0.01);

        banco.addContaCorrente(contaCorrente1);
        banco.addContaCorrente(contaCorrente2);
        banco.addContaCorrente(contaCorrente3);
        banco.addContaCorrente(contaCorrente4);
        banco.addContaCorrente(contaCorrente5);

        banco.addContaPoupanca(contaPoupanca1);
        banco.addContaPoupanca(contaPoupanca2);
        banco.addContaPoupanca(contaPoupanca3);
        banco.addContaPoupanca(contaPoupanca4);
        banco.addContaPoupanca(contaPoupanca5);

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem iCriarContaCorrente;
    private javax.swing.JMenuItem iCriarContaPoupanca;
    private javax.swing.JMenuItem iCriarContaPoupanca1;
    private javax.swing.JMenuItem iTransferencia;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mBuscarConta;
    private javax.swing.JMenu mCriarConta;
    private javax.swing.JMenu mOperaçõesBancarias;
    private javax.swing.JLabel rotTituloPrinc;
    private javax.swing.JMenu sbMetodosUnicos;
    private javax.swing.JMenu sbTodasContas;
    // End of variables declaration//GEN-END:variables
}
