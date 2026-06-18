package classes;

public class Gerente extends Funcionario {
    private String matricula;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public double aumentarSalario() {
        final double PERCENTUAL = 20.0 / 100.0;

        double valorAumento = this.getSalario() * PERCENTUAL;
        this.setSalario(this.getSalario() + valorAumento);
        return this.getSalario();
    }
}
