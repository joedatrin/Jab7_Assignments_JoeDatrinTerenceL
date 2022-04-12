package exercises_12_04_222;
import java.io.*;


public class FileReader_Exercises {

	public static void main(String[] args) {
        char[] array=new char[100];
        try {
            FileReader input=new FileReader("test2.txt");
            input.read(array);
            System.out.println(array);
            input.close();
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }
}
