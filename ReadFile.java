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
    //converts the csv file to an array
    public void convertToArray(){
        int r = 0;
        //Since Yahoo stock market file only give 7 columns
        items = new String[checkRowNumber()][7];

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while((line=reader.readLine())!= null){
                StringTokenizer z = new StringTokenizer(line, ",");
                while(z.hasMoreTokens()){
                    for(int c = 0 ; c<7 ; c++){
                        items[r][c] = z.nextToken();
                    }
                    r++;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //prints out Items array TO MAKE SURE
    public void printArray(){
        for(int x =0; x < items.length; x++){
            System.out.printf("%s -", x);
            for(int y=0; y<items[x].length; y++){
                System.out.printf("%s -", items[x][y]);
            }
            System.out.println();
        }
    }

    //return array items
    public String[][] getArray(){
        return items;
    }



}