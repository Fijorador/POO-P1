
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import jdk.jfr.Event;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Mateus
 */
public class CriarContaCorrente extends javax.swing.JFrame {

    private static CriarContaCorrente instancia;
    private JDialog confirmationDialog;

    /**
     * Creates new form CriarContaCorrente
     */
    public CriarContaCorrente() {
        initComponents();
        rotTituloPaginaCC.requestFocus();

    }

    public static CriarContaCorrente getInstance() {
        if (instancia == null) {
            instancia = new CriarContaCorrente();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotNConta = new javax.swing.JLabel();
        rotNAg = new javax.swing.JLabel();
        rotTituloPaginaCC = new javax.swing.JLabel();
        rotSenha = new javax.swing.JLabel();
        rotConfirmeSenha = new javax.swing.JLabel();
        rotSaldoIncial = new javax.swing.JLabel();
        rotLimiteCC = new javax.swing.JLabel();
        cxNumeroConta = new javax.swing.JTextField();
        cxAgencia = new javax.swing.JTextField();
        cxSaldoInicial = new javax.swing.JTextField();
        cxLimiteCC = new javax.swing.JTextField();
        btSalvarCC = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        pwSenha = new javax.swing.JPasswordField();
        pwConfirmeSenha = new javax.swing.JPasswordField();
        Separador = new javax.swing.JSeparator();
        Cifrao = new javax.swing.JLabel();
        Crifaro2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotNConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotNConta.setText("Numero da Conta :");

        rotNAg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotNAg.setText("Numero da Agencia:");

        rotTituloPaginaCC.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        rotTituloPaginaCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotTituloPaginaCC.setText("| Criar Conta Corrente |");

        rotSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotSenha.setText("Senha:");

        rotConfirmeSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotConfirmeSenha.setText("Confirme a Senha:");

        rotSaldoIncial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotSaldoIncial.setText("Saldo Inicial:");

        rotLimiteCC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotLimiteCC.setText("Limite da Conta Corrente:");

        cxNumeroConta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cxNumeroConta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cxNumeroContaFocusGained(evt);
            }
        });
        cxNumeroConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxNumeroContaMouseClicked(evt);
            }
        });
        cxNumeroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumeroContaActionPerformed(evt);
            }
        });
        cxNumeroConta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cxNumeroContaPropertyChange(evt);
            }
        });
        cxNumeroConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxNumeroContaKeyPressed(evt);
            }
        });

        cxAgencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cxAgencia.setText("0000");
        cxAgencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxAgenciaMouseClicked(evt);
            }
        });
        cxAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxAgenciaKeyPressed(evt);
            }
        });

        cxSaldoInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cxSaldoInicial.setText("0.00");
        cxSaldoInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cxSaldoInicialFocusLost(evt);
            }
        });
        cxSaldoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxSaldoInicialMouseClicked(evt);
            }
        });
        cxSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cxSaldoInicialKeyPressed(evt);
            }
        });

        cxLimiteCC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cxLimiteCC.setText("100.00");
        cxLimiteCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxLimiteCCMouseClicked(evt);
            }
        });
        cxLimiteCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxLimiteCCActionPerformed(evt);
            }
        });

        btSalvarCC.setText("Salvar ");
        btSalvarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCCActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        pwSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwSenha.setText("000000");
        pwSenha.setToolTipText("");
        pwSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwSenhaMouseClicked(evt);
            }
        });
        pwSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwSenhaKeyPressed(evt);
            }
        });

        pwConfirmeSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwConfirmeSenha.setText("000000");
        pwConfirmeSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwConfirmeSenhaMouseClicked(evt);
            }
        });
        pwConfirmeSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwConfirmeSenhaKeyPressed(evt);
            }
        });

        Cifrao.setText("R$");

        Crifaro2.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separador)
            .addComponent(rotTituloPaginaCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotNConta)
                    .addComponent(rotSenha)
                    .addComponent(rotNAg)
                    .addComponent(rotConfirmeSenha))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pwConfirmeSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addGap(193, 193, 193))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cifrao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Crifaro2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalvarCC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotLimiteCC)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cxSaldoInicial, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rotSaldoIncial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cxLimiteCC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 345, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotTituloPaginaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSalvarCC)
                            .addComponent(btSair))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotNConta)
                            .addComponent(rotSaldoIncial)
                            .addComponent(cxNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rotNAg)
                                .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cifrao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotSenha)
                            .addComponent(rotLimiteCC)
                            .addComponent(pwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotConfirmeSenha)
                            .addComponent(cxLimiteCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Crifaro2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addContainerGap(53, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
        Principal principal = Principal.getInstance();
        principal.setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxNumeroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroContaActionPerformed

    }//GEN-LAST:event_cxNumeroContaActionPerformed

    private void btSalvarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCCActionPerformed

        criarContaCorrente();
        limpar();

    }//GEN-LAST:event_btSalvarCCActionPerformed

    private void cxNumeroContaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cxNumeroContaPropertyChange

    }//GEN-LAST:event_cxNumeroContaPropertyChange

    private void cxLimiteCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxLimiteCCActionPerformed

    }//GEN-LAST:event_cxLimiteCCActionPerformed

    private void cxNumeroContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxNumeroContaMouseClicked
        limparCampo(cxNumeroConta);
    }//GEN-LAST:event_cxNumeroContaMouseClicked

    private void cxNumeroContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxNumeroContaKeyPressed
    
        

    

    }//GEN-LAST:event_cxNumeroContaKeyPressed

    private void cxNumeroContaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxNumeroContaFocusGained

    }//GEN-LAST:event_cxNumeroContaFocusGained

    private void cxAgenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxAgenciaMouseClicked
        limparCampo(cxAgencia);
    }//GEN-LAST:event_cxAgenciaMouseClicked

    private void pwSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwSenhaMouseClicked
        limparCampo(pwSenha);
    }//GEN-LAST:event_pwSenhaMouseClicked

    private void pwConfirmeSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwConfirmeSenhaMouseClicked
        limparCampo(pwConfirmeSenha);
    }//GEN-LAST:event_pwConfirmeSenhaMouseClicked

    private void cxSaldoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxSaldoInicialMouseClicked
        limparCampo(cxSaldoInicial);
    }//GEN-LAST:event_cxSaldoInicialMouseClicked

    private void cxLimiteCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxLimiteCCMouseClicked
        limparCampo(cxLimiteCC);
    }//GEN-LAST:event_cxLimiteCCMouseClicked

    private void cxAgenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxAgenciaKeyPressed

    }//GEN-LAST:event_cxAgenciaKeyPressed

    private void pwSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwSenhaKeyPressed

    }//GEN-LAST:event_pwSenhaKeyPressed

    private void cxSaldoInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cxSaldoInicialKeyPressed

    }//GEN-LAST:event_cxSaldoInicialKeyPressed

    private void cxSaldoInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cxSaldoInicialFocusLost

    }//GEN-LAST:event_cxSaldoInicialFocusLost

    private void pwConfirmeSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwConfirmeSenhaKeyPressed

    }//GEN-LAST:event_pwConfirmeSenhaKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cifrao;
    private javax.swing.JLabel Crifaro2;
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvarCC;
    private javax.swing.JTextField cxAgencia;
    private javax.swing.JTextField cxLimiteCC;
    private javax.swing.JTextField cxNumeroConta;
    private javax.swing.JTextField cxSaldoInicial;
    private javax.swing.JPasswordField pwConfirmeSenha;
    private javax.swing.JPasswordField pwSenha;
    private javax.swing.JLabel rotConfirmeSenha;
    private javax.swing.JLabel rotLimiteCC;
    private javax.swing.JLabel rotNAg;
    private javax.swing.JLabel rotNConta;
    private javax.swing.JLabel rotSaldoIncial;
    private javax.swing.JLabel rotSenha;
    private javax.swing.JLabel rotTituloPaginaCC;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        String numeroContaPadrao = "00000-X";
        String agenciaPadrao = "0000";
        String saldoInicialPadrao = "0.00";
        String limiteCCPadrao = "100.00";
        String senhaPadrao = "000000";

        cxNumeroConta.setText(numeroContaPadrao);
        cxAgencia.setText(agenciaPadrao);
        cxLimiteCC.setText(limiteCCPadrao);
        cxSaldoInicial.setText(saldoInicialPadrao);
        pwConfirmeSenha.setText(senhaPadrao);
        pwSenha.setText(senhaPadrao);

        btLimpar.requestFocusInWindow();
    }

    private void limparCampo(Component componente) {
        if (componente instanceof JTextField) {
            JTextField textField = (JTextField) componente;
            textField.setText("");
        } else if (componente instanceof JPasswordField) {
            JPasswordField passwordField = (JPasswordField) componente;
            passwordField.setText("");
        }
    }

    public void criarContaCorrente() {
        String agencia = cxAgencia.getText();
        String numeroConta = cxNumeroConta.getText();
        String senha = new String(pwSenha.getPassword());
        String confirmacaoSenha = new String(pwConfirmeSenha.getPassword());
        double saldoInicial = Double.parseDouble(cxSaldoInicial.getText());
        double limiteCC = Double.parseDouble(cxLimiteCC.getText());

        try {
            if (!senha.equals(confirmacaoSenha)) {
                throw new InvalidaException("As senhas não correspondem");
            }

            if (!OperacoesBancarias.validarSenha(senha)) {
                throw new InvalidaException("A senha deve conter 6 digitos numéricos");

            }

            if (!OperacoesBancarias.validarNumeroConta(numeroConta)) {
                throw new InvalidaException("Conta deve ter 6 dígitos numéricos");
            }

            if (!OperacoesBancarias.validarAgencia(agencia)) {
                throw new InvalidaException("Agência deve ter 4 dígitos numéricos");
            }

            if (saldoInicial < 0) {
                throw new InvalidaException("O saldo inicial deve ser maior ou igual a zero");
            }

            if (limiteCC < 100) {
                throw new InvalidaException("Limite mínimo da conta corrente é R$100.00");
            }

            if (BancoContas.verificarContaExistente(numeroConta)) {
                throw new InvalidaException("A conta já existe");
            }

            ContaCorrente contaCorrente = new ContaCorrente(numeroConta, agencia, senha, saldoInicial, limiteCC, limiteCC);

            BancoContas.getBanco().addContaCorrente(contaCorrente);

            limpar();

            String message = "<html><b>Número da Conta:</b> " + numeroConta + "<br><b>Agência:</b> " + agencia + "<br><b>Senha:</b> " + senha + "<br><br>Conta corrente criada com sucesso</html>";
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(this, message, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            });
        } catch (InvalidaException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void arrumaFloat(FocusEvent evt) {
        JTextField textField = (JTextField) evt.getSource();
        String text = textField.getText();

        // Substitui a vírgula por ponto
        text = text.replace(',', '.');

        // Verifica se o ponto está presente no texto
        if (!text.contains(".")) {
            // Adiciona ".00" caso não exista ponto
            text += ".00";
        }

        textField.setText(text);
    }

    private void limitaCaracters(KeyEvent evt, JTextField componente, int tamanho) {

        int k = evt.getKeyChar();
        if (Character.isDigit(k)) {
            if (componente.getText().length() == tamanho) {
                evt.consume(); // Impede a entrada adicional de caracteres
            }
        } else {
            evt.consume(); // Impede a entrada de caracteres não numéricos
        }
    }

    private void limitarNumeroCaracteres(java.awt.event.KeyEvent evt, int maxCaracteres) {
        if (cxNumeroConta.getText().length() >= maxCaracteres) {
            evt.consume(); // Impede a entrada de mais caracteres
        }

    }
}
