package exercises_12_04_222;
import java.io.*;

public class ObjectStreams_Exercise {
	
	public static void main(String[] args) {
        int data1=5;
        String data2=" This is Object Stream";
        try {
            FileOutputStream file=new FileOutputStream("test_O.txt");
//            Create an ObjectOutputStream
            ObjectOutputStream output=new ObjectOutputStream(file);
//            Write data
            output.writeInt(data1);
            output.writeObject(data2);
//            Read Data
            FileInputStream fileStream=new FileInputStream("test_O.txt");
            ObjectInputStream objStream= new ObjectInputStream(fileStream);
            System.out.println(objStream.readInt());
            System.out.println(objStream.readObject());
            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }

}
