package Livraria;

public class App {
    public static void main(String[] args) {







        Autor Rafa =  new Autor(
                "Rafael",
                "Carvalho",
                "Romance",
                "Masculino",
                "Brasil",
                "São Paulo",
                "18");



        Editora Saraiva = new Editora(
                "Saraiva",
                "2000",
                "9003.2334",
                "Rua tal",
                "Brasil",
                "São Paulo");



        Livro livro1 = new Livro(
                "F",
                2,
                "romance",
                Rafa,
                Saraiva,
                "2000");

        livro1.estado(livro1.estado(true));




    }
}
