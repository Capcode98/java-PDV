package br.com.PDV.secao02;

import br.com.PDV.secao01.CadastroProduto;
import br.com.PDV.secao01.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastro extends JFrame  {
    JTextField inputcodigo;
    JTextField inputnome;
    JTextField inputunidade;
    JTextField inputpreco;
    JTextField inputestoque;
    JTextField input_ultimavenda;

    CadastroProduto cadastro = new CadastroProduto();
    public JanelaCadastro(){
        setTitle("Cadastro de Produto");
        setVisible(true);//tela visivel
        setSize(500, 400); //tamanho da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// fecha apenas a segunda janela , mantendo a aplicação rodando.
        setResizable(false); //mantem o tamanho da janela fixo
        setLocationRelativeTo(null);//centro da tela

        setLayout(null);

        JLabel labcodigo = new JLabel();
        labcodigo.setText("Código:");
        labcodigo.setBounds(20 , 20, 250 , 30 );
        labcodigo.setFont(new Font("Arial",Font.BOLD , 16));
        add(labcodigo);

        inputcodigo = new JTextField();
        inputcodigo.setBounds(90, 20 , 340, 30);
        inputcodigo.setFont(new Font("Arial", Font.PLAIN, 16));
        add(inputcodigo);

        JLabel labnome = new JLabel();
        labnome.setText("Nome:");
        labnome.setBounds(20 , 60, 250 , 30 );
        labnome.setFont(new Font("Arial", Font.BOLD, 16));
        add(labnome);

        inputnome = new JTextField();
        inputnome.setBounds(90 , 60 , 340 , 30);
        inputcodigo.setFont(new Font("Arial", Font.PLAIN, 16));
        add(inputnome);

        JLabel labunidade = new JLabel();
        labunidade.setText("Unidade: ");
        labunidade.setBounds(20 , 100 , 350 , 30);
        labunidade.setFont(new Font("Arial", Font.BOLD, 16));
        add(labunidade);

        inputunidade = new JTextField();
        inputunidade.setBounds(90, 100, 340,30);
        inputunidade.setFont(new Font("Arial",Font.PLAIN, 16));
        add(inputunidade);

        JLabel labpreco = new JLabel();
        labpreco.setText("Preço: ");
        labpreco.setBounds(20 , 140 , 350 , 30);
        labpreco.setFont(new Font("Arial", Font.BOLD, 16));
        add(labpreco);

        inputpreco = new JTextField();
        inputpreco.setBounds(90, 140, 340,30);
        inputpreco.setFont(new Font("Arial",Font.PLAIN, 16));
        add(inputpreco);

        JLabel labestoque = new JLabel();
        labestoque.setText("Estoque: ");
        labestoque.setBounds(20 , 180 , 350 , 30);
        labestoque.setFont(new Font("Arial", Font.BOLD, 16));
        add(labestoque);

        inputestoque = new JTextField();
        inputestoque.setBounds(90, 180, 340,30);
        inputestoque.setFont(new Font("Arial",Font.PLAIN, 16));
        add(inputestoque);

        JLabel lab_ultimavenda = new JLabel();
        lab_ultimavenda.setText("Ultima venda: ");
        lab_ultimavenda.setBounds(20 , 220 , 350 , 30);
        lab_ultimavenda.setFont(new Font("Arial", Font.BOLD, 16));
        add(lab_ultimavenda);

        input_ultimavenda = new JTextField();
        input_ultimavenda.setBounds(130, 220, 300,30);
        input_ultimavenda.setFont(new Font("Arial",Font.PLAIN, 16));
        add(input_ultimavenda);

        JButton buconfirmar = new JButton();
        buconfirmar.setText("Confirmar");
        buconfirmar.setBounds(160, 290, 150, 30);
        buconfirmar.setFont(new Font("Arial", Font.BOLD, 16));
        add(buconfirmar);

        buconfirmar.addActionListener(this::incluir);
    }
    public void incluir(ActionEvent actionEvent) {

        String cod = inputcodigo.getText();
        String nome = inputnome.getText();
        String unidade = inputunidade.getText();
        String preco = inputpreco.getText();
        String estoque = inputestoque.getText();
        String data = input_ultimavenda.getText();
        if (cod.isEmpty() || nome.isEmpty() || unidade.isEmpty() || preco.isEmpty() || estoque.isEmpty() || data.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Produto produto = new Produto(cod, nome, unidade, preco, estoque, data);
            cadastro.inclusao(produto);
            cadastro.imprimir();
        }
    }
}
