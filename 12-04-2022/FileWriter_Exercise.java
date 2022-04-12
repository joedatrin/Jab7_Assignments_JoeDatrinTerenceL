package exercises_12_04_222;
import java.io.*;


public class FileWriter_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is the addition to the file";
        try {
            FileWriter output=new FileWriter("test2.txt");
            output.write(data);
            output.close();
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }

	}

}
