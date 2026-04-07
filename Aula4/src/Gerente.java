public class Gerente extends Funcionario {
    private String senha;
    private String tipo;
    private int numFuncGerenciados;

    public Gerente(int matricula, String nome, String cpf, double salario, String senha, String tipo,
            int numFuncGerenciados) {
        super(matricula, nome, cpf, salario);
        this.senha = senha;
        this.tipo = tipo;
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

}