import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private static String path="Data/";
    private static Scanner input= new Scanner(System.in);

    private static void setPath(){
        System.out.println(" Name file: ");
        path=path+input.nextLine();
    }
    public static ArrayList<Integer> readerFile() throws FileNotFoundException,IOException{
        setPath();
        File file= new File(path);
        FileInputStream fileInputStream= new FileInputStream(file);
//        if (!file.exists()){
//            System.out.println("No exist file");
//            return;
//        }

        DataInputStream dataInputStream= new DataInputStream(fileInputStream);
        int value;
        ArrayList<Integer> list =new ArrayList<>();
        while((value = dataInputStream.read())!= -1){
            list.add(value);
        }
        return list;
    }
}
