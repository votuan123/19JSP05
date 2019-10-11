package file.txt;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFiletxt {
	public static void main(String[] args) {
		WriteFile();
		ReadFile();
	}

	public static void WriteFile() {
		try {
			File file = new File("D:\\test.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("hello MSITA");
			fw.close();
		} catch (Exception e) {
			System.out.println("err write file :" + e);
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void ReadFile() {
		try {
			File file = new File("D:\\test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String string = br.readLine();
			while (string != null) {
				System.out.println(string);
				break;
			}
		} catch (Exception e) {
			System.out.println("err read file :" + e);
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
