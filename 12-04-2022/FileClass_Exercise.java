package exercises_12_04_222;
import java.io.*;

public class FileClass_Exercise {
	 public static void main(String[] args) {
	        File file=new File("test2.txt");
	        try {
	            boolean value=file.createNewFile();
	            if(value) {
	                System.out.println("New File is Created");
	            }
	            else {
	                System.out.println("File Already Exists");
	            }
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
	        }

}
