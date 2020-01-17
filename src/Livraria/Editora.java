package Livraria;

public class Editora {

    private String nome;
    private String ano;
    private String CNPJ;
    private String endereco;
    private String pais;
    private String estado;

    public Editora(String nome, String ano, String CNPJ, String endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }


    public String dadosEditora() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
