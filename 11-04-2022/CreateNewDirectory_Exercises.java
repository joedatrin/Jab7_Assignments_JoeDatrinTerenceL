package exercises_11_04_2022;
import java.io.*;

public class CreateNewDirectory_Exercises {
	
	public static void main(String[] args) {
        try {
            File file=new File("directory_test");
            boolean value=file.mkdir();
            if(value) {
                System.out.println("New Directory Created");
            }
            else {
                System.out.println("Directory Already Exists");
            }
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }

}
