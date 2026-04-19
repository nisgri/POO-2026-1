public class ExemploException {
    public static void main(String[] args) {
        try {
            System.out.println("Resultado:"+ calcular(10, 0));
        } catch (ArithmeticException e)
        {
            System.out.println("Erro! Divisão por 0.");
        } finally
        {
            System.out.println("Fim do programa.");
        }
    }

    public static int calcular(int a, int b)
    {
        return a/ b;
    }
}
