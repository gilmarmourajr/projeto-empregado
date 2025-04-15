import java.text.DecimalFormat;

public abstract class Empregado {
    public long matricula;
    public String nome;

    public abstract double calcularSalario();

    public String toString() {
        String aux = "";
        aux += "Matrícula: " + matricula + "\n";
        aux += "Nome: " + nome + "\n";
        return aux;
    }
}
