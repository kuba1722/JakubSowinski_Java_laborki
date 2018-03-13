import java.util.InputMismatchException;
import java.util.Scanner;

public class NewObject {

    public Figure Create()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Trojkat\n2. Kwadrat\n3. Kolo\n");
        int wybor=scanner.nextInt();


           if (wybor == 1) {

               Triangle t=null;
               int bok1,bok2,bok3;
               try {
                   System.out.println("Podaj dlugosc boku: ");
                   bok1 = scanner.nextInt();
                   System.out.println("Podaj dlugosc boku: ");
                   bok2 = scanner.nextInt();
                   System.out.println("Podaj dlugosc boku: ");
                   bok3 = scanner.nextInt();


               }
               catch(InputMismatchException e) {
                   throw new MyException();
               }
               t = new Triangle(bok1, bok2, bok3);
                   return t;

           } else if (wybor == 2) {
               System.out.println("Podaj dlugosc boku: ");
               int bok1;
               Square s =null;

               try{
                   bok1 = scanner.nextInt();
                   }
                   catch(InputMismatchException e)
                   {
                       throw new MyException();
                   }
                   s=new Square(bok1);
               return s;

           } else if (wybor==3){
               System.out.println("Podaj promien: ");
               int bok1;

               Circle c = null;
               try{
                   bok1 = scanner.nextInt();
               }
               catch(InputMismatchException e)
               {
                   throw new MyException();
               }
                c= new Circle(bok1);
               return c;

           }
           else {
                throw new MyException();
           }

       }

    }


