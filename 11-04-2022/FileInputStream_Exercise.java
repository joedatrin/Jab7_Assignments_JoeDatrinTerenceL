package exercises_11_04_2022;

import java.io.FileInputStream;


public class FileInputStream_Exercise {

	public static void main(String[] args) {
        try {
            FileInputStream input=new FileInputStream("test.txt");// The file is stored outside the src folder
            int i =input.read();
            while(i!=-1) {
                System.out.print((char)i);
                i=input.read();
            }
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }
}
