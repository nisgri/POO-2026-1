public class Equipamento {
    private int codigo;
    private String descricao;
    private Marca marca;
    
    public Equipamento(int codigo, String descricao, Marca marca) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Equipamento [codigo=" + codigo + ", descricao=" + descricao + ", marca=" + marca + "]";
    }
}
