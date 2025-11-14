public class App {
    public static void main(String[] args) throws Exception {
        long numeroIntroducido = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        long numero = numeroIntroducido;
        long volteado = 0;
        int longitud = 0;
        long digito = 0;
        long par = 0;
        long impar = 0;

        while (numero != 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        for (int i = 0; i < longitud; i++) {
            digito = volteado % 10;
            if (digito % 2 == 0) 
                par++;
            else
                impar++;
            volteado /= 10;
        }

        System.out.printf("El %d contiene %d digitos pares y %d digitos impares", numeroIntroducido, par, impar);
    }
}
