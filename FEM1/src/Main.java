public class Main {

    public static void main(String args[]) {

        int q=-150;
        GlobalData g = new GlobalData(2, 50, 5, 2, 10, 400);

        FEMGrid siatka = new FEMGrid(g.nh, g.ne);
        for (int i = 0; i < g.nh; i++) {
            siatka.wezly.add(new Node(0,(g.L/g.ne)*i,i));
        }
        siatka.wezly.get(0).status=1;
        siatka.wezly.get(siatka.wezly.size()).status=2;


        for (int i = 0; i <g.ne ; i++) {
            siatka.elementy.add(new Element(siatka.wezly.get(i),siatka.wezly.get(i+1),g.L/g.ne,50,2));
        }

        for ( int i=0; i<g.ne;i++) {
            Element e=siatka.elementy.get(i);
            e.HL[0][0]=e.S*e.K/e.Le;
            e.HL[0][1]=-e.S*e.K/e.Le;
            e.HL[1][0]=-e.S*e.K/e.Le;
            e.HL[1][1]=e.S*e.K/e.Le+g.alfa*g.S;
            e.PL[0][0]=0;
            e.PL[0][1]=0;
            siatka.elementy.remove(i);
            siatka.elementy.add(i,e);
        }
        siatka.elementy.get(0).HL[1][1]-=g.alfa*g.S;
        siatka.elementy.get(0).PL[0][0]=q*g.S;
        siatka.elementy.get(siatka.elementy.size()).PL[0][1]=-g.alfa*g.S*g.talfa;

        SolveSOF solver=new SolveSOF(g.nh);
        for (int i = 0; i < g.nh; i++) {

            solver.GH[siatka.elementy.get(i).ID1.ID][siatka.elementy.get(i).ID2.ID]+=siatka.elementy.get(i).HL[0][1];   //01
//00
            //10
//11

        }






    }

}