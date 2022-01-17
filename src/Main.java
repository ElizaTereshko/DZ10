import java.io.*;

public class Main {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.palindrom();
        Censor censor = new Censor();
        censor.censor();
        TextFormater textFormater = new TextFormater();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("fileText.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileTextEnd.txt"))) {
            while ((line = bufferedReader.readLine()) != null){
                if (textFormater.amountofWords(line) >= 3 && textFormater.amountofWords(line) <= 5){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
                if (textFormater.palindrom(line) == true) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }

        } catch (IOException e) {

        }

    }
}
