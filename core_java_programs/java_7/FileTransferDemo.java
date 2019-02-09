import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileTransferDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Documents and Settings\\All Users\\Documents\\Blue hills.jpg";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		String of ="D:\\corejava\\myfile.jpg";
		FileOutputStream fos = new FileOutputStream(of );
		byte[] buf = new byte[1024];
	  	  int len;
	    while ((len = fis.read(buf)) > 0) {
	        fos.write(buf, 0, len);
	    }
	    fis.close();
	    fos.close();
	    System.out.println("Transfered successfully!!!!");
	}

}
