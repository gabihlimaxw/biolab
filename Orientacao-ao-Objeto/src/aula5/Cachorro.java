package aula5;

public class Cachorro {
    public String sexo;
    public String nome;
    public String raca;

    public Cachorro(String sexo, String nome, String raca) {
        this.sexo = sexo;
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "sexo='" + sexo + '\'' +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
