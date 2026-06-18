import javax.swing.JOptionPane;

import classes.ControleDeAumento;
import classes.Funcionario;
import classes.Gerente;

public class App {

    public static void main(String[] args) {

        ControleDeAumento controle = new ControleDeAumento(0);

        while (true) {

            String opcao = JOptionPane.showInputDialog(
                    "=== SISTEMA DE AUMENTO SALARIAL ===\n"
                            + "1 - Registrar aumento para Funcionário\n"
                            + "2 - Registrar aumento para Gerente\n"
                            + "3 - Exibir total de aumentos\n"
                            + "0 - Sair\n\n"
                            + "Escolha uma opção:");

            if (opcao == null || opcao.equals("0")) {
                break;
            }
            switch (opcao) {
                case "1":
                    String nomeFunc = JOptionPane.showInputDialog("Nome do funcionário:");
                    String cpfFunc = JOptionPane.showInputDialog("CPF do funcionário:");
                    double salarioFunc = Double.parseDouble(
                            JOptionPane.showInputDialog("Salário do funcionário:")
                    );
                    Funcionario funcionario = new Funcionario(
                            nomeFunc,
                            cpfFunc,
                            salarioFunc
                    );
                    double salarioAntigoFunc = funcionario.getSalario();
                    controle.registrarAumento(funcionario);
                    JOptionPane.showMessageDialog(
                            null,
                            "Aumento aplicado!\n\n"
                                    + "Funcionário: " + funcionario.getNome()
                                    + "\nSalário antigo: R$ " + salarioAntigoFunc
                                    + "\nNovo salário: R$ " + funcionario.getSalario()
                    );
                    break;
                case "2":
                    String nomeGer = JOptionPane.showInputDialog("Nome do gerente:");
                    String cpfGer = JOptionPane.showInputDialog("CPF do gerente:");
                    double salarioGer = Double.parseDouble(
                            JOptionPane.showInputDialog("Salário do gerente:")
                    );
                    Gerente gerente = new Gerente(
                            nomeGer,
                            cpfGer,
                            salarioGer
                    );
                    double salarioAntigoGer = gerente.getSalario();
                    controle.registrarAumento(gerente);
                    JOptionPane.showMessageDialog(
                            null,
                            "Aumento aplicado!\n\n"
                                    + "Gerente: " + gerente.getNome()
                                    + "\nSalário antigo: R$ " + salarioAntigoGer
                                    + "\nNovo salário: R$ " + gerente.getSalario()
                    );
                    break;
                case "3":
                    JOptionPane.showMessageDialog(
                            null,
                            "Total acumulado de aumentos: R$ "
                                    + controle.getTotalDeAumento()
                    );
                    break;
                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!"
                    );
            }
        }
        JOptionPane.showMessageDialog(
                null,
                "Programa encerrado!"
        );
    }
}