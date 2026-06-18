package classes;

public class ControleDeAumento {
    private double totalDeAumento = 0;

    public ControleDeAumento(double totalDeAumento) {
        this.totalDeAumento = totalDeAumento;
    }

    public void registrarAumento(Funcionario funcionario) {
        double salarioAntigo = funcionario.getSalario();
        double salarioNovo = funcionario.aumentarSalario();

        double valorDoAumento = salarioNovo - salarioAntigo;
        this.totalDeAumento += valorDoAumento;

        System.out.println("Aumento aplicado para: " + funcionario.getNome());
        System.out.println("Salário antigo: R$ " + salarioAntigo + " | Novo salário: R$ " + salarioNovo);
        System.out.println("----------------------------------------");
    }

    public double getTotalDeAumento() {
        return totalDeAumento;
    }
}
