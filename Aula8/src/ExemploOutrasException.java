public class ExemploOutrasException {
    public static void main(String[] args) {
        int vetor[]= {56, 90, 10};
        String fraseEntrada= "Aula de Java";
        Integer b= 5;
        Integer c= 10;
        String fraseSaida= null;

        try {
            fraseSaida= fraseEntrada.toUpperCase();

            System.out.println(b+ c);
            System.out.println(fraseSaida);
            System.out.println(vetor[1]);
            System.out.println(vetor[9]);
        } catch (NullPointerException e) {
            System.out.println("Erro! Nulo");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! Vetor ou índice fora de alcançe");
            e.printStackTrace();
        }
    }
}
