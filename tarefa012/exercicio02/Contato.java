import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String email) {
        Contato novoContato = new Contato(nome, email);
        contatos.add(novoContato);
    }

    public Contato buscarContato(String valorBusca) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(valorBusca) || contato.getEmail().equals(valorBusca)) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(String nome) {
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getNome().equals(nome)) {
                iterator.remove();
                break;
            }
        }
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Email: " + contato.getEmail());
        }
    }
}
