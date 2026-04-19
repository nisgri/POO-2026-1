public class TesteMaratona {
    public static void main(String[] args) {
        AtletaAmador a1= new AtletaAmador("João", "Masculino", 10, 1.90, false);
        AtletaAmador a2= new AtletaAmador("Joana", "Feminino", 20, 1.80, false);
        AtletaProfissional a3= new AtletaProfissional("Wagner", "Masculino", 18, 1.70, 120);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

        a1.verificaSituacao();
        a2.verificaSituacao();
        a3.verificaSituacao();
    }
}
