import java.util.ArrayList;
import java.util.List;

public class Zone {
    public List<crate> pile = new ArrayList<crate>();

    public Zone(char[] letters){
        for(char letter : letters){
            crate c = new crate(letter);
            pile.add(c);
        }
    }

    public crate getTop(){
        return pile.get(pile.size()-1);
    }

    public crate removeTop(){
        crate c = pile.get(pile.size()-1);
        pile.remove(pile.size()-1);
        return c;
    }

    public void receive(crate c){
        pile.add(c);
    }
}
