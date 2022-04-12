package exercises_12_04_222;
import java.io.*;

public class Assignment_RenameFile {
	public static void main(String[] args)
	{
		File f = new File("Assign1");
		try
		{
			f.createNewFile();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		File new_f = new File("Assign1_new");
		f.renameTo(new_f);
	}

}
