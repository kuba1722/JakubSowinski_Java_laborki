import java.util.ArrayList;

public class FEMGrid {
    int nh,ne;
    ArrayList<Element> elementy=new ArrayList<>();
    ArrayList<Node> wezly=new ArrayList<>();


    public FEMGrid(int nh, int ne) {
        this.nh = nh;
        this.ne = ne;
    }
}
