import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;


// Беда (((
public class Censor {
    public void censor (){
        boolean flag = false;
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader("fileCheck.txt"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("fileCensor.txt"))){
            String line1;
            String line2;
            String [] array;
                while ((line2 = bufferedReader2.readLine()) != null) {

                }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
