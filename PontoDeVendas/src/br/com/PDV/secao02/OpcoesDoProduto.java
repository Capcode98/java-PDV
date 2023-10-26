package br.com.PDV.secao02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class OpcoesDoProduto extends JFrame {
    public OpcoesDoProduto() { //Construtor

        setTitle("Opções");
        setVisible(true); // tela visivel
        setSize(500, 500);//tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// finalizar a janela atraves do botao vermelho a janela
        setResizable(false);// mantem o tamanho da janela fixo.
        setLocationRelativeTo(null);// centro da tela
        setLayout(null);

        JButton bunovo = new JButton("Novo Produto"); //instaciando o botao
        bunovo.setBounds(150, 120, 180, 60);// configuração do botao
        bunovo.setFont(new Font("Arial", Font.PLAIN, 20));
        bunovo.setForeground(new Color(0, 0, 0));
        bunovo.setBackground(new Color (234, 234, 234));
        add(bunovo); // adiciona o botao na tela

        JButton bueditar = new JButton("Editar");
        bueditar.setBounds(150 , 200, 180 , 60);
        bueditar.setFont(new Font("Arial", Font.PLAIN, 20));
        bueditar.setForeground(new Color(0,0,0));
        bueditar.setBackground(new Color (234, 234, 234));
        add(bueditar);

        JButton buconsultar = new JButton("Consultar");
        buconsultar.setBounds(150, 280, 180,60);
        buconsultar.setFont(new Font("Arial", Font.PLAIN, 20));
        buconsultar.setForeground(new Color(0, 0, 0));
        buconsultar.setBackground(new Color (234, 234, 234));
        add(buconsultar);

        bunovo.addActionListener(this::novoProduto);
        bueditar.addActionListener(this::editarProduto);
        buconsultar.addActionListener(this::consultarProduto);
        setVisible(true);

    }

    public void novoProduto(ActionEvent e) {
        new JanelaCadastro();

    }
    private void editarProduto(ActionEvent actionEvent){
        new JanelaEditar();

    }
    private void consultarProduto(ActionEvent actionEvent){
        new JanelaConsultar();

    }

}
