public class MyException extends RuntimeException{

    public MyException() {

        super("Bledny wybor figury");
    }
    public void wypisz(){
        System.err.println("Nie ma takiej opcji");
    }
}
