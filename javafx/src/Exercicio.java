import javax.swing.*;

public class Exercicio {
public static void main(String[] args) {
    JFrame janela = new JFrame("Exercicio");
    janela.setSize(600,600);
    janela.setLayout(null);

    JLabel label1 = new JLabel("Digite seu nome");
    label1.setBounds(20,50,150,40);

    JTextField input = new JTextField();
    input.setBounds(20,80, 150,40);


    JLabel label2 = new JLabel("Digite seu e-mail");
    label2.setBounds(20,130,150,40);

    JTextField input2 = new JTextField();
    input2.setBounds(20,160, 150,40);


    JLabel label3 = new JLabel("Digite seu Telefone");
    label3.setBounds(20,200,150,40);

    JTextField input3 = new JTextField();
    input3.setBounds(20,230, 150,40);


    JButton button =new JButton("Clique Aqui");
    button.setBounds(20,20,150,40);

    button.addActionListener( e -> {
        String texto = input.getText();
        JOptionPane.showMessageDialog(null,"Dados salvos com sucesso ");
    });

    janela.add(button);
    janela.add(label3);
    janela.add(label2);
    janela.add(label1);
    janela.add(input);
    janela.add(input3);
    janela.add(input2);


    janela.setVisible(true);
}
}