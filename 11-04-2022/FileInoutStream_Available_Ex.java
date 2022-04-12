package exercises_11_04_2022;
import java.io.FileInputStream;




public class FileInoutStream_Available_Ex {
	public static void main(String[] args) {
        try {
            FileInputStream input=new FileInputStream("test.txt"); // The file is stored outside the src folder
            System.out.println(input.available());
//            Read
           input.read();
           /*input.read();
            input.read(); */
            System.out.println(input.available());
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

}
}