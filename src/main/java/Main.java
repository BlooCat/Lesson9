import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String fileName;
        System.out.print("Enter the path to the file to open: ");
        fileName = in.nextLine();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lineData = bufferedReader.readLine();
        while (lineData != null){
            System.out.println(lineData);
            lineData = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }
}
