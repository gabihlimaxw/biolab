package aula5;

public class Gato {
    public String sexo;
    public String nome;
    public String raca;

    public Gato(String sexo, String nome, String raca) {
        this.sexo = sexo;
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "sexo='" + sexo + '\'' +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
