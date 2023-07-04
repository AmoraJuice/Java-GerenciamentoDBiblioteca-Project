import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

Class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Membro {
    private String nome;
    private List<Livro> livrosEmprestado;

    public Membro(String nome) {
        this.nome = nome;
        this.livrosEmprestado = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public  list<Livro> getLivrosEmprestados() {
        return livrosEmprestado;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livrosEmprestado.add(livro);
            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Voce nao esta disponivel no momento.");
    }
}

public void devolverLivro (Livro livro) {
    if(livrosEmprestado.remove(livro)) {
        livro.setDisponivel(true);
        System.out.println("Livro devolvido com sucesso!");
    } else {
        System.out.println("Voce não possui esse livro emprestado.");
        }
    }
}

public class App {
    private List<Livro> livros;
    private List<Membro> membro;

    public App() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        livros.add(livros);
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void mostrarLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
            for (Livro livro : livros) {
                if (livro.isDisponivel()) {
                    System.out.println(livro.getTitulo() + - " + livro.getAutor());
            }
        }
    }
    public static void main(String[] args) throws Exception {
        App biblioteca = new App();

        Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");
        Livro livro3 = new Livro("Livro 3", "Autor 3");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Membro membro1 = new Membro("Membro 1");
        Membro membro2 = new Membro("Membro 2");

        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);

        Scanner scanner = new Scanner(System.in);
    While (true) {
        System.out.println("\n=== Menu ===""); //alterar depois
        System.out.println("1. Mostrar livros disponiveis");
        System.out.println("2. Mostrar livros emprestados");
        System.out.println("3. Emprestar livro");
        System.out.println("4. Delvover livros");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opçao: ");
        int opcao = scanner.nextInt();
        }
    }
}
