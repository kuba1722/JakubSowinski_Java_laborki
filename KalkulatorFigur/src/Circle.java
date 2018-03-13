import static java.lang.Math.*;

public class Circle extends Figure implements Print{
    public double r;


    Circle(double r)
    {
        this.r=r;
    }
    public void print() {
        System.out.println("\n\nKolo: \nDługosc promienia: "+r+"\n");
        System.out.println("Pole kola: "+ calculateArea()+"\t"+"jego obwod: "+calculatePerimeter());
    }

    @Override
    double calculateArea() {
        double pole= PI*pow(r,2);

        return pole;
    }

    public double calculatePerimeter() {
        double obwod=2*PI*r;

        return obwod;
    }

}
