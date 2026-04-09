public class TesteAtleta {
    public static void main(String[] args) {
        Pais p1= new Pais("Brasil");
        Pais p2= new Pais("EUA");

        Atleta a1= new Atleta("Anderson", 98, p1);
        Atleta a2= new Atleta("Carlos", 59, p2);
        Atleta a3= new Atleta("Marcelo", 110, p1);

        System.out.println(a1.getNome()+ " "+ a1.verificarSituacao()+ " da olimpíada.");
        System.out.println(a2.getNome()+ " "+ a2.verificarSituacao()+ " da olimpíada.");
        System.out.println(a3.getNome()+ " "+ a3.verificarSituacao()+ " da olimpíada.");

        System.out.println("O total de atletas que participarão da competição é "+ Atleta.getTotalParticipantes());
    }
}
