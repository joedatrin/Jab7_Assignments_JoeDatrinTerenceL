package exercises_12_04_222;
import java.io.*;


public class RenameFile_Exercises {
	public static void main(String[] args) {
        File file=new File("test3.txt");
        try {
            file.createNewFile();
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        File newFile=new File("newName_test3");
       file.renameTo(newFile);
        }

}
