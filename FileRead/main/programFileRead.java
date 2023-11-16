package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class programFileRead {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\dontCry.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e ) {
			System.out.println("error" + e.getMessage());
		}
		finally {
			if(sc != null) {
			sc.close();
			}
		}

	}

}
