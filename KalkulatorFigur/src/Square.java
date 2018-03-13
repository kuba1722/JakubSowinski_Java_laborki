import static java.lang.Math.*;

public class Square extends Figure implements Print {
    public int side;


    Square(int side)
    {
        this.side=side;
    }

    public void print() {
        System.out.println("\n\nKwadrat: \nDługosc boku: " +side+"\n");
        System.out.println("Pole kwadratu: "+ calculateArea()+"\t"+"jego obwod: "+calculatePerimeter());
    }


    public double calculateArea(){
        double pole= pow(side,2);
        return pole;
        };

        @Override
        public double calculatePerimeter() {
            double obwod=4*side;
            return obwod;
        }

}
