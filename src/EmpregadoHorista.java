import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado {
    public int totalHorasTrabalhadas;
    public double valorHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalHorasTrabalhadas, double valorHoraTrabalhada) {
        super(matricula, nome);
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalHorasTrabalhadas * valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        DecimalFormat fM = new DecimalFormat("R$#,##0.00");

        String aux = super.toString();
        aux += "Total de horas trabalhadas: " + totalHorasTrabalhadas + "\n";
        aux += "Valor da hora trabalhada: " + fM.format(valorHoraTrabalhada);
        return aux;
    }
}
