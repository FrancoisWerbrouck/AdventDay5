import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Dock {
    public Zone col1;
    public Zone col2;
    public Zone col3;
    public Zone col4;
    public Zone col5;
    public Zone col6;
    public Zone col7;
    public Zone col8;
    public Zone col9;
    public List<Zone> dock= new ArrayList<Zone>();

    public Dock(){
        init();
    }
    public void init(){
        char[] liste1 = {'B','P','N','Q','H','D','R','T'};
        col1 = new Zone(liste1);
        char[] liste2 = {'W','G','B','J','T','V'};
        col2 = new Zone(liste2);
        char[] liste3 = {'N','R','H','D','S','V','M','Q'};
        col3 = new Zone(liste3);
        char[] liste4= {'P','Z','N','M','C'};
        col4 = new Zone(liste4);
        char[] liste5= {'D','Z','B'};
        col5 = new Zone(liste5);
        char[] liste6 = {'V','C','W','Z'};
        col6 = new Zone(liste6);
        char[] liste7 = {'G','Z','N','C','V','Q','L','S'};
        col7 = new Zone(liste7);
        char[] liste8= {'L','G','J','M','D','N','V'};
        col8 = new Zone(liste8);
        char[] liste9={'T','P','M','F','Z','C','G'};
        col9 = new Zone(liste9);
        dock.add(col1);
        dock.add(col2);
        dock.add(col3);
        dock.add(col4);
        dock.add(col5);
        dock.add(col6);
        dock.add(col7);
        dock.add(col8);
        dock.add(col9);
    }
    public void read(){
      try{
           FileReader input = new FileReader("D:\\École\\Project\\Advent Calender\\05\\AdventDay5\\Commands.txt");
            BufferedReader bufRead = new BufferedReader(input);
            String myLine = null;

            while ( (myLine = bufRead.readLine()) != null)
            {    
                String[] array1 = myLine.split(" ");
                int amount =Integer.parseInt(array1[1]);
                int start = Integer.parseInt(array1[3]);
                int end = Integer.parseInt(array1[5]);
                move(amount,start,end);
            }
            } catch (Exception e){
                System.out.println(e.getStackTrace());
            }
    }

    public void move(int amount, int start, int end){
        for(int i=0;i<amount;i++){
            crate moved = dock.get(start-1).removeTop();
            dock.get(end-1).receive(moved);
        }
    }
    
    public void print(){
        int compteur =1; 
        for(Zone col:dock){
            System.out.println(compteur+": ");
            for(int i=0;i<col.pile.size();i++){
                System.out.print(" [ "+col.pile.get(i).letter+" ] ");
            }
            System.out.println("");
            compteur++;
        }
    }

}
