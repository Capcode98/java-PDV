package br.com.PDV.secao01;
import javax.swing.*;
import java.util.ArrayList;
public class CadastroProduto {
    public ArrayList<Produto> lista_produto;

    public CadastroProduto(){
        lista_produto = new ArrayList<>();
    }

    public void inclusao(Produto produto){
        lista_produto.add(produto);
        JOptionPane.showMessageDialog(null,"Operação realizada com sucesso", "Concluido",JOptionPane.INFORMATION_MESSAGE);

    }
    public void imprimir(){
        for (Produto p : lista_produto){
            System.out.println("Codigo: " + p.obtercodigo());
            System.out.println("Nome: " + p.obterNome());
            System.out.println("Unidade: " + p.obterUnidade());
            System.out.println("preco: " + p.obterPreco());
            System.out.println("Estoque: " + p.quantidade_estoque());
            System.out.println("Data da ultima venda: " + p.data_ultima_venda());
        }
    }
    void alteracao(){

    }
    Produto consulta(String consulta_produto){
        for(Produto p : lista_produto){
            if(p.obterNome().equals(consulta_produto) ){
                return p;
            }
        }
        return null;
    }
}