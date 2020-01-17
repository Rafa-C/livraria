package Livraria;

public class Livro {

    private String nome;
    private int totalPaginas;
    private boolean aberto;
    private String genero;
    private Autor autor;
    private Editora editora;
    private int paginaAtual;
    private String anoPublicacao;

    public enum tiposGenero{

    Romance,
    Aventura,
    Drama,
    Terror,
    Comedia,
    }

    public Livro(String nome, int totalPaginas, String genero, Autor autor, Editora editora, String anoPublicacao) {
        this.nome = nome;
        this.totalPaginas = totalPaginas;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = 0;
        this.anoPublicacao = anoPublicacao;
        this.aberto = false;
    }


    public void abertoLivro(){
        this.aberto = true;
    }
    public void fechadoLivro(){
        this.aberto = false;
    }

    public void estado(boolean aberto){
        if(aberto=false){

            System.out.println("Tá fechado");

        }
        else{
            System.out.println();
            System.out.println(editora.dadosEditora());
            System.out.println(autor.dadosAutor());
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
