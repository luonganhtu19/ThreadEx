import java.io.*;
import java.util.Scanner;

public class Reader {
    private static String path="Data/";
    private static Scanner input= new Scanner(System.in);

    private static void setPath(){
        System.out.println(" Name file: ");
        path=path+input.nextLine();
    }
    public static void readerFile() throws FileNotFoundException,IOException{
        setPath();
        File file= new File(path);
        FileInputStream fileInputStream= new FileInputStream(file);
        if (!file.exists()){
            System.out.println("No exist file");
            return;
        }

        DataInputStream dataInputStream= new DataInputStream(fileInputStream);

        int value;
        while((value = dataInputStream.read())!= -1){
            System.out.println(value);
        }
    }
}
