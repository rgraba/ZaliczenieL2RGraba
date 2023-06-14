import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Program sumujący elementy tablicy jednowymiarowej");
     Scanner scanner = new Scanner(System.in);
    while(true){
    System.out.println("Podaj liczbę elementów tablicy: ");
        int LiczebnośćTablicy = scanner.nextInt();
        int suma = 0;
        int[] liczby = new int[LiczebnośćTablicy];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < LiczebnośćTablicy; i++) {
          System.out.print("Element " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
            suma = suma + liczby[i];
        }
        System.out.println("Suma elementów tablicy to: " + suma); 
  }
}
}