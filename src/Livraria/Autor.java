package Livraria;

public class Autor {
    private String nome;
    private String sobrenome;
    private String gereroLiterario;
    private String sexo;
    private String Pais;
    private String cidade;
    private String idade;



    public Autor(String nome, String sobrenome, String gereroEscrita, String sexo, String pais, String cidade, String idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.gereroLiterario = gereroEscrita;
        this.sexo = sexo;
        this.Pais = pais;
        this.cidade = cidade;
        this.idade = idade;

    }


    public String dadosAutor() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", gereroEscrita='" + gereroLiterario + '\'' +
                ", sexo='" + sexo + '\'' +
                ", Pais='" + Pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGereroLiterario() {
        return gereroLiterario;
    }

    public void setGereroLiterario(String gereroLiterario) {
        this.gereroLiterario = gereroLiterario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
