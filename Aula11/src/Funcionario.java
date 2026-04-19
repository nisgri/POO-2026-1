public class Funcionario {
    //private Integer matricula;
    private String nome;
    private String profissao;

    public Funcionario(/*Integer matricula,*/ String nome, String profissao) {
        //this.matricula= matricula;
        this.nome = nome;
        this.profissao = profissao;
    }
    
    /*public Integer getMatricula() {
        return matricula;
    }*/

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", profissao=" + profissao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (profissao == null) {
            if (other.profissao != null)
                return false;
        } else if (!profissao.equals(other.profissao))
            return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

}
