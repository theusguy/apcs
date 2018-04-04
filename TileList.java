import java.util.*;

public class TileList {
    ArrayList<Tile> list;
    public TileList() {
        list = new ArrayList<Tile>();
    }
    public Tile moveToBack(int x, int y) {
        boolean flag = false;
        int i;
        for(i = list.size()-1; i >= 0; i--) {
            if(list.get(i).inside(x,y)) {
                flag = true;
                break;
            }
        }
        if(!flag)
            return null;
        list.add(list.get(i));
        list.remove(i);
        return list.get(list.size()-1);

    }
    
    // inserts t at the back of the list of tiles
    public void insertBack(Tile t) {
        list.add(t);
    }
    
    // returns the number of tiles in this list
    public int size() {
       return  list.size();
    }
    
    // returns the Tile at the given index
    public Tile get(int index) {
        return list.get(index);
    }
}
