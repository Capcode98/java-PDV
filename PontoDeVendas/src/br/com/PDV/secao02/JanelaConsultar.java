package br.com.PDV.secao02;

import br.com.PDV.secao01.CadastroProduto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JanelaConsultar extends JFrame {
    JTextField inputconsulta;
    CadastroProduto produto;
    public JanelaConsultar(){
        setTitle("Consulta");
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel labconsulta = new JLabel();
        labconsulta.setText("Pesquisar: ");
        labconsulta.setBounds(10 , 20, 150, 20);
        labconsulta.setFont(new Font("Arial", Font.BOLD, 16));
        labconsulta.setForeground(Color.black);
        setLayout(null);
        add(labconsulta);

        inputconsulta = new JTextField();
        inputconsulta.setBounds(90, 20 , 340, 30);
        inputconsulta.setFont(new Font("Arial", Font.PLAIN, 16));
        add(inputconsulta);

        JButton buok = new JButton();
        buok.setText("ok");
        buok.setBounds(100, 100, 50,50);
        add(buok);

        buok.addActionListener(this::pesquisa);

    }

    private void pesquisa(ActionEvent actionEvent) {
        String constante = inputconsulta.getText();
        produto = new CadastroProduto();
    }

}
