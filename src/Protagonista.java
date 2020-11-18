import enumerations.Sexo;

public class Protagonista {
    Sexo sexo;
    String nome;
    Medidor personalidade = new Medidor();

    public Protagonista(String sexo, String nome){
        this.sexo = Sexo.valueOf(sexo);
        this.nome = nome;
    }
}
