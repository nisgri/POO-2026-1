public class TesteMarca {
    public static void main(String[] args) {
        Equipamento e= new Equipamento(1, "Mouse", Marca.APPLE);

        System.out.println(e);

        System.out.println("*****Todas As Marcas*****");
        for(Marca m: Marca.values())
            System.out.println(m);
    }
}
