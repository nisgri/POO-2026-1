public class TesteCurso {
    public static void main(String[] args) {
        Direito d= new Direito("Universidade Católica de Petrópolis", "Benjamin Constant", 1, 36000);
       
        System.out.println(d.matrizCurricular());
        d.fazerMatricula();
        System.out.println(d.programacao());
        d.conteudoEventos();
        d.realizarProva();

        System.out.println("\n");

        TecnicoConcomitante tc= new TecnicoConcomitante("Centro Federal de Educação Tecnológica", "Rafael Saraiva", "Técnico em Telecomunicações");
        
        tc.fazerMatricula();
        tc.reuniaoDePais();
    }
}
