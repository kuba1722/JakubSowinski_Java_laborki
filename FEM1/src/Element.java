public class Element {

    Node ID1=null,ID2=null;
    int Le, K, S;
    int [][] HL= new int[2][2];
    int [][] PL= new int[1][2];

    public Element(Node ID1, Node ID2, int le, int k, int s) {
        this.ID1 = ID1;
        this.ID2 = ID2;
        Le = le;
        K = k;
        S = s;

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                HL[i][j]=0;
            }
            PL[0][i]=0;
        }

    }
}
