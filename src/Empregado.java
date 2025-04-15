import java.text.DecimalFormat;

public abstract class Empregado {
    public long matricula;
    public String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String toString() {
        String aux = "";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }
}
