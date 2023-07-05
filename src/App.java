import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
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
    public  List<Livro> getLivrosEmprestados() {
        return getLivrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Voce nao esta disponivel no momento.");
    }
}

public void devolverLivro (Livro livro) {
    if(livrosEmprestados.remove(livro)) {
        livro.setDisponivel(true);
        System.out.println("Livro devolvido com sucesso!");
    } else {
        System.out.println("Voce não possui esse livro emprestado.");
        }
    }
}

public class App {
    private List<Livro> livros;
    private List<Membro> membros;

    public App() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void mostrarLivrosDisponiveis() {
        System.out.println("Livros disponiveis:");
            for (Livro livro : livros) {
                if (livro.isDisponivel()) {
                    System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            }
        }
    }
    public void mostrarLivrosEmprestados() {
        System.out.println("Livros emprestados:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("livro.getTitulo"() + " - " + livro.getAutor());
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

    while (true) {
            System.out.println("\n=== MENU ===");
                System.out.println("1. Mostrar livros disponíveis");
                    System.out.println("2. Mostrar livros emprestados");
                        System.out.println("3. Emprestar livro");
                            System.out.println("4. Devolver livro");
                    System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

        if (opcao == 1) {
            biblioteca.mostrarLivrosDisponiveis();
        } else if (opcao == 2) {
            biblioteca.mostrarLivrosDisponiveis();
        } else if (opcao == 3) {
            System.out.print("Digite o titulo  do livro: ");
            scanner.nextLine();
            String titulo = scanner.nextLine();

            Livro livro = null;
            for (Livro 1 : biblioteca.livros) {
                if (1.getTitulo().equals(titulo) && 1.is.Disponivel()) {
                    Livro = 1;
                    break;
                }
            }

            if(livro != null) {
                System.out.print("Digite o nome do membro: ");
                String nomeMembro = scanner.nextLine();

                Membro membro = null;
                for (Membro m : biblioteca.membros) {
                    if (m.getNome().equals(nomeMembro)) {
                        membro = m;
                        break;
                    }
                }
                if (membro != null) {
                    membro.emprestarLivro(livro);
                } else {
                    System.out.println("Membro nao encontrado.");
                }
            } else {
                System.out.println("Livro nao encontrado ou nao disponivel.");
            }

        } else if (opcao == 4) {
            System.out.println("Digital o titulo do livro: ");
            String titulo = scanner.nextLine();

            Livro livro = null;
            for (Livro 1 : biblioteca.livros) {
                if (1.getTitulo().equals(titulo) && !l.isDisponivel()) {
                    livro = 1;
                    break;
                }
            }
            if(membro != null) {
                membro.devolverLivro(livro);
            } else {
                System.out.println("Membro nao encontrado.");
            }
        } else {
            System.out.println("Livro nao encontrado ou nao emprestado.");
        }
    } else if (opcao == 5) {
        break;
        } else {
            System.out.println("Opcao invalida.");
        }
    }
scanner.close();
}
