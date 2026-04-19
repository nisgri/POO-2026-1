public class TesteAgenda {
    public static void main(String[] args) {
        AgendaTelefonica at= new AgendaTelefonica();

        at.inserir("Dagoberto Moraes", "(92) 3961-5461");
        at.inserir("Clóvis Andrade", "(61) 3737-8416");
        at.inserir("Tibúrcio Fernandes", "(92) 2963-9217");
        at.inserir("Gregório Matos", "(67) 3601-0122");
        at.inserir("Etelredo Prudente", "(81) 3636-5224");

        System.out.println(at.buscarNumero("(68) 2568-5948"));
        at.remover("Gregório Matos");
        System.out.println(at.buscarNumero("(92) 3961-5461"));
        System.out.println("A lista possui "+ at.tamanho()+ " contatos ao todo.");
        at.listar();

    }
}
