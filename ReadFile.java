import java.io.*;
import java.util.StringTokenizer;

public class ReadFile{
    File file = new File("stocks/text.csv");
    int row = 0;
    String [][] items;

    //check correct path and get file
    public boolean checkFile(){
        return file.isFile();
    }
    //check number of rows in csv file
    public int checkRowNumber(){
        row = 0;
        if(checkFile()==true){
            //do if it is file
            try{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while((reader.readLine())!=null){
                    row++;
                }
            }catch(Exception e){
                System.out.println(e);
            }

        } else{
            System.out.println("This is not a file");
        }
        return row;
    }



}