import java.io.*;

public class TextFormater {
    public static int amountofWords(String line) {
        int amount = 0;
                String [] array = line.split(" ");
                amount = array.length;
        return amount;
    }

    public static boolean palindrom (String line){
        boolean flag = true;
                String [] array = line.split(" ");
                for (int i = 0; i < array.length; i++){
                    String [] arr = array[i].split("");
                    String res = "";
                    for (int j = arr.length - 1; j >= 0; j--){
                        res = res + arr[j];
                    }
                    if (res.equals(array[i])) {
                        flag = true;
                        break;
                    } else flag = false;

                }
        return flag;
    }
}
