import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
//        System.out.println("Nhap so luong day so muon in: ");
//        Scanner input= new Scanner(System.in);
//        int number;
//        try{
//             number= input.nextInt();
//         }catch (Exception e){
//            System.out.println(" Nhap dung number");
//            return;
//        }
//        Writer.setPath();
//        for (int i = 0; i < number+1; i++) {
//            Writer.writerFile(i);
//        }
        ArrayList<Integer> listNumber= Reader.readerFile();
        for(int number: listNumber){
            System.out.println(number);
        }
    }
}
