package AulaCollections;

/*Dadas as informações abaixo. Crie uma lista e ordene esta lista exibindo: Nome - Idade - Cor;

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 1 = nome: Simba, idade: 6, cor: tigrado
Gato 1 = nome: Jon, idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.List;

public class ExemploListOrdenação {
    public static void main(String[] args) {




    }
}

class Gato{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}
