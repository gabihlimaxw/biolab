import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CadastroPessoa {

    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cadastro de Pessoas");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btnAdicionar = new JButton("Adicionar Pessoa");
        btnAdicionar.setBounds(50, 30, 180, 30);

        JButton btnMostrar = new JButton("Mostrar Pessoas");
        btnMostrar.setBounds(50, 80, 180, 30);

        frame.add(btnAdicionar);
        frame.add(btnMostrar);

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Digite o nome:");
                String idadeStr = JOptionPane.showInputDialog("Digite a idade:");

                try {
                    int idade = Integer.parseInt(idadeStr);
                    listaPessoas.add(new Pessoa(nome, idade));
                    JOptionPane.showMessageDialog(null, "Pessoa adicionada!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Idade inválida!");
                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (listaPessoas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.");
                } else {
                    StringBuilder lista = new StringBuilder();
                    for (Pessoa p : listaPessoas) {
                        lista.append(p.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, lista.toString());
                }
            }
        });

        frame.setVisible(true);
    }
}