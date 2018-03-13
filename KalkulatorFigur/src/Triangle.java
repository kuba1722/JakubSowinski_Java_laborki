import java.util.ArrayList;

import static java.lang.Math.*;

public class Triangle extends Figure{
public int bok1,bok2,bok3;

    public Triangle(int bok1, int bok2, int bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }



    @Override
    public void print() {
        System.out.println("\n\nTrojkat:\nDługosci bokow: "+bok1+ ", "+bok2+", "+bok3+"\n");
        System.out.println("Pole trojkata: "+ calculateArea()+"\t"+"jego obwod: "+calculatePerimeter());
    }
    public double calculateArea(){
        double P=(bok1+bok2+bok3)/2;
        double pod=P*(P-bok1)*(P-bok2)*(P-bok3);
        double pole= sqrt(pod);
        return P;

    };

    @Override
    public double calculatePerimeter() {
        double obwod= bok1+bok2+bok3;
        return obwod;
    }
}
