import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteContent {
    public static void writeOnFile(){
        System.out.println("> Make sure to type \"end\" when you want the input to be written on the file. ");
        System.out.println("> Type here what you want to write to the file: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        List<String> arrList = new ArrayList<>();

        try {
            //while loop that iterates through every line of input given in the console
            while((str = br.readLine()) != null){
                //when br.readline() equals "end" the while loop will break
                if(str.equalsIgnoreCase("end")){ break; }
                //adding the line given in the console as input to the ArrayList
                arrList.add(str);
            }
            //close the stream
            br.close();
            //name of the file
            Path fileName = Paths.get("content.txt");
            //writing on the file the input given in the console
            Files.write(fileName, arrList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
