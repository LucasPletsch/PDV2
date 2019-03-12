package ProcessoDeVenda;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class Produto {


    private String nome;
    private int cod;
    private float valor;
    private Date dataValidade;

    protected Produto() {
    }

    public Produto(String nome, int cod, float valor, Date dataValidade) {
        this.nome = nome;
        this.cod = cod;
        this.valor = valor;
        this.dataValidade = dataValidade;
    }



	/*public Produto getProdutoPorNome(String nome) {

		Produto buscaResult  = //Resultado da busca.
	}
	*/

    public boolean excluirProduto(int cod) {

        boolean deuCerto=false;

        return deuCerto;
    }
}
