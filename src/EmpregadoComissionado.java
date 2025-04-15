import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado {
    public double totalVendas;
    public double comissao;

    public double calcularSalario() {
        return totalVendas * comissao / 100;
    }

    @Override
    public String toString() {
        DecimalFormat fM = new DecimalFormat("R$#,##0.00");

        String aux = super.toString();
        aux += "Total de vendas: " + fM.format(totalVendas) + "\n";
        aux += "Comissão por venda: " + comissao + "%";
        return aux;
    }
}
