import javax.imageio.IIOException;
import java.io.*;

public class Palindrom {

    public void palindrom(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileText1.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileText2.txt"))){
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String [] array = line.split("");
                    String res = "";
                    for (int i = array.length -1; i>=0; i--){
                        res = res + array[i];
                    }
                    if (res.equals(line)) {
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
                }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
