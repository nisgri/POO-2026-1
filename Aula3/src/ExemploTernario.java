public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida= true;
        double media= 9.1;

        System.out.println(concluida? "Tarefa concluída com sucesso!": "Tarefa não concluída.");
        System.out.println(media< 5? "Ruim.": media< 9? "Bom.": "Ótimo." );
    }
}
