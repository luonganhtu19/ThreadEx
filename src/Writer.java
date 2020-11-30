import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    private static String path="Data/";
    private static Scanner input= new Scanner(System.in);

    public static void setPath(){
        System.out.println(" Name file: ");
        path=path+input.nextLine();
    }
    public static void writerFile(int number) throws IOException {
        File file= new File(path);
        FileOutputStream fileOutputStream= new FileOutputStream(file,true);
        DataOutputStream dataOutputStream= new DataOutputStream(fileOutputStream);

        dataOutputStream.write(number);
    }
}
