package SRP;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
public class jorunal {
    private final List<String> entries=new ArrayList<>();
    private static int count=0;

    public void addEntry(String text){
        entries.add(++count+" : "+text);
    }
    public void removeEntry(int index){
        entries.remove(index);
    }
    public String toString(){
        return String.join(System.lineSeparator(),entries);
    }
}
class persistence{
    public void saveToFile(jorunal jour,String fileName,boolean overwrite) throws FileNotFoundException {
        if(overwrite|| new File(fileName).exists()){
            try(PrintStream out= new PrintStream(fileName)){
                out.println(jour.toString());
            }
        }
    }
}
class demo{
    public static void main(String[] args) throws Exception{
        jorunal j= new jorunal();
        j.addEntry("i have 5 darks");
        j.addEntry("i have 3 lights");
        System.out.println(j);
        persistence p= new persistence();
        String fileName="c:\\temp\\jour.txt";
        p.saveToFile(j,fileName,true);
        Runtime.getRuntime().exec("notepad.exe "+fileName);
    }
}
