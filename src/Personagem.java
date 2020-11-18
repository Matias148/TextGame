import enumerations.Sexo;

public class Personagem {
    Sexo sexo;
    String nome;
    double aceitacao;

    public Personagem(Sexo sexo, String nome) {
        this.sexo = sexo;
        this.nome = nome;
    }
}
