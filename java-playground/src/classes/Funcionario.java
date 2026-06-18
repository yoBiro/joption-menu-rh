package classes;

import interfaces.ISalario;

public class Funcionario implements ISalario {
    private String nome;
    private String cpf;
    double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double aumentarSalario() {
        final double PERCENTUAL = 10.0 / 100.0;

        double valorAumento = this.salario * PERCENTUAL;
        this.salario += valorAumento;
        return this.salario;
    }

}
