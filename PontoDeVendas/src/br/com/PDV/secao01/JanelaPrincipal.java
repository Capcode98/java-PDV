package br.com.PDV.secao01;

import br.com.PDV.secao02.OpcoesDoProduto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame  {
    JTextField num1;
    JTextField num2;
    public JanelaPrincipal() { //Construtor

        setTitle("Ponto de vendas");
        setVisible(true); // tela visivel
        setSize(500, 500);//tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finalizar a janela atraves do botao vermelho a janela
        setResizable(false);// mantem o tamanho da janela fixo.
        setLocationRelativeTo(null);// centro da tela

        JLabel titulo = new JLabel();
        titulo.setText("LOJA 01");
        titulo.setBounds(160 , 0,300,100);
        titulo.setFont(new Font("segoe ui",Font.BOLD , 30));
        add(titulo);

        setLayout(null);
        JButton buCadastrar = new JButton("Cadastro de produtos"); //instaciando o botao
        buCadastrar.setBounds(100, 200, 250, 30);// configuração do botao
        buCadastrar.setFont(new Font("Arial", Font.BOLD, 20));
        buCadastrar.setForeground(new Color(0, 0, 0));
        buCadastrar.setBackground(new Color (206, 206, 206));
        add(buCadastrar); // adiciona o botao na tela


        JButton buregistro = new JButton("Registro de vendas");
        buregistro.setBounds(100 , 240, 250 , 30);
        buregistro.setFont(new Font("Arial", Font.BOLD, 20));
        buregistro.setForeground(new Color(0,0,0));
        buregistro.setBackground(new Color (206, 206, 206));
        add(buregistro);

        JButton burealizarvendas = new JButton("Realizar Vendas");
        burealizarvendas.setBounds(100, 280, 250,30);
        burealizarvendas.setFont(new Font("Arial", Font.BOLD, 20));
        burealizarvendas.setForeground(new Color(0, 0, 0));
        burealizarvendas.setBackground(new Color (206, 206, 206));
        add(burealizarvendas);

        buCadastrar.addActionListener(this::botaocadastro);
        buregistro.addActionListener(this::botaoregistro);
        burealizarvendas.addActionListener(this::botaovendas);

        setVisible(true);

    }

    public void botaocadastro(ActionEvent e) {
        new OpcoesDoProduto();
    }
    private void botaoregistro(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null,"certo", "outro metodo",JOptionPane.ERROR_MESSAGE);
    }
    private void botaovendas(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null," vendas","vendas" ,JOptionPane.ERROR_MESSAGE);
    }

}
