import java.io.*;
import java.util.StringTokenizer;

public class ReadFile{
    File file = new File("stocks/text.csv");
    int row = 0;
    String [][] items;

    //check correct path

    public boolean checkFile(){
        return file.isFile();
    }


}