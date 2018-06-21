import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class fileRead {
    public static void process(String str){
        String[] entries= str.split(";");
        String name,phoneNo,zipcode;
        name=entries[0];
        phoneNo=entries[1];
        zipcode=entries[2];
        System.out.println("name: "+name);
        System.out.println("phone number: " +phoneNo);
        System.out.println("zipcode: " +zipcode);}

    public static void main(String[] arguments) {

        String fileName = "sample.txt";
        String line=null;

        try {
            int numberoflines=0;
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line=bufferedReader.readLine())!=null){
                numberoflines++;
                System.out.println("line:"+numberoflines+" - "+line);
                process(line);
            }
            System.out.println("Number of lines processed : "+ numberoflines);

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File was not found\n");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("error reading the file\n");
            e.printStackTrace();
        }


    }
}
