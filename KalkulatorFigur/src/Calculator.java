import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Calculator {


        public static void main(String args[]) {

            ArrayList<Figure> lista = new ArrayList<>();

            int option = 0;
            try {
                do {

                    System.out.println("Menu: \n1. Dodaj figure\n2. Wyświetl figury\n3. Usuń ostatnia figure\n4. Wyjscie");

                    Scanner scanner = new Scanner(System.in);
                    option = scanner.nextInt();
                    try {
                        switch (option) {
                            case 1:
                                //System.out.println("sdfsdf");
                                try { // NewObject obj=null;
                                    lista.add(new NewObject().Create());
                                } catch (MyException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                Iterator<Figure> test_iterator = lista.iterator();
                                int i = 0;
                                while (test_iterator.hasNext()) {
                                    test_iterator.next().print();
                                }

                                break;
                            case 3:
                                lista.remove(lista.size() - 1);
                                break;

                            case 4:
                                System.out.println("Zamykanie");
                                break;

                            default:
                               throw new MyException();
                        }
                    }
                    catch(MyException e)
                        {
                            e.wypisz();
                        }


                    } while (option != 4) ;
                }
      catch(InputMismatchException e)
                {
                    System.out.println("zly wybor");
                }

            }
        }

