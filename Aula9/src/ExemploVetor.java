public class ExemploVetor {
    public static void main(String[] args) {
        String[] vetor= {"Celular", "TV", "Kindle"};
        String[] times= new String[4];
        times[0]= "Flamengo";
        times[1]= "Vasco";
        times[2]= "Botafogo";
        times[3]= "Fluminense";

        for (int i = 0; i < 4; i++) {
            System.out.println(times[i]);
        }
        System.out.println("*****************************");
        for(String t: times) {
            System.out.println(t);
        }
    }
}
