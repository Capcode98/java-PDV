package br.com.PDV.secao02;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public abstract class ModeloTabelaProduto extends AbstractTableModel{
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_TELEFONE = 1;
    private String[] colunas = new String[]{"Nome","Telefone"};
    private ArrayList<Pessoa> pessoas;

    public ModeloTabelaProduto(){
        this.pessoas = new ArrayList<Pessoa>();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount(){
        return pessoas.size();
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex){ //nao deixa editar a grade
        return false;
    }

    @Override
    public Object getValueAt(int row, int col){
        Pessoa pessoa = pessoas.get(row);
        switch(col){
            case COLUNA_NOME:
                return pessoa.obterNome();
            case COLUNA_TELEFONE:
                return pessoa.obterTelefone();
        }
        return "";
    }
}
