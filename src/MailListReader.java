import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {
    public static List<String> read(String fileName) throws FileNotFoundException, IOException{
        List<String> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String[] aux;
            for(String line; (line = br.readLine()) != null; ) {
                aux = line.split("@");
                if (aux.length == 2){
                    result.add(line);
                }
            }
        }
        
        return result;
    }
}

        