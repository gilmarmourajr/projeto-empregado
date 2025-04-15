import java.util.ArrayList;
import java.util.Scanner;

public class Util {
    private ArrayList<Empregado> empregados = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int input = 1;
        while(input != 0) {
            System.out.println("Digite a opção desejada (0 para sair): ");
            System.out.println("1 - Inserir novo empregado");
            System.out.println("2 - Pesquisar um empregado");
            System.out.println("3 - Listar empregados");
            input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite a matrícula do funcionário:");
                    long matricula = Long.parseLong(sc.nextLine());
                    if (pesquisar(matricula) != null) {
                        System.out.println("Matrícula já cadastrada.");
                        break;
                    }

                    System.out.println("Digite o nome do funcionário:");
                    String nome = sc.nextLine();

                    System.out.println("Selecione o tipo de funcionário a ser cadastrado:");
                    System.out.println("1 - Empregado horista");
                    System.out.println("2 - Empregado comissionado");
                    int selecao = Integer.parseInt(sc.nextLine());
                    switch (selecao) {
                        case 1:
                            System.out.println("Digite o total de horas trabalhadas:");
                            int totalHoras = Integer.parseInt(sc.nextLine());

                            System.out.println("Digite o valor da hora trabalhada:");
                            double valorHora = Double.parseDouble(sc.nextLine());
                    }

                    break;
                case 2:
                    System.out.println("Digite a matrícula a ser pesquisada:");
                    long matricula = Long.parseLong(sc.nextLine());
                    break;
                case 3:
                    System.out.println(listar());
                default:
                    System.out.println("Comando inválido.");
            }
        }
    }

    public void inserir(Empregado empregado) {
        if(empregado != null) {
            empregados.add(empregado);
        }
    }

    public Empregado criarEmpregado(long matricula, String nome, double totalVendas, double comissao) {
        Empregado novo = new EmpregadoComissionado(matricula, nome, totalVendas, comissao);
        return novo;
    }

    public Empregado criarEmpregado(long matricula, String nome, int totalHorasTrabalhadas, double valorHoraTrabalhada) {
        Empregado novo = new EmpregadoHorista(matricula, nome, totalHorasTrabalhadas, valorHoraTrabalhada);
        return novo;
    }

    public Empregado pesquisar(long matricula) {
        for(Empregado empregado : empregados) {
            if(empregado.matricula == matricula) {
                return empregado;
            }
        }
        return null;
    }

    public String listar() {
        String output = "";
        for (Empregado empregado : empregados) {
            output += empregado + "\n";
        }
        return output;
    }
}
