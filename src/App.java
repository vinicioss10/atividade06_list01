import java.util.Scanner;

/*Faça um Programa que peça o raio de um
 círculo, calcule e mostre sua área. */

public class App {
    public static void main(String[] args) throws Exception {
        double raio;
        double area;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Informe a area do raio");
        raio = dig.nextInt();
        area = Math.PI * (raio * raio);
        System.out.println("a area deste circulo é de " + area);

    }
}
