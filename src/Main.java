
public class Main {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[3];
        empregados[0] = new EmpregadoComissionado(123456, "Gilmar", 100000, 50);
        empregados[1] = new EmpregadoHorista(123654, "Ferdinando", 1000, 0.5);
        empregados[2] = new EmpregadoHorista(456789, "Edurado", 10, 100);

        for(Empregado e : empregados) {
            System.out.println(e);
            System.out.println("Salário: " + e.calcularSalario());
            System.out.println("--------------------------");
        }
    }
}