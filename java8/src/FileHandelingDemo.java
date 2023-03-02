import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileHandelingDemo {

	public static void main(String[] args) throws IOException {

		String sourceFilePath = "D:/Test.txt";
		String DestinationPath = "D:/dir1/";
		copyFile(sourceFilePath, DestinationPath);
	}

	public static void copyFile(String sourceFilePath, String DestinationPath) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			String data[] = sourceFilePath.split("\\/");
			String obj[] = data[data.length - 1].split("\\.");

			String FileName = obj[0];
			String FileExtension = obj[1];

			fis = new FileInputStream(sourceFilePath);
			fos = new FileOutputStream(DestinationPath + FileName + "_" + new Date().getTime() + "." + FileExtension);

			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

}
