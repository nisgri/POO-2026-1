public class TesteMedico {
    public static void main(String[] args) {
        Medico m1= new Medico(1234, "Ambrósio", 1200);
        Medico m2= new Medico(1235, "Renato", 1400);
        Medico m3= new Medico(1236, "Bruno", 1600);

        System.out.print("Total de médicos cadastrados: "+ Medico.getTotal());
    }
}
