import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public Zone col1;
    public Zone col2;
    public Zone col3;
    public Zone col4;
    public Zone col5;
    public Zone col6;
    public Zone col7;
    public Zone col8;
    public Zone col9;
    public Zone[] dock = {col1,col2,col3,col4,col5,col6,col7,col8,col9};

    public static void main(String[] args) throws Exception {
        Dock dock = new Dock();
        dock.read();
        System.out.println("read");
        dock.print();
        System.out.println("printed");
    }
}
