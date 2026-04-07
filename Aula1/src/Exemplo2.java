public class Exemplo2 {
    public static void main(String[] args) {
        String dia= "Domingo";
        String resultado= switch(dia)
        {
            case "Segunda"-> "dia de semana";
            case "Terça"-> "dia de semana";
            case "Quarta"-> "dia de semana";
            case "Quinta"-> "dia de semana";
            case "Sexta"-> "dia de semana";
            case "Sábado"-> "fim de semana";
            case "Domingo"-> "fim de semana";
            default-> "dia inválido";
        };
        System.out.println(resultado);

        String time= "Santos";
        String resposta= switch(time)
        {
            case "Flamengo","Vasco","Botafogo","Fluminense"-> "RJ";
            case "São Paulo","Palmeiras","Santos","Corinthians"-> "SP";
            default-> "Outro estado";
        };
        System.out.println(resposta);
    }
}
