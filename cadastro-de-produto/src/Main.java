import javax.swing.*;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

void main() {

         List<String> ListaProdutos = new ArrayList<>();

        JFrame janela = new JFrame("Cadastro de Produtos");
        janela.setSize(800, 800);
        janela.setLayout(null);

        JLabel produto = new JLabel("Digite o nome do produto");
        produto.setBounds(20, 50, 220, 40);

        JTextField input = new JTextField();
        input.setBounds(20, 80, 180, 40);


        JLabel preco = new JLabel("Digite o preço");
        preco.setBounds(20, 130, 150, 40);

        JTextField input2 = new JTextField();
        input2.setBounds(20, 160, 150, 40);


        JLabel quantidade = new JLabel("Digite a quantidade");
        quantidade.setBounds(20, 200, 150, 40);

        JTextField input3 = new JTextField();
        input3.setBounds(20, 230, 150, 40);


        JButton button = new JButton("Cadastrar");
        button.setBounds(20, 20, 150, 40);

        button.addActionListener(e -> {


            if ("Mouse".equals(input.getText()) && "50".equals(input2.getText()) && "2".equals(input3.getText())) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            } else if ("".equals(input.getText()) && "".equals(input2.getText()) && "".equals(input3.getText())) {
                JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos");
            }else{
                JOptionPane.showMessageDialog(null, "Cadastro Invalido");

            }

        });


       button.addActionListener(e -> {
           Produtos produtos = new Produtos (input.getText(), input2.getText(), input3.getText());
           ListaProdutos.add("produto");
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        });


        janela.add(button);
        janela.add(produto);
        janela.add(preco);
        janela.add(quantidade);
        janela.add(input);
        janela.add(input3);
        janela.add(input2);


        janela.setVisible(true);

    }
