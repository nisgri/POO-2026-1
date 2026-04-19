public class ServidorFederal extends Servidor{
    private String matricula;

    public ServidorFederal(String cpf, String nome, String lotacao, String matricula) {
        super(cpf, nome, lotacao);
        this.matricula = matricula;
    }


}
