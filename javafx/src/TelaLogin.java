import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    JTextField campoEmail;
    JPasswordField campoSenha;
    JButton botaoLogin;
    JButton botaoLimpar;

    public TelaLogin() {

        setTitle("Tela de Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Campos
        add(new JLabel("E-mail:"));
        campoEmail = new JTextField(20);
        add(campoEmail);

        add(new JLabel("Senha:"));
        campoSenha = new JPasswordField(20);
        add(campoSenha);

        // Botões
        botaoLogin = new JButton("Login");
        botaoLimpar = new JButton("Limpar");

        add(botaoLogin);
        add(botaoLimpar);

        // Ação do botão Login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());

                // Verifica campos vazios
                if (email.isEmpty() || senha.isEmpty()) {

                    JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos!");

                } else {

                    // Validação
                    if (email.equals("admin@senai.com")
                            && senha.equals("123456")) {

                        JOptionPane.showMessageDialog(null,
                                "Login realizado com sucesso!");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "E-mail ou senha incorretos!");
                    }
                }
            }
        });

        // Ação do botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoEmail.setText("");
                campoSenha.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new TelaLogin();
    }
}