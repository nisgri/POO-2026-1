public class TestePlano {
    public static void main(String[] args) {
        Clinica c= new Clinica("Amil", "123456", "Checkup");
        Medico m=new Medico("Amil", "122", "Carlos Roberto");
        Anestesista a=new Anestesista("UniMed", "2132", "José", "Raqui");
        ControlePagamento cp= new ControlePagamento();


        System.out.println(c);
        System.out.println("Valor Pago Clínica:"+ c.calcularPagamento());
        cp.calcularTotalPago(c);

        System.out.println(m);
        System.out.println("Valor Pago Médico:"+ m.calcularPagamento());
        cp.calcularTotalPago(m);

        System.out.println(a);
        System.out.println("Valor Pago Anestesista:"+ a.calcularPagamento());
        cp.calcularTotalPago(a);

        System.out.println("Total gasto do plano de saúde: R$"+ cp.getTotalPago());
    }
}
