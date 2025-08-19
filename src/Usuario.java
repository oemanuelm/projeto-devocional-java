public class Usuario {

    private String nome;
    private String senha;
    private int idade;

    public Usuario(String nome, int idade, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getnome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean verificarSenha(String senhaInformada) {
        return this.senha.equals(senhaInformada);

    }

}
