import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado {
    public double totalVendas;
    public double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalVendas, double comissao) {
        super(matricula, nome);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return totalVendas * comissao / 100;
    }

    @Override
    public String toString() {
        DecimalFormat fM = new DecimalFormat("#,##0.00");

        String aux = super.toString();
        aux += "Total de vendas: R$" + fM.format(totalVendas) + "\n";
        aux += "Comissão por venda: " + fM.format(comissao) + "%";
        return aux;
    }
}
