// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double a,b,c;
    double p;
    Scanner skaner = new Scanner(System.in);
    while(true){
      System.out.printf("wybierz operacje: (0 - wyjscie, 1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu, 5 - pole           prostokata, 6 - pole trojkata, 7 - suma kwadratow, 8 - najmniejsza)\n");
      int operacja = skaner.nextInt();
      if(operacja == 0){
        break;
      }
      System.out.printf("podaj a: \n");
      a = skaner.nextDouble();
      System.out.printf("podaj b: \n");
      b = skaner.nextDouble();
        switch(operacja){
          case 1:
            double suma = a + b;
            System.out.printf("suma: %f\n", suma);
            break;
          case 2:
            double roznica = a - b;
            System.out.printf("roznica: %f\n", roznica);
            break;
          case 3:
            double iloczyn = a * b;
            System.out.printf("iloczyn: %f\n", iloczyn);
            break;
          case 4:
            if(b == 0){
              System.out.printf("nie dzielimy przez zero\n");
              break;
            }
            else {
              double iloraz = a / b;
              System.out.printf("iloraz: %f\n", iloraz);
              break;
            }
          case 5:
            double poleProstokata = a * b;
            System.out.printf("pole prostokata: %f\n", poleProstokata);
            break;
          case 6:
            System.out.printf("podaj c: \n");
            c = skaner.nextDouble();
            p=(a+b+c)/2;
            double poleTrojkata = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("pole trojkata: %f\n", poleTrojkata);
            break;
          case 7:
            System.out.printf("podaj c: \n");
            c = skaner.nextDouble();
            double sumaKwadratow = Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2);
            System.out.printf("suma kwadratow: %f\n", sumaKwadratow);
            break;
          case 8:
            System.out.printf("podaj c: \n");
            c = skaner.nextDouble();
            double najmniejsza= Math.min(a,b);
            if(c<najmniejsza){
              najmniejsza = c;
            }
            System.out.printf("najmniejsza: %f\n", najmniejsza);
            break;
          default:
            System.out.printf("nie ma takiej operacji\n");
            break;
        }
    }
    skaner.close();
  }
}


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
